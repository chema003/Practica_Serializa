package gestionVehiculos;
import java.io.Serializable;

import serializadorVehiculo.SerializarVehiculo;



public class Vehiculo implements Serializable{

	private String matricula;
	private String marca;
	private String modelo;
	private double deposito;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public Vehiculo(String matricula, String marca, String modelo, double deposito) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.deposito = deposito;
	}
	
	public Vehiculo() {}
	
	@Override
	public String toString() {
		return "El Vehiculo es de la marca " + getMarca() + " y modelo "+ getModelo() +
				"tiene como matrícula " + getMatricula() + ", y un depósito con capacidad de " +
				getDeposito() + "litros.";
	}
	
	
	
	
}
