package com.tnt.bourse.services;

import java.util.List;


import com.tnt.bourse.entities.OrderAchat;
import com.tnt.bourse.model.MessageResponse;

public interface OrderAchatService {
	public MessageResponse save(OrderAchat orderachat);
	public MessageResponse update( OrderAchat orderachat);
	public MessageResponse delete(int id);
	public List<OrderAchat> findAll();
}
