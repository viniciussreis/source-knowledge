package br.com.source.knowledge.rest.converter;

import br.com.source.knowledge.interactor.converter.ModelToModelConverter;
import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.rest.model.PersonViewModel;

public interface PersonViewModelToPersonConverter extends ModelToModelConverter<PersonViewModel, Person>{
}
