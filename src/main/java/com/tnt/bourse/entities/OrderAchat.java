package com.tnt.bourse.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ordre_achat")
public class OrderAchat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "date_achat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAchat;
	@Column(name = "prix_vente_max")
	private double prixVenteMax;
	private int qte;

	@ManyToOne
	private PortefeuillAction portefeuillAction;

	private String etat;
	@JsonIgnore
	@OneToMany(mappedBy = "orderAchat")
	private List<Operation> operations;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public double getPrixVenteMax() {
		return prixVenteMax;
	}

	public void setPrixVenteMax(double prixVenteMax) {
		this.prixVenteMax = prixVenteMax;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public PortefeuillAction getPortefeuillAction() {
		return portefeuillAction;
	}

	public void setPortefeuillAction(PortefeuillAction portefeuillAction) {
		this.portefeuillAction = portefeuillAction;
	}



}
