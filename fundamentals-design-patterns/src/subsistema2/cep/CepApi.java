package subsistema2.cep;


public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperaCidade(String cep){
        return "Rio de Janeiro";
    }
    public String recuperaEstado(String cep){
        return "RJ";
    }
}
