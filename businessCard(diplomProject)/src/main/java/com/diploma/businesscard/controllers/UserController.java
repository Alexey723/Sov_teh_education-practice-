package com.diploma.businesscard.controllers;

import com.diploma.businesscard.model.User;
import com.diploma.businesscard.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class UserController {

    FileConroller file = new FileConroller();
    public static String UPLOAD_DIRECTORY = System.getProperty("user.dir") + "/images/";
    private final DataService dataServices;

    public UserController(DataService dataServices) {
        this.dataServices = dataServices;
    }

    @GetMapping("/")
    public String viewUser(Model model) {
        if(new File("business card.txt").exists()) {
            model.addAttribute("index", file.readFile());
            model.addAttribute("condition", false);
            model.addAttribute("userExist", true);
            return "index";
        } else {
        var user = dataServices.findAll();
        model.addAttribute("index", user);
            model.addAttribute("condition", true);
            model.addAttribute("userExist", false);
        return "index";}
    }

    @GetMapping("/registration")
    public String editUser(Model model) {
        if(new File("business card.txt").exists()) {
        return "reg_error";
    }else{
            var user = dataServices.findAll();
            model.addAttribute("registration", user);
            return "registration";
        }}

    @PostMapping("/registration")
    public String addUser(User i, Model model, @RequestParam("image") MultipartFile uploadImg) throws IOException {
        StringBuilder fileNames = new StringBuilder();
        String newUser;
        Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, uploadImg.getOriginalFilename());
        fileNames.append(uploadImg.getOriginalFilename());
        Files.write(fileNameAndPath, uploadImg.getBytes());
        String fileName = StringUtils.cleanPath(uploadImg.getOriginalFilename());
        File f = new File("/images/" + fileName);
        String path = f.getPath();
        i.setPic(path);
        dataServices.addInfo(i);
        var user = dataServices.findAll();
        model.addAttribute("registration", user);
        newUser = user.toString().replace("[", "").replace("]", "");
        file.appendFile(newUser);
        dataServices.clearInfo(i);
        return "registration";
    }

    @GetMapping("/login")
    public String login() {
            return "login";
        }

    @PostMapping("/login")
    public String login(User i) {
        if(i.getLogin().equals("Admin") && i.getPassword().equals("admin")) {
            return "edit";
        }else{
            return "log_error";
        }
    }
    @GetMapping("/edit")
    public String editUser2() {
        return "edit";
    }

    @PostMapping("/edit")
    public String addUser2(User i, Model model) {
        String addInfo;
        i.setAge(0);
        dataServices.addInfo(i);
        if(i.getSocSeti() == null){
            i.setSocSeti("https://");}
        if(i.getGitHub() == null){
            i.setGitHub("https://");}
        if(i.getEmail() == null){
            i.setEmail("");}
        var user = dataServices.findAll();
        model.addAttribute("edit", user);
        addInfo = user.toString().replace("[", "").replace("]", "");
        file.appendFile(addInfo);
        dataServices.clearInfo(i);
        return "edit";
    }

    @GetMapping("/delete")
    public String deleteUser() {
        file.deleteFile();
        return "registration";

    }
    @GetMapping("/error")
    public String errorMsg() {
       return "error";
        }

}



