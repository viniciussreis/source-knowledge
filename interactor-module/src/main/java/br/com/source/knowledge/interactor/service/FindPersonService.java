package br.com.source.knowledge.interactor.service;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.inbound.FindPersonUseCase;
import br.com.source.knowledge.interactor.port.outbound.FindPerson;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
public class FindPersonService implements FindPersonUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(FindPersonService.class);

    private final FindPerson findPerson;

    @Override
    public Person findById(String id) {
        LOGGER.info("Initiating the search for a person with id: {}", id);

        var person = findPerson.findById(id).orElseThrow(() -> new RuntimeException("Person not found"));

        return person;
    }

}
