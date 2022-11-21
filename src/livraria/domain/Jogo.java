package livraria.domain;

import java.util.List;

public class Jogo extends Produto {
	
	private String distribuidora;
	private List<String> generos;
	private List<String> estudio;
	
	public Jogo(String nome, Integer id, Double preco, String distribuidora, List<String> generos, List<String> estudio) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.distribuidora = distribuidora;
		this.generos = generos;
		this.estudio = estudio;
	}
	
	public Jogo() {
	}
	
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public List<String> getEstudio() {
		return estudio;
	}
	public void setEstudio(List<String> estudio) {
		this.estudio = estudio;
	}

	@Override
	public String toString() {
		return "Jogo [getDistribuidora()=" + getDistribuidora() + ", getGeneros()=" + getGeneros() + ", getEstudio()="
				+ getEstudio() + ", getNome()=" + getNome() + ", getId()=" + getId() + ", getPreco()=" + getPreco()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
