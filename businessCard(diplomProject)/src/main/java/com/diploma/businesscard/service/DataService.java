package com.diploma.businesscard.service;

import com.diploma.businesscard.controllers.FileConroller;
import com.diploma.businesscard.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class DataService {
    private LinkedList<User> user = new LinkedList<>();

FileConroller fc = new FileConroller();

    public void addInfo(User i) {           //добавление пользователя
            user.add(i);
    }
    public void clearInfo(User i) {         //очистка данных о пользователе в текущем сеансе
        user.remove();
    }
    public LinkedList<User> findAll() {     //метод возвращает данные пользователя
        return user;
    }

}

