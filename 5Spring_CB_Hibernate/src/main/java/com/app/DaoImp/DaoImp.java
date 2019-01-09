package com.app.DaoImp;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.Dao.Dao;
import com.app.model.Employee;

@Repository
public class DaoImp implements Dao {

	@Autowired
	SessionFactory sf;
	@Override
	public int registation(Employee emp) {
		Session session = sf.openSession();
		int x = (int) session.save(emp);
		session.beginTransaction().commit();
		return x;
	}
	public List<Employee> alldata() {
		Session session = sf.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> q = builder.createQuery(Employee.class);
		Root<Employee> root = q.from(Employee.class);
		q.select(root);
		Query q1 = session.createQuery(q);
		List<Employee> list = q1.list();
		return list;

	}

	@Override
	public List<Employee> login(Employee emp) {
		List<Employee> list = new ArrayList<Employee>();
		Session session = sf.openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> q = builder.createQuery(Employee.class);
		Root<Employee> root = q.from(Employee.class);
		q.select(root).where(builder.equal(root.get("uname"), emp.getUname()),
				builder.equal(root.get("pass"), emp.getPass()));
		Query<Employee> q1 = session.createQuery(q);
		List<Employee> list1 = q1.getResultList();
		if (!list1.isEmpty()) {
			list = alldata();
		}
		return list;
	}

	@Override
	public List<Employee> delete(int eid) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Employee employee = session.get(Employee.class, eid);
		session.delete(employee);
		t.commit();

		List<Employee> li = this.alldata();
		return li;

		/*
		 * CriteriaBuilder builder = session.getCriteriaBuilder();
		 * CriteriaDelete<Employee> delete =
		 * builder.createCriteriaDelete(Employee.class); Root<Employee> root =
		 * delete.from(Employee.class); delete.from(Employee.class);
		 * System.out.println(eid);
		 * //delete.where(builder.equal(root.get("eid"),eid));
		 * delete.where(builder.equal(root.get("eid"), eid));
		 * 
		 * Query<Employee> q=session.createQuery(delete); int
		 * x=q.executeUpdate(); t.commit(); if(x>0){ list=alldata();
		 * 
		 * } return list;
		 */
	}

	@Override
	public List<Employee> update1(Employee emp) {
		List<Employee> list = new ArrayList<Employee>();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaUpdate<Employee> query = builder
				.createCriteriaUpdate(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.set(root.get("name"), emp.getName())
				.set(root.get("address"), emp.getAddress())
				.set(root.get("mail"), emp.getMail())
				.set(root.get("uname"), emp.getUname())
				.set(root.get("pass"), emp.getPass());
		query.where(builder.equal(root.get("eid"), emp.getEid()));
		Query<Employee> q = session.createQuery(query);
		int x = q.executeUpdate();
		t.commit();
		if (x > 0) {

			list = this.alldata();
		}
		return list;
	}

	@Override
	public Employee edit(int eid) {

		Session session = sf.openSession();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Employee> q = builder.createQuery(Employee.class);
		Root<Employee> root = q.from(Employee.class);

		q.select(root).where(builder.equal(root.get("eid"), eid));
		Query<Employee> query = session.createQuery(q);
		Employee emp = query.getSingleResult();
		return emp;
	}

}
