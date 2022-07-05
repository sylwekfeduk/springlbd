package pl.fis.lbd.springlbd;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.internal.matchers.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.fis.lbd.springlbd.entity.employee.Employee;
import pl.fis.lbd.springlbd.service.employee.EmployeeImpl1;
import pl.fis.lbd.springlbd.service.employee.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SpringlbdApplicationTests {

	@Autowired
	EmployeeImpl1 employeeService;

	@Test
	void whenSavingEmployee_thenOk() {
		Employee savedEmployee = employeeService.save(new Employee(
				1L,
				"Jan",
				"Kowalski",
				96258532651L,
				"CGH164523",
				"652485741"));
		Assertions.assertNotNull(savedEmployee);
	}

	@Test
	void whenFindingEmployee_thenOk() {
		List<Employee> temp = new ArrayList<>();
		temp.add(new Employee(
				1L,
				"Jan",
				"Kowalski",
				96258532651L,
				"CGH164523",
				"652485741"));
		assertThat(employeeService.findByName("Kowalski").get(0)).isEqualTo(temp.get(0));
	}

	@Test
	void whenFindingEmployee_thenNotOk() {
		assertThat(employeeService.findByName("Krzysiek")).isEmpty();
	}

}
