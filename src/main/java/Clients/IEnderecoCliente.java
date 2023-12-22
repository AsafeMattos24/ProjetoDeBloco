package Clients;

import Model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://viacep.com.br/ws")
public interface IEnderecoCliente {
    @GetMapping(value = "/{cep}/json/")
    public Endereco buscarCep(String cep);

}
