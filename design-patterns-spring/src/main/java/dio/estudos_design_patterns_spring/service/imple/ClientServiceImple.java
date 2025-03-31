package dio.estudos_design_patterns_spring.service.imple;

import dio.estudos_design_patterns_spring.model.Adress;
import dio.estudos_design_patterns_spring.model.AdressRepository;
import dio.estudos_design_patterns_spring.model.Client;
import dio.estudos_design_patterns_spring.model.ClientRepository;
import dio.estudos_design_patterns_spring.service.ClientService;
import dio.estudos_design_patterns_spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da<b>Strategy</b> {@link ClientService}, a qual pode
 * ser injetada pelo spring (via {@link Autowired}). Com isso, como
 * essa classe é um {@link Service}, ela será tratada com um <b>Singleton</b>.
 */
@Service
public class ClientServiceImple implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AdressRepository adressRepository;
    @Autowired
    private ViaCepService viaCepService;


    // TODO Singleton: injetar os componentes do Spring com @Autowired
    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client =  clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insert(Client client) {
        salvarClientePorCep(client);
    }

    private void salvarClientePorCep(Client client) {
        // Verificar se o Endereço do Cliente já existe (pelo CEP)
        String cep  = client.getEndereco();
        Adress endereco = adressRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno
            Adress novoEndereco = viaCepService.consultarAdress(cep);
            adressRepository.save(novoEndereco);
            return novoEndereco;
        });
        client.setEndereco(String.valueOf(endereco));
        // Inserir Cliente, vicnulando o Endereço (novo ou existente)
        clientRepository.save(client);
    }

    @Override
    public void update(Long id, Client client) {
    // Busca Cliente por ID, caso exista
        Optional<Client> clientBd =  clientRepository.findById(id);
        if (clientBd.isPresent()) {
            salvarClientePorCep(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
