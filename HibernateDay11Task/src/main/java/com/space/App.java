package com.space;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Session session = ConnectionProvider.getFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            SpaceMission mission = new SpaceMission();

            mission.setMissionName("Chandrayaan-4");
            mission.setDestination("Moon");
            mission.setYear(2028);

            Astronaut a1 = new Astronaut();

            a1.setAstronautName("Rahul");
            a1.setSpecialization("Pilot");
            a1.setExperienceYears(8);

            Astronaut a2 = new Astronaut();

            a2.setAstronautName("Amit");
            a2.setSpecialization("Scientist");
            a2.setExperienceYears(5);

            List<Astronaut> astronauts = new ArrayList<Astronaut>();
            List<SpaceMission> missions = new ArrayList<SpaceMission>();
            
            astronauts.add(a1);
            astronauts.add(a2);
            
            missions.add(mission);
            
            
            mission.setAstronauts(astronauts);
            
            a1.setMissions(missions);
            a2.setMissions(missions);

            session.persist(mission);
            session.persist(a1);
            session.persist(a2);

            tx.commit();

            System.out.println("Mission and astronauts inserted successfully.");

        } catch (Exception e) {

            if (tx != null) {
                tx.rollback();
            }

            e.printStackTrace();

        } finally {
            session.close();
        }
        
        session.close();
        OperationDao.retriveAllAstronautFromParticularMission(1);
        OperationDao.retriveAllMissoinBelongToParticularAstronaut(1);
        OperationDao.displayMissionDetails();
    }
    
}
