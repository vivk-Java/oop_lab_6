package isa.utm.Hospital.Staff;

import isa.utm.Person;

import java.util.ArrayList;
import java.util.Date;

public class Staff extends Person {
    public ArrayList<String> education = new ArrayList<String>();
    public ArrayList<String> certification = new ArrayList<String>();
    public ArrayList<String> languages = new ArrayList<String>();

    public Date joined;
}
