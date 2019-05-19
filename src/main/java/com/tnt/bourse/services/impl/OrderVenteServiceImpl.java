package com.tnt.bourse.services.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.tnt.bourse.entities.Action;
import com.tnt.bourse.entities.OrderVente;
import com.tnt.bourse.model.MessageResponse;
import com.tnt.bourse.repositories.OrderVenteRepository;
import com.tnt.bourse.services.OrderVenteService;
@Service
public class OrderVenteServiceImpl implements OrderVenteService {

	private OrderVenteRepository orderVenteRepository ; 
	
	@Override
	public MessageResponse save(OrderVente orderVente , Action action) {

		if (action.getId() != orderVente.getId()) {
			return new MessageResponse(false, " vous n'avez pas cette action") ; 
		}else { 
			orderVente.setDateCreation(new Date());
orderVenteRepository.save(orderVente) ; 
return new MessageResponse(true, "operation effectue avec succe ") ; 

} 
		
	}

}
