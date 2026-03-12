package com.jarvis.java8.Features.ServiceImple;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jarvis.java8.Features.model.Employee;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream =
                new ClassPathResource("employeesdata.json").getInputStream();

        List<Employee> employees =
                mapper.readValue(inputStream, new TypeReference<List<Employee>>() {});

        return employees;
    }

    public List<Employee> getEmployeesContainNull() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream =
                new ClassPathResource("employeesdatanulls.json").getInputStream();

        List<Employee> employees =
                mapper.readValue(inputStream, new TypeReference<List<Employee>>() {});

        return employees;
    }

    public List<Employee> getEmployeesNoData() throws Exception {

        List<Employee> employees = new ArrayList<>();


        return  null;
    }


    public List<Employee> getEmployeesContainSomeNull() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream inputStream =
                new ClassPathResource("employeessomenull.json").getInputStream();

        List<Employee> employees =
                mapper.readValue(inputStream, new TypeReference<List<Employee>>() {});

        return employees;
    }
}
