package com.project.pms.vo;

import org.springframework.stereotype.Component;

@Component
public class DashboardVO {
    private Integer totalEmployees;
    private Integer totalBilledEmployees;
    private Integer totalUnBilledEmployees;
    private Integer totalProjectApplications;

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public Integer getTotalBilledEmployees() {
        return totalBilledEmployees;
    }

    public void setTotalBilledEmployees(Integer totalBilledEmployees) {
        this.totalBilledEmployees = totalBilledEmployees;
    }

    public Integer getTotalUnBilledEmployees() {
        return totalUnBilledEmployees;
    }

    public void setTotalUnBilledEmployees(Integer totalUnBilledEmployees) {
        this.totalUnBilledEmployees = totalUnBilledEmployees;
    }

    public Integer getTotalProjectApplications() {
        return totalProjectApplications;
    }

    public void setTotalProjectApplications(Integer totalProjectApplications) {
        this.totalProjectApplications = totalProjectApplications;
    }
}
