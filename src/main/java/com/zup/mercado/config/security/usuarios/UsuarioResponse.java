package com.zup.mercado.config.security.usuarios;


public class UsuarioResponse {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String email;

	UsuarioResponse(Usuario usuario){
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
	}

	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}

}
