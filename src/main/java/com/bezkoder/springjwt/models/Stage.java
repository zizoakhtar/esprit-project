package com.bezkoder.springjwt.models;
import java.sql.Date;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Stage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	//encadrant université
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "E_stage_id", nullable = true)
	private User Enseig_stage;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "E_opt_id", nullable = true)
	private User Enseig_option;
//

	@OneToOne
	@JoinColumn(name = "stagiaire", nullable = true)
	private User stagiaire ;


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

//	@OneToOne
//	public ImageModel pfe;     


}

