package com.marcelodev.gof.repository;

import com.marcelodev.gof.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
