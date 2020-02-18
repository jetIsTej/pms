package com.project.pms.entity;

import com.datastax.driver.core.LocalDate;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class ProjectApplication {
    private Integer projectApplicationId;
    private String applicationName;
    private String accountName;
    private String location;
    private LocalDate projectApplicationStartDate;
    private LocalDate projectApplicationEndDate;
    private Integer projectApplicationTeamSize;
    private String projectManagerFirstName;
    private String projectManagerLastName;
    private String projectScrumMasterFirstName;
    private String projectScrumMasterLastName;
    private String projectTeamLeadFirstName;
    private String projectTeamLeadLastName;
}
