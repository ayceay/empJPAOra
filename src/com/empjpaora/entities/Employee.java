/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empjpaora.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Administrator
 */
@Entity
@SequenceGenerator(name = "seq" , sequenceName = "MY_SEQ" , allocationSize = 1)
@NamedQuery(query = "select e from Employee e where e.salary = :maas" , name = "findBySalary")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private int eid;
    private String ename;
    private double salary;
     private String degree;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
   
    @Override
    public String toString()
    {
        return this.getEid() + " - " + this.getEname() + " - " + this.getSalary() + " - " + this.getSalary();
    }
    
}
