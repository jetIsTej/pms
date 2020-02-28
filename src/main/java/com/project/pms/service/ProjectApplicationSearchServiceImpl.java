package com.project.pms.service;

import com.project.pms.dao.ProjectApplicationDAO;
import com.project.pms.entity.ProjectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProjectApplicationSearchServiceImpl implements ProjectApplicationSearchService {

    @Autowired
    private ProjectApplicationDAO projectApplicationDAO;

    @Override
    public List<ProjectApplication> searchByProjectAccountName(String projectAccountName) {
        return null;
    }

    @Override
    public List<ProjectApplication> searchByProjectManagerFirstName(String projectMangerFirstName) {
        return null;
    }

    @Override
    public List<ProjectApplication> searchByScrumMasterFirstName(String scrumMasterFirstName) {
        return null;
    }

    @Override
    public List<ProjectApplication> searchByTeamLeadFirstName(String teamLeadFirstName) {
        return null;
    }

    @Override
    public ProjectApplication searchByProjectApplicationName(String projectApplicationName) {
        return null;
    }

    @Override
    public Integer getTotalProjectApplications() {
        return projectApplicationDAO.getTotalProjectApplicationsCount();
    }

    @Override
    public List<ProjectApplication> getAll() {
        return projectApplicationDAO.getAllProjectApplications();
    }

    @Override
    public Object searchByUUID(UUID uuid) {
        return null;
    }

    @Override
    public Object searchById(Integer id) {
        return null;
    }
}
