package com.ehrazjava.jobms.job.mapper;

import com.ehrazjava.jobms.job.Job;
import com.ehrazjava.jobms.job.dto.JobDTO;
import com.ehrazjava.jobms.job.external.Company;
import com.ehrazjava.jobms.job.external.Review;

import java.util.List;

public class JobMapper {

    public static JobDTO mapToJobWithCompanyDTO(Job job, Company company, List<Review> reviewList){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        jobDTO.setReviews(reviewList);

        return jobDTO;
    }
}
