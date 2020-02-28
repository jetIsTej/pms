package com.project.pms.service;

import com.project.pms.vo.DashboardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardDataService{

    @Autowired
    private EmployeeSearchService employeeSearchService;

    @Autowired
    private ProjectApplicationSearchService projectApplicationSearchService;

    @Autowired
    private DashboardVO dashboardVO;

    public DashboardVO getDashboardData(){
        dashboardVO.setTotalEmployees(employeeSearchService.getTotalEmployees());
        dashboardVO.setTotalBilledEmployees(employeeSearchService.getTotalBilledEmployees());
        dashboardVO.setTotalUnBilledEmployees(employeeSearchService.getTotalUnbilledEmployees());
        dashboardVO.setTotalProjectApplications(projectApplicationSearchService.getTotalProjectApplications());
        return dashboardVO;
    }
}
