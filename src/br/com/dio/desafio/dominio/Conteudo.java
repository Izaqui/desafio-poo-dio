package br.com.dio.desafio.dominio;

public abstract class Conteudo extends Pessoa{

    protected static final double XP_PADRAO = 10d;

    private String titulo;

    public Conteudo(String titulo, String descricao){
        super(descricao);
        this.titulo = titulo;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected abstract void progredir();

}
