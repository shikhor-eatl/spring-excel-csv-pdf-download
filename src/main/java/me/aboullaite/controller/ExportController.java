package me.aboullaite.controller;

import me.aboullaite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ExportController {

    @Autowired
    private UserService userService;

    /**
     * Handle request to download an Excel document
     */
    @GetMapping("/download")
    public Object download() {
        Map<String, Object> model = new HashMap<>();
        model.put("users", userService.findAllUsers());
        return model;
    }
}
