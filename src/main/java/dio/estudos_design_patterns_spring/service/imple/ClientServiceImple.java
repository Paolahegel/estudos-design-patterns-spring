package dio.estudos_design_patterns_spring.service.imple;

import dio.estudos_design_patterns_spring.model.Client;
import dio.estudos_design_patterns_spring.service.ClientService;
import org.springframework.stereotype.Service;

/**
 * Implementação da<b>Strategy</b> {@link ClientService}, a qual pode
 * ser injetada pelo spring (via {@link Autowired}). Com isso, como
 * essa classe é um {@link Service}, ela será tratada com um <b>Singleton</b>.
 */
@Service
public class ClientServiceImple implements ClientService {

    // TODO Singleton: injetar os componentes do Spring com @Autowired
    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples

    @Override
    public Iterable<Client> findAll() {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public void insert(Client client) {

    }

    @Override
    public void update(Long id, Client client) {

    }

    @Override
    public void delete(Long id) {

    }
}
