package isa.utm;

import isa.utm.Hospital.Hospital;
import isa.utm.Util.Address;
import isa.utm.Util.FullName;
import isa.utm.Util.Gender;
import isa.utm.Util.Phone;

import java.util.ArrayList;
import java.util.Date;

public class Person {
    public ArrayList<Hospital> hospitals = new ArrayList<Hospital>();

    public String title;
    public Date birthDate;
    public Gender gender;
    public Phone phone;

    private FullName name;
    private Address homeAddress;

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}
