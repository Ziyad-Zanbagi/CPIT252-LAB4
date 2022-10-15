// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;


public enum SkinTone {

  FAIR, LIGHT, MEDIUM , DARK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
