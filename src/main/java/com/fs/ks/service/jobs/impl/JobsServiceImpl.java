package com.fs.ks.service.jobs.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fs.ks.dao.JobsDAO;
import com.fs.ks.model.Job;
import com.fs.ks.service.jobs.JobsService;
import com.fs.ks.utility.GlobalConstant;

@Service
@Transactional
public class JobsServiceImpl implements JobsService {

static Logger logger = LoggerFactory.getLogger(JobsServiceImpl.class);
    
    @Autowired
    private JobsDAO jobsDAO;
    
    @Override
    public List<Job> getJobs() throws Exception {
    	return jobsDAO.getJobs();
    }
    
    public Integer addJob(Job job) throws Exception{
    	Job jobCheck = this.getJob(job.getJobName());
    	if(jobCheck!=null){
			logger.debug( "The role [" + jobCheck.getJobName() + "] already exists");
			return GlobalConstant.OBJECT_DUPLICATE;
		}else{
			jobsDAO.addJob(job);
			return GlobalConstant.ACTION_SUCCESSFUL;
		}
    }
    
    @Override
    public Job getJob(String jobname){
        return jobsDAO.getJob(jobname);
    }
}
