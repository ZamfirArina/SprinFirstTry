package com.webapp.sport;

public class Player {
    private String lastName;
    private String firstName;
    private String countryOfOrigin;

    public Player(String lastName, String firstName, String countryOfOrigin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Player{" +
                "lastName=" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", countryOfOrigin=" + countryOfOrigin +
                '}';
    }
}