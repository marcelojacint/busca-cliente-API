package com.marcelodev.gof.service.impl;

import com.marcelodev.gof.entity.Cliente;
import com.marcelodev.gof.entity.Endereco;
import com.marcelodev.gof.repository.ClienteRepository;
import com.marcelodev.gof.repository.EnderecoRepository;
import com.marcelodev.gof.service.ClienteService;
import com.marcelodev.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        if (id == null) {
            throw new NullPointerException("usuário não existe");
        }
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        this.salvarCleinteComCep(cliente);

    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            this.salvarCleinteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarCleinteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultaCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
