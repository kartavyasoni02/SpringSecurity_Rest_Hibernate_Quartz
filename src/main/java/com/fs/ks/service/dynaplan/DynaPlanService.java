package com.fs.ks.service.dynaplan;

import java.util.List;

import com.fs.ks.model.DynaPlan;

public interface DynaPlanService {

	public Integer addDynaPlan(DynaPlan dynaPlan) throws Exception;
	 
	public List<DynaPlan> getDynaPlans() throws Exception;
	
	public DynaPlan getDynaPlan(String dynaPlanName) throws Exception;
	
	public void deleteDynaPlan(int id) throws Exception;
	
	public DynaPlan getDynaPlan(int id) throws Exception;
	
	public Integer updateDynaPlan(DynaPlan dynaPlan) throws  Exception;
	
	public List<Object> getDynaPlanDetails()throws  Exception;
}
