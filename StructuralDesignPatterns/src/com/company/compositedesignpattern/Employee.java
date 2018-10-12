package com.company.compositedesignpattern;

import java.util.ArrayList;

//composite
public class Employee implements IEmployee {
    private String name;
    private int monthlySalary;
    private String designation;
    private ArrayList<IEmployee> subordinateList = new ArrayList<>();

    public Employee(String name, int monthlySalary, String designation) {
        super();
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public int getYearlySalary() {
        return monthlySalary * 12;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ArrayList<IEmployee> getSubordinateList() {
        return subordinateList;
    }

    public void setSubordinateList(ArrayList<IEmployee> subordinateList) {
        this.subordinateList = subordinateList;
    }

    public void addSubordinate(IEmployee employee) {
        subordinateList.add(employee);
    }

    public void removeSubordinate(IEmployee employee) {
        subordinateList.remove(employee);
    }
}
