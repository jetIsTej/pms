package com.project.pms.controller;

import com.project.pms.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditController {
    @Autowired
    private ModifyService modifyService;
}
