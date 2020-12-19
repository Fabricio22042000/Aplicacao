package com.algaworks.algamoney.api.security;

import java.util.Collection;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.GrantedAuthority;

import com.algaworks.algamoney.api.model.Usuario;

public class UsuarioSistema extends User{
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;

	
	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> permissoes) {
		super(usuario.getEmail(),usuario.getSenha(),permissoes);
		this.usuario = usuario;
	}


	public Usuario getUsuario() {
		return usuario;
	}
	
}
