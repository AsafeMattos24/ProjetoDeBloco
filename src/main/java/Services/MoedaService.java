package Services;

import Model.Moeda;
import Repositories.MoedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class MoedaService {
    @Autowired
    private MoedaRepository moedaRepository;

    public void incluir(Moeda moeda){
        moedaRepository.save(moeda);

    }
    public Collection<Moeda> obterLista(){
        return (Collection<Moeda>) moedaRepository.findAll();
    }
}
