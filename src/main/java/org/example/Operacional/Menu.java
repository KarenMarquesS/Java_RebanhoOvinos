package org.example.Operacional;

import org.example.Modelo.Manejo;
import org.example.Modelo.Peso;
import org.example.Modelo.Registro;
import org.example.Modelo.Vacina;
import org.example.Repositorio.ManejoRepositorio;
import org.example.Repositorio.PesoRepositorio;
import org.example.Repositorio.RegistroRepositorio;
import org.example.Repositorio.VacinaRepositorio;

import java.util.Scanner;

public class Menu {

    private Object scanenr;

    public void mostrarMenu(Scanner scanner){
        RegistroRepositorio registroRepositorio = new RegistroRepositorio();
        PesoRepositorio pesoRepositorio = new PesoRepositorio();
        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();

        MenuOperacional menuOperacional = new MenuOperacional();

        int escolha;

        while(true){

            System.out.println("Preencha todos os campos!!");

            System.out.println("""
                    1- Sair
                    2- Registrar Novo CORDEIRO
                    3- Manejo Aos 7 dias
                    4- Registro do Ganho de Peso
                    5- Manejo Semanal do Rebanho
                    """);

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    break;

                case 2:
                    System.out.println("Novo Cordeiro");
                    Registro novoCordeiro = menuOperacional.cadastrarCordeiro();
                    registroRepositorio.Adicionar(novoCordeiro);
                    break;

                case 3:
                    System.out.println("Manejo Aos 7 dias");
                    System.out.println("Identificar o Cordeiro, Aplicar a primeira vacina");
                    Vacina primeiroManejo = menuOperacional.IdentificarCordeiro();
                    vacinaRepositorio.Adicionar(primeiroManejo);

                case 4:
                    Peso peso = new Peso();
                    System.out.println("Ganho de Peso");
                    System.out.println("Número do BRINCO? ");
                    peso.setN_brinco(scanner.nextInt());
                    scanner.nextLine();
                    Peso novoPeso = menuOperacional.OpcoesPeso();
                    pesoRepositorio.Adicionar(novoPeso);

                case 5:
                    System.out.println("Informações do Manejo Diário");
                    Manejo novoManejo = menuOperacional.RotinaSemanal();
                    manejoRepositorio.Adicionar(novoManejo);

                default:
                    System.out.println(">>> OPÇÃO INVÁLIDA <<<");

            }
        }

    }


}
