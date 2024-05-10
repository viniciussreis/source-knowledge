package br.com.source.knowledge.converter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.rest.converter.PersonViewModelToPersonConverter;
import br.com.source.knowledge.rest.model.PersonViewModel;
import org.springframework.stereotype.Component;

@Component
public class PersonViewModelToPersonConverterImpl implements PersonViewModelToPersonConverter {

    @Override
    public Person convert(PersonViewModel model) {
        var person = new Person();
        person.setName(model.getName());

        return person;
    }
}
