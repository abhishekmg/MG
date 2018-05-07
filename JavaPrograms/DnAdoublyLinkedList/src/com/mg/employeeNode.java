package com.mg;

public class employeeNode {

    private employee employee;
    private employeeNode next;
    private employeeNode previous;

    public employeeNode(employee employee) {
        this.employee = employee;
    }

    public com.mg.employee getEmployee() {
        return employee;
    }

    public void setEmployee(com.mg.employee employee) {
        this.employee = employee;
    }

    public employeeNode getNext() {
        return next;
    }

    public void setNext(employeeNode next) {
        this.next = next;
    }

    public employeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(employeeNode previous) {
        this.previous = previous;
    }

    public String toString() {
        return employee.toString();
    }
}
