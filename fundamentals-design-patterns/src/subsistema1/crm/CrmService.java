package subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema CRM.");
        System.out.println("Nome: " + nome);
        System.out.println("Cep: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
    }
}
