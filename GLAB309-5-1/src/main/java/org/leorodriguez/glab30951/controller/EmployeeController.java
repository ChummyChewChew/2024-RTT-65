package org.leorodriguez.glab30951.controller;
import org.leorodriguez.glab30951.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
/*
Controller marks a class as a Spring MVC controller that process oncoming HTTP requests
Returns views names and matches them to actual views
primarily used to return web pages
 */
@Controller
public class EmployeeController {
    private Map<Long, Employee> employeeMap = new HashMap<>();

    @GetMapping("/employeeform")//// Maps HTTP GET requests to /employeeform to this method
    public String empForm() {//Declares the empform method that returns a view name
        return "employeeForm"; //returns the name of the view to be rendered
    }

    @PostMapping("/addEmployee")// maps HTTP POST request to //addEmployee to this method
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model) {
         // Declares the submit method,
            // binds form data to an Employee object, and uses ModelMap to pass attributes to the view

        model.addAttribute("name", employee.getName());// Adds the employee's name as an attribute to the model
        model.addAttribute("id", employee.getId());//same for id
        model.addAttribute("contactNumber", employee.getContactNumber());//same for contact number
        employeeMap.put(employee.getId(), employee);// Stores the employee in the employeeMap with the ID as the key
        return "employeeView";// Returns the name of the view to be rendered

}
}