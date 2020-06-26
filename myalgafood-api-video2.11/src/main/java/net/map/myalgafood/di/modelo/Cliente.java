/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.map.myalgafood.di.modelo;

/**
 *
 * @author mpisching
 */
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;
	public Cliente(String nome, String email, String telefone, boolean ativo) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.ativo = ativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

    public void ativar() {
    	this.ativo = true;
    }
}
