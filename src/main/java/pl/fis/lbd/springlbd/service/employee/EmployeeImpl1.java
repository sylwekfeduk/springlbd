package pl.fis.lbd.springlbd.service.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("dev")
@Service
public class EmployeeImpl1 implements EmployeeService {

    @Autowired
    private static final Logger LOG = LoggerFactory.getLogger(EmployeeImpl1.class);

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
        LOG.info("prefix: " + prefix + " suffix: " + suffix);
        String nickname = prefix+firstName.substring(0,3)+lastName.substring(0,3)+suffix;
        LOG.info(nickname);
        return nickname;
    }
}
