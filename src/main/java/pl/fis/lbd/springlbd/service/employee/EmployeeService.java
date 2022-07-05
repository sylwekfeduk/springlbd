package pl.fis.lbd.springlbd.service.employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeService> findAll();
    String getEmployeeNickname(String firstName, String lastName);

}
