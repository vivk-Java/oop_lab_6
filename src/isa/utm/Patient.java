package isa.utm;

import isa.utm.Hospital.Staff.OperationsStaff;
import isa.utm.Util.History;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person {
    public ArrayList<OperationsStaff> operationsStaff;

    public String id;
    public Date accepted;
    public History sickness;

    public ArrayList<String> prescriptions = new ArrayList<String>();
    public ArrayList<String> allergies = new ArrayList<String>();
    public ArrayList<String> specialReqs = new ArrayList<String>();

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
