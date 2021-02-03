/*package com.bezkoder.springjwt.DTO;

import java.sql.Date;
import java.util.Map;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.bezkoder.springjwt.models.EnseignantStage;
import com.bezkoder.springjwt.models.EnseignantStageOption;
import com.bezkoder.springjwt.models.InternshipStatus;
import com.bezkoder.springjwt.models.Rapport;
import com.bezkoder.springjwt.models.Stage;
import com.bezkoder.springjwt.models.Stagiaire;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class StageDTO {
    private Long id;
	    private String Enseig_stage;
	    private String Enseig_option;
	    private String stagiaire ;
        public String etablissement;
	    public String adresse;
	    public String adresse_electro;
	    private InternshipStatus status;
	    public String enc_entreprise;
        public String mail_enc_entreprise;
	    public Date dateDeb;
	    public Date datefin;
	    public String theme;
	    public Float note_jury ;
	    public Float note_entrep ;
	    public Float note_univ ;
        public Rapport fiche_pfe;
	    



	  
	    public StageDTO(String  enseig_stage, String  enseig_option, String  stagiaire,String etablissement,
				String adresse, String adresse_electro, String enc_entreprise, String mail_enc_entreprise, Date dateDeb,
				Date datefin, String theme) {
			super();
			Enseig_stage = enseig_stage;
			Enseig_option = enseig_option;
			this.etablissement = etablissement;
			this.stagiaire=stagiaire;
			this.adresse = adresse;
			this.adresse_electro = adresse_electro;
			this.enc_entreprise = enc_entreprise;
			this.mail_enc_entreprise = mail_enc_entreprise;
			this.dateDeb = dateDeb;
			this.datefin = datefin;
			this.theme = theme;
		}

		public StageDTO(String  enseig_stage, String  enseig_option, String  stagiaire,
				String etablissement, String adresse, String adresse_electro, InternshipStatus status,
				String enc_entreprise, String mail_enc_entreprise, Date dateDeb, Date datefin, String theme,
				Float note_jury, Float note_entrep, Float note_univ, Rapport fiche_pfe) {
			super();
			Enseig_stage = enseig_stage;
			Enseig_option = enseig_option;
			this.stagiaire = stagiaire;
			this.etablissement = etablissement;
			this.adresse = adresse;
			this.adresse_electro = adresse_electro;
			this.status = status;
			this.enc_entreprise = enc_entreprise;
			this.mail_enc_entreprise = mail_enc_entreprise;
			this.dateDeb = dateDeb;
			this.datefin = datefin;
			this.theme = theme;
			this.note_jury = note_jury;
			this.note_entrep = note_entrep;
			this.note_univ = note_univ;
			this.fiche_pfe = fiche_pfe;
		}

		
	    public StageDTO(Stage internship) {
	        this.id = internship.getId();
	        if (internship.getStagiaire() == null) {
	            this.stagiaire = null;
	        } else {
	            this.stagiaire = internship.getStagiaire().getEmail();
	        }
	        if (internship.getEnseig_option() == null) {
	            this.Enseig_option = null;
	        } else {
	            this.Enseig_option = internship.getEnseig_option().getEmail();
	        }
	        
	        this.enc_entreprise = internship.getEnc_entreprise();
	        if (internship.getEnseig_stage() == null) {
	            this.Enseig_stage = null;
	        } else {
	            this.Enseig_stage = internship.getEnseig_stage().getEmail();
	        }       
	        this.dateDeb = internship.getDateDeb();
	        this.datefin = internship.getDatefin();
	        this.theme = internship.getTheme();
	        this.note_entrep = internship.getNote_entrep();
	        this.note_jury = internship.getNote_jury();
	        this.note_univ = internship.getNote_univ();
            this.mail_enc_entreprise = internship.getMail_enc_entreprise();
	        this.status = internship.getStatus();
	        this.etablissement= internship.getEtablissement();
	  //      this.fiche_pfe = internship.getFiche_pfe();
	        this.adresse = internship.getAdresse();
	        this.adresse_electro = internship.getAdresse_electro();
	        
	       
	    }

 /*   public StageDTO(Map<String, ?> map) {
	        this.id = (Long) map.get("id");
	        this.Enseig_option = (/) map.get("option");
	        this.Enseig_stage = (LocalDate) map.get("startTime");
	        this.etablissement = (LocalDate) map.get("endTime");
	        this.adresse = (Boolean) map.get("paid");
	        this.adresse_electro = (Integer) map.get("nrMonths");
	        this.dateDeb = (String) map.get("description");
	        this.datefin = (Integer) map.get("nrApplicants");
	        this.status = (InternshipStatus) map.get("status");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.enc_entreprise = (String) map.get("location");
	        this.etablissement = (LocalDate) map.get("addedDate");
	      

	    }*/

	

