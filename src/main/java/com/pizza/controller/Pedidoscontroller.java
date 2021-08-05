package com.pizza.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.bean.Pedidos;
import com.pizza.bean.Pizza;


@RestController
@RequestMapping("/pedidos")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Pedidoscontroller {

	private ArrayList<Pedidos> listOrder = new ArrayList<Pedidos>();
	
	@GetMapping
	public ArrayList<Pedidos> GetOrder(HttpServletRequest request) {
		
		
		return listOrder;
	}

	@PostMapping
    public @ResponseBody Pedidos addOrder(@RequestBody Pedidos order) {

		order.setId(listOrder.size() + 1);
		listOrder.add(order);
        return order;
    }
	
	
	/*@RequestMapping(value="/pedido", method = RequestMethod.POST)
	public void createOrder(@RequestBody orden HttpServletRequest request) {
		
		Pedidos orden = new Pedidos();
		orden.setId(listOrder.size() + 1);
		orden.setPizzas(request.body.)
		//orden.setP1(2);
		//orden.setP2(1);
		listOrder.add(orden);
	}
	*/
}
