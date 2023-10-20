
package br.com.livraria.produtos;
import br.com.livraria.externos.*;

public class TesteLivraria {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("586.907.788-53");
        autor1.setNome("Abel Ferreira");
        autor1.setEmail("abel.ferreira@hotmail.com");

        Editora editora1 = new Editora("Editora Intrínseca", "05.660.045/0001-06");
        editora1.setNomeFantasia("EDITORA INTRINSECA LTDA");

        System.out.println("----------- INFORMAÇÕES DO LIVRO -------------");
        Livro livro1 = new Livro("123-45-6789-123-4", autor1, editora1);
        livro1.setNome("Cabeça fria, Coração Quente");
        livro1.setDescricao("Uma viagem pelos bastidores da equipa técnica: segredos, reflexões e métodos de trabalho revelados em primeira pessoa");
        livro1.setValor(160.40);
        livro1.setDescontoPercentual(20);
        livro1.exibirDadosLivro();
        System.out.println("");

        System.out.println("----------- INFORMAÇÕES DO AUTOR -------------");
        autor1.exibirDadosdoAutor();
        System.out.println("");

        System.out.println("----------- INFORMAÇÕES DO EDITORA -------------");
        editora1.exibirDadosDaEditora();
    }

}
