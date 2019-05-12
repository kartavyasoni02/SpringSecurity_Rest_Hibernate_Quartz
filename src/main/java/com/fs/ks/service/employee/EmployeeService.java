package com.fs.ks.service.employee;

import java.util.List;

import com.fs.ks.model.Employee;
import com.fs.ks.model.UserEmployee;

public interface EmployeeService {

    public Integer addUpdateEmployee(Employee employee) throws Exception;

    public Employee getEmployee(int id) throws Exception;
    
    public Employee getEmployee(String firstName, String lastName) throws Exception;

    public List<UserEmployee> getEmployees() throws Exception;
}
