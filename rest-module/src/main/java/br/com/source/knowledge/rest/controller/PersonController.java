package br.com.source.knowledge.rest.controller;

import br.com.source.knowledge.interactor.port.inbound.FindPersonUseCase;
import br.com.source.knowledge.interactor.port.inbound.InsertPersonUseCase;
import br.com.source.knowledge.rest.api.PersonApi;
import br.com.source.knowledge.rest.converter.PersonToPersonViewModelConverter;
import br.com.source.knowledge.rest.converter.PersonViewModelToPersonConverter;
import br.com.source.knowledge.rest.model.PersonViewModel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class PersonController implements PersonApi {

    private final InsertPersonUseCase insertPersonService;
    private final FindPersonUseCase findPersonService;

    private final PersonViewModelToPersonConverter personViewModelToPersonConverter;
    private final PersonToPersonViewModelConverter personToPersonViewModelConverter;

    @Override
    public ResponseEntity<Void> insert(PersonViewModel personViewModel) {
        var person = personViewModelToPersonConverter.convert(personViewModel);
        insertPersonService.insert(person);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<PersonViewModel> findById(Long id) {
        var person = findPersonService.findById(id);
        var viewModel = personToPersonViewModelConverter.convert(person);
        return ResponseEntity.ok(viewModel);
    }

}
