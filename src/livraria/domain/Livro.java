package livraria.domain;

import java.util.List;

public class Livro extends Produto {
	
	private List<String> generos;
	private List<String> escritores;
	private String editora;
	
	public Livro(String nome, Integer id, Double preco, List<String> generos, List<String> escritores, String editora) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.generos = generos;
		this.escritores = escritores;
		this.editora = editora;
	}
	

	
	public List<String> getGeneros() {
		return generos;
	}
	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}
	public List<String> getEscritores() {
		return escritores;
	}
	public void setEscritores(List<String> escritores) {
		this.escritores = escritores;
	}
	String getEditora() {
		return editora;
	}
	void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [getGeneros()=" + getGeneros() + ", getEscritores()=" + getEscritores() + ", getEditora()="
				+ getEditora() + ", getNome()=" + getNome() + ", getId()=" + getId() + ", getPreco()=" + getPreco()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
