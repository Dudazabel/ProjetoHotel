import java.util.Scanner;

public class View {
    Scanner leia = new Scanner (System.in);

     public int menu (){
        System.out.println ("""
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
        System.out.print ("Digite a opção que deseja: ");
        int opcao = leia.nextInt();
        leia.nextLine();
        return opcao;
    }

    public String cadastrarNome(){
        System.out.print ("Digite o nome do hóspede: ");
        String nome = leia.nextLine();
        return nome;
    }
    
    public String cadastrarDocumento (){
        System.out.print ("Digite o documento do hóspede: ");
        String documento = leia.nextLine();
        return documento;
    }
    
    public String cadastrarTelefone(){
        System.out.print ("Digite o telefone do hóspede: ");
        String telefone = leia.nextLine();
        return telefone;
    }

    public void listarHospede(HospedeModel hospede){
        System.out.println (hospede);
    }
}
