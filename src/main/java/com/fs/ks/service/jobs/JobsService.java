package com.fs.ks.service.jobs;

import java.util.List;

import com.fs.ks.model.Job;

public interface JobsService {

	public List<Job> getJobs() throws Exception;
	
	public Integer addJob(Job job) throws Exception;
	
	 public Job getJob(String jobname);
}
