package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public interface MentoriaI {

    double calcularXp();

    LocalDate getData();

    void setData(LocalDate data);

    String toString();

}