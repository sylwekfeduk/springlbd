package pl.fis.lbd.springlbd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.fis.lbd.springlbd.service.employee.EmployeeImpl1;
import pl.fis.lbd.springlbd.service.employee.EmployeeService;

@SpringBootTest
public class EmployeeUnitTest {

    @Autowired
    EmployeeImpl1 employeeImpl1;

    @Test
    public void getEmployeeNicknameTest() {
        Assertions.assertEquals(employeeImpl1.getEmployeeNickname("Jan", "Kowalski"), "elJanKowski");
    }
}
