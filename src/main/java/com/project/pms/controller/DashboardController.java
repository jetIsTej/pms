package com.project.pms.controller;

import com.project.pms.service.DashboardDataService;
import com.project.pms.vo.DashboardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @Autowired
    private DashboardDataService dashboardDataService;

    @Autowired
    private DashboardVO dashboardVO;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dashboardData")
    public @ResponseBody DashboardVO getDashBoardData(){
        return dashboardDataService.getDashboardData();
    }

}
