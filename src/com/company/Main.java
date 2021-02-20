package com.company;

import com.sun.corba.se.impl.presentation.rmi.IDLTypeException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  IOException {
        String content=new String(Files.readAllBytes(Paths.get("C:\\Users\\dench\\Desktop\\h2.txt")));
        content=content.replaceAll("[^A-Za-z ]", "");
        String[] words=content.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>0 && words[i].charAt(0) == 'a' && words[i].length() == 3 && words[i].length() < 8){
                System.out.println(words[i]);
            }
        }
        System.out.println(words.length);
        System.out.println(content.substring(0,400));
        Arrays.sort(words);
        int aCounter=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>0 &&  words[i].charAt(0)=='A') {
                System.out.println(words[i]);
                aCounter++;
            }
        }
        System.out.println(aCounter + " - количество слов которие начинаються на А");
        System.out.println(words.length + " - Количество символом");
    }
}
