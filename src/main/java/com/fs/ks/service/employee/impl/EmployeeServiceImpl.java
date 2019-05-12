package com.fs.ks.service.employee.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.ks.dao.EmployeeDAO;
import com.fs.ks.model.Employee;
import com.fs.ks.model.UserEmployee;
import com.fs.ks.service.employee.EmployeeService;
import com.fs.ks.service.role.impl.RoleServiceImpl;
import com.fs.ks.utility.GlobalConstant;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	 static Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
	    
	    @Autowired
	    private EmployeeDAO employeeDAO;
	
	@Override
	public Integer addUpdateEmployee(Employee employee) throws Exception {
		
    	logger.info("in addUpdateEmployee");
    	if(employee.getEmployeeId() == null){
    		employeeDAO.addEmployee(employee);
			return GlobalConstant.ACTION_SUCCESSFUL;
    	}
    	else{
    		employeeDAO.updateEmployee(employee);
    		return GlobalConstant.ACTION_SUCCESSFUL;
    	}
    	
	}

	@Override
	public Employee getEmployee(int id) throws Exception {
		
		return employeeDAO.getEmployee(id);
	}

	@Override
	public Employee getEmployee(String firstName, String lastName) throws Exception {
		return employeeDAO.getEmployee(firstName, lastName);
		
	}

	@Override
	public List<UserEmployee> getEmployees() throws Exception {
		return employeeDAO.getEmployees();
	}
}
