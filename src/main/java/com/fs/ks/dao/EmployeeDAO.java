package com.fs.ks.dao;

import java.util.List;

import com.fs.ks.model.Employee;
import com.fs.ks.model.UserEmployee;

public interface EmployeeDAO {

    public void addEmployee(Employee employee) throws Exception;

    public Employee getEmployee(int id) throws Exception;

    public Employee getEmployee(String firstName, String lastName) throws Exception;

    public Integer updateEmployee(Employee employee) throws Exception;

    public List<UserEmployee> getEmployees() throws Exception;

}
