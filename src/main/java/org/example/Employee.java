package org.example;

// Immutable Class
final public class Employee {
    private final String name;
    private final String emp_id;

    public Employee(String name,String emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }
    public String getName(){
        return name;
    }

    public String getEmp_id(){
        return emp_id;
    }
}
