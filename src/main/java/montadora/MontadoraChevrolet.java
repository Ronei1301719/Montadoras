package montadora;

import montadoraChevrolet.Camaro;
import montadoraChevrolet.Cruze;
import montadoraChevrolet.Onix;
import montadoraChevrolet.Prisma;

public class MontadoraChevrolet extends Montadora {

	@Override
	public void montarCarro() {
		montaCamaro();
		montaCruze();
		montaOnix();
		montaPrisma();
	}

	private void montaCamaro() {
		for (int i = 0; i < 10; i++) {
			Carro carro = new Camaro();
			System.out.println(carro.toString());
		}
	}

	private void montaCruze() {
		for (int i2 = 0; i2 < 10; i2++) {
			Carro carro = new Cruze();
			System.out.println(carro.toString());
		}
	}

	private void montaOnix() {
		for (int i3 = 0; i3 < 10; i3++) {
			Carro carro = new Onix();
			System.out.println(carro.toString());
		}
	}
	private void montaPrisma() {
		for (int i1 = 0; i1 < 10; i1++) {
			Carro carro = new Prisma();
			System.out.println(carro.toString());
		}
	}
}