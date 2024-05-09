package br.com.source.knowledge.rest.api;

import br.com.source.knowledge.rest.model.PersonViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/person")
public interface PersonApi {

    @GetMapping(value = "/{id}")
    ResponseEntity<PersonViewModel> findById(@PathVariable String id);

    @PostMapping
    ResponseEntity<Void> insert();
}
