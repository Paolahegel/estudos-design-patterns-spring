package dio.estudos_design_patterns_spring.controller;

import dio.estudos_design_patterns_spring.model.Client;
import dio.estudos_design_patterns_spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai
 * toda a complexidade de integrações (Postgres e API do ViaCEP) em uma
 * interface simples e coesa (API REST)
 */
@RestController
@RequestMapping("clientes")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> insert(@RequestBody Client client) {
        clientService.insert(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client) {
        clientService.update(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
        public ResponseEntity<Client> delete(@PathVariable Long id) {
        clientService.delete(id);
        return ResponseEntity.ok().build();
        }
}
