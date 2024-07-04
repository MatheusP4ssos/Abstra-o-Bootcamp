package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Js");
    curso2.setDescricao("Descriçao curso Js");
    curso2.setCargaHoraria(7);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descrição mentoria Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Imersão Java inicial ao avançado");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devMatheus = new Dev();
    devMatheus.setNome("Dev Matheus");
    devMatheus.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Matheus:" + devMatheus.getConteudosInscritos());
    devMatheus.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos  Matheus:" + devMatheus.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Matheus" + devMatheus.getConteudoConcluidos());
    System.out.println("XP total: " + devMatheus.calcularTotalXp());

    System.out.println("-------");

    Dev devCamila = new Dev();
    devCamila.setNome("Dev Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Camila:" + devCamila.getConteudosInscritos());
    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudoConcluidos());
    System.out.println("XP total: " + devCamila.calcularTotalXp());
  }
}
