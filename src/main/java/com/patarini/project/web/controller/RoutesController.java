package com.patarini.project.web.controller;

import com.patarini.project.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/routes")
public class RoutesController {
    private final RouteService routeService;

    public RoutesController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping
    public String getRoutesPage(@RequestParam(required = false) String error, Model model){
        if(error!=null && !error.isEmpty()){
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("routes", this.routeService.listAll());
        return "routes";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRoute(@PathVariable Long id){
        this.routeService.deleteById(id);
        return "redirect:/routes";
    }


}
