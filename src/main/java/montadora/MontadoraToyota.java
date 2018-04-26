package montadora;

import montadoraToytota.Corolla;
import montadoraToytota.Prius;
import montadoraToytota.Etios;

public class MontadoraToyota extends Montadora {

	@Override
	public void montarCarro() {
		montaCorolla();
		montaPrius();
		montaEtios();
		
	}
	private void montaCorolla() {
		for (int i8 = 0; i8 < 10; i8++) {
			Carro carro = new Corolla();
			System.out.println(carro.toString());
		}
	}
	private void montaPrius() {
		for (int i9 = 0; i9 < 10; i9++) {
			Carro carro = new Prius();
			System.out.println(carro.toString());
		}
	}
	private void montaEtios() {
		for (int i9 = 0; i9 < 10; i9++) {
			Carro carro = new Etios();
			System.out.println(carro.toString());
		}
	}
}