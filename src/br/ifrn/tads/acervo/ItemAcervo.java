package br.ifrn.tads.acervo;

import java.util.Date;

	
public class ItemAcervo {
	protected double custo;
	protected Date data;
	protected int codigoItem;
	protected boolean pago;
	
	public ItemAcervo(){
		
	}
	
	public ItemAcervo(double custo, int codigoItem, boolean pago, Date data){
		this.custo = custo;
		this.codigoItem = codigoItem;
		this.pago = pago;
		this.data = data;
	}
	
	@Override
	public String toString(){
		return  "Custo: " +this.custo+"\n"+
				"Código: " + this.codigoItem+"\n";
				
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	
}
