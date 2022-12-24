package homeWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        IntStream.rangeClosed(1,10000000).forEach(value -> list.add(random.nextInt(1000)));
        System.out.println(list.stream().count());
        List<Integer> result = list.stream().filter(x -> x % 3 == 0).collect(Collectors.toList());
        System.out.println(result.stream().count());
        List<Integer> result2 = result.stream().distinct().collect(Collectors.toList());
        System.out.println(result2.stream().count());

        try {
            FileOutputStream writeData = new FileOutputStream("result.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(result2.toString());
            writeStream.flush();
            writeStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}
