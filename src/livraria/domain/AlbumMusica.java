package livraria.domain;

import java.util.List;

public class AlbumMusica extends Produto {

	private String artistas;
	private List<String> generos;
	private List<String> selos;
	
	public AlbumMusica(String nome, Integer id, Double preco, String artistas, List<String> generos, List<String> selos) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.artistas = artistas;
		this.generos = generos;
		this.selos = selos;
	}
	
	public AlbumMusica() {
	}
	
	public String getArtistas() {
		return artistas;
	}
	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}
	public List<String> getgeneros() {
		return generos;
	}
	public void setgeneros(List<String> generos) {
		this.generos = generos;
	}
	public List<String> getSelos() {
		return selos;
	}
	public void setSelos(List<String> selos) {
		this.selos = selos;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + this.getNome() + ", id=" + this.getId() + ", preço=" + this.getPreco() + "] - " + "AlbumMusica [artistas=" + this.getArtistas() + ", generos=" + this.getgeneros() + ", selos=" + selos + "]";
	}
	
	
}
