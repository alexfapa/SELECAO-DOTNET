

package br.com.selecao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="pessoa")
@Entity
public class PessoaModel {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="IdPessoa")
	private Integer codigo;
	
	@Column(name="CpfPessoa")
	public String cpf;
	
	@Column(name="NomePessoa")
	public String nome;
	
	@Column(name="EmailPessoa")
	public String email;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
