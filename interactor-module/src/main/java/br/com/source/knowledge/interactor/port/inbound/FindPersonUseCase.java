package br.com.source.knowledge.interactor.port.inbound;

import br.com.source.knowledge.interactor.domain.Person;

public interface FindPersonUseCase {

    Person findById(Long id);

}
