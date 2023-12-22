package Controller;

import Model.Moeda;
import Services.EnderecoService;
import Services.MoedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moeda")
public class MoedaController {
@Autowired
    private MoedaService service;
@Autowired
private EnderecoService enderecoService;

    @GetMapping(value = "/listar")
    public List<Moeda> obterLista(){
      return (List<Moeda>) service.obterLista();
    }

    @PostMapping(value = "/incluir")
    public void incluir(Moeda moeda){
    service.incluir(moeda);
    }

    @DeleteMapping(value = "/{id}/excluir")
    public void excluir(Integer id){
      service.excluir(id);
    }
}
