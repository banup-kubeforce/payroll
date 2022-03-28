package com.kubeforce.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Map;
import java.util.Objects;
@Entity
@Table(name= "employee")
public class Employee {


        @Id
        @GeneratedValue(generator = "UUID")
        private Long id;

        private String name;

        private int employeeIdentifier;

        private String email;

        private String salary;

    public Employee(String name, int employeeIdentifier, String email, String salary)
    {
        this.name = name;
        this.employeeIdentifier = employeeIdentifier;
        this.email = email;
        this.salary = salary;
    }

    public Employee() {

    }


    public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public int getEmployeeIdentifier ()
        {
            return employeeIdentifier;
        }

        public void setCustomerIdentifier (int employeeIdentifier)
        {
            this.employeeIdentifier = employeeIdentifier;
        }

        public String getEmail ()
        {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        public String getSalary ()
        {
            return salary;
        }

        public void setSalary (String salary)
        {
            this.salary = salary;
        }

        public Long getId ()
        {
            return id;
        }

        public void setId (Long id)
        {
            this.id = id;
        }
}
