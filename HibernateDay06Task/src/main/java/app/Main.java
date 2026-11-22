package app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.h2.tools.Server;

import dao.PatientDAO;
import model.Address;
import model.Patient;

public class Main {
	public static void main(String[] args) {

		try {
			Server webServer = Server.createWebServer("-web", "-webPort", "8084").start();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		List<Patient> list = new ArrayList<Patient>();

		while (true) {
			System.out.println("\n===== PATIENT REGISTRATION SYSTEM =====");
			System.out.println("1. Register Patient");
			System.out.println("2. Display All Patients");
			System.out.println("3. Search Patient By ID");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");
			System.out.println("6. Exit");
			System.out.println("=========================================");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter Patient Details:");
				Patient patient = new Patient();
				System.out.print("Name: ");
				patient.setFullName(sc.next());

				System.out.println("Phone Number: ");
				patient.setPhNo(sc.nextLong());

				System.out.println("Email: ");
				patient.setEmail(sc.next());

				Address address = new Address();
				System.out.println("Street: ");
				address.setStreet(sc.next());

				System.out.println("City");
				address.setCity(sc.next());

				System.out.println("State: ");
				address.setState(sc.next());

				System.out.println("Pincode");
				address.setPinCode(sc.next());

				patient.setAddress(address);

				list.add(patient);
				String msg = PatientDAO.registerPatient(patient);
				System.out.println(msg);
				break;
			case 2:
				List<Patient> displayAllPatient = PatientDAO.displayAllPatient(list);
				System.out.println("Patients Are: ");
				displayAllPatient.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter ID for search: ");
				int id = sc.nextInt();
				boolean isPresent = false;
				for (Patient p : list) {
					if (p.getId() == id) {
						isPresent = true;
						break;
					}
				}
				if (isPresent) {
					Patient patient2 = PatientDAO.searchPatientById(id);
					System.out.println(patient2);
				} else {
					System.out.println("Id not Present.");
				}

				break;
			case 4:
				System.out.println("Enter ID for Update: ");
				int idUpdate = sc.nextInt();
				Address address2 = new Address();
				System.out.println("Enter Updated street: ");
				address2.setStreet(sc.next());
				System.out.println("Enter Updated City: ");
				address2.setCity(sc.next());
				System.out.println("Enter Updated State: ");
				address2.setState(sc.next());
				System.out.println("Enter PinCode: ");
				address2.setPinCode(sc.next());
				boolean isPresentUpdate = false;
				for (Patient p : list) {
					if (p.getId() == idUpdate) {
						isPresentUpdate = true;
						list.get(idUpdate).setAddress(address2);
						break;
					}
				}
				if (isPresentUpdate) {
					Patient patient2 = PatientDAO.updatePatient(idUpdate, address2);
					System.out.println(patient2);
				} else {
					System.out.println("Id not Present.");
				}
				break;
			case 5:
				System.out.println("Enter ID for search: ");
				int idRemove = sc.nextInt();
				boolean isPresentRemove = false;
				for (Patient p : list) {
					if (p.getId() == idRemove) {
						isPresentRemove = true;
						list.remove(idRemove);
						break;
					}
				}
				if (isPresentRemove) {
					String msg2 = PatientDAO.deletePatient(idRemove);

					System.out.println(msg2);
				} else {
					System.out.println("Id not Present.");
				}
				break;
			case 6:
				System.out.println("Thank You...");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
