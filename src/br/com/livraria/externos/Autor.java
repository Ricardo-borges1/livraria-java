package br.com.livraria.externos;

public class Autor {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Autor (String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void exibirDadosdoAutor(){
		System.out.println("Autor:"+ nome);
		System.out.println("CPF:"+ cpf);
		System.out.println("Email:"+ email);
	}

}
