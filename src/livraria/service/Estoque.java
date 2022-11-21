package livraria.service;
import java.util.List;

import livraria.domain.AlbumMusica;
import livraria.domain.Brinquedo;
import livraria.domain.Filme;
import livraria.domain.Jogo;
import livraria.domain.Livro;

public class Estoque {
	
	// Populando o Estoque
	private List<AlbumMusica> albumMusicaList = ServiceEstoque.gerarAlbuns();
	private List<Brinquedo> brinquedoList = ServiceEstoque.gerarBrinquedos();
	private List<Filme> filmeList = ServiceEstoque.gerarFilmes();
	private List<Jogo> jogoList = ServiceEstoque.gerarJogos();
	private List<Livro> livroList = ServiceEstoque.gerarLivros();
	
	// Adcionando
	public void adicionarAlbum(AlbumMusica album) {
		albumMusicaList.add(album);
	}
	public void adicionarBrinquedo(Brinquedo brinquedo) {
		brinquedoList.add(brinquedo);
	}
	public void adicionarFilme(Filme filme) {
		filmeList.add(filme);
	}
	public void adicionarJogo(Jogo jogo) {
		jogoList.add(jogo);
	}
	public void adicionarJogo(Livro livro) {
		livroList.add(livro);
	}
	
	// Listando
	public List<AlbumMusica> listarAlbumMusica() {
		return albumMusicaList;
	}
	public List<Brinquedo> listarBrinquedo() {
		return brinquedoList;
	}
	public List<Filme> listarFilme() {
		return filmeList;
	}
	public List<Jogo> listarJogo() {
		return jogoList;
	}
	public List<Livro> listarLivro() {
		return livroList;
	}
	
	// Removendo
	public List<AlbumMusica> excluirAlbumMusica(AlbumMusica album) {
		for (AlbumMusica albumMusica : albumMusicaList) {
			if (album.equals(albumMusica)) {
				albumMusicaList.remove(albumMusica);
			}
		}
		return albumMusicaList;
	}
	
	public List<Brinquedo> excluirBrinquedo(Brinquedo brinquedo) {
		for (Brinquedo b : brinquedoList) {
			if (brinquedo.equals(b)) {
				brinquedoList.remove(b);
			}
		}
		return brinquedoList;
	}
	
	public List<Filme> excluirFilme(Filme filme) {
		for (Filme f : filmeList) {
			if (filme.equals(f)) {
				filmeList.remove(f);
			}
		}
		return filmeList;
	}
	
	public List<Jogo> excluirJogo(Jogo jogo) {
		for (Jogo j : jogoList) {
			if (jogo.equals(j)) {
				jogoList.remove(j);
			}
		}
		return jogoList;
	}
	
	public void listarEstoquePorCategoria() {
		System.out.println("---------------- Listando Album de Músicas");
		for (AlbumMusica a : albumMusicaList) {
			System.out.println(a);
		}
		System.out.println("---------------- Listando Brinquedos");
		for (Brinquedo a : brinquedoList) {
			System.out.println(a);
		}
		System.out.println("---------------- Listando Filmes");
		for (Filme a : filmeList) {
			System.out.println(a);
		}
		System.out.println("---------------- Listando Jogos");
		for (Jogo a : jogoList) {
			System.out.println(a);
		}
		System.out.println("---------------- Listando Livros");
		for (Livro a : livroList) {
			System.out.println(a);
		}
		
	}
}
