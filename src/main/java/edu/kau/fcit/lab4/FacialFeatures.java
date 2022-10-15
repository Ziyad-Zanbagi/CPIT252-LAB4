
// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;

public enum FacialFeatures {

  CLEAN_SHAVEN, LIGHT_BEARD, HEAVY_BEARD, GOATEE, MOUSTACHE;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
