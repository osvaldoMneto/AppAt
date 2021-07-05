package testes;

import domain.Bike;
import domain.Carro;
import domain.Moto;
import domain.Veiculo;

public class TesteVeiculo {
	
	public static void main( String [] args) {
		
		Bike bk1 = new Bike("Entrega rapida", "2010");
		bk1.setCondutor("Gulherme");
		System.out.println("Bike: " +bk1);
		
		
		Carro car1 = new Carro("Entrega rapida", "2010");
		car1.setLugares(6);
		System.out.println(" Carro:  " +car1);
		
		Moto mot1 = new Moto("Entrega rapida", "2010");
		mot1.setPlaca("XLM 200");
		System.out.println("Moto: " +bk1);
		
	}
	

}
