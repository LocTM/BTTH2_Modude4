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
    public String list(HttpServletRequest request){
        List<Customer> customers = new ArrayList<>();
        customers.add( new Customer( "1","Tran Minh Lo1c","Loc@gmail.com","0941424386"));
        customers.add( new Customer( "2","Tran Minh Loc2","Loc@gmail.com","0941424386"));
        customers.add( new Customer( "3","Tran Minh Loc3","Loc@gmail.com","0941424386"));
        customers.add( new Customer( "4","Tran Minh Loc4","Loc@gmail.com","0941424386"));
        request.setAttribute("customers", customers);
        return "customerList.jsp";
    }



}
