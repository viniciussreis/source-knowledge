package br.com.source.knowledge.mongo.adapter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.outbound.FindPerson;
import br.com.source.knowledge.mongo.converter.PersonMongoEntityToPersonConverter;
import br.com.source.knowledge.mongo.repository.PersonMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FindPersonMongoAdapter implements FindPerson {

    private final PersonMongoRepository personMongoRepository;
    private final PersonMongoEntityToPersonConverter personMongoEntityToPersonConverter;

    @Override
    public Optional<Person> findById(String id) {
        var personEntity = personMongoRepository.findById(id);

        var person = personEntity.map(personMongoEntityToPersonConverter::convert);

        return person;
    }
}
