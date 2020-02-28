package com.project.pms.dao;

import com.project.pms.dao.repositories.ProjectApplicationRepository;
import com.project.pms.entity.ProjectApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.cql.CqlTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ProjectApplicationDAO {

    @Autowired
    private CassandraOperations cassandraTemplate;

    @Autowired
    private ProjectApplicationRepository projectApplicationRepository;

    private CqlTemplate getCqlTemplate(){
        return (CqlTemplate)cassandraTemplate.getCqlOperations();
    }

    // List results
    public List<ProjectApplication> getAllProjectApplications(){
        return projectApplicationRepository.findAll();
    }

    public List<ProjectApplication> getProjectApplicationsByAccountName(String projectAccountName){
        return projectApplicationRepository.findByProjectAccountName(projectAccountName);
    }

    public List<ProjectApplication> getProjectApplicationsByProjManagerFirstName(String projectManagerFirstName){
        return projectApplicationRepository.findByProjectManagerFirstName(projectManagerFirstName);
    }

    public List<ProjectApplication> getProjectApplicationsByScrumMasterFirstName(String scrumMasterFirstName){
        return projectApplicationRepository.findByProjectScrumMasterFirstName(scrumMasterFirstName);
    }

    public List<ProjectApplication> getProjectApplicationsByTeamLeadFirstName(String teamLeadFirstName){
        return projectApplicationRepository.findByProjectTeamLeadFirstName(teamLeadFirstName);
    }

    // Single results
    public ProjectApplication getProjectApplicationDetailByUUID(UUID projectUUID){
        Optional<ProjectApplication> value = projectApplicationRepository.findById(projectUUID);
        return value.orElse(null);
    }

    public ProjectApplication getProjectApplicationDetailByProjectId(){
        //TODO - NEED TO WRITE CASSANDRATEMPLATE QUERY
        return null;
    }

    public ProjectApplication getProjectApplicationDetailByProjectAppName(String projectApplicationName){
        List<ProjectApplication> projectApplicationList = projectApplicationRepository.findByProjectApplicationName(projectApplicationName);
        if(projectApplicationList != null && projectApplicationList.size() > 0)
            return projectApplicationList.get(0);
        else
            return null;
    }

    public boolean deleteProjectApplicationByUUID(UUID projectUUID){
        //TODO - NEED TO WRITE CASSANDRATEMPLATE QUERY
        return false;
    }

    public boolean deleteProjectApplicationByProjectId(Integer projectId){
        //TODO - NEED TO WRITE CASSANDRATEMPLATE QUERY
        return false;
    }

    public Integer getTotalProjectApplicationsCount() {
        String totalProjectApplicationsCount = "select count(*) from project_app";
        Long countValue = getCqlTemplate().queryForObject(totalProjectApplicationsCount, Long.class);
        return countValue.intValue();
    }
}
