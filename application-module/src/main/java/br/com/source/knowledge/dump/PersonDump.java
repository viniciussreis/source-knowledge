package br.com.source.knowledge.dump;

import br.com.source.knowledge.interactor.domain.Person;
import br.com.source.knowledge.interactor.port.outbound.InsertPerson;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonDump implements InitializingBean {

    private final InsertPerson insertPersonAdapter;
    private final ObjectMapper objectMapper;

    @Override
    public void afterPropertiesSet() {
        try (var inputStream = getClass().getResourceAsStream("/persons.json")) {
            var typeReference = new TypeReference<List<Person>>() {};
            var persons = objectMapper.readValue(inputStream, typeReference);
            for (var person : persons) {
                insertPersonAdapter.insert(person);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error to read file", e);
        }
    }
}
