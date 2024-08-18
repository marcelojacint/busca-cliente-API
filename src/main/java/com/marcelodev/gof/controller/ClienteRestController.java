package com.marcelodev.gof.controller;

import com.marcelodev.gof.entity.Cliente;
import com.marcelodev.gof.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Clientes", produces = "application/json")
@Tag(name = "Busca-Cliente-API")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;
    @Operation(summary = "realiza a busca de todos os clientes!", method = "GET")
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }
    @Operation(summary = "realiza a busca de cliente por id!", method = "GET")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @Operation(summary = "realiza a inserção do cliente na base de dados!", method = "POST")
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @Operation(summary = "realiza a atualização dos dados do cliente", method = "PUT")
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }
    @Operation(summary = "realiza a exclusão do cliente", method = "DELETE")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }


}
