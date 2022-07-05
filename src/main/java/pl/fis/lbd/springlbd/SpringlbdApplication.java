package pl.fis.lbd.springlbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.fis.lbd.springlbd.service.employee.EmployeeService;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringlbdApplication {

	@Autowired
	@Qualifier("impl1")
	private EmployeeService employeeService;

	@PostConstruct
	private void testFindAll() {
		employeeService.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringlbdApplication.class, args);
	}

}
