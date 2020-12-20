package com.patarini.project.web.controller;

import com.patarini.project.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/tollsapp")
public class LoggedInController {
    private final RouteService routeService;

    public LoggedInController(RouteService routeService) {
        this.routeService = routeService;
    }


    @GetMapping
    public String getHomePage(@RequestParam(required = false) String error, Model model){
        if(error!=null && !error.isEmpty()){
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        return "home-logged-in";
    }

    @PostMapping("/add")
    public String saveRoute(@RequestParam String pointA, @RequestParam String pointB, @RequestParam Long userID){
        this.routeService.save(pointA, pointB, userID);
        return "redirect:/tollsapp";
    }

}
