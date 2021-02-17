package com.patarini.project.web.controller;

import com.patarini.project.service.PaytollService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tollsapp")
public class LoggedInController {
    private final PaytollService paytollService;

    public LoggedInController(PaytollService paytollService) {
        this.paytollService = paytollService;
    }


    @GetMapping
    public String getHomePage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        return "home-logged-in";
    }

//    @PostMapping("/add")
//    public String saveRoute(@RequestParam String nearestCity,
//                            @RequestParam String latitude,
//                            @RequestParam String longitude,
//                            @RequestParam Long userID) {
//        this.paytollService.save(nearestCity, latitude, longitude, userID);
//        return "redirect:/tollsapp";
//    }

}
