package com;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;

import com.entity.Astronaut;
import com.exception.MyException;
import com.service.AstronautService;

@SpringBootApplication
@EntityScan(basePackages = { "com.entity" })
public class AstronautManagementSystemUsingDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AstronautManagementSystemUsingDataJpaApplication.class,
				args);

		AstronautService service = context.getBean("aser", AstronautService.class);

//		Astronaut astronaut1 = new Astronaut();
//		astronaut1.setName("Sunita Williams");
//		astronaut1.setAge(60);
//		astronaut1.setNationality("American");
//		astronaut1.setSpaceAgency("NASA");
//		astronaut1.setExperienceYear(27);
//		astronaut1.setMission("Boeing Starliner CFT / ISS Expedition 72");
//		astronaut1.setMissionCount(3);
//		astronaut1.setSalary(152000.00);
//		astronaut1.setCurrentlyActive(true);
//
//		Astronaut astronaut2 = new Astronaut();
//		astronaut2.setName("Rakesh Sharma");
//		astronaut2.setAge(77);
//		astronaut2.setNationality("Indian");
//		astronaut2.setSpaceAgency("ISRO");
//		astronaut2.setExperienceYear(10);
//		astronaut2.setMission("Soyuz T-11 / Salyut 7");
//		astronaut2.setMissionCount(1);
//		astronaut2.setSalary(60000.00);
//		astronaut2.setCurrentlyActive(false);
//
//		Astronaut astronaut3 = new Astronaut();
//		astronaut3.setName("Kalpana Chawla");
//		astronaut3.setAge(40);
//		astronaut3.setNationality("Indian-American");
//		astronaut3.setSpaceAgency("NASA");
//		astronaut3.setExperienceYear(6);
//		astronaut3.setMission("STS-107 Columbia");
//		astronaut3.setMissionCount(2);
//		astronaut3.setSalary(98000.00);
//		astronaut3.setCurrentlyActive(false);
//
//		Astronaut astronaut4 = new Astronaut();
//		astronaut4.setName("Peggy Whitson");
//		astronaut4.setAge(66);
//		astronaut4.setNationality("American");
//		astronaut4.setSpaceAgency("NASA");
//		astronaut4.setExperienceYear(30);
//		astronaut4.setMission("Axiom Mission 2 / ISS Expedition 50-52");
//		astronaut4.setMissionCount(4);
//		astronaut4.setSalary(160000.00);
//		astronaut4.setCurrentlyActive(true);
//
//		Astronaut astronaut5 = new Astronaut();
//		astronaut5.setName("Thomas Pesquet");
//		astronaut5.setAge(48);
//		astronaut5.setNationality("French");
//		astronaut5.setSpaceAgency("ESA");
//		astronaut5.setExperienceYear(10);
//		astronaut5.setMission("Crew-2 / Alpha");
//		astronaut5.setMissionCount(2);
//		astronaut5.setSalary(120000.00);
//		astronaut5.setCurrentlyActive(true);
//
//		Astronaut astronaut6 = new Astronaut();
//		astronaut6.setName("Samantha Cristoforetti");
//		astronaut6.setAge(49);
//		astronaut6.setNationality("Italian");
//		astronaut6.setSpaceAgency("ESA");
//		astronaut6.setExperienceYear(15);
//		astronaut6.setMission("Crew-4 / Minerva");
//		astronaut6.setMissionCount(2);
//		astronaut6.setSalary(125000.00);
//		astronaut6.setCurrentlyActive(true);
//
//		Astronaut astronaut7 = new Astronaut();
//		astronaut7.setName("Chris Hadfield");
//		astronaut7.setAge(67);
//		astronaut7.setNationality("Canadian");
//		astronaut7.setSpaceAgency("CSA");
//		astronaut7.setExperienceYear(21);
//		astronaut7.setMission("ISS Expedition 34/35");
//		astronaut7.setMissionCount(3);
//		astronaut7.setSalary(110000.00);
//		astronaut7.setCurrentlyActive(false);
//
//		Astronaut astronaut8 = new Astronaut();
//		astronaut8.setName("Shubhanshu Shukla");
//		astronaut8.setAge(41);
//		astronaut8.setNationality("Indian");
//		astronaut8.setSpaceAgency("ISRO");
//		astronaut8.setExperienceYear(2);
//		astronaut8.setMission("Axiom Mission 4 (Ax-4)");
//		astronaut8.setMissionCount(1);
//		astronaut8.setSalary(75000.00);
//		astronaut8.setCurrentlyActive(true);
//
//		List<Astronaut> astronauts = List.of(
//				astronaut2, astronaut3, astronaut4, astronaut5,
//				astronaut6, astronaut7, astronaut8
//				);
//
//		service.insertAstronaut(astronaut1);
//		service.insertAstronauts(astronauts);

		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n========== ASTRONAUT MENU ==========");
			System.out.println("1.  Insert Astronaut");
			System.out.println("2.  Get All Astronauts");
			System.out.println("3.  Get Astronaut By Id");
			System.out.println("4.  Get All Astronaut Names");
			System.out.println("5.  Check Astronaut Exists By Id");
			System.out.println("6.  Count Astronauts");
			System.out.println("7.  Check Table Is Empty");
			System.out.println("8.  Update Astronaut Age");
			System.out.println("9.  Update Astronaut Experience");
			System.out.println("10. Update Astronaut Status");
			System.out.println("11. Search Astronauts By Name");
			System.out.println("12. Search Astronauts By Country");
			System.out.println("13. Search Astronauts By Age");
			System.out.println("14. Search Astronauts By Mission");
			System.out.println("15. Search Astronauts By Salary");
			System.out.println("16. Astronauts Older Than Given Age");
			System.out.println("17. Astronauts Younger Than Given Age");
			System.out.println("18. Astronauts Earning More Than Given Salary");
			System.out.println("19. Search Astronauts By Country And Mission");
			System.out.println("20. Astronauts Within An Age Range");
			System.out.println("0.  Exit");
			System.out.print("Enter your choice: ");

			while (!sc.hasNextInt()) {
				System.out.print("Please enter a number: ");
				sc.next();
			}
			choice = sc.nextInt();
			sc.nextLine(); 

			try {
				switch (choice) {
				case 1:
					Astronaut ast = new Astronaut();

					System.out.print("Enter name: ");
					ast.setName(sc.nextLine());
					System.out.print("Enter age: ");
					ast.setAge(Integer.parseInt(sc.nextLine()));
					System.out.print("Enter nationality: ");
					ast.setNationality(sc.nextLine());
					System.out.print("Enter space agency: ");
					ast.setSpaceAgency(sc.nextLine());
					System.out.print("Enter experience (years): ");
					ast.setExperienceYear(Integer.parseInt(sc.nextLine()));
					System.out.print("Enter mission: ");
					ast.setMission(sc.nextLine());
					System.out.print("Enter mission count: ");
					ast.setMissionCount(Integer.parseInt(sc.nextLine()));
					System.out.print("Enter salary: ");
					ast.setSalary(Double.parseDouble(sc.nextLine()));
					System.out.print("Currently active (true/false): ");
					ast.setCurrentlyActive(Boolean.parseBoolean(sc.nextLine()));
					service.insertAstronaut(ast);
					break;

				case 2:
					printList(service.retriveAstronauts());
					break;

				case 3:
					System.out.print("Enter id: ");
					System.out.println(service.retriveAstronaut(Long.parseLong(sc.nextLine())));
					break;

				case 4:
					service.retriveAstronautName().forEach(System.out::println);
					break;

				case 5:
					System.out.print("Enter id: ");
					System.out.println(service.isAstronautPresent(Long.parseLong(sc.nextLine())) ? "Astronaut exists."
							: "Astronaut does not exist.");
					break;

				case 6:
					System.out.println("Total astronauts: " + service.countTotalAstronauts());
					break;

				case 7:
					System.out.println(service.checkIsEmpty() ? "Table is empty." : "Table has records.");
					break;

				case 8:
					System.out.print("Enter id: ");
					long aid = Long.parseLong(sc.nextLine());
					System.out.print("Enter new age: ");
					int age = Integer.parseInt(sc.nextLine());
					System.out.println(service.updateAge(aid, age) ? "Age updated." : "Update failed.");
					break;

				case 9:
					System.out.print("Enter id: ");
					long eid = Long.parseLong(sc.nextLine());
					System.out.print("Enter new experience (years): ");
					int exp = Integer.parseInt(sc.nextLine());
					System.out.println(service.updateExperience(eid, exp) ? "Experience updated." : "Update failed.");
					break;

				case 10:
					System.out.print("Enter id: ");
					long sid = Long.parseLong(sc.nextLine());
					System.out.print("Currently active (true/false): ");
					boolean status = Boolean.parseBoolean(sc.nextLine());
					System.out.println(service.updateStatus(sid, status) ? "Status updated." : "Update failed.");
					break;

				case 11:
					System.out.print("Enter name: ");
					printList(service.retriveAstronautByName(sc.nextLine()));
					break;

				case 12:
					System.out.print("Enter country: ");
					printList(service.retriveAstronautByCountry(sc.nextLine()));
					break;

				case 13:
					System.out.print("Enter age: ");
					printList(service.retriveAstronautByAge(Integer.parseInt(sc.nextLine())));
					break;

				case 14:
					System.out.print("Enter mission: ");
					printList(service.retriveAstronautByMission(sc.nextLine()));
					break;

				case 15:
					System.out.print("Enter salary: ");
					printList(service.retriveAstronautBySalary(Double.parseDouble(sc.nextLine())));
					break;

				case 16:
					System.out.print("Enter age: ");
					printList(service.retriveAstronautOlderThanAGivenAge(Integer.parseInt(sc.nextLine())));
					break;

				case 17:
					System.out.print("Enter age: ");
					printList(service.retriveAstronautYoungerThanAGivenAge(Integer.parseInt(sc.nextLine())));
					break;

				case 18:
					System.out.print("Enter salary: ");
					printList(service.retriveAstronautEarningMoreThanAGivenSalary(Double.parseDouble(sc.nextLine())));
					break;

				case 19:
					System.out.print("Enter country: ");
					String country = sc.nextLine();
					System.out.print("Enter mission: ");
					String mission = sc.nextLine();
					printList(service.retriveAstronautByCountryAndMission(country, mission));
					break;

				case 20:
					System.out.print("Enter start age: ");
					int startAge = Integer.parseInt(sc.nextLine());
					System.out.print("Enter end age: ");
					int endAge = Integer.parseInt(sc.nextLine());
					printList(service.retriveAstronautWithinAnAgeRange(startAge, endAge));
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

	private static void printList(List<Astronaut> list) {
		if (list.isEmpty()) {
			System.out.println("No astronauts found.");
		} else {
			list.forEach(System.out::println);
		}

	}
}
