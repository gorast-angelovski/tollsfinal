package com.patarini.project.web.controller;

import com.patarini.project.service.PaytollService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tollList")
public class TollsController {
    private final PaytollService paytollService;

    public TollsController(PaytollService paytollService) {
        this.paytollService = paytollService;
    }

    @GetMapping
    public String getTollsPage(@RequestParam(required = false) String error, Model model) {
        if (error != null && !error.isEmpty()) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("tolls", this.paytollService.listAll());
        return "tollList";
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String deleteToll(@PathVariable Long id) {
        this.paytollService.deleteById(id);
        return "redirect:/tollList";
    }
}
