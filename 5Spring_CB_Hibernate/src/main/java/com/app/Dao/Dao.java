package com.app.Dao;

import java.util.List;

import com.app.model.Employee;

public interface Dao {
	

	public int registation(Employee emp);
    
	public List<Employee> login(Employee emp);
    
    public List<Employee> delete(int eid);
    public List<Employee> update1(Employee emp);
    
    public Employee edit(int eid);
   

}
