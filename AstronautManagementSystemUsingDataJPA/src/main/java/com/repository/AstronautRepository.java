package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Astronaut;

@Repository
public interface AstronautRepository extends JpaRepository<Astronaut, Long> {

	List<Astronaut> findByName(String name);
	
	List<Astronaut> findByNationality(String country);
	
	List<Astronaut> findByAge(Integer age);
	
	List<Astronaut> findByMission(String mission);
	
	List<Astronaut> findBySalary(Double salary);
	
	List<Astronaut> findByAgeGreaterThan(Integer age);
	
	List<Astronaut> findByAgeLessThan(Integer age);
	
	List<Astronaut> findBySalaryGreaterThan(Double salary);
	
	List<Astronaut> findByNationalityAndMission(String country, String mission);
	
	List<Astronaut> findByAgeBetween(Integer start, Integer end);
}
