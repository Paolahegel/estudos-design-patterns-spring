package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperaCidade(cep);
        String estado = CepApi.getInstance().recuperaEstado(cidade);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
