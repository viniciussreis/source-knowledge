package br.com.source.knowledge.converter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.mongo.converter.PersonMongoEntityToPersonConverter;
import br.com.source.knowledge.mongo.entity.PersonMongoEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMongoEntityToPersonConverterImpl implements PersonMongoEntityToPersonConverter {

    @Override
    public Person convert(PersonMongoEntity model) {
        var person = new Person();
        person.setName(model.getName());

        return person;
    }
}
