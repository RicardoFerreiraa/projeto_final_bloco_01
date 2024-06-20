package model;

public abstract class Roupa {
	private char Tamanho;
	private char Cor;
	private float Material;
	private int Codigo;

	public Roupa(char tamanho, char cor, float material, int Codigo) {
		this.Tamanho = tamanho;
		this.Cor = cor;
		this.Material = material;
		this.Codigo = Codigo;
	}

	public char getTamanho() {
		return Tamanho;
	}


	public void setTamanho(char tamanho) {
		this.Tamanho = tamanho;
	}


	public char getCor() {
		return Cor;
	}


	public void setCor(char cor) {
		this.Cor = cor;
	}


	public float getMaterial() {
		return Material;
	}


	public void setMaterial(float material) {
		this.Material = material;
	}


	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		this.Codigo = codigo;
	}

	public abstract void Visualizar();

}
