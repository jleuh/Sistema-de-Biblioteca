package br.ifrn.tads.acervo;

import java.util.Date;

	
public class ItemAcervo {
	private double custo;
	private Date data;
	private int codigoItem;
	private boolean pago;
	
	public ItemAcervo(){
		
	}
	
	public ItemAcervo(double custo, int codigoItem, boolean pago, Date data){
		this.custo = custo;
		this.codigoItem = codigoItem;
		this.pago = pago;
		this.data = data;
	}
	
}
