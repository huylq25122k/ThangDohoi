package com.example.controller.controllerspring;

import com.example.dao.dao.model.User;
import com.example.springs.service.IService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerS {
    private IService iService;

    @GetMapping("/getUser")
    public List<User> getAll(){
        List<User> users = iService.getAll();
        return users;
    }
}
