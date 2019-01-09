package com.app.serviceImp;

import java.lang.annotation.Annotation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.Dao;
import com.app.model.Employee;
import com.app.service.Service1;

@Service
public class ServiceImp implements Service1 {
  
	@Autowired
	Dao daoobj;

	@Override
	public int registation(Employee emp) {
		return daoobj.registation(emp);
	}
	@Override
	public List<Employee> login(Employee emp) {
		return daoobj.login(emp);
	}

	@Override
	public List<Employee> delete(int eid) {
			return daoobj.delete(eid);
	}

	@Override
	public List<Employee> update1(Employee emp) {


		return daoobj.update1(emp);
	}

	@Override
	public Employee edit(int eid) {
		
		return daoobj.edit(eid);
	}






}
