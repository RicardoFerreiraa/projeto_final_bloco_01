package model;

public class Camisa extends Roupa {

	private String TipoManga;

	public Camisa(char tamanho, char cor, float material, String TipoManga) {
		super(tamanho, cor, material);
		this.TipoManga = TipoManga;

	}


	public String getTipoManga() {
		return TipoManga;
	}


	public void setTipoManga(String tipoManga) {
		TipoManga = tipoManga;
	}


	@Override
	public void Visualizar() {
		System.out.println("Tamanho da Camisa: " +getTamanho());
		System.out.println("Cor da camisa: " +getCor());
		System.out.println("Material da camisa: " +getMaterial());
		System.out.println("Tipo de manga: " +TipoManga);
	}

}
