package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface Service1 {
	
	public int registation(Employee emp);
	public List<Employee> login(Employee emp);
    public List<Employee> delete(int eid);
    
    public List<Employee> update1(Employee emp);
    
    public Employee edit(int eid);
    
}
