package com.myfirstspringapp.JobMicroservice.job.mapper;

import com.myfirstspringapp.JobMicroservice.job.Job;
import com.myfirstspringapp.JobMicroservice.job.dto.JobDTO;
import com.myfirstspringapp.JobMicroservice.job.external.Company;
import com.myfirstspringapp.JobMicroservice.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDto(
            Job job,
            Company company,
            List<Review> reviews
    ){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReviews(reviews);

        return jobDTO;
    }
}
