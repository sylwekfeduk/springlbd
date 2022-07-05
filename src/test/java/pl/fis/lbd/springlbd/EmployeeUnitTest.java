package pl.fis.lbd.springlbd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.fis.lbd.springlbd.service.employee.EmployeeImpl1;

@SpringBootTest(classes = EmployeeImpl1.class)
public class EmployeeUnitTest {

    @Autowired
    EmployeeImpl1 employeeImpl1;

    @Test
    public void getEmployeeNicknameTest() {
        Assertions.assertEquals(employeeImpl1.getEmployeeNickname("Jan", "Kowalski"), "elJanKowski");
    }
}
