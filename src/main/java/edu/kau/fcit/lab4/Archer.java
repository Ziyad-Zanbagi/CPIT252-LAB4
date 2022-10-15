
// package com.mycompany.factorybuilder;
package edu.kau.fcit.lab4;

public class Archer implements Characters {
    private String name;
    private Avatar avatar;

    public Archer(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name = name;
        // TODO: instantiate an avatar builder using Avatar.Builder
        this.avatar = new Avatar.Builder(SkinTone.LIGHT).withHairColor(HairColor.WHITE)
                .withHairType(HairType.LONG_STRAIGHT)
                .withFacialFeatures(FacialFeatures.CLEAN_SHAVEN).build();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Avatar getAvatar() {
        // TODO Auto-generated method stub
        return avatar;
    }

    @Override
    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;

    }

    @Override
    public String toString() {
        return this.name + " has " + this.avatar.toString();
    }
}
