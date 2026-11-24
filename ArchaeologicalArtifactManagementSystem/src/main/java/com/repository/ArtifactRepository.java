package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.Artifact;

public interface ArtifactRepository extends JpaRepository<Artifact, Long> {

	@Query("SELECT a FROM Artifact a")
	List<Artifact> findAllArtifact();
	
	@Query("FROM Artifact a WHERE a.artifactName like ?1")
	List<Artifact> findArtifactByName(String name);
	
	@Query("FROM Artifact a WHERE a.civilization like ?1")
	List<Artifact> findArtifactByCivilization(String civilization);
	
	@Query("FROM Artifact a WHERE a.discoveryLocation like ?1")
	List<Artifact> findArtifactByDiscoveryLocation(String discoveryLocation);
	
	@Query("FROM Artifact a WHERE a.discoveryYear < ?1")
	List<Artifact> findArtifactByDiscoveryYear(String discoveryYear);
	
	@Query("FROM Artifact a WHERE a.estimatedValue > ?1")
	List<Artifact> findArtifactByEstimatedValue(String estimatedValue);
	
	@Query("FROM Artifact a WHERE a.ageInYear BETWEEN ?1 AND ?2")
	List<Artifact> findArtifactByAgeRange(int start, int end);
	
	
}
