package br.com.source.knowledge.converter;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.rest.converter.PersonToPersonViewModelConverter;
import br.com.source.knowledge.rest.model.PersonViewModel;
import org.springframework.stereotype.Component;

@Component
public class PersonToPersonViewModelConverterImpl implements PersonToPersonViewModelConverter {

    @Override
    public PersonViewModel convert(Person model) {
        var personViewModel = new PersonViewModel();
        personViewModel.setName(model.getName());

        return personViewModel;
    }
}
