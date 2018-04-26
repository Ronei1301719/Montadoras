package Main;

import java.awt.List;
import java.util.ArrayList;

import montadoraChevrolet.Cruze;
import montadoraChevrolet.Camaro;
import montadoraChevrolet.Onix;
import montadoraChevrolet.Prisma;
import montadoraFord.Fiesta;
import montadoraFord.Focus;
import montadoraFord.Fusion;
import montadoraHonda.City;
import montadoraHonda.Fit;
import montadoraToytota.Corolla;
import montadoraToytota.Prius;
import montadoraToytota.Etios;
import montadora.Carro;
import montadora.Montadora;
import montadora.MontadoraChevrolet;
import montadora.MontadoraFord;
import montadora.MontadoraHonda;
import montadora.MontadoraToyota;


public class Main {

	public static void main(String[] args) {
		
		Montadora montadora = new MontadoraChevrolet();
		montadora.montarCarro();
		Montadora a = new MontadoraFord();
		a.montarCarro();
		Montadora h = new MontadoraHonda();
		h.montarCarro();
		Montadora t = new MontadoraToyota();
		t.montarCarro();
	}

}
