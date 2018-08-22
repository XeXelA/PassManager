package com.pup.passmanager.generator;
import static com.pup.passmanager.generator.GeneratorType.GENERATORazAZ;
import static com.pup.passmanager.generator.GeneratorType.GENERATORazAZ09;
import static com.pup.passmanager.generator.GeneratorType.GENERATORspecjalSign;

class PasswordGeneratorFactory{

    PasswordGenerator getGenerator(GeneratorType type) {

        if (type == GENERATORazAZ) {
            return new GeneratorAZaz();
        }
        else if(type == GENERATORazAZ09){
            return new GeneratorAZaz09();
        }
        else if(type == GENERATORspecjalSign){
            return new GeneratorSpecjalSign();
        }

        throw new PasswordGeneratorException("No such generator");
    }
}