package br.com.source.knowledge.rest.controller;

import br.com.source.knowledge.rest.api.PersonApi;
import br.com.source.knowledge.rest.model.PersonViewModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController implements PersonApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Override
    public ResponseEntity<PersonViewModel> findById(String id) {
        var personMock = new PersonViewModel();
        personMock.setName("Moitinha");
        return ResponseEntity.ok(personMock);
    }

    @Override
    public ResponseEntity<Void> insert() {
        LOGGER.info("Entrou no log");
        return ResponseEntity.ok().build();
    }
}
