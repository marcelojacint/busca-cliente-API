package com.marcelodev.gof.repository;

import com.marcelodev.gof.entity.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
