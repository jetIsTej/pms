package com.project.pms.dao.repositories;

import com.project.pms.entity.ProjectApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProjectApplicationRepository extends CrudRepository<ProjectApplication, UUID> {
    List<ProjectApplication> findByProjectApplicationId(Integer projApplicationId);
    List<ProjectApplication> findByProjectApplicationName(String projApplicationName);
    List<ProjectApplication> findByProjectAccountName(String projAccountName);
    List<ProjectApplication> findByProjectManagerFirstName(String projectManagerFirstName);
    List<ProjectApplication> findByProjectManagerFirstNameLike(String nameExpression);
    List<ProjectApplication> findByProjectScrumMasterFirstName(String projectScrumMasterFirstName);
    List<ProjectApplication> findByProjectTeamLeadFirstName(String projectTeamLeadFirstName);
    List<ProjectApplication> findAll();
    Optional<ProjectApplication> findById(UUID projectUUID);
}
