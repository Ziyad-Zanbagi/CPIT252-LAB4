
// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;

public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if(type.toString().equalsIgnoreCase("knight")) {
            return new Knight(name);
        }
        if(type.toString().equalsIgnoreCase("archer")) {
            return new Archer(name);
        }
        if(type.toString().equalsIgnoreCase("flag_bearer")) {
            return new FlagBearer(name);
        }
        return null;
    }
}
