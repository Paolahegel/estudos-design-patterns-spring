package dio.estudos_design_patterns_spring.service;

import dio.estudos_design_patterns_spring.model.Adress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Cliente HTTP, criado via <b>OpenFeign</b>, para p consumo da API do <b>ViaCEP</b>
 */
@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Adress consultarAdress(@PathVariable("cep") String cep);
}
