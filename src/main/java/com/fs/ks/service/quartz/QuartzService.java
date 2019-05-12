package com.fs.ks.service.quartz;

/**
 * @author kartavya.soni
 */
import java.util.List;

import com.fs.ks.domain.JobDetails;
import com.fs.ks.model.DynaPlanSchedulerDetails;
import com.fs.ks.model.QuartzModel;

public interface QuartzService {
	public QuartzModel scheduleJobs(QuartzModel model);

	public String stopJob(String job);

	List<JobDetails> getAllJobs();

	List<QuartzModel> populateAllScheduledJobs();

	public QuartzModel getScheduledJob(String jobName);

	public String startJob(String job);



}