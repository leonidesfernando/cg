package br.com.home.cg.modelo;


public enum TipoLancamentoAtivo {

	HIGH_TECH("HighTech"), TECSINAPSE("TecSinapse");
	
	private String tipo;
	
	private TipoLancamentoAtivo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
