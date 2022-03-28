package com.kubeforce.payroll;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Function;
import java.util.Optional;

public class EmployeeFunction implements Function<Long,Employee>  {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee apply (Long s)
    {
        Optional<Employee> employeeOptional = employeeRepository.findById(s);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        }
        return null;
    }
}
