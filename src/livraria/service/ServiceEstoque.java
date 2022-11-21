package livraria.service;

import java.util.ArrayList;
import java.util.List;

import livraria.domain.AlbumMusica;
import livraria.domain.Brinquedo;
import livraria.domain.Filme;
import livraria.domain.Jogo;
import livraria.domain.Livro;

public class ServiceEstoque {
	
	public static List<AlbumMusica> gerarAlbuns(){
		List<AlbumMusica> albumMusicaList = new ArrayList<>();
		albumMusicaList.add(new AlbumMusica("Revolver", 1, 19.78, "The Beatles", List.of("Rock","Pop Rock", "Blues") , List.of("Parlophone")));
		albumMusicaList.add(new AlbumMusica("In Utero", 2, 21.90, "Nirvana", List.of("Rock","Pop Rock") , List.of("DGC")));
		albumMusicaList.add(new AlbumMusica("Innervisions", 3, 12.75, "Stevie Wonder", List.of("Rock", "Blues") , List.of("Tamla")));
		albumMusicaList.add(new AlbumMusica("Definitely Maybe", 4, 14.89, "Oasis", List.of("Rock") , List.of("Creation")));
		return albumMusicaList;
	}
	
	public static List<Brinquedo> gerarBrinquedos(){
		List<Brinquedo> brinquedoList = new ArrayList<>();
		brinquedoList.add(new Brinquedo("Carrinho", 6, 25.87, "Corrida"));
		brinquedoList.add(new Brinquedo("A casa do Batman", 7, 97.74, "Lego"));
		brinquedoList.add(new Brinquedo("Monta monta", 8, 29.99, "Educativo"));
		return brinquedoList;
	}
	
	public static List<Filme> gerarFilmes(){
		List<Filme> filmeList = new ArrayList<>();
		filmeList.add(new Filme("Homem-Aranha", 9, 89.90, "Marvel", List.of("Jon Watts"), List.of("Ação","Aventura"), List.of("Kevin Feige","AMy Pascal")));
		filmeList.add(new Filme("Os Caça Fantasmas", 10, 79.90, "Ghostbusters", List.of("Jason Reitman"), List.of("Ação","Aventura", "Sobrenatural"), List.of("Ivan Reitman")));
		filmeList.add(new Filme("Milagre na cela 7", 11, 69.90, "Motion Content Group", List.of("Mehmet Ada Öztekin"), List.of("Drama"), List.of("Cengiz Çagatay")));
		return filmeList;
	}
	
	public static List<Jogo> gerarJogos(){
		List<Jogo> jogoList = new ArrayList<>();
		jogoList.add(new Jogo("FIFA", 12, 189.90 , "EA Sports", List.of("Esporte","Simulação"), List.of("EA SPORTS")));
		jogoList.add(new Jogo("Minecraft", 13, 249.90 , "Microsoft", List.of("Sobrevivência"), List.of("Mojang Studios")));
		jogoList.add(new Jogo("Assassin's Creed", 14, 149.90 , "Ubisoft", List.of("Acção","aventura"), List.of("Ubisoft Montreal")));
		return jogoList;
	}
	
	public static List<Livro> gerarLivros(){
		List<Livro> livroList = new ArrayList<>();
		livroList.add(new Livro("Padrões de Projetos", 15, 112.99, List.of("Tecnologia"), List.of("Erich Gamma"), "Bookman"));
		livroList.add(new Livro("Código limpo", 16, 85.54, List.of("Tecnologia"), List.of("Robert C. Martin"), "Alta Books"));
		livroList.add(new Livro("Expressões Regulares", 17, 45.50, List.of("Tecnologia"), List.of("Aurelio Marinho Jargas"), "Novatec Editora"));
		return livroList;
	}

}
