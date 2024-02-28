package com.codegym.controller;

import com.codegym.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @GetMapping("customers")
    public String showList(HttpServletRequest request){
//        List<Customer> customers = custommerService.findAll();
//        request.setAttribute("customers", customers);
        return "customerList.jsp";
    }



}
