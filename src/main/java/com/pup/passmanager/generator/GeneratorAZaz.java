package com.pup.passmanager.generator;

import java.util.Random;
import java.util.Scanner;

public class GeneratorAZaz implements PasswordGenerator {
    private Scanner skaner = new Scanner(System.in);
    private Random generator = new Random();
    //int dlugoscHasla;
    private char[] haslo = new char[150];

    @Override
    public String generate(int dlugoscHasla) {
        for (int i = 0; i < dlugoscHasla; i++) {
            haslo[i] = (char) ((char) generator.nextInt(122 - 97) + 97);
            haslo[i + 1] = (char) ((char) generator.nextInt(90 - 65) + 65);
            i++;
        }
        return String.valueOf(haslo); //zamienia chara na stringa
    }

    @Override
    public GeneratorType getType() {
        return GeneratorType.GENERATORazAZ;
    }
}
// metoda, która generuje losowy ciag znaków a-z i A-Z (z tym, że co druga jest małą literą)
//   @Override
//    public String generator(int dlugoscHasla) {
//        for (int i = 0; i < dlugoscHasla; i++) {
//            haslo[i] = (char) ((char) generator.nextInt(122 - 97) + 97);
//            haslo[i + 1] = (char) ((char) generator.nextInt(90 - 65) + 65);
//            i++;
//        }
//        return String.valueOf(haslo); //zamienia chara na stringa
//    }


