package pl.fis.lbd.SHcompany.model;

import java.util.List;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private Technology knownTechnology;
    private Departement employeeDepartement;
    private List<EmployeeRole> employeeRole;
    private EmployeeContract employeeContract;
    private CompanyBranch companyBranch;

}
