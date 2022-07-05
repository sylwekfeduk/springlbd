package pl.fis.lbd.springlbd.service.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("impl2")
public class EmployeeImpl2 implements EmployeeService{
    @Override
    public List<EmployeeService> findAll() {
        return null;
    }
}
