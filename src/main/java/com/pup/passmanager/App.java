package com.pup.passmanager;

public class App {
    public static void main(String[] args) {
        Generator pierwszy = new Generator();

        //pierwszy.wypisz();
        //pierwszy.generate(6);
        System.out.println("pierwsze hasło: "+pierwszy.generator(6));
        System.out.println("drugie hasło: "+pierwszy.generator(10));
        System.out.println("_______________________________________________________");
        System.out.println("pierwsze hasło: "+pierwszy.generator2(6));
        System.out.println("drugie hasło: "+pierwszy.generator2(10));
        System.out.println("-----------------------------------------------------");

        System.out.println("pierwsze hasło: "+pierwszy.generator3(6));
        System.out.println("drugie hasło: "+pierwszy.generator3(10));
            }
}
