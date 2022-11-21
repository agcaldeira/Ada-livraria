package livraria.domain;

import java.util.List;

public class Filme extends Produto {
	
	private String est�dio;
	private List<String> diretores;
	private List<String> g�neros;
	private List<String> produtores;
	
	public Filme(String nome, Integer id, Double preco, String est�dio, List<String> diretores, List<String> g�neros, List<String> produtores) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.est�dio = est�dio;
		this.diretores = diretores;
		this.g�neros = g�neros;
		this.produtores = produtores;
	}
	
	public Filme() {
	}
	
	public String getEst�dio() {
		return est�dio;
	}
	public void setEst�dio(String est�dio) {
		this.est�dio = est�dio;
	}
	public List<String> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<String> diretores) {
		this.diretores = diretores;
	}
	public List<String> getG�neros() {
		return g�neros;
	}
	public void setG�neros(List<String> g�neros) {
		this.g�neros = g�neros;
	}
	public List<String> getProdutores() {
		return produtores;
	}
	public void setProdutores(List<String> produtores) {
		this.produtores = produtores;
	}

	@Override
	public String toString() {
		return "Filme [getEst�dio()=" + getEst�dio() + ", getDiretores()=" + getDiretores() + ", getG�neros()="
				+ getG�neros() + ", getProdutores()=" + getProdutores() + ", getNome()=" + getNome() + ", getId()="
				+ getId() + ", getPreco()=" + getPreco() + "]";
	}
	
}
