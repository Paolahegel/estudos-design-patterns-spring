package dio.estudos_design_patterns_spring.service;

import dio.estudos_design_patterns_spring.model.Client;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter múltiplas implementaçãoes dessa
 * mesma interface.
 */
public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);

}
