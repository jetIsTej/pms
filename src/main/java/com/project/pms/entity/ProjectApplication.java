package com.project.pms.entity;

import com.datastax.driver.core.LocalDate;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table(value = "project_app")
public class ProjectApplication {
    @PrimaryKey("proj_app_uuid")
    private UUID projectApplicationUUID;
    @Column("proj_app_id")
    private Integer projectApplicationId;
    @Column("proj_app_name")
    private String projectApplicationName;
    @Column("proj_acc_name")
    private String projectAccountName;
    @Column("proj_location")
    private String location;
    @Column("proj_app_start_date")
    private LocalDate projectApplicationStartDate;
    @Column("proj_app_end_date")
    private LocalDate projectApplicationEndDate;
    @Column("proj_app_team_size")
    private Integer projectApplicationTeamSize;
    @Column("proj_manager_fname")
    private String projectManagerFirstName;
    @Column("proj_manager_lname")
    private String projectManagerLastName;
    @Column("proj_sm_fname")
    private String projectScrumMasterFirstName;
    @Column("proj_sm_lname")
    private String projectScrumMasterLastName;
    @Column("proj_tl_fname")
    private String projectTeamLeadFirstName;
    @Column("proj_tl_lname")
    private String projectTeamLeadLastName;

    public UUID getProjectApplicationUUID() {
        return projectApplicationUUID;
    }

    public void setProjectApplicationUUID(UUID projectApplicationUUID) {
        this.projectApplicationUUID = projectApplicationUUID;
    }

    public Integer getProjectApplicationId() {
        return projectApplicationId;
    }

    public void setProjectApplicationId(Integer projectApplicationId) {
        this.projectApplicationId = projectApplicationId;
    }

    public String getProjectApplicationName() {
        return projectApplicationName;
    }

    public void setProjectApplicationName(String projectApplicationName) {
        this.projectApplicationName = projectApplicationName;
    }

    public String getProjectAccountName() {
        return projectAccountName;
    }

    public void setProjectAccountName(String projectAccountName) {
        this.projectAccountName = projectAccountName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getProjectApplicationStartDate() {
        return projectApplicationStartDate;
    }

    public void setProjectApplicationStartDate(LocalDate projectApplicationStartDate) {
        this.projectApplicationStartDate = projectApplicationStartDate;
    }

    public LocalDate getProjectApplicationEndDate() {
        return projectApplicationEndDate;
    }

    public void setProjectApplicationEndDate(LocalDate projectApplicationEndDate) {
        this.projectApplicationEndDate = projectApplicationEndDate;
    }

    public Integer getProjectApplicationTeamSize() {
        return projectApplicationTeamSize;
    }

    public void setProjectApplicationTeamSize(Integer projectApplicationTeamSize) {
        this.projectApplicationTeamSize = projectApplicationTeamSize;
    }

    public String getProjectManagerFirstName() {
        return projectManagerFirstName;
    }

    public void setProjectManagerFirstName(String projectManagerFirstName) {
        this.projectManagerFirstName = projectManagerFirstName;
    }

    public String getProjectManagerLastName() {
        return projectManagerLastName;
    }

    public void setProjectManagerLastName(String projectManagerLastName) {
        this.projectManagerLastName = projectManagerLastName;
    }

    public String getProjectScrumMasterFirstName() {
        return projectScrumMasterFirstName;
    }

    public void setProjectScrumMasterFirstName(String projectScrumMasterFirstName) {
        this.projectScrumMasterFirstName = projectScrumMasterFirstName;
    }

    public String getProjectScrumMasterLastName() {
        return projectScrumMasterLastName;
    }

    public void setProjectScrumMasterLastName(String projectScrumMasterLastName) {
        this.projectScrumMasterLastName = projectScrumMasterLastName;
    }

    public String getProjectTeamLeadFirstName() {
        return projectTeamLeadFirstName;
    }

    public void setProjectTeamLeadFirstName(String projectTeamLeadFirstName) {
        this.projectTeamLeadFirstName = projectTeamLeadFirstName;
    }

    public String getProjectTeamLeadLastName() {
        return projectTeamLeadLastName;
    }

    public void setProjectTeamLeadLastName(String projectTeamLeadLastName) {
        this.projectTeamLeadLastName = projectTeamLeadLastName;
    }
}
