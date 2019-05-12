package com.fs.ks.dao;

import java.util.List;

import com.fs.ks.model.Job;

/**
 * 
 * @author archit.kashyap
 *
 */
public interface JobsDAO {

	public List<Job> getJobs();
	
	public void addJob(Job job) throws Exception;
	
	public Job getJob(String usersJob);
}
