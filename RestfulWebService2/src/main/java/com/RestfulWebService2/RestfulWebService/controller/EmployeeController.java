package com.RestfulWebService2.RestfulWebService.controller;

import com.RestfulWebService2.RestfulWebService.entity.Employee;
import com.RestfulWebService2.RestfulWebService.service.EmployeeDataLoaderService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
@Tag(name = "Controller Class for Employee", description = "Operations related to Employee Entity")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDataLoaderService employeeDataLoaderService;

    @PostMapping("add/verify")
    Employee addEmployeeWithVerification(@RequestBody Employee employee){
        employeeDataLoaderService.addEmployee(employee);
        return employeeDataLoaderService.getEmployee(employee.getId());
    }

    @Operation(description = "Adds Employee in XML Format")
    @PostMapping(value = "add/XML", consumes ="application/xml")
    void addEmployeeUsingXML(@RequestBody Employee employee){
        employeeDataLoaderService.addEmployee(employee);
    }
    @Operation(description = "Returns a List of Employee present at the moment in Database")
    @GetMapping(value = "/getList", produces = MediaType.APPLICATION_XML_VALUE)
    List<Employee> getEmployeeList(){
        return employeeDataLoaderService.getList();
    }

    @GetMapping("/filtered")
    MappingJacksonValue getFilterResponse(@RequestParam Long id){
        Employee employee = employeeDataLoaderService.getEmployee(id);
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("employeeFilter", SimpleBeanPropertyFilter.filterOutAllExcept("name", "age", "id"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(employee);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
    @Operation(description = "Deletes the Employee as specified by the Query Parameter")
    @DeleteMapping("/delete")
    void deleteUser(@RequestParam Long id){
        employeeDataLoaderService.removeEmployee(id);
    }

    @GetMapping(value = "/versioning/mimeType", produces = MediaType.APPLICATION_XML_VALUE)
    String mimeVersion1(){
        return "Version 1 of Mine Type";
    }
    @GetMapping(value = "/versioning/mimeType", produces = MediaType.APPLICATION_JSON_VALUE)
    String mimeVersion2(){
        return "Version 2 of Mine Type";
    }

    @GetMapping(value = "/versioning/requestParam", params = "version=1")
    String requestParamVersion1(){
        return "Version 1 of Request Param";
    }

    @GetMapping(value = "/versioning/requestParam", params = "version=2")
    String requestParamVersion2(){
        return "Version 2 of Request Param";
    }

    @GetMapping("versioning/v1")
    String uriVersion1(){
        return "Version1 of URI";
    }

    @GetMapping("versioning/v2")
    String uriVersion2(){
        return "Version2 of URI";
    }

    @GetMapping(value = "versioning/header", headers = "api=v1")
    String headerVersion1(){
        return "Version 1 of Header";
    }
    @GetMapping(value = "versioning/header", headers = "api=v2")
    String headerVersion2(){
        return "Version 2 of Header";
    }

    @GetMapping("hateosEmployee/{id}")
    EntityModel<Employee> getEmployeeHateos(@PathVariable Long id){
        Employee employee = employeeDataLoaderService.getEmployee(id);
        EntityModel<Employee> entityModel = EntityModel.of(employee);
        Link link = linkTo(methodOn(EmployeeController.class).getEmployeeList()).withRel("List of All Employee").withName("All Employee Details");
        entityModel.add(link);
        return entityModel;
    }
}
