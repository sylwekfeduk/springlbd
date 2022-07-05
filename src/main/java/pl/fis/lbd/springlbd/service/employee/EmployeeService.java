package pl.fis.lbd.springlbd.service.employee;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeService {

    List<EmployeeService> findAll();
    String getEmployeeNickname(String firstName, String lastName);

}
