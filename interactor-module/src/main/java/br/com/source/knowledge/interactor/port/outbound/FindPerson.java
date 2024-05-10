package br.com.source.knowledge.interactor.port.outbound;

import br.com.source.knowledge.interactor.domain.Person;

import java.util.Optional;

public interface FindPerson {

    Optional<Person> findById(String id);
}
