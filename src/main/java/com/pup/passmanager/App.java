package com.pup.passmanager;

import com.pup.passmanager.generator.GeneratorType;
import com.pup.passmanager.model.PasswordEntry;
import com.pup.passmanager.model.PasswordFacade;

import java.util.List;

public class App {
    public static void main(String[] args) {

        PasswordFacade passwordFacade = new PasswordFacade();
        List<PasswordEntry> entries = passwordFacade.getEntries("entries.csv");

        PasswordEntry passwordEntry1 = passwordFacade.generatePassword("facebook", "login", GeneratorType.GENERATORazAZ, 10);
        PasswordEntry passwordEntry2 = passwordFacade.generatePassword("google", "login", GeneratorType.GENERATORspecjalSign, 10);
        PasswordEntry passwordEntry3 = passwordFacade.generatePassword("mial", "login", GeneratorType.GENERATORazAZ09, 10);
        PasswordEntry passwordEntry4 = passwordFacade.generatePassword("szkola", "login", GeneratorType.GENERATORspecjalSign, 35);
        PasswordEntry passwordEntry5 = passwordFacade.generatePassword("cos tam", "login", GeneratorType.GENERATORazAZ09, 20);

        System.out.println("pierwsze hasło: " + passwordEntry1.getPassword());
        System.out.println("drugie hasło: " + passwordEntry2.getPassword());
        System.out.println("pierwsze hasło: " + passwordEntry3.getPassword());
        System.out.println("drugie hasło: " + passwordEntry4.getPassword());
        System.out.println("pierwsze hasło: " + passwordEntry5.getPassword());



    }
}
