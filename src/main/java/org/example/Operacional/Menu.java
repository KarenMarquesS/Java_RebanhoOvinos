package org.example.Operacional;

import org.example.Modelo.Manejo;
import org.example.Modelo.Peso;
import org.example.Modelo.Registro;
import org.example.Modelo.Vacina;
import org.example.Repositorio.ManejoRepositorio;
import org.example.Repositorio.PesoRepositorio;
import org.example.Repositorio.RegistroRepositorio;
import org.example.Repositorio.VacinaRepositorio;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public void menuAdicionar(Scanner scanner){
        RegistroRepositorio registroRepositorio = new RegistroRepositorio();
        PesoRepositorio pesoRepositorio = new PesoRepositorio();
        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();

        MenuOperacional menuOperacional = new MenuOperacional();

        int escolha1;

        while(true){

            System.out.println("""
                             CORDEIRO TECH
                    >> ADICIONAR NOVOS REGISTROS <<
                   
                    1- Voltar ao Menu Anterior
                    2- Registrar Novo CORDEIRO
                    3- Manejo Aos 7 dias
                    4- Registro do Ganho de Peso
                    5- Manejo Semanal do Rebanho
                    6- Sair do sistema
                    """);

            System.out.println("Escolha uma opção: ");

            escolha1 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha1){
                case 1:
                    System.out.println("Voltar ao Menu Anterior");
                    return;

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
                    break;

                case 4:
                    Peso peso = new Peso();
                    System.out.println("Ganho de Peso");
                    System.out.println("Número do BRINCO? ");
                    peso.setN_brinco(scanner.nextInt());
                    scanner.nextLine();
                    Peso novoPeso = menuOperacional.OpcoesPeso();
                    pesoRepositorio.Adicionar(novoPeso);
                    break;

                case 5:
                    System.out.println("Informações do Manejo Diário");
                    Manejo novoManejo = menuOperacional.RotinaSemanal();
                    manejoRepositorio.Adicionar(novoManejo);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println(">>> OPÇÃO INVÁLIDA <<<");
                    break;

            }
        }
    }


    public void menuEditar(Scanner scanner){

        RegistroRepositorio registroRepositorio = new RegistroRepositorio();
        PesoRepositorio pesoRepositorio = new PesoRepositorio();
        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();
        MenuOperacional menuOperacional = new MenuOperacional();

        int escolha2;

        while (true){
            System.out.println("""
                         CORDEIRO TECH
                    >> EDITAR REGISTROS <<
                   
                    1- Voltar ao Menu Anterior
                    2- Editar o Registro do Novo CORDEIRO
                    3- Editar o Manejo Aos 7 dias
                    4- Editar o Registro do Ganho de Peso
                    5- Editar o Manejo Semanal do Rebanho
                    6- Sair do sistema
                    """);

            System.out.println("Escolha uma opção: ");

            escolha2 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha2){
                case 1:
                    System.out.println("Voltar ao Menu Anterior");
                    return;

                case 2:
                    System.out.println("Editar o REGISTRO do Novo Cordeiro");
                    Registro editarRegCordeiro = menuOperacional.editarRegistro();
                    registroRepositorio.UpDateDinamico(editarRegCordeiro);
                    break;

                case 3:
                    System.out.println("Editar os dados do manejo de 7 dias");
                    Vacina editarVacina = menuOperacional.editarRegVacina();
                    vacinaRepositorio.UpDateDinamico(editarVacina);
                    break;

                case 4:
                    System.out.println("Editar os dados do Ganho de Peso");
                    Peso editarPeso = menuOperacional.editarRegPeso();
                    pesoRepositorio.UpDateDinamico(editarPeso);
                    break;

                case 5:
                    System.out.println("Editar os dados do Manejo Semanal");
                    Manejo editarManejo = menuOperacional.editarRegManejo();
                    manejoRepositorio.UpDateDinamico(editarManejo);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public void menuExcluir(Scanner scanner){

        PesoRepositorio pesoRepositorio = new PesoRepositorio();
        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();
        MenuOperacional menuOperacional = new MenuOperacional();

        int escolha3;

        while (true){

            System.out.println("""
                          CORDEIRO TECH
                    >> REMOVER REGISTROS <<
                   
                    1- Voltar ao Menu Anterior
                    2- REMOVER FICHA ZOOTECNICA DO CORDEIRO
                    3- SAIR
                    """);

            System.out.println("Escolha uma opção: ");

            escolha3 = scanner.nextInt();
            scanner.nextLine();

            switch (escolha3){
                case 1:
                    System.out.println("Voltar ao Menu Anterior");
                    return;

                case 2:
                    System.out.println("Remover FICHA ZOOTECNICA DO CORDEIRO");
                    System.out.println("Informe o número do brinco do cordeiro que deseja remover do sistema: ");
                    int n_brinco = scanner.nextInt();

                    Map<String, Object> dadosCordeiro = menuOperacional.buscarBrincoCordeiro(n_brinco);

                    if (dadosCordeiro.isEmpty()) {
                        System.out.println("Nenhuma ficha encontrada para o número do brinco informado.");
                    } else {
                        System.out.println("Dados encontrados:");
                        System.out.println("Vacinas: " + dadosCordeiro.get("vacinas"));
                        System.out.println("Pesos: " + dadosCordeiro.get("pesos"));
                        System.out.println("Manejos: " + dadosCordeiro.get("manejos"));

                        System.out.print("Deseja realmente remover essa ficha? 'S'im  ou  'N'ão: ");
                        String confirmacao = scanner.next();

                        if (confirmacao.equalsIgnoreCase("S")) {
                            // Aqui você deve implementar a lógica para remover os dados de cada repositório

                            try {
                                vacinaRepositorio.removerPorBrinco(n_brinco);
                                pesoRepositorio.removerPorBrinco(n_brinco);
                                manejoRepositorio.removerPorBrinco(n_brinco);

                                System.out.println("Ficha removida com sucesso!");
                            } catch (Exception e) {
                                System.out.println("Ocorreu um erro ao tentar remover a ficha: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Operação cancelada.");
                        }
                    }
                    break;


            }

        }

    }

}
