package br.com.livraria.externos;

public class Editora {

	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	public Editora (String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	
	public void exibirDadosDaEditora() {
		System.out.println("Razão Social:" + razaoSocial);
		System.out.println("Nome Fantasia:" + nomeFantasia);
		System.out.println("CNPJ"+ cnpj);
	}

}
