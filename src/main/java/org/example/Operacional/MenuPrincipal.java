package org.example.Operacional;

import java.util.Scanner;

public class MenuPrincipal {


    public void menuPrincipal(Scanner scanner) {

        Menu menu = new Menu();

        int escolha;

        while (true) {

            System.out.println("""
                        Bem Vindo(a) ao 
                     == CordeiroTech ==
                    
                    1- Sair do Sistema
                    2- Adicionar Registros
                    3- Editar Registros
                    4- Remover Registros
                    """);

            System.out.println("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {



                case 1:
                    System.out.println("Saindo do Sistema...");
                    return;

                case 2:
                    System.out.println("Adicionar Registro");
                    menu.menuAdicionar(scanner);
                    break;

                case 3:
                    System.out.println("Editar Registro");
                    menu.menuEditar(scanner);
                    break;

                case 4:
                    System.out.println("Remover Registro");
                    menu.menuExcluir(scanner);
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;

            }
        }
    }
}




