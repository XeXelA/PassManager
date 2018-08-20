package com.pup.passmanager;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    Scanner skaner = new Scanner(System.in);
    private Random generator = new Random();
    //int dlugoscHasla;
    private char[] haslo = new char[150];


    public void generator() {

    }

    public String generator(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 97) + 97);
            haslo[i + 1] = (char) ((char) generator.nextInt(90 - 65) + 65);
            i++;
        }
        return String.valueOf(haslo); //zamienia chara na stringa
    }

    public String generator2(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 97) + 97);
            haslo[i + 1] = (char) ((char) generator.nextInt(90 - 65) + 65);
            haslo[i + 2] = (char) ((char) generator.nextInt(57 - 48) + 48);
            i = i + 2;
        }
        return String.valueOf(haslo);
    }

    public String generator3(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 48) + 48);

        }
        return String.valueOf(haslo);
    }

}



