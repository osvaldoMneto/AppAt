package domain;

import exceptions.ErroMotoException;

public class Moto extends Veiculo {
	
	private int cilindradas;
	private int nota;
	private String placa;

	public Moto(String descricao, String ano) {
		super(descricao, ano);
		// TODO Auto-generated constructor stub
	}

	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			StringBuilder mot = new StringBuilder();
			
			mot.append(this.cilindradas);
			mot.append(";");
			mot.append(nota);
			mot.append(";");
			mot.append(placa);
			mot.append(";");
			mot.append(super.toString());
			mot.append(";");
			
			
			
			return mot.toString();
	
	}
	
	@Override
	public float valorDoServico() throws ErroMotoException {
		
		if(nota == 0 || nota < 0 || nota > 10) {
			throw new ErroMotoException (" A Nota deve estar entre 1 e 10");
			
		}
		
		 if ( nota >8) {
			 
				int valor1 = 5;
				System.out.println ("O valor do serviço é de R$" + valor1 +" por Km");
				 
			 }else { 
				  int valor2 = 3;
				 System.out.println("O valor do serviço é R$"+ valor2+ "Km");}
		
		
		
		
		return this.valorDoServico();
	}
	
	public int getCilindradas() {
		return cilindradas;
	}


	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
