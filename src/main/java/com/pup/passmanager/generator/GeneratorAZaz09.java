package com.pup.passmanager.generator;

import java.util.Random;
import java.util.Scanner;

public class GeneratorAZaz09 implements PasswordGenerator {
    private Scanner skaner = new Scanner(System.in);
    private Random generator = new Random();
    private char[] haslo = new char[150];



    @Override
    public String generate(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 97) + 97);
            haslo[i + 1] = (char) ((char) generator.nextInt(90 - 65) + 65);
            haslo[i + 2] = (char) ((char) generator.nextInt(57 - 48) + 48);
            i = i + 2;
        }
        return String.valueOf(haslo);
    }

    @Override
    public GeneratorType getType() {
        return GeneratorType.GENERATORazAZ09;

    }
}






