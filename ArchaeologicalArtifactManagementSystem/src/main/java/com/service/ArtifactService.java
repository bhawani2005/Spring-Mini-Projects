package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Artifact;
import com.repository.ArtifactRepository;

@Service("artifactSer")
public class ArtifactService {
	
	@Autowired
	ArtifactRepository repository;
	
	public void insertArtifact(Artifact artifact) {
		repository.save(artifact);
		System.out.println("Artifact Inserted successfully...");
	}

	public List<Artifact> getAllArtifact(){
		return repository.findAllArtifact();
	}
	
	
}
