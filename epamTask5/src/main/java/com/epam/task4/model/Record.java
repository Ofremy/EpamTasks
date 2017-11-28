package com.epam.task4.model;

/**
 * Created by Orest
 * 24.11.2017
 * Java Version 1.8.
 */
public class Record {
    private String surName;
    private String firstName;
    private String phone;
    private String address;

    public Record() {

    }

    public Record(String surName, String firstName, String phone, String address) {
        this.surName = surName;
        this.firstName = firstName;
        this.phone = phone;
        this.address = address;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (surName != null ? !surName.equals(record.surName) : record.surName != null) return false;
        if (firstName != null ? !firstName.equals(record.firstName) : record.firstName != null) return false;
        if (phone != null ? !phone.equals(record.phone) : record.phone != null) return false;
        return address != null ? address.equals(record.address) : record.address == null;

    }

    @Override
    public int hashCode() {
        int result = surName != null ? surName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
