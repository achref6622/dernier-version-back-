package com.tnt.bourse.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class OperationId implements Serializable {
	@Column(name = "id_order_achat")
	private Integer idOrderAchat;
	@Column(name = "id_order_vente")
	private Integer idOrderVente;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idOrderAchat == null) ? 0 : idOrderAchat.hashCode());
		result = prime * result + ((idOrderVente == null) ? 0 : idOrderVente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperationId other = (OperationId) obj;
		if (idOrderAchat == null) {
			if (other.idOrderAchat != null)
				return false;
		} else if (!idOrderAchat.equals(other.idOrderAchat))
			return false;
		if (idOrderVente == null) {
			if (other.idOrderVente != null)
				return false;
		} else if (!idOrderVente.equals(other.idOrderVente))
			return false;
		return true;
	}
	public Integer getIdOrderAchat() {
		return idOrderAchat;
	}
	public void setIdOrderAchat(Integer idOrderAchat) {
		this.idOrderAchat = idOrderAchat;
	}
	public Integer getIdOrderVente() {
		return idOrderVente;
	}
	public void setIdOrderVente(Integer idOrderVente) {
		this.idOrderVente = idOrderVente;
	}

	
	
	
}
