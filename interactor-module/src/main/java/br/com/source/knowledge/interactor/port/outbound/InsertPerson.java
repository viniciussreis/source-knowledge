package br.com.source.knowledge.interactor.port.outbound;

import br.com.source.knowledge.interactor.domain.Person;

public interface InsertPerson {

    Person insert(Person person);

}
