package com.diploma.businesscard.controllers;

import com.diploma.businesscard.model.User;
import org.springframework.stereotype.Controller;

import java.io.*;
import java.util.LinkedList;

@Controller
public class FileConroller {


    public void appendFile(String user1) {                  //Метод записи данных в файл

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("business card.txt", true))) {
                writer.write(user1 + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public LinkedList<User> readFile(){                   //Метод чтения данных из файла

        String lineRead;
        String[] splitLine;
        User user;
        LinkedList<User> usr = new LinkedList ();
        try (BufferedReader reader = new BufferedReader(new FileReader("business card.txt")))
        {
            lineRead = reader.readLine();
            while (lineRead != null)
            {
                splitLine = lineRead.split("' ");
                    user = new User(splitLine[0], Integer.parseInt(splitLine[1]), splitLine[2],
                            splitLine[3], splitLine[4], splitLine[5], splitLine[6], splitLine[7],
                            splitLine[8], splitLine[9], splitLine[10], splitLine[11], splitLine[12]);

                usr.add(user);
                lineRead = reader.readLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();}

        return usr;
    }

    public void deleteFile(){                   // метод удаления файла

            File remove = new File("business card.txt");
            remove.delete();

    }
}
