package montadora;

public abstract class Carro {

	protected int porta = 4;
	protected int pneu = 4;
	protected int roda = 4;
	protected String cor;
	protected String motor;
	protected String modelo;
	protected String marca;
	
	public int getPorta() {
		return porta;
	}
	
	public int getPneu() {
		return pneu;
	}
	
	public int getRoda() {
		return roda;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Carro [porta=" + porta + ", pneu=" + pneu + ", roda=" + roda + ", cor=" + cor + ", motor=" + motor
				+ ", modelo=" + modelo + ", marca=" + marca + "]";
	}

	
		
	
}
