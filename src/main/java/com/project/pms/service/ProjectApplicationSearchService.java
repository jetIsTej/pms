package com.project.pms.service;

import com.project.pms.entity.ProjectApplication;

import java.util.List;

public interface ProjectApplicationSearchService extends SearchService {
    List<ProjectApplication> searchByProjectAccountName(String projectAccountName);
    List<ProjectApplication> searchByProjectManagerFirstName(String projectMangerFirstName);
    List<ProjectApplication> searchByScrumMasterFirstName(String scrumMasterFirstName);
    List<ProjectApplication> searchByTeamLeadFirstName(String teamLeadFirstName);
    ProjectApplication searchByProjectApplicationName(String projectApplicationName);

    Integer getTotalProjectApplications();
}
