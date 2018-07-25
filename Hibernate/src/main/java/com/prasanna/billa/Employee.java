package com.prasanna.billa;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee() {
    }

    /*public Employee(String name, float salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
*/
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}