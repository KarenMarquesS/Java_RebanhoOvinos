package org.example.Operacional;

import org.example.Modelo.Manejo;
import org.example.Modelo.Peso;
import org.example.Modelo.Registro;
import org.example.Modelo.Vacina;
import org.example.Repositorio.ManejoRepositorio;
import org.example.Repositorio.PesoRepositorio;
import org.example.Repositorio.RegistroRepositorio;
import org.example.Repositorio.VacinaRepositorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MenuOperacional {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    Scanner scanner = new Scanner(System.in);

    // MÉTODOS PARA ADICIONAR AS INFORMAÇÕES
    public Registro cadastrarCordeiro(){

        Registro registro = new Registro();

        System.out.println("Número do BRINCO da mãe? ");
        registro.setMae_brinco(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual a DATA de NASCIMENTO? (dd/MM/yyyy)");
        try {
            String dataNascimentoStr = scanner.nextLine();
            Date dataNascimento = dateFormat.parse(dataNascimentoStr);
            registro.setData_nascimento(dataNascimento);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }

        System.out.println("Qual o PESO do cordeiro? ");
        registro.setPeso_nascimento(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Qual o SEXO do cordeiro? (M ou F) ");
        registro.setSexo(scanner.nextLine());

        System.out.println("Qual a RAÇA? ");
        registro.setRaca(scanner.nextLine());

        System.out.println("Cadastrado Realizado com Sucesso");

        return registro;
    }

    public Vacina IdentificarCordeiro(){

        Vacina vacina = new Vacina();

        System.out.println("Insira o NÚMERO DO BRINCO do Cordeiro que foi colocado no animal: ");
        vacina.setN_brinco(scanner.nextInt());
        scanner.nextLine();


        System.out.println("Data do Manejo (dd/MM/yyyy): ");
        try {
            String dataVacinaStr = scanner.nextLine();
            Date dataVacina = dateFormat.parse(dataVacinaStr);
            vacina.setData_vacina(dataVacina);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }

        System.out.println("Nome da Vacina");
        vacina.setNome_vacina(scanner.nextLine());

        System.out.println("Informações Cadastradas com Sucesso");

        return vacina;
    }

    public Peso OpcoesPeso(){

        PesoRepositorio pesoRepositorio = new PesoRepositorio();

        int opcao;

        while (true){

            System.out.println("Qual peso deseja cadastrar? ");
            System.out.println("Digite o peso com vírgula -> ex. 3,20 ");

            System.out.println("""
                0- Voltar ao Menu Anterior=========================================
                1- Ganho em 15 dias
                2- Ganho em 20 dias
                3- Ganho em 30 dias
                4- Ganho em 40 dias
                5- Ganho em 50 dias
                6- Ganho em 60 dias
                7- Ganho em 90 dias
                
                """);

//            """
//      Os métodos cadastrarPesoX são semelhantes. Eles podem ser simplificados usando um único método parametrizado:
//                    public Peso cadastrarPeso(int dias) {
//                        Peso peso = new Peso();
//                        System.out.printf("Peso aos %d dias: ", dias);
//                        peso.setPesoPorDia(dias, scanner.nextDouble());
//                        scanner.nextLine();
//                        System.out.println("Peso Cadastrado com Sucesso");
//                        return peso;
//                    }
//                    """

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 0:
                    break;

                case 1:
                    Peso peso15 = cadastrarPeso15();
                    pesoRepositorio.Adicionar(peso15);
                    break;

                case 2:
                    Peso peso20 = cadastrarPeso20();
                    pesoRepositorio.Adicionar(peso20);
                    break;

                case 3:
                    Peso peso30 = cadastrarPeso30();
                    pesoRepositorio.Adicionar(peso30);
                    break;

                case 4:
                    Peso peso40 = cadastrarPeso40();
                    pesoRepositorio.Adicionar(peso40);
                    break;

                case 5:
                    Peso peso50 = cadastrarPeso50();
                    pesoRepositorio.Adicionar(peso50);
                    break;

                case 6:
                    Peso peso60 = cadastrarPeso60();
                    pesoRepositorio.Adicionar(peso60);
                    break;

                case 7:
                    Peso peso90 = cadastrarPeso90();
                    pesoRepositorio.Adicionar(peso90);
                    break;



                default:
                    System.out.println(">>> Digite uma opção válida!! <<<");

            }
        }
    }

    public Peso cadastrarPeso15(){
        Peso peso15 = new Peso();

        System.out.println("Peso aos 15 dias: ");
        peso15.setPeso_15_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

        return peso15;
    }

    public Peso cadastrarPeso20(){
        Peso peso20 = new Peso();

        System.out.println("Peso aos 20 dias: ");
        peso20.setPeso_20_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

     return peso20;
    }

    public Peso cadastrarPeso30(){
        Peso peso30 = new Peso();

        System.out.println("Peso aos 30 dias: ");
        peso30.setPeso_30_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

        return peso30;
    }

    public Peso cadastrarPeso40(){
        Peso peso40 = new Peso();

        System.out.println("Peso aos 40 dias: ");
        peso40.setPeso_40_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

        return peso40;
    }

    public Peso cadastrarPeso50(){
        Peso peso50 = new Peso();

        System.out.println("Peso aos 50 dias: ");
        peso50.setPeso_50_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

        return peso50;
    }

    public Peso cadastrarPeso60(){
        Peso peso60 = new Peso();

        System.out.println("Peso aos 60 dias: ");
        peso60.setPeso_60_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

       return peso60;
    }

    public Peso cadastrarPeso90(){
        Peso peso90 = new Peso();

        System.out.println("Peso aos 90 dias: ");
        peso90.setPeso_90_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso Cadastrado com Sucesso");

        return peso90;
    }

    public Manejo RotinaSemanal(){

        Manejo manejoSemanal = new Manejo();

        System.out.println("Informe o número do Brinco do Cordeiro");
        manejoSemanal.setN_brinco(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Data do Manejo de Rotina (dd/MM/yyyy): ");
        try{
            String dataManejoStr = scanner.nextLine();
            Date dataManejo = dateFormat.parse(dataManejoStr);
            manejoSemanal.setData_manejo(dataManejo);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }

        System.out.println("Qual o GRAU DO FAMACHA? ");
        manejoSemanal.setGrau_famacha(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Marque com um X caso no tipo do vermifugo que " +
                "foi administrado,CASO TENHA SIDO NECESSÁRIO");
        System.out.println("Vermifugo Oral");
        manejoSemanal.setVermifugo_oral(scanner.nextLine());
        System.out.println("Vermifugo Intra-Muscular");
        manejoSemanal.setVermifugo_muscular(scanner.nextLine());
        System.out.println("Vermifugo Intra-Venoso");
        manejoSemanal.setVermifugo_venoso(scanner.nextLine());

        System.out.println("Informe o nome do Vermifugo: ");
        manejoSemanal.setNome_vermifugo(scanner.nextLine());

        System.out.println("Foi encontrado bicheira ('S'im  ou  'N'ão)?");
        manejoSemanal.setPresenca_bicheira(scanner.nextLine());

        System.out.println("Qual o nome do medicamento administrado, CASO TENHA SIDO NECESSÁRIO");
        manejoSemanal.setNome_medicamento(scanner.nextLine());

        System.out.println("Informações Inseridas com Sucesso!!");

        return manejoSemanal;

    }


    // MÉTODOS PARA EDIÇÃO DAS INFORMAÇÕES

    public Registro editarRegistro(){

        Map<String, Object> fieldsToUpdate = new HashMap<>();

        if (fieldsToUpdate == null) {fieldsToUpdate = new HashMap<>();}

        Registro registro = new Registro();
        RegistroRepositorio registroRepositorio = new RegistroRepositorio();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do brinco:");
        registro.setMae_brinco(scanner.nextInt());
        scanner.nextLine();
        int mae_brinco = 123;

        System.out.println("Digite a data de nascimento (formato yyyy-MM-dd):");
        try {
            String dataNascimentoStr = scanner.nextLine();
            Date dataNascimento = dateFormat.parse(dataNascimentoStr);
            registro.setData_nascimento(dataNascimento);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }
        Date data_nascimento = Date.valueOf("2023-01-01");

        System.out.println("Digite o sexo (M/F):");
        registro.setSexo(scanner.nextLine());
        String sexo = "M";

        System.out.println("Digite o peso ao nascimento:");
        registro.setPeso_nascimento(scanner.nextDouble());
        scanner.nextLine();
        double peso_nascimento = 3.5;

        System.out.println("Digite a raça:");
        registro.setRaca(scanner.nextLine());
        String raca = "Raça Exemplo";


        fieldsToUpdate.put("mae_brinco", mae_brinco);
        fieldsToUpdate.put("data_nascimento", data_nascimento);
        fieldsToUpdate.put("sexo", sexo);
        fieldsToUpdate.put("peso_nascimento", peso_nascimento);
        fieldsToUpdate.put("raca", raca);

        registroRepositorio.UpDateDinamico(mae_brinco, fieldsToUpdate);

        return new Registro();

    }


    public boolean editarRegVacina( int n_brinco, Date data_vacina, String nome_vacina,
                                   Map<String, Object> fieldsToUpdate){

        if (fieldsToUpdate == null) {fieldsToUpdate = new HashMap<>();}

        Vacina vacina = new Vacina();
        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();

        System.out.println("Insira o NÚMERO DO BRINCO do Cordeiro que foi colocado no animal: ");
        vacina.setN_brinco(scanner.nextInt());
        scanner.nextLine();


        System.out.println("Data do Manejo (dd/MM/yyyy): ");
        try {
            String dataVacinaStr = scanner.nextLine();
            Date dataVacina = dateFormat.parse(dataVacinaStr);
            vacina.setData_vacina(dataVacina);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }

        System.out.println("Nome da Vacina");
        vacina.setNome_vacina(scanner.nextLine());


        fieldsToUpdate.put("n_brinco", n_brinco);
        fieldsToUpdate.put("data_vacina", data_vacina);
        fieldsToUpdate.put("nome_vacina", nome_vacina);

        vacinaRepositorio.UpDateDinamico(n_brinco, fieldsToUpdate);

        return new Vacina(n_brinco, data_vacina, nome_vacina);

    }

    public Peso editarRegPeso(int n_brinco, double peso_15_dias, double peso_20_dias,
                              double peso_30_dias, double peso_40_dias, double peso_50_dias, double peso_60_dias,
                              double peso_90_dias, Map<String, Object> fieldsToUpdate){

        if (fieldsToUpdate == null) {fieldsToUpdate = new HashMap<>();}

        Peso peso15 = new Peso();
        Peso peso20 = new Peso();
        Peso peso30 = new Peso();
        Peso peso40 = new Peso();
        Peso peso50 = new Peso();
        Peso peso60 = new Peso();
        Peso peso90 = new Peso();
        PesoRepositorio pesoRepositorio = new PesoRepositorio();

        System.out.println("Peso aos 15 dias: ");
        peso15.setPeso_15_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 20 dias: ");
        peso20.setPeso_20_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 30 dias: ");
        peso30.setPeso_30_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 40 dias: ");
        peso40.setPeso_40_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 50 dias: ");
        peso50.setPeso_50_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 60 dias: ");
        peso60.setPeso_60_dias(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Peso aos 90 dias: ");
        peso90.setPeso_90_dias(scanner.nextDouble());
        scanner.nextLine();


        fieldsToUpdate.put("peso_15_dias", peso_15_dias);
        fieldsToUpdate.put("peso_20_dias", peso_20_dias);
        fieldsToUpdate.put("peso_30_dias", peso_30_dias);
        fieldsToUpdate.put("peso_40_dias", peso_40_dias);
        fieldsToUpdate.put("peso_50_dias", peso_50_dias);
        fieldsToUpdate.put("peso_60_dias", peso_60_dias);
        fieldsToUpdate.put("peso_90_dias", peso_90_dias);

        pesoRepositorio.UpDateDinamico(n_brinco, fieldsToUpdate);

        return new Peso();

    }

    public Manejo editarRegManejo(int n_brinco, Date data_manejo, int grau_famacha,
                                  String vermifugo_oral, String vermifugo_muscular, String vermifugo_venoso,
                                  String nome_vermifugo, String presenca_bicheira, String nome_medicamento,
                                  Map<String, Object> fieldsToUpdate){

        if (fieldsToUpdate == null) {fieldsToUpdate = new HashMap<>();}

        Manejo manejoSemanal = new Manejo();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();

        System.out.println("Informe o número do Brinco do Cordeiro");
        manejoSemanal.setN_brinco(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Data do Manejo de Rotina (dd/MM/yyyy): ");
        try{
            String dataManejoStr = scanner.nextLine();
            Date dataManejo = dateFormat.parse(dataManejoStr);
            manejoSemanal.setData_manejo(dataManejo);
        } catch (ParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
            return null;
        }

        System.out.println("Qual o GRAU DO FAMACHA? ");
        manejoSemanal.setGrau_famacha(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Marque com um X caso no tipo do vermifugo que " +
                "foi administrado,CASO TENHA SIDO NECESSÁRIO");
        System.out.println("Vermifugo Oral");
        manejoSemanal.setVermifugo_oral(scanner.nextLine());
        System.out.println("Vermifugo Intra-Muscular");
        manejoSemanal.setVermifugo_muscular(scanner.nextLine());
        System.out.println("Vermifugo Intra-Venoso");
        manejoSemanal.setVermifugo_venoso(scanner.nextLine());

        System.out.println("Informe o nome do Vermifugo: ");
        manejoSemanal.setNome_vermifugo(scanner.nextLine());

        System.out.println("Foi encontrado bicheira ('S'im  ou  'N'ão)?");
        manejoSemanal.setPresenca_bicheira(scanner.nextLine());

        System.out.println("Qual o nome do medicamento administrado, CASO TENHA SIDO NECESSÁRIO");
        manejoSemanal.setNome_medicamento(scanner.nextLine());

        fieldsToUpdate.put("n_brinco", n_brinco);
        fieldsToUpdate.put("data_manejo", data_manejo);
        fieldsToUpdate.put("grau_famacha", grau_famacha);
        fieldsToUpdate.put("vermifugo_oral", vermifugo_oral);
        fieldsToUpdate.put("vermifugo_muscular", vermifugo_muscular);
        fieldsToUpdate.put("vermifugo_venoso", vermifugo_venoso);
        fieldsToUpdate.put("nome_vermifugo", nome_vermifugo);
        fieldsToUpdate.put("presenca_bicheira", presenca_bicheira);
        fieldsToUpdate.put("nome_medicamento", nome_medicamento);

        manejoRepositorio.UpDateDinamico(n_brinco, fieldsToUpdate);

        return new Manejo();
    }



    public Map<String, Object> buscarBrincoCordeiro(int n_brinco){

        VacinaRepositorio vacinaRepositorio = new VacinaRepositorio();
        PesoRepositorio pesoRepositorio = new PesoRepositorio();
        ManejoRepositorio manejoRepositorio = new ManejoRepositorio();

        Map<String, Object> dadosCordeiro = new HashMap<>();

        try{
            // chama os métodos
            List<Vacina> vacinas = vacinaRepositorio.GetByBrincoV(n_brinco);
            List<Peso> pesos = pesoRepositorio.GetByBrincoP(n_brinco);
            List<Manejo> manejos = manejoRepositorio.GetByBrincoM(n_brinco);

            // adc os resultados no MAP
            dadosCordeiro.put("vacinas", vacinas);
            dadosCordeiro.put("pesos", pesos);
            dadosCordeiro.put("manejos", manejos);

        }catch (Exception e){
            e.printStackTrace();
            dadosCordeiro.put("erro", "Ocorreu um erro ao buscar os dados pelo Número do Brinco, Favor, verifique " +
                    "se o Número está correto!");
        }
        return dadosCordeiro;
    }



}
