package br.edu.unicesumar.type;

public enum Bancos {

	BANCO_BRASIL("Banco do Brasil", "001"), 
	SANTANDER("Santander", "033"), 
	CEF("Caixa Econômica Federal", "104"), 
	ITAU("Itaú", "341"),
	BANCOOB("Sicoob", "756");
	
	public String nomeBanco;
	public String numeroBanco;

	Bancos(String nomeBanco, String numeroBanco){
		this.nomeBanco = nomeBanco;
		this.numeroBanco = numeroBanco;		
	}
	
	public Bancos getEnum(String nome){
		for (Bancos b1 : Bancos.values()){
			if (b1.nomeBanco.equals(nome)){
				return b1;
			}
		}
		return null;
		
	}
	
	

}
