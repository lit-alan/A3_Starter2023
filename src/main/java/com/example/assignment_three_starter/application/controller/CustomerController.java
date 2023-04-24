package com.example.assignment_three_starter.application.controller;

import com.example.assignment_three_starter.application.service.CustomerService;
import com.example.assignment_three_starter.model.Customer;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping({"", "/"})
    public String index() {
        return "index";
    }

    @GetMapping({"all", "/all"})
    public ModelAndView getAllByCountry(HttpServletRequest req) {

        List<Customer> customers = new ArrayList();
        customers = service.findAll();
        return new ModelAndView("/allCustomers", "cList",customers);

     }

    @GetMapping("/delete")
    @ResponseBody
    public String delete() {
        return "delete";
     }

    @GetMapping("/add")
    @ResponseBody
    public String add() {
        return "add";
    }

    @GetMapping("/edit")
    @ResponseBody
    public String edit() {
        return "edit";
    }


}
