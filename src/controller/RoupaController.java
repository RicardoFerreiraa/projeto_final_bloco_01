package controller;

import java.util.ArrayList;
import java.util.List;


import model.Roupa;
import repository.RoupaRepository;


public class RoupaController implements RoupaRepository {

	private List<Roupa> roupas = new ArrayList<Roupa>();


	public void AtualizarRoupas(String Tamanho, Roupa novaroupa) {
		Roupa roupa = buscarRoupa(Tamanho);
		roupas.remove(roupa);
		roupas.add(novaroupa);
	}

	@Override
	public void adicionarRoupa(Roupa roupa) {
		roupas.add(roupa);
		System.out.println("");

	}

	@Override
	public Roupa buscarRoupa(String Tamanho) {
		return null;
	}


	@Override
	public void removerRoupa(String Tamanho) {

	}


	@Override
	public void procurarPorNumero(int Codigo) {


	}

}