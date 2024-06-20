package repository;

import model.Roupa;

public interface RoupaRepository {

	void adicionarRoupa (Roupa roupa);
	Roupa buscarRoupa(String Tamanho);
	void removerRoupa(String Tamanho);
}
