package pl.fis.lbd.springlbd.service.employee;

import org.springframework.stereotype.Repository;
import pl.fis.lbd.springlbd.entity.employee.Employee;

import java.util.*;

@Repository
public interface EmployeeService {

    Map<Long, Employee> database = new HashMap<>();

    List<EmployeeService> findAll();
    String getEmployeeNickname(String firstName, String lastName);
    default Employee save(Employee employee) {
        database.put(employee.getId(), employee);
        return employee;
    }
    default List<Employee> findByName(String name) {
        List<Employee> temp = new ArrayList<>();
        for(Employee employee : database.values()) {
            if (employee.getFirstName().equals(name) || employee.getLastName().equals(name))
                temp.add(employee);
        }
        return temp;
    }

}
