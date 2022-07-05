package pl.fis.lbd.springlbd.service.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("impl1")
public class EmployeeImpl1 implements EmployeeService{
    @Override
    public List<EmployeeService> findAll() {
        return null;
    }
}
