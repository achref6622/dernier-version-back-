package com.tnt.bourse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tnt.bourse.entities.Action;
import com.tnt.bourse.entities.Client;
import com.tnt.bourse.entities.OrderVente;
import com.tnt.bourse.model.MessageResponse;
import com.tnt.bourse.services.OrderVenteService;
import com.tnt.bourse.services.PortfeuilleService;

@RestController
@RequestMapping("/vente")
public class OrderVenteController {
	
	@Autowired
	private OrderVenteService orderVenteService;
	

	@PostMapping
	public MessageResponse save(@RequestBody OrderVente orderVente ,@RequestBody int id) {
		System.out.println("*********");
		Action a = new Action() ; 
		a.setId(id);
		return orderVenteService.save(orderVente, a);
	}
}
