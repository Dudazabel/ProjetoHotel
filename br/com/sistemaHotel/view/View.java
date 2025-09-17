import java.util.Scanner;

public class View {
    Scanner leia = new Scanner (System.in);

     public int menu (){
        System.out.println("""
            === MENU PRINCIPAL HOTEL ===
            1. Cadastrar hóspede
            2. Cadastrar quarto
            3. Cadastrar reserva
            4. Listar todos os hóspedes
            5. Listar todos os quartos
            6. Listar todas as reservas
            7. Pesquisar hóspede por nome
            8. Pesquisar quarto por tipo
            9.  Pesquisar reserva por nome do hóspede
            10. Editar dados de um hóspede
            11. Cancelar uma reserva
            0. Sair do sistema
            """);
        System.out.println("Digite a opção que deseja: ");
        System.out.print(">");
        int opcao = leia.nextInt();
        leia.nextLine();
        return opcao;
    }

    public String cadastrarNome(){
        System.out.print("Digite o nome do hóspede: ");
        return leia.nextLine();
    }
    
    public String cadastrarDocumento (){
        System.out.print("Digite o documento do hóspede: ");
        return leia.nextLine();
    }
    
    public String cadastrarTelefone(){
        System.out.print("Digite o telefone do hóspede: ");
        return leia.nextLine();
    }

    public String cadastrarNumero(){
        System.out.print("Digite o número do quarto: ");
        return leia.nextLine();
    }

    public String cadastrarTipo(){
        System.out.println("Digite o tipo do quarto: ");
        return leia.nextLine();
    }

    public String cadastrarPreco(){
        System.out.println("Digite o preço do quarto: ");
        return leia.nextLine();
    }

    public void erroCatch(){
        System.out.println("Erro, digite novamente.");
    }

    public void sair(){
        System.out.println("Saindo...");
    }

    public String cadastrarHospede(){
        System.out.println("Digite o nome do hospede da reserva: ");
        return leia.nextLine();
    }

    public String cadastrarQuarto(){
        System.out.prntln("Digite o número do quarto da reserva: ");
        return leia.nextLine();
    }

    public String cadastrarDataEntrada(){
        System.out.println("Digite a data de entrada da reserva: ");
        return leia.nextLine();
    }

    public String cadastrarDataSaida(){
        System.out.println("Digite a data de saída da reserva: ");
        return leia.nextLine();
    }


}
