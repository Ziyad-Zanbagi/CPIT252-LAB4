// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;

public enum BodyType {

  SKINNY,
  FIT,
  MUSCULAR,
  FAT;



  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
