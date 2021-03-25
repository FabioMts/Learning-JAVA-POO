package com.loiane.cursojava.aula43.labs.exe03;

public class Peixe extends Animal{
	
	public String caracteristica = "Barbatanas e cauda";
	
	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("cinzenta");
	}
	

	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristica;
		return s;
	}

}
