package spring.boot.base.SpringBootApp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.base.SpringBootApp.Model.Account;
import spring.boot.base.SpringBootApp.Model.Employee;

@RestController
public class TestController {

	@RequestMapping("/test")
	public ResponseEntity<Account> getArray()
	{
	
		List<Employee> list = new ArrayList<>();
		
		Account account = new Account();
		account.setId(101);
		
		Employee e1 = getEmp();
		Employee e2 = getEmp();
		Employee e3 = getEmp();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		account.setEmployee(list);
		
		return ResponseEntity.ok(account);
		
	}
	
	
private Employee getEmp(){

	Employee emp = new Employee();
	emp.setCity("Noida");
	emp.setContact("898565");
	emp.setEmail("abc@gmail.com");
	emp.setName("Alam");
	emp.setwork("Devlp");
	
	return emp;
}
}
