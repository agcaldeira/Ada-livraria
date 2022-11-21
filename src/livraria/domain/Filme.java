package livraria.domain;

import java.util.List;

public class Filme extends Produto {
	
	private String estúdio;
	private List<String> diretores;
	private List<String> gêneros;
	private List<String> produtores;
	
	public Filme(String nome, Integer id, Double preco, String estúdio, List<String> diretores, List<String> gêneros, List<String> produtores) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.estúdio = estúdio;
		this.diretores = diretores;
		this.gêneros = gêneros;
		this.produtores = produtores;
	}
	
	public Filme() {
	}
	
	public String getEstúdio() {
		return estúdio;
	}
	public void setEstúdio(String estúdio) {
		this.estúdio = estúdio;
	}
	public List<String> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<String> diretores) {
		this.diretores = diretores;
	}
	public List<String> getGêneros() {
		return gêneros;
	}
	public void setGêneros(List<String> gêneros) {
		this.gêneros = gêneros;
	}
	public List<String> getProdutores() {
		return produtores;
	}
	public void setProdutores(List<String> produtores) {
		this.produtores = produtores;
	}

	@Override
	public String toString() {
		return "Filme [getEstúdio()=" + getEstúdio() + ", getDiretores()=" + getDiretores() + ", getGêneros()="
				+ getGêneros() + ", getProdutores()=" + getProdutores() + ", getNome()=" + getNome() + ", getId()="
				+ getId() + ", getPreco()=" + getPreco() + "]";
	}
	
}
