package com.pup.passmanager.generator;

public interface PasswordGenerator {
    String generate(int dlugoscHasla);
    GeneratorType getType();
}
