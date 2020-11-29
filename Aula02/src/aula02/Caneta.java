package aula02;
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	protected void rabiscar() {
		if (this.tampada==true) {
			System.out.println("ERRO! A caneta está tampada!");
		} else {
			System.out.println("Estou Rabiscandokiaohbgwerjgwoh´pafjgbs");
		}
		
	}
	public void tampar() {
		this.tampada=true;
	}
	public void destampar() {
		this.tampada=false;
	}
}
