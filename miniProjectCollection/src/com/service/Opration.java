package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Course;
import com.model.Faculty;

public class Opration {

	Scanner sc = new Scanner(System.in);
	Faculty f = new Faculty();
	List<Course> courseList = new ArrayList<>();

	public void addc() {
		System.out.println("how many courseu want to add");
		int tol = sc.nextInt();
		for (int i = 1; i <= tol; i++) {
			Course c = new Course();
			System.out.println("enter the cid");
			c.setCid(sc.nextInt());
			System.out.println("enter the courese name");
			c.setCname(sc.next());
			courseList.add(c);
		}
	}

	public void displayc() {

		System.out.println("CID\t CNAME");
		for (Course cc : courseList) {
			System.out.println(cc.getCid() + "\t" + cc.getCname());
		}
	}

	public void addf() {

		System.out.println("enetr fid");
		f.setFid(sc.nextInt());
		System.out.println("enetr th fname");
		f.setFname(sc.next());
		displayc();
		System.out.println("how many couser u want to add for given faaculty");
		int tol = sc.nextInt();
		for (int i = 1; i <= tol; i++) {
			// System.out.println("ADD all cousers for given faculty:");
			System.out.println("Eneter the couser for given faculty:");
			int cid = sc.nextInt();
			for (Course cl : courseList) {
				if (cid == cl.getCid()) {
					f.getClist().add(cl);
				}
			}
		}
	}

	public void displayf() {

		System.out.println(f.getFid());
		System.out.println(f.getFname());
		List<Course> clist = f.getClist();
		for (Course cf : clist) {
			// System.out.println(cf.getCid());
			System.out.println(cf.getCname());
		}
	}

}
