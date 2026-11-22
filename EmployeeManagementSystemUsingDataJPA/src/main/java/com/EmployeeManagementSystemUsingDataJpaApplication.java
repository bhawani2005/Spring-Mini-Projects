package com;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;

import com.entity.Employee;
import com.exception.MyException;
import com.service.EmployeeService;

@SpringBootApplication
@EntityScan(basePackages = "com.entity")
public class EmployeeManagementSystemUsingDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeManagementSystemUsingDataJpaApplication.class, args);

		EmployeeService service = context.getBean("empSer", EmployeeService.class);

		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n========== EMPLOYEE MENU ==========");
			System.out.println("1.  Insert Employee");
			System.out.println("2.  Update Employee Salary");
			System.out.println("3.  Get Employee By Id");
			System.out.println("4.  Get All Employees");
			System.out.println("5.  Delete Employee By Id");
			System.out.println("6.  Delete All Employees");
			System.out.println("7.  Check Employee Exists By Id");
			System.out.println("8.  Count Employees");
			System.out.println("9.  Search Employees By Name");
			System.out.println("10. Search Employees By Address");
			System.out.println("11. Search Employees By Job");
			System.out.println("0.  Exit");
			System.out.print("Enter your choice: ");

			while (!sc.hasNextInt()) {
				System.out.print("Please enter a number: ");
				sc.next();
			}
			choice = sc.nextInt();
			sc.nextLine(); // consume leftover newline

			try {
				switch (choice) {
				case 1:
					Employee emp = new Employee();
				
					System.out.print("Enter name: ");
					emp.setName(sc.nextLine());
					System.out.print("Enter address: ");
					emp.setAddress(sc.nextLine());
					System.out.print("Enter job: ");
					emp.setJob(sc.nextLine());
					System.out.print("Enter salary: ");
					emp.setSalary(Double.parseDouble(sc.nextLine()));
					System.out.println("Enter experience: ");
					emp.setExperience(Integer.parseInt(sc.nextLine()));
					service.insertEmployee(emp);
					break;

				case 2:
					System.out.print("Enter id: ");
					int uid = Integer.parseInt(sc.nextLine());
					System.out.print("Enter new salary: ");
					double salary = Double.parseDouble(sc.nextLine());
					System.out.println(service.updateEmployee(uid, salary) ? "Salary updated." : "Update failed.");
					break;

				case 3:
					System.out.print("Enter id: ");
					System.out.println(service.getEmployeeById(Integer.parseInt(sc.nextLine())));
					break;

				case 4:
					printList(service.getEmployees());
					break;

				case 5:
					System.out.print("Enter id: ");
					service.deleteById(Integer.parseInt(sc.nextLine()));
					System.out.println("Delete request completed.");
					break;

				case 6:
					service.deleteAll();
					System.out.println("All employees deleted.");
					break;

				case 7:
					System.out.print("Enter id: ");
					System.out.println(service.checkEmployeeById(Integer.parseInt(sc.nextLine())) ? "Employee exists."
							: "Employee does not exist.");
					break;

				case 8:
					System.out.println("Total employees: " + service.countEmployee());
					break;

				case 9:
					System.out.print("Enter name: ");
					printList(service.getEmployeeByName(sc.nextLine()));
					break;

				case 10:
					System.out.print("Enter address: ");
					printList(service.getEmployeeByAddress(sc.nextLine()));
					break;

				case 11:
					System.out.print("Enter job: ");
					printList(service.getEmployeeByJob(sc.nextLine()));
					break;

				case 0:
					System.out.println("Exiting... Thank you!");
					break;

				default:
					System.out.println("Invalid choice, try again.");
				}
			} catch (MyException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number entered.");
			} catch (Exception e) {
				System.out.println("Something went wrong: " + e.getMessage());
			}

		} while (choice != 0);

		sc.close();
		System.exit(0);
	}

	private static void printList(List<Employee> list) {
		if (list.isEmpty()) {
			System.out.println("No employees found.");
		} else {
			list.forEach(System.out::println);
		}

	}

}
