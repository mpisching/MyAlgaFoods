package net.map.myalgafood.di.notificacao;

import net.map.myalgafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String message);

}