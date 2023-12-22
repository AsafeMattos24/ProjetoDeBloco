package Services;

import Clients.IEnderecoCliente;
import Model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;

public class EnderecoService {
    @Autowired
    private IEnderecoCliente enderecoCliente;
    public Endereco buscarCep(String cep){
        return enderecoCliente.buscarCep(cep);
    }
}
