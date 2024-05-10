package br.com.source.knowledge.mongo.converter;

import br.com.source.knowledge.interactor.converter.ModelToModelConverter;
import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.mongo.entity.PersonMongoEntity;

public interface PersonMongoEntityToPersonConverter extends ModelToModelConverter<PersonMongoEntity, Person> {
}
