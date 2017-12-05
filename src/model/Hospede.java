package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospede {
	
	@Id
	@Column
	private String cpf;
	
	@Column(name = "nomeHospede", nullable = false, length = 100)
	private String nome;
	
	@Column
	private String estado;
	
	@Column(nullable = false)
	private String pais;
	
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, length = 16)
	private String password;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setId(String cpf) {
		this.cpf = cpf;
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
	
	public void setUserID(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
