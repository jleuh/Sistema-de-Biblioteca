package br.ifrn.tads.acervo;

import java.util.Date;

public class Texto extends ItemAcervo{

		private String autor;
		
		public Texto(){
			
		}
		public Texto(double custo, int codigoItem, boolean pago, Date data, String autor){
			super(custo, codigoItem, pago, data);
			this.autor = autor;
		}
		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		
}
