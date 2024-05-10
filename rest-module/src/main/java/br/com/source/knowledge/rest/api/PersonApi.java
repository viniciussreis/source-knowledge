package br.com.source.knowledge.rest.api;

import br.com.source.knowledge.rest.model.PersonViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/person")
public interface PersonApi {

    @PostMapping
    ResponseEntity<Void> insert(@RequestBody PersonViewModel personViewModel);

    @GetMapping(value = "/{id}")
    ResponseEntity<PersonViewModel> findById(@PathVariable Long id);
}
