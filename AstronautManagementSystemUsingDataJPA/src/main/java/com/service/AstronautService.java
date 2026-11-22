package com.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Astronaut;
import com.exception.MyException;
import com.repository.AstronautRepository;

@Service("aser")
public class AstronautService {

	public AstronautService() {
		super();
	}

	@Autowired
	AstronautRepository repository;

	public void insertAstronaut(Astronaut astronaut) {
		repository.save(astronaut);

		System.out.println("Astronaut insert successfully.....");
	}

	public void insertAstronauts(List<Astronaut> astronauts) {
		repository.saveAll(astronauts);

		System.out.println("Astronauts insert successfully.....");

	}

	public List<Astronaut> retriveAstronauts() {
		return repository.findAll();
	}

	public Astronaut retriveAstronaut(long id) {
		return repository.findById(id).orElseThrow(() -> new MyException("Id not matched."));
	}

	public List<String> retriveAstronautName() {
		return repository.findAll().stream().map(ast -> ast.getName()).collect(Collectors.toList());
	}

	public boolean isAstronautPresent(long id) {
		return repository.existsById(id);
	}

	public long countTotalAstronauts() {
		return repository.count();
	}

	public boolean checkIsEmpty() {
		return repository.findAll().isEmpty();
	}

	public boolean updateAge(long id, int age) {
		Astronaut astronaut = repository.findById(id).orElseThrow(() -> new MyException("Id not matched."));

		astronaut.setAge(age);

		Astronaut save = repository.save(astronaut);
		return save != null;
	}
	
	public boolean updateExperience(long id, int yearOfExperience) {
		Astronaut astronaut = repository.findById(id).orElseThrow(() -> new MyException("Id not matched."));

		astronaut.setExperienceYear(yearOfExperience);

		Astronaut save = repository.save(astronaut);
		return save != null;
	} 
	
	public boolean updateStatus(long id, boolean status) {
		Astronaut astronaut = repository.findById(id).orElseThrow(() -> new MyException("Id not matched."));

		astronaut.setCurrentlyActive(status);

		Astronaut save = repository.save(astronaut);
		return save != null;
	}
	
	public List<Astronaut> retriveAstronautByName(String name) {
		return repository.findByName(name);
	}
	
	public List<Astronaut> retriveAstronautByCountry(String country) {
		return repository.findByNationality(country);
	}
	
	public List<Astronaut> retriveAstronautByAge(int age) {
		return repository.findByAge(age);
	}
	
	public List<Astronaut> retriveAstronautByMission(String mission) {
		return repository.findByMission(mission);
	}
	
	public List<Astronaut> retriveAstronautBySalary(double salary) {
		return repository.findBySalary(salary);
	}
	
	public List<Astronaut> retriveAstronautOlderThanAGivenAge(int age) {
		return repository.findByAgeGreaterThan(age);
	}
	
	public List<Astronaut> retriveAstronautYoungerThanAGivenAge(int age) {
		return repository.findByAgeLessThan(age);
	}
	
	public List<Astronaut> retriveAstronautEarningMoreThanAGivenSalary(Double salary) {
		return repository.findBySalaryGreaterThan(salary);
	}
	
	public List<Astronaut> retriveAstronautByCountryAndMission(String country, String mission) {
		return repository.findByNationalityAndMission(country, mission);
	}
	
	public List<Astronaut> retriveAstronautWithinAnAgeRange(int startAge, int endAge) {
		return repository.findByAgeBetween(startAge, endAge);
	}
}
