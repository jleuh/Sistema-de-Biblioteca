package br.ifrn.tads.app;

import java.util.HashSet;
import java.util.Set;

import br.ifrn.tads.acervo.Apostila;
import br.ifrn.tads.acervo.ItemAcervo;
import br.ifrn.tads.acervo.Livro;



public class SistemaBiblioteca {
	public static Set<ItemAcervo> acervo = new HashSet<>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Livro l  = new Livro();
		
		l.setAutor("Ariano");
		l.setTitulo("O Alto da Comparecida");
		l.setCodigoItem(123);
		l.setCusto(50);
		
		
		System.out.println(l.toString());
		

	}

}
