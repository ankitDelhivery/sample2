package org.delhivery.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    private int id;
    private String name;
    private String role;

    public Employee(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString(){
        String def1 = "Employee Specs: Employee ID: "+id+", EmployeeName: "+name;
        String def2 = ", EmployeeRole: %s. Thanks for asking !!";
        return def1+String.format(def2, role);
    }

}
