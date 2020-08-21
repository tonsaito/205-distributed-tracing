package br.com.itau.mastertech.distribute.tracing.client.api.repository;

import br.com.itau.mastertech.distribute.tracing.client.api.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Integer> {
}
