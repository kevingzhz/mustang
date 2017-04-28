package com.dimogo.open.myjobs.manager.admin.service;

import com.dimogo.open.myjobs.dto.*;

import java.util.List;

/**
 * Created by Ethan Xiao on 2017/4/19.
 */
public interface MyJobsService {

	List<ClusteredJobInfo> listJobs(int start, int pageSize);

	int countJobs();

	List<ExecutorInfo> listExecutors(int start, int pageSize);

	ExecutorDetails findExecutor(String executorId);

	int countExecutors();

	List<NotificationInfo> listNotifications(int start, int pageSize);

	int countNotifications();

	ClusteredJobInfo findJob(String jobName);

	void updateJob(ClusteredJobInfo jobInfo);

	List<ExecutorInfo> listJobExecutors(String job);

	List<JobExecutionDTO> listJobExecutions(String job);

}
