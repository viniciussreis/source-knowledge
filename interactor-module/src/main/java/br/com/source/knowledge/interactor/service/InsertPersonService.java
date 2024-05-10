package br.com.source.knowledge.interactor.service;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.inbound.InsertPersonUseCase;
import br.com.source.knowledge.interactor.port.outbound.InsertPerson;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
public class InsertPersonService implements InsertPersonUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(InsertPersonService.class);

    private final InsertPerson insertPerson;

    @Override
    public Person insert(Person person) {
        LOGGER.info("Initiating the insertion of a person");

        return insertPerson.insert(person);
    }
}
