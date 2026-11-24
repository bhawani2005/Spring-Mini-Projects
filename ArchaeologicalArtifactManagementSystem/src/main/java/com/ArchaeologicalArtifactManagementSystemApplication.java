package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;

import com.entity.Artifact;
import com.service.ArtifactService;

@SpringBootApplication
@EntityScan(basePackages = {"com.entity"})
public class ArchaeologicalArtifactManagementSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(ArchaeologicalArtifactManagementSystemApplication.class, args);
		
		ArtifactService service = context.getBean("artifactSer", ArtifactService.class);
		
//		 List<Artifact> artifacts = new ArrayList<>();
//
//	        Artifact a1 = new Artifact();
//	        a1.setArtifactName("Rosetta Stone");
//	        a1.setCivilization("Ancient Egyptian");
//	        a1.setDiscoveryLocation("Rosetta, Egypt");
//	        a1.setDiscoveryYear(1799);
//	        a1.setEstimatedValue(5000000);
//	        a1.setAgeInYear(2200);
//	        a1.setMuseumName("British Museum");
//	        a1.setCondition("Good");
//	        artifacts.add(a1);
//
//	        Artifact a2 = new Artifact();
//	        a2.setArtifactName("Terracotta Army");
//	        a2.setCivilization("Ancient Chinese");
//	        a2.setDiscoveryLocation("Xi'an, China");
//	        a2.setDiscoveryYear(1974);
//	        a2.setEstimatedValue(10000000);
//	        a2.setAgeInYear(2200);
//	        a2.setMuseumName("Emperor Qinshihuang Museum");
//	        a2.setCondition("Excellent");
//	        artifacts.add(a2);
//
//	        Artifact a3 = new Artifact();
//	        a3.setArtifactName("Dancing Girl");
//	        a3.setCivilization("Indus Valley");
//	        a3.setDiscoveryLocation("Mohenjo-daro, Pakistan");
//	        a3.setDiscoveryYear(1926);
//	        a3.setEstimatedValue(2000000);
//	        a3.setAgeInYear(4500);
//	        a3.setMuseumName("National Museum, New Delhi");
//	        a3.setCondition("Good");
//	        artifacts.add(a3);
//
//	        Artifact a4 = new Artifact();
//	        a4.setArtifactName("Ashoka Pillar");
//	        a4.setCivilization("Mauryan");
//	        a4.setDiscoveryLocation("Sarnath, India");
//	        a4.setDiscoveryYear(1905);
//	        a4.setEstimatedValue(3000000);
//	        a4.setAgeInYear(2300);
//	        a4.setMuseumName("Sarnath Archaeological Museum");
//	        a4.setCondition("Excellent");
//	        artifacts.add(a4);
//
//	        Artifact a5 = new Artifact();
//	        a5.setArtifactName("Tutankhamun Mask");
//	        a5.setCivilization("Ancient Egyptian");
//	        a5.setDiscoveryLocation("Valley of the Kings, Egypt");
//	        a5.setDiscoveryYear(1922);
//	        a5.setEstimatedValue(15000000);
//	        a5.setAgeInYear(3300);
//	        a5.setMuseumName("Egyptian Museum");
//	        a5.setCondition("Excellent");
//	        artifacts.add(a5);
//
//	        Artifact a6 = new Artifact();
//	        a6.setArtifactName("Mona Lisa");
//	        a6.setCivilization("Renaissance");
//	        a6.setDiscoveryLocation("Florence, Italy");
//	        a6.setDiscoveryYear(1797);
//	        a6.setEstimatedValue(900000000);
//	        a6.setAgeInYear(523);
//	        a6.setMuseumName("Louvre Museum");
//	        a6.setCondition("Excellent");
//	        artifacts.add(a6);
//
//	        Artifact a7 = new Artifact();
//	        a7.setArtifactName("Ajanta Paintings");
//	        a7.setCivilization("Ancient Indian");
//	        a7.setDiscoveryLocation("Ajanta, India");
//	        a7.setDiscoveryYear(1819);
//	        a7.setEstimatedValue(4000000);
//	        a7.setAgeInYear(2000);
//	        a7.setMuseumName("Ajanta Caves");
//	        a7.setCondition("Fair");
//	        artifacts.add(a7);
//
//	        Artifact a8 = new Artifact();
//	        a8.setArtifactName("Buddha Statue");
//	        a8.setCivilization("Ancient Buddhist");
//	        a8.setDiscoveryLocation("Bamiyan, Afghanistan");
//	        a8.setDiscoveryYear(1890);
//	        a8.setEstimatedValue(6000000);
//	        a8.setAgeInYear(1500);
//	        a8.setMuseumName("Kabul Museum");
//	        a8.setCondition("Damaged");
//	        artifacts.add(a8);
//
//	        Artifact a9 = new Artifact();
//	        a9.setArtifactName("Iron Pillar");
//	        a9.setCivilization("Gupta");
//	        a9.setDiscoveryLocation("Delhi, India");
//	        a9.setDiscoveryYear(1830);
//	        a9.setEstimatedValue(2500000);
//	        a9.setAgeInYear(1600);
//	        a9.setMuseumName("Qutub Complex");
//	        a9.setCondition("Excellent");
//	        artifacts.add(a9);
//
//	        Artifact a10 = new Artifact();
//	        a10.setArtifactName("Antikythera Mechanism");
//	        a10.setCivilization("Ancient Greek");
//	        a10.setDiscoveryLocation("Antikythera, Greece");
//	        a10.setDiscoveryYear(1901);
//	        a10.setEstimatedValue(8000000);
//	        a10.setAgeInYear(2100);
//	        a10.setMuseumName("National Archaeological Museum, Athens");
//	        a10.setCondition("Good");
//	        artifacts.add(a10);
//
//	        Artifact a11 = new Artifact();
//	        a11.setArtifactName("Sanchi Stupa Relics");
//	        a11.setCivilization("Mauryan");
//	        a11.setDiscoveryLocation("Sanchi, India");
//	        a11.setDiscoveryYear(1818);
//	        a11.setEstimatedValue(3500000);
//	        a11.setAgeInYear(2200);
//	        a11.setMuseumName("Sanchi Archaeological Museum");
//	        a11.setCondition("Good");
//	        artifacts.add(a11);
//
//	        Artifact a12 = new Artifact();
//	        a12.setArtifactName("Dead Sea Scrolls");
//	        a12.setCivilization("Ancient Hebrew");
//	        a12.setDiscoveryLocation("Qumran, Israel");
//	        a12.setDiscoveryYear(1947);
//	        a12.setEstimatedValue(12000000);
//	        a12.setAgeInYear(2100);
//	        a12.setMuseumName("Israel Museum");
//	        a12.setCondition("Excellent");
//	        artifacts.add(a12);
//
//	        Artifact a13 = new Artifact();
//	        a13.setArtifactName("Viking Sword");
//	        a13.setCivilization("Viking");
//	        a13.setDiscoveryLocation("Norway");
//	        a13.setDiscoveryYear(1900);
//	        a13.setEstimatedValue(1500000);
//	        a13.setAgeInYear(1000);
//	        a13.setMuseumName("Historical Museum, Oslo");
//	        a13.setCondition("Fair");
//	        artifacts.add(a13);
//
//	        Artifact a14 = new Artifact();
//	        a14.setArtifactName("Harappan Seal");
//	        a14.setCivilization("Indus Valley");
//	        a14.setDiscoveryLocation("Harappa, Pakistan");
//	        a14.setDiscoveryYear(1921);
//	        a14.setEstimatedValue(1800000);
//	        a14.setAgeInYear(4000);
//	        a14.setMuseumName("National Museum, Karachi");
//	        a14.setCondition("Good");
//	        artifacts.add(a14);
//
//	        Artifact a15 = new Artifact();
//	        a15.setArtifactName("Roman Gladiator Helmet");
//	        a15.setCivilization("Ancient Roman");
//	        a15.setDiscoveryLocation("Pompeii, Italy");
//	        a15.setDiscoveryYear(1860);
//	        a15.setEstimatedValue(2200000);
//	        a15.setAgeInYear(1900);
//	        a15.setMuseumName("National Archaeological Museum, Naples");
//	        a15.setCondition("Good");
//	        artifacts.add(a15);
//	        
//	        for (Artifact artifact : artifacts) {
//				service.insertArtifact(artifact);
//			}
		
		System.out.println("All Artifact Details: ");
		service.getAllArtifact().forEach(System.out::println);
	}

}
