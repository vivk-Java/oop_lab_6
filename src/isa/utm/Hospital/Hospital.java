package isa.utm.Hospital;

import isa.utm.Person;
import isa.utm.Util.Address;
import isa.utm.Util.Phone;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Person> persons;
    public ArrayList<Department> departments;

    public String name;
    public Phone phone;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
