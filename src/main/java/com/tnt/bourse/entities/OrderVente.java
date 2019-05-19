package com.tnt.bourse.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ordre_vente")
public class OrderVente implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_creation")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Column(name = "date_execution")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateExecution;
	@Column(name = "prix_vente_min")
	private double prixVenteMin;
	private int qte;
	private boolean partiel;
	private String etat;
	@ManyToOne
	private PortefeuillAction portefeuillAction;
	@JsonIgnore
	@OneToMany(mappedBy="orderVente")
	private List<Operation> operations;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateExecution() {
		return dateExecution;
	}
	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}
	public double getPrixVenteMin() {
		return prixVenteMin;
	}
	public void setPrixVenteMin(double prixVenteMin) {
		this.prixVenteMin = prixVenteMin;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public boolean isPartiel() {
		return partiel;
	}
	public void setPartiel(boolean partiel) {
		this.partiel = partiel;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public PortefeuillAction getPortefeuillAction() {
		return portefeuillAction;
	}
	public void setPortefeuillAction(PortefeuillAction portefeuillAction) {
		this.portefeuillAction = portefeuillAction;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
	
}
