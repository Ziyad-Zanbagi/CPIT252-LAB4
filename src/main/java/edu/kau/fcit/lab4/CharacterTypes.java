
// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;

public enum CharacterTypes {
  ARCHER,FLAG_BEARER,KNIGHT;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
