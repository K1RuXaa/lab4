package Enums;

public enum Gender {
    Male(" "), Female("у "), Neuther("о "), All("и ");
    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}