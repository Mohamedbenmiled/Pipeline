package tn.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Formation implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormation;
	private String titre;
	@Enumerated(EnumType.STRING)
	private Niveau niveau;

	
	
	@Temporal(TemporalType.DATE) 
	private Date dateDebut;
	
	
	@Temporal(TemporalType.DATE) 
	private Date dateFin;
	
	
	private int nbrHeures ;
	private int nbrMaxParticipant;
	private int frais ;
	
	
	@ManyToOne
	@JsonIgnore
	private Formateur formateur;
	@ManyToMany
	@JsonIgnore
	private Set<Apprenant> apprenants;
}
