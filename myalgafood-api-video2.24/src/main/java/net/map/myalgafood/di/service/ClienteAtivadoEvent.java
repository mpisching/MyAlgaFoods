package net.map.myalgafood.di.service;

import net.map.myalgafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
