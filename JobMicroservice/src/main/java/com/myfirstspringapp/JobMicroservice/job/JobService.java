package com.myfirstspringapp.JobMicroservice.job;

import com.myfirstspringapp.JobMicroservice.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);
    JobDTO getById(Long id);
    Boolean deleteJob(Long id);
    boolean updateJob(Long id, Job updatedJob);
}
