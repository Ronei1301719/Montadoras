package montadora;

import montadoraFord.Fiesta;
import montadoraFord.Focus;
import montadoraFord.Fusion;

public class MontadoraFord extends Montadora {

	@Override
	public void montarCarro() {
		montaFiesta();
		montaFocus();
		montaFusion();
	}
	private void montaFiesta() {
		for (int i5 = 0; i5 < 10; i5++) {
			Carro carro = new Fiesta();
			System.out.println(carro.toString());
		}
	}
	private void montaFocus() {
		for (int i6 = 0; i6 < 10; i6++) {
			Carro carro = new Focus();
			System.out.println(carro.toString());
		}
	}
	private void montaFusion() {
		for (int i7 = 0; i7 < 10; i7++) {
			Carro carro = new Fusion();
			System.out.println(carro.toString());
		}
	}
}
