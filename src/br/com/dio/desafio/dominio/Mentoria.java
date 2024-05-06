package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo implements MentoriaI {

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    public Mentoria() {
        this("Título padrão", "Descrição padrão", LocalDate.now());
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    protected void progredir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'progredir'");
    }
}
