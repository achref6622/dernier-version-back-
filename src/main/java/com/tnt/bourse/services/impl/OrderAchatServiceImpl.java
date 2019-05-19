package com.tnt.bourse.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tnt.bourse.entities.Action;
import com.tnt.bourse.entities.OrderAchat;
import com.tnt.bourse.model.MessageResponse;
import com.tnt.bourse.repositories.OrderAchatRepository;
import com.tnt.bourse.services.OrderAchatService;

public class OrderAchatServiceImpl implements OrderAchatService {

	@Autowired
	private OrderAchatRepository orderachatrepository  ; 
	
	
	@Override
	public MessageResponse save(OrderAchat orderachat ) {
		
		 if (orderachat.getPortefeuillAction().getPortefeuille().getNumeraire() < orderachat.getPrixVenteMax() ) {
			 return new MessageResponse(false,"erreur" ) ; 
		 }
		 
	orderachat.setDateAchat(new Date());	
	return null ; 
//	orderachat.getPortefeuillAction()
		/*
		
if (		orderachat.getClient().getPortefeuille().getNumeraire()<orderachat.getPrixVenteMax()) { 
	return new MessageResponse(false, "verifier votre portfeuille ") ; 
}
		orderachat.setDateAchat(new Date()); 
		orderachatrepository.save(orderachat) ; 
		orderachat.getClient().getPortefeuille().setNumeraire(orderachat.getClient().getPortefeuille().getNumeraire() - orderachat.getPrixVenteMax());
		return new MessageResponse( true , " operation effectue avec succe" ) ;  
		
		*/
	
		
		
	}

	@Override
	public MessageResponse update(OrderAchat orderachat) {
		if ( orderachatrepository.findById(orderachat.getId())== null ) { 
			return new MessageResponse( false , " introuvable" ) ;  

		}
		orderachat.setDateAchat(new Date()); 
		orderachatrepository.save(orderachat) ; 
		return new MessageResponse( true , " operation effectue avec succe" ) ;  
		
	}

	@Override
	public MessageResponse delete(int id) {
		if ( orderachatrepository.findById(id)== null ) { 
			return new MessageResponse( false , " introuvable" ) ;  

		}
		orderachatrepository.delete(orderachatrepository.getOne(id));
		return new MessageResponse(true, "operation effectue avec succe") ; 
	}

	@Override
	public List<OrderAchat> findAll() {
	return orderachatrepository.findAll() ; 
	
	}

}
