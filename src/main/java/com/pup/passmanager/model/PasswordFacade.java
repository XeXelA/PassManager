package com.pup.passmanager.model;

import com.pup.passmanager.files.FilesFacade;
import com.pup.passmanager.generator.GeneratorType;
import com.pup.passmanager.generator.PasswordGeneratorFacade;

import java.util.List;

public class PasswordFacade {

    private PasswordGeneratorFacade passwordGeneratorFacade;
    private FilesFacade filesFacade;

    public PasswordFacade() {
        passwordGeneratorFacade = new PasswordGeneratorFacade();
        filesFacade = new FilesFacade();
    }

    public PasswordEntry generatePassword(String website, String login, GeneratorType strategy, int length) {
        String password = passwordGeneratorFacade.getPassword(length, strategy);
        return new PasswordEntry(website, password, login);
    }

    public List<PasswordEntry> getEntries(String path) {
        return filesFacade.getEntries(path);
    }
}