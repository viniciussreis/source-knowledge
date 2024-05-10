package br.com.source.knowledge.mongo.adapter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.outbound.InsertPerson;
import br.com.source.knowledge.mongo.converter.PersonMongoEntityToPersonConverter;
import br.com.source.knowledge.mongo.converter.PersonToPersonMongoEntityConverter;
import br.com.source.knowledge.mongo.repository.PersonMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class InsertPersonMongoAdapter implements InsertPerson {


    private final PersonMongoRepository personMongoRepository;
    private final PersonToPersonMongoEntityConverter personToPersonMongoEntityConverter;
    private final PersonMongoEntityToPersonConverter personMongoEntityToPersonConverter;

    @Override
    public Person insert(Person person) {
        var personEntity = personToPersonMongoEntityConverter.convert(person);
        var personEntitySaved = personMongoRepository.save(personEntity);

        return personMongoEntityToPersonConverter.convert(personEntitySaved);
    }
}
