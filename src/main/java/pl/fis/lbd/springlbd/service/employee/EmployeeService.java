package pl.fis.lbd.springlbd.service.employee;

import org.springframework.stereotype.Repository;
import pl.fis.lbd.springlbd.entity.employee.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeService {

    Map<Long, Employee> database = new HashMap<>();

    List<EmployeeService> findAll();
    String getEmployeeNickname(String firstName, String lastName);

}
