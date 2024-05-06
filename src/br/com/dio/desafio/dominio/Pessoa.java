package br.com.dio.desafio.dominio;

public class Pessoa {
    protected String descricao;

    public Pessoa( String descricao){
        this.descricao = descricao;
    }


    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
