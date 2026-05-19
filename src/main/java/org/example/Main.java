package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Object produtos;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String>usuarios = new ArrayList<>();
        List<String>produtos = new ArrayList<>();




        System.out.println("============================");
        System.out.println("BEM VINDO AO SISTEMA DE USUÁRIO!");
        System.out.println("============================");


        int opcao = 0;

        while(opcao!= 10) {
            exibirMenu();

            System.out.println("Escolha uma opção: ");

            if(scan.hasNextInt()) {
                opcao = scan.nextInt();
                scan.nextLine();

            }else {
                System.out.println("Por favor digiti uma opção valida!");
                scan.nextLine();
                continue;
            }

            switch (opcao){
                case 1:
                    cadastrarUsuario(scan, usuarios);
                    break;
                case 2:
                    ListarTodosUsuarios(usuarios);
                    break;
                case 3:
                    //consultar por nome
                    break;
                case 4:
                    Cadastrarproduto(scan, produtos);
                    break;
                case 5:
                    Listarprodutos(produtos);
                    break;
                case 8:
                    capturaNotas(scan);
                    break;
                    
                case 10:
                    System.out.println("Encerrando o sistema...Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }



        }
        scan.close();

    }

    private static void Listarprodutos(List<String> produtos) {
    }


    public static void exibirMenu() {

        System.out.println("=============MENU===========");
        System.out.println("1 - Cadastro");
        System.out.println("2 - Listar todos");
        System.out.println("3 - buscar por nome");
        System.out.println("4 - Produtos");
        System.out.println("5 - Listar Produtos");
        System.out.println("10 - Sair");
        System.out.println("===========================");
    }

    public static void cadastrarUsuario(@NotNull Scanner scan, List<String> usuarios){

        String dados = "";

        System.out.println("----Cadastro de usuário-----");
        System.out.println("Digite o nome: ");
        dados = scan.nextLine();
        System.out.println("Digite o CPF: ");
        dados += " | " + scan.nextLine();
        System.out.println("Digite o E-mail: ");




        if(scan.nextLine().contains("@")) {
            dados += " | " + scan.nextLine();
        }else {
            System.out.println("E-mail inválido!");
        }

        System.out.println("Digite o Telefone: ");
        dados += " | " + scan.nextLine();

        usuarios.add(dados);

        System.out.println(" usuario inserido com sucesso!");

    }
    public static void ListarTodosUsuarios(@NotNull List<String>usuarios) {


        System.out.println("Lista de usuarios");

        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario encontrado!");

        } else {

            for (int i = 0; i < usuarios.size(); i++) {

                System.out.println("código:" + (i + 1) + ". " + usuarios.get(i).toString());
            }


        }
    }

    public static void Cadastrarproduto(Scanner scan, List<String> produtos){

        String dados = "";

        System.out.println("-------- Lista de Produtos---------");
        System.out.println("Nome do Produto: ");
        dados = scan.nextLine();
        System.out.println("Cor do Produto: ");
        dados = scan.nextLine();
        System.out.println("Modelo do Produto: ");
        dados = scan.nextLine();

        produtos.add(dados);

    }
//
//     Main(@NotNull List<String>produtos) {
//
//
//        System.out.println("Lista de usuarios");
//
//        if (produtos.isEmpty()) {
//            System.out.println("Nenhum usuario encontrado!");
//
//        } else {
//
//            for (int i = 0; i < produtos.size(); i++) {
//
//                System.out.println("código:" + (i + 1) + ". " + produtos.get(i).toString());
//            }
//
//
//        }

        public static void capturaNotas(Scanner scanner){

    double notas = 0;
    int quantidade = 0;

    boolean capturar = true;

    while (capturar) {

        double nota;

        System.out.println("Digite a nota ou 9999 para resultado:");
        nota = scanner.nextDouble();

        if (nota < 0 ){

            System.out.println(" Nota inválida");
            continue;

        }

        if (nota == 9999){
            capturar = false;
            continue;
        }
        notas += nota;
        quantidade++;

        double media = calcularMedia(notas, quantidade);

        System.out.println("Media do aluno é igual a "+media);
    }

        }

        public static double calcularMedia(double notas, int quantidade){

        if (notas == 0){
            return 0;
        }
        return notas/quantidade;





        }
     }
