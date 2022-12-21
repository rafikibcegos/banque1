package org.formation.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	
 private int numeroCompte;


// @OneToOne(mappedBy = "compte")
// private Client client;

private LocalDate dateOuverture;
private float solde;








public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public Compte() {
	
	
}



public int getNumeroCompte() {
	return numeroCompte;
}



public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}



public LocalDate getDateOuverture() {
	return dateOuverture;
}



public void setDateOuverture(LocalDate dateOuverture) {
	this.dateOuverture = dateOuverture;
}



public float getSolde() {
	return solde;
}



public void setSolde(float solde) {
	this.solde = solde;
}



public Compte(Long id, int numeroCompte, LocalDate dateOuverture, float solde) {
	super();
	this.id = id;
	this.numeroCompte = numeroCompte;
	this.dateOuverture = dateOuverture;
	this.solde = solde;
}



@Override
public String toString() {
	return "Compte [id=" + id + ", numeroCompte=" + numeroCompte + ", dateOuverture=" + dateOuverture + ", solde="
			+ solde + "]";
}































	
	
	
	
}
	
	
	
	


