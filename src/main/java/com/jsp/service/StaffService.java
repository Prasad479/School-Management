package com.jsp.service;

import java.util.List;

import com.jsp.dao.StaffDao;
import com.jsp.dto.StaffDto;

public class StaffService {

	StaffDao staffDao = new StaffDao();

	public StaffDto saveStaff(StaffDto staff) {
		return staffDao.saveStaff(staff);
	}

	public StaffDto deleteStaff(int id) {
		return staffDao.deleteStaff(id);
	}

	public StaffDto updateStaffName(int id, String name) {
		return staffDao.updateStaffName(id, name);
	}

	public StaffDto updateStaffEmail(int id, String email) {
		return staffDao.updateStaffEmail(id, email);
	}

	public StaffDto updateStaffJob(int id, String job) {
		return staffDao.updateStaffJob(id, job);
	}

	public StaffDto getStaff(int id) {
		return staffDao.getStaff(id);
	}

	public List<StaffDto> getAllStaffs() {
		return staffDao.getAllStaffs();
	}

}
