package livraria.domain;

public abstract class Produto  {
	
    private String nome;
	private Integer id;
	private Double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", id=" + id + ", preço=" + preco + "]";
	}
	
	
	
}
