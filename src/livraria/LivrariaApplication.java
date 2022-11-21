package livraria;
import java.util.List;

import livraria.domain.AlbumMusica;
import livraria.service.Caixa;
import livraria.service.Estoque;

public class LivrariaApplication {
	
	public static void main(String args[]) {
		
		// Criando o Estoque
		Estoque estoque = new Estoque();
		
		// Recuperando os dados do estoque
		List<AlbumMusica> albumList = estoque.listarAlbumMusica();
		
		// Adicionando
		estoque.adicionarAlbum(new AlbumMusica("Exile on Main St.", 5, 17.98, "The Rolling Stones", List.of("Rock") , List.of("Rolling Stones")));
		
		// Listando
		for (AlbumMusica albumMusica : albumList) {
			System.out.println(albumMusica);
		}
		
		// Excluindo
		albumList.remove(albumList.get(2));
		
		// Listando
		System.out.println("-----------------------------------------------------");
		for (AlbumMusica albumMusica : albumList) {
			System.out.println(albumMusica);
		}
		
		//Listando por Categoria
		System.out.println("-----------------------------------------------------");
		estoque.listarEstoquePorCategoria();
		
		//Movimentando o Caixa
		System.out.println("-----------------------------------------------------");
		Caixa caixa = new Caixa();
		System.out.println("Saldo do Caixa: " + caixa.getTotal());
		caixa.registrarCompra(albumList.get(0));
		System.out.println("Saldo do Caixa: " + caixa.getTotal());
		caixa.registrarCompra(albumList.get(1));
		System.out.println("Saldo do Caixa: " + caixa.getTotal());
	}
	
	

}
