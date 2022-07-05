package pl.fis.lbd.springlbd.service.employee;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("dev")
@Service
public class EmployeeImpl1 implements EmployeeService {

    @Value("${prefix}")
    private String prefix;

    @Value("${suffix}")
    private String suffix;

    @Override
    public List<EmployeeService> findAll() {
        return null;
    }

    @Override
    public String getEmployeeNickname(String firstName, String lastName) {
        return prefix+firstName.substring(0,3)+lastName.substring(0,3)+suffix;
    }
}
