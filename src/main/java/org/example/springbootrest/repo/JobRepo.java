package org.example.springbootrest.repo;

import org.example.springbootrest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core java", 1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Spring Developer", "Must have good experience in core java", 1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(3, "Spring Boot Developer", "Must have good experience in core java", 1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(4, "React Developer", "Must have good experience in core java", 1,List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))
    ));
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }

    public JobPost getJob(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId)
                return job;
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost job : jobs){
            if(job.getPostId() == jobPost.getPostId()){
//                job.setPostId(jobPost.getPostId());
                job.setPostProfile(jobPost.getPostProfile());
                job.setPostDesc(jobPost.getPostDesc());
                job.setPostTechStack(jobPost.getPostTechStack());
                job.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost job : jobs){
            if(job.getPostId() == postId){
                jobs.remove(job);
            }
        }
    }
}

