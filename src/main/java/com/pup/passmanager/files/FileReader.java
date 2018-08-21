package com.pup.passmanager.files;
import com.pup.passmanager.model.PasswordEntry;

import java.io.IOException;
import java.util.List;

interface FileReader {

    List<String> read(String path) throws IOException;
    List<PasswordEntry> getPasswordEntries(String path) throws IOException;

}