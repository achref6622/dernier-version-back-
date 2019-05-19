package com.tnt.bourse.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Operation implements Serializable {
	@EmbeddedId
	private OperationId id;
	private int qte;
	private double prix;
	@ManyToOne
	@JoinColumn(name="id_order_achat",insertable = false, updatable = false)
	private OrderAchat orderAchat;
	@ManyToOne
	@JoinColumn(name="id_order_achat",insertable = false, updatable = false)
	private OrderVente orderVente;
	
	public OperationId getId() {
		return id;
	}
	public void setId(OperationId id) {
		this.id = id;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public OrderAchat getOrderAchat() {
		return orderAchat;
	}
	public void setOrderAchat(OrderAchat orderAchat) {
		this.orderAchat = orderAchat;
	}
	public OrderVente getOrderVente() {
		return orderVente;
	}
	public void setOrderVente(OrderVente orderVente) {
		this.orderVente = orderVente;
	}
	
	
	
}
