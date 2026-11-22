package com.space;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OperationDao {

	public static void retriveAllAstronautFromParticularMission(int missionId) {
		List<Astronaut> astronauts = new ArrayList<Astronaut>();

		SessionFactory factory = ConnectionProvider.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		SpaceMission mission = session.getReference(SpaceMission.class, missionId);

		if (mission != null) {
			astronauts = mission.getAstronauts();

			for (Astronaut astronaut : astronauts) {
				System.out.println("Name: " + astronaut.getAstronautName());
				System.out.println("Specialization" + astronaut.getSpecialization());
				System.out.println("Year Of Exparience: " + astronaut.getExperienceYears());

				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();
			}
		} else {
			System.out.println("Wrong Mission Id ...  Please enter valid mission id.");
		}

		transaction.commit();
		session.close();
	}

	public static void retriveAllMissoinBelongToParticularAstronaut(int astronautId) {
		SessionFactory factory = ConnectionProvider.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		List<SpaceMission> missions = new ArrayList<SpaceMission>();

		Astronaut astronaut = session.getReference(Astronaut.class, astronautId);

		missions = astronaut.getMissions();

		if (missions != null) {
			for (SpaceMission spaceMission : missions) {
				System.out.println("Mission Name: " + spaceMission.getMissionName());
				System.out.println("Destination" + spaceMission.getDestination());
				System.out.println("Mission Year: " + spaceMission.getYear());

				System.out.println();
				System.out.println("-------------------------------");
				System.out.println();

			}
		}

		transaction.commit();
		session.close();
	}

	@SuppressWarnings("deprecation")
	public static void removeAAstronautFromAMissionButNotDeleteAstronautData(int missionId, int astronautId) {
		SessionFactory factory = ConnectionProvider.getFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		SpaceMission mission = session.getReference(SpaceMission.class, missionId);
		Astronaut astronaut = session.getReference(Astronaut.class, astronautId);

		if (mission != null && astronaut != null) {
			mission.getAstronauts().remove(astronaut);
			astronaut.getMissions().remove(mission);

			transaction.commit();

		} else {
			System.out.println("Mission id or Astronautid is wrong... Please enter valid data.");
		}

		session.close();

	}

	public static void displayMissionDetails() {
		SessionFactory factory = ConnectionProvider.getFactory();

		Session session = factory.openSession();

		List<SpaceMission> resultList = session.createQuery("from SpaceMission", SpaceMission.class).getResultList();
		
		for (SpaceMission spaceMission : resultList) {
			System.out.println("===================================================");
			System.out.println();
			System.out.println("Mission Details: ");
			System.out.println("---------------------------------------------------");
			System.out.println("Mission Name: " + spaceMission.getMissionName());
			System.out.println("Destination" + spaceMission.getDestination());
			System.out.println("Mission Year: " + spaceMission.getYear());
			System.out.println("---------------------------------------------------");
			List<Astronaut> astronauts = spaceMission.getAstronauts();
			for (Astronaut astronaut : astronauts) {
				System.out.println("Astronaut Details: ");
				System.out.println("---------------------------------------------------");
				System.out.println("Name: " + astronaut.getAstronautName());
				System.out.println("Specialization" + astronaut.getSpecialization());
				System.out.println("Year Of Exparience: " + astronaut.getExperienceYears());
				System.out.println("===================================================");
				System.out.println();
			}
			
		}
		session.close();
	}
}
