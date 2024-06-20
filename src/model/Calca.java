package model;

public class Calca extends Roupa {

	private String Cintura;

	public Calca(char tamanho, char cor, float material, String Cintura, int Codigo) {
		super(tamanho, cor, material, Codigo);
		this.Cintura = Cintura;
	}

	public String getCintura() {
		return Cintura;
	}

	public void setCintura(String cintura) {
		this.Cintura = cintura;
	}
	@Override
	public void Visualizar() {
		System.out.println("Tamanho da calça: "+getTamanho());
		System.out.println("Cor da Calça: " +getCor());
		System.out.println("Material da camisa: "+getMaterial());
		System.out.println("Cintura da camisa: "+ Cintura);

	}
}
