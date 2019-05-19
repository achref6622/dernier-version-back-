package com.tnt.bourse.services;

import com.tnt.bourse.entities.Action;
import com.tnt.bourse.entities.OrderVente;
import com.tnt.bourse.model.MessageResponse;

public interface OrderVenteService {
	public MessageResponse save(OrderVente orderVente , Action action);


}
