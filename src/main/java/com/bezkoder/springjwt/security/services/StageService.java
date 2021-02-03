package com.bezkoder.springjwt.security.services;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bezkoder.springjwt.interfaces.StageInterface;
import com.bezkoder.springjwt.models.Stage;
import com.bezkoder.springjwt.repository.StageRepository;

@Service
public class StageService implements StageInterface{
	@Autowired
	StageRepository sr;
	
	@Override
	public void addStage(Stage stage) {
		sr.save(stage);
	}
	
	public List<Stage> ListeStages() {
		// TODO Auto-generated method stub
		return (List<Stage>)sr.findAll();	
	}

    public Stage findById(Long internshipId) {
        Optional<Stage> result = sr.findById(internshipId);
        return (result.isPresent()) ? result.get() : null;
    }

   /* public Stage save(StageDTO internshipDTO) {
        validator.validate(internshipDTO);

        Stage internship = findById(internshipDTO.getId());
        if (internship == null) {
                   Optional<Stagiaire> stagiaire =sir.findById(internshipDTO.getStagiaire());

           if (( stagiaire).isPresent()) {
          	EnseignantStage ens_stage =ensR.findByName(internshipDTO.getEnseig_stage());
        	 EnseignantStageOption ens_option =ensoption.findByName(internshipDTO.getEnseig_option());

                //internship.setCompany(company.get());
                //internship.setAreaOfInterest(areaOfInterest);
              internship.setStagiaire(stagiaire.get());
            internship.setEnseig_option(ens_option);
                internship.setEnseig_stage(ens_stage);
                
                return sr.save(internship);
            }
        }
        return null;
    }
*/
}
/*
  
*/