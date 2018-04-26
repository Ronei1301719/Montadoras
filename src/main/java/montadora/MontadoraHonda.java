package montadora;

import montadoraHonda.City;
import montadoraHonda.Fit;

public class MontadoraHonda extends Montadora {

	@Override
	public void montarCarro() {
		montaCity();
		montaFit();
	}
	private void montaCity() {
		for (int i8 = 0; i8 < 10; i8++) {
			Carro carro = new City();
			System.out.println(carro.toString());
		}
	}
	private void montaFit() {
		for (int i9 = 0; i9 < 10; i9++) {
			Carro carro = new Fit();
			System.out.println(carro.toString());
		}
	}
}

