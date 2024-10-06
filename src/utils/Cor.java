package utils;

public enum Cor {

	VERMELHO("\u001B[31m","vermelho"),
	AMARELO("\u001B[43m", "amarelo"),
	VERDE("\u001B[42m", "verde"),
	AZUL("\u001B[44m", "azul"),
	PRETO("\u001B[30m", "preto"), 

	RESET("\u001B[0m", "reset");
	
	private final String ansiCode;
	private final String value;

	Cor(String ansiCode, String cor) {
		this.ansiCode = ansiCode;
		this.value = cor;
	}
	public String ansiCode() {
		return this.ansiCode;
	}
	
	public String getValue() {
		return this.value;
	}
}
