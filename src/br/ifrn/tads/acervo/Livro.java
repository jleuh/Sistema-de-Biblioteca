package br.ifrn.tads.acervo;

import java.util.Date;

public class Livro extends ItemAcervo{
	
	private String titulo;
	private String autor;
	private String isbn;
	private int edicao;
	private int quantidade;
	
	public Livro(){
		
	}
	public Livro(double custo, int codigoItem, boolean pago, Date data,String titulo, String autor, String isbn, int edicao, int quantidade){
		super(custo, codigoItem, pago, data);
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicao = edicao;
		this.quantidade = quantidade;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString(){
		return "----------------\n----------------\nTitulo: " + this.titulo + "\n"+"Autor: " + this.autor + 
												  "\n" + "ISBN: "+ this.isbn + "\n"+"Edicao: " +this.edicao+
												  	"\n"+ "Quantidade: " + this.quantidade +"\n"+ super.toString();
	}
}
