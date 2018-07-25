package com.don.beti;

public class PermanentEmp {

    public static void main(String[] args) {
        Employee employee = new Employee(101);
        employee.setVendor("Mulesoft");
        System.out.println(employee.getVendor());
    }
}
