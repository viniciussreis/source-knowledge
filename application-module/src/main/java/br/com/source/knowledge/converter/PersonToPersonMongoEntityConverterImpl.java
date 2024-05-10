package br.com.source.knowledge.converter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.mongo.converter.PersonToPersonMongoEntityConverter;
import br.com.source.knowledge.mongo.entity.PersonMongoEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonToPersonMongoEntityConverterImpl implements PersonToPersonMongoEntityConverter {

    @Override
    public PersonMongoEntity convert(Person model) {
        var personMongoEntity = new PersonMongoEntity();
        personMongoEntity.setName(model.getName());

        return personMongoEntity;
    }
}
