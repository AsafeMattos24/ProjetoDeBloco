package org.example;

import Model.Endereco;
import Model.Moeda;
import Services.EnderecoService;
import Services.MoedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class MoedaLoader implements ApplicationRunner{

    private Map<String,Moeda> mapa = new HashMap<String,Moeda>();
    @Autowired
    private MoedaService service;
    @Autowired
    private EnderecoService enderecoService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("Files/Moedas.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos = null;


        while(linha != null){
            campos = linha.split(";");

            String cep = campos[3];
            Endereco endereco = enderecoService.buscarCep(cep);
        Moeda moeda = new Moeda();
        moeda.setSimbolo(campos[1]);
        moeda.setNome(campos[1]);
        moeda.setCodigo(campos[0]);
        moeda.setEndereco(endereco);

       service.incluir(moeda);

        linha = leitura.readLine();
        }

        for(Moeda moeda : service.obterLista()){
            System.out.println(moeda);
        }

        for(String nome : mapa.keySet()){
            System.out.println(nome);
        }
        leitura.close();


    }
}
