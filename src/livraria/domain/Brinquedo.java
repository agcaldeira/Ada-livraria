package livraria.domain;

public class Brinquedo extends Produto {

	private String tipo;

	public Brinquedo(String nome, Integer id, Double preco, String tipo) {
		this.setNome(nome);
		this.setId(id);
		this.setPreco(preco);
		this.tipo = tipo;
	}
	
	public Brinquedo() {
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + this.getNome() + ", id=" + this.getId() + ", preço=" + this.getPreco() + "] - " + "Brinquedo [tipo=" + this.getTipo() + "]";
	}
	
	

}
