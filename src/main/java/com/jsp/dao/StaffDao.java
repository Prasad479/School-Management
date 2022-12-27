package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StaffDto;
import com.jsp.dto.TeacherDto;

public class StaffDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prasad");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public StaffDto saveStaff(StaffDto staff) {
		entityTransaction.begin();
		entityManager.persist(staff);
		entityTransaction.commit();
		System.out.println("Save successfully");
		return staff;
	}

	public StaffDto deleteStaff(int id) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if (staff != null) {
			entityTransaction.begin();
			entityManager.remove(staff);
			entityTransaction.commit();
			System.out.println("Delete successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public StaffDto updateStaffName(int id, String name) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if (staff != null) {
			staff.setName(name);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public StaffDto updateStaffEmail(int id, String email) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if (staff != null) {
			staff.setEmail(email);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Email updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public StaffDto updateStaffJob(int id, String job) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if (staff != null) {
			staff.setJob(job);
			entityTransaction.begin();
			entityManager.merge(staff);
			entityTransaction.commit();
			System.out.println("Job updated successfully");
		} else {
			System.out.println("Staff not exist");
		}
		return staff;
	}

	public StaffDto getStaff(int id) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		if (staff != null) {
			return staff;
		} else {
			System.out.println("staff not exist");
		}
		return null;
	}

	public List<StaffDto> getAllStaffs() {
		String sql = "Select s from StaffDto s";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
}
