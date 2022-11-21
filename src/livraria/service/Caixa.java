package livraria.service;

import livraria.domain.AlbumMusica;
import livraria.domain.Brinquedo;
import livraria.domain.Filme;
import livraria.domain.Jogo;
import livraria.domain.Livro;

public class Caixa {
	
	private double total = 0.0;

	public double getTotal() {
		return total;
	}

	private void adiciona(double total) {
		this.total += total;
	}
	
	public void registrarCompra(AlbumMusica produto) {
		adiciona(produto.getPreco());
	}
	public void registrarCompra(Brinquedo produto) {
		adiciona(produto.getPreco());
	}
	public void registrarCompra(Filme produto) {
		adiciona(produto.getPreco());
	}
	public void registrarCompra(Jogo produto) {
		adiciona(produto.getPreco());
	}
	public void registrarCompra(Livro produto) {
		adiciona(produto.getPreco());
	}


}
