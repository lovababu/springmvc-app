package org.avol.springmvc.model;

/**
 * Created by Durga on 8/4/2016.
 */
public enum Gender {

    FEMALE("female"), MALE("male");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
