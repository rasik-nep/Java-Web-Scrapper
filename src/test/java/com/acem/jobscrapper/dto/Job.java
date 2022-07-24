package com.acem.jobscrapper.dto;

import java.util.Date;

public class Job {

    private String name;
    private Date deadline;
    private Company company;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", deadline=" + deadline +
                ", company=" + company +
                '}';
    }

}
