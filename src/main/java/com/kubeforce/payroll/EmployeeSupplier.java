package com.kubeforce.payroll;

import java.util.function.Supplier;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class EmployeeSupplier implements Supplier
{
    public static final Logger LOGGER = LoggerFactory.getLogger(EmployeeSupplier.class);

    @Autowired
    private EmployeeRepository EmployeeRepository;

    @Override
    public Employee get ()
    {
        List <Employee>employees = EmployeeRepository.findAll();
        LOGGER.info("Getting the employee of our choice - ", employees);
        return employees.get(0);
    }
}

