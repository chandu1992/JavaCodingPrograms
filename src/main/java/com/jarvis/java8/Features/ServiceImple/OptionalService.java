package com.jarvis.java8.Features.ServiceImple;

import com.jarvis.java8.Features.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OptionalService {

    @Autowired
    private EmployeeService employeeService;

    public void optionalTest() throws Exception {






       // return null

//        Optional<List<Employee>> optDataOf = Optional.of(data1);   // data is null so of() not handle null pointer exc
//        System.out.println(optDataOf.isPresent());

        List<Employee> data1 = employeeService.getEmployeesNoData();
        Optional<List<Employee>> optDataOfNullable = Optional.ofNullable(data1);
        optDataOfNullable.ifPresentOrElse(
                e -> System.out.println(e.get(1).getEmployeeId()),      // getEmployeeId = null so part not executes
                () -> System.out.println("Employee not found")    // this execute
        );

        List<Employee> data = employeeService.getEmployeesContainNull();
        Optional<List<Employee>> optData = Optional.ofNullable(data);
        optData.ifPresentOrElse(
                e -> System.out.println(e.get(1).getEmployeeId()),      // getEmployeeId = 2  this execute
                () -> System.out.println("Employee not found")    // this not  execute
        );

        List<Employee> empData = employeeService.getEmployeesContainNull();
        Optional<List<Employee>> empDataOpt = Optional.ofNullable(empData);

        // ifPresent() if data present then execute the code. If data not present code not execute
        empDataOpt.ifPresent(employee ->{
            System.out.println(employee.size());   // 100000
        });

        System.out.println(optDataOfNullable.isPresent()); // data not present isPresent() give false



        List<Employee> dataSome = employeeService.getEmployeesContainSomeNull();
        Optional<List<Employee>> optDataSome = Optional.ofNullable(data);

        optDataSome.ifPresentOrElse(
                e -> {
                    String cityname = e.get(1).getAddresses().get(0).getCity(); // cityname = null

                    Optional.ofNullable(cityname)
                            .ifPresentOrElse(
                                    city -> System.out.println(cityname.toUpperCase()),
                                    () -> System.out.println("City is null")            // this execute
                            );

                },
                () -> System.out.println("Employee not found")    // this not  execute
        );

        if(optData.isPresent()){     // isPresent() return true if data present
            System.out.println("data is present");
        }


        List<Employee> empdatatest = employeeService.getEmployeesContainSomeNull();
        Optional<List<Employee>> testdata = Optional.ofNullable(empdatatest);

        //if getSalary salary=500000 it returns 500000. if salary is null then return 0
        //if null found what we give in orElse block it will execute
        testdata.ifPresent(empObj->{
            System.out.println(Optional.ofNullable(empObj.get(2).getSalary()).orElse(0));
        });

        testdata.ifPresent(empObj->{
            System.out.println(Optional.ofNullable(empObj.get(2).getSalary()).orElseGet(()->0));
        });

        Employee emp = testdata.get().get(1);
        System.out.println(emp);


       Optional<List<Employee>> e= testdata.stream().findFirst();

       e.ifPresent(emp1 ->{
           System.out.println(emp1.size());
       });
    }
}
