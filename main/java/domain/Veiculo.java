package domain;

import exceptions.ErroBikeException;
import exceptions.ErroCarroException;
import exceptions.ErroMotoException;

public  abstract class Veiculo {
	private String descricao;
	private String ano;
	private String marca;
	
	

	
	

	public Veiculo(String descricao, String ano) {
		this.descricao = descricao;
		this.ano = ano;
		this.marca = marca;
		
	}
	
	public String verVeiculo() {
		
		StringBuilder vec= new StringBuilder();
		vec.append(descricao);
		vec.append(";");
		vec.append(ano);
		vec.append(";");
		vec.append(marca);
		vec.append(";");
		try {
			vec.append(valorDoServico());
		} catch (ErroBikeException | ErroCarroException | ErroMotoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vec.append("\r\n");
		
		return vec.toString();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder vec = new StringBuilder();
		vec.append(this.descricao);
		vec.append(";");
		vec.append(this.ano);
		vec.append(";");
		vec.append(marca);
		
		
		
		return vec.toString();
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}

	
	public String getAno() {
		return ano;
	}
	public String getMarca() {
		return marca;
	}
	
	
	
	public abstract float valorDoServico() throws ErroBikeException, ErroCarroException, ErroMotoException;
	
	
}    

    