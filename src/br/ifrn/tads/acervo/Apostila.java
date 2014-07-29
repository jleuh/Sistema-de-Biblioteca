package br.ifrn.tads.acervo;

import java.util.Date;

public class Apostila extends ItemAcervo{
	
	private String titulo;
	private String autor;
	private int quantidade;
	
	public Apostila(){
		
	}
	public Apostila(double custo,int codigoItem, boolean pago, Date data, String titulo, String autor, int quantida){
		super(custo, codigoItem, pago, data);
		this.titulo = titulo;
		this.autor = autor;
		this.quantidade = quantida;
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
