package com.sfeir.octopus.back.shared.model;

public enum PeriodicityType {
    DAILY("1"), WEEKLY("2"), MONTHLY("3"), YEARLY("4");

    private String type;

    private PeriodicityType(String type) {
        this.type = type;
    }

    public String type(){
        return type;
    }
}
