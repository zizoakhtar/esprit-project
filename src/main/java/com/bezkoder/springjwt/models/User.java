package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;
	 private String prenom;
	 private String nom;
	 private int tel;
	 @NotBlank
	 @Size(max = 50)
	 @Email
	 private  String adresse ;
	@NotBlank
	@Size(max = 120)
	private String password;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();



	public User(@NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			@NotBlank @Size(max = 120) String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}



	@OneToMany(
	            mappedBy = "stagiaire",
	            cascade = CascadeType.ALL,
	            fetch = FetchType.EAGER,
	            orphanRemoval = true
	    )
	    @Size(min = 2, max = 6)
	    @Fetch(FetchMode.SELECT)
	    @BatchSize(size = 30)
	    private List<Stage> stages = new ArrayList<>();
	    


    private CandidateStatus candidateStatus;
}
