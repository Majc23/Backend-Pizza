package com.pizza.bean;

import java.util.ArrayList;

import com.pizza.*;
public class Pedidos {
	
	public int id;
	public String date;
	public  ArrayList<Pizza> pizzas; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	
	
}
