package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	//construtor
	public Curso() {
	}
	//getters e setters
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
}
