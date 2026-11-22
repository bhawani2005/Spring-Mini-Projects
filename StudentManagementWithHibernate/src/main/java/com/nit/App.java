package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.OperationDao;
import com.entity.Student;

public class App {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("============================");
			System.out.println("Press 1 : Insert Students");
			System.out.println("Press 2 : Get Students");
			System.out.println("Press 3 : Update Student.");
			System.out.println("Press 4 : Exit");
			System.out.println("============================");

			System.out.println("Enter Your Choice: ");
			int choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Enter a number How many student you will insert:");
				int n = Integer.parseInt(sc.nextLine());

				for (int i = 1; i <= n; i++) {
					Student student = new Student();
					System.out.print("Enter student name: ");
					student.setName(sc.nextLine());
					System.out.print("Enter student degree: ");
					student.setDegree(sc.nextLine());

					list.add(student);
				}

				String msg = OperationDao.insertStudent(list);
				System.out.println(msg);
				break;
			case 2:
				List<Student> students = OperationDao.getStudents(list);
				System.out.println("Students are: ");
				for (Student student : students) {
					System.out.println(student);
				}
				break;
			case 3:
				System.out.println("Enter id for update: ");
				int id = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter field name which field you update: ");
				String fieldName = sc.nextLine();
				
				System.out.println("Enter updated value: ");
				if(fieldName.equalsIgnoreCase("name")) {
					String updatedName = sc.nextLine();
					
					Student updateStudent = OperationDao.updateData(id, fieldName, updatedName);
					if(updateStudent!=null) {
						System.out.println("Student Updated");
					}
					else {
						System.out.println("Update Failed. Enter Correct Id.");
					}
				}
				else if(fieldName.equalsIgnoreCase("degree")) {
					String updatedDegree = sc.nextLine();
					
					Student updateStudent = OperationDao.updateData(id, fieldName, updatedDegree);
					if(updateStudent!=null) {
						System.out.println("Student Updated");
					}
					else {
						System.out.println("Update Failed. Enter Correct Id.");
					}
				}
				else {
					System.out.println("field not find.");
				}
				break;
				
			case 4:
				System.out.println("Enter the Id: ");
				int forRemoveId = Integer.parseInt(sc.nextLine());
				 String msg2 = OperationDao.removeData(forRemoveId);
				System.out.println(msg2);
				break;
			case 5:
				System.out.println("Thank You for using this System.");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}
		}

	}
}
