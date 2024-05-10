package br.com.source.knowledge.interactor.service;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.inbound.FindPersonUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindPersonService implements FindPersonUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindPersonService.class);

    @Override
    public Person findById(Long id) {
        LOGGER.info("Initiating the search for a person with id: {}", id);
        var person = new Person();
        person.setName("John Doe");

        return person;
    }

}
