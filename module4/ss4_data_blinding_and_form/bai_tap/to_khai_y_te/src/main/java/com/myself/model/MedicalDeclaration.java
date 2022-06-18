package com.myself.model;

public class MedicalDeclaration {
    private String name;
    private String dayOfBirth;
    private String gender;
    private String national;
    private String idCard;
    private String travelInformation;
    private String idTravel;
    private String seat;
    private String DateOfDepartment;
    private String DateOfArrival;
    private String LocalPassed;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String dayOfBirth, String gender, String national, String idCard, String travelInformation, String idTravel, String seat, String dateOfDepartment, String dateOfArrival, String localPassed) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.national = national;
        this.idCard = idCard;
        this.travelInformation = travelInformation;
        this.idTravel = idTravel;
        this.seat = seat;
        DateOfDepartment = dateOfDepartment;
        DateOfArrival = dateOfArrival;
        LocalPassed = localPassed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getIdTravel() {
        return idTravel;
    }

    public void setIdTravel(String idTravel) {
        this.idTravel = idTravel;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDateOfDepartment() {
        return DateOfDepartment;
    }

    public void setDateOfDepartment(String dateOfDepartment) {
        DateOfDepartment = dateOfDepartment;
    }

    public String getDateOfArrival() {
        return DateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        DateOfArrival = dateOfArrival;
    }

    public String getLocalPassed() {
        return LocalPassed;
    }

    public void setLocalPassed(String localPassed) {
        LocalPassed = localPassed;
    }
}

