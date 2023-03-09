package com.sandeep.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.ems.dao.EmployeeDao;
import com.sandeep.ems.entities.Employee;
import com.sandeep.ems.service.EHSService;
import com.sandeep.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	@Autowired
	EHSService healthInsuranceService;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeedao.save(employee);
	}

	@Override
	public List<Employee> retriveAllEmployees() {

		return employeedao.findAll();
	}

	@Override
	public Employee retriveEmployeeByid(Integer id) {

		return employeedao.findById(id).get();

	}

	@Override
	public void deleteEmployeesByid(Integer id) {
		employeedao.deleteById(id);

	}

	@Override
	public void deleteAllEmployees() {
		employeedao.deleteAll();
	}

}
