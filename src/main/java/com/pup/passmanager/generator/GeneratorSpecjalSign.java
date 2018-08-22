package com.pup.passmanager.generator;

import java.util.Random;
import java.util.Scanner;


public class GeneratorSpecjalSign implements PasswordGenerator {
    private Scanner skaner = new Scanner(System.in);
    private Random generator = new Random();
    private char[] haslo = new char[150];


    @Override
    public String generate(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 48) + 48);

        }
        return String.valueOf(haslo);
    }

    @Override
    public GeneratorType getType() {
        return GeneratorType.GENERATORspecjalSign;
    }
}
