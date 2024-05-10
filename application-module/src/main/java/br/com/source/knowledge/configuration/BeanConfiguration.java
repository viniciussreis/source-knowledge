package br.com.source.knowledge.configuration;

import br.com.source.knowledge.interactor.port.inbound.FindPersonUseCase;
import br.com.source.knowledge.interactor.port.inbound.InsertPersonUseCase;
import br.com.source.knowledge.interactor.port.outbound.FindPerson;
import br.com.source.knowledge.interactor.port.outbound.InsertPerson;
import br.com.source.knowledge.interactor.service.FindPersonService;
import br.com.source.knowledge.interactor.service.InsertPersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public InsertPersonUseCase insertPersonService(InsertPerson insertPersonMongoAdapter) {
        return new InsertPersonService(insertPersonMongoAdapter);
    }

    @Bean
    public FindPersonUseCase findPersonService(FindPerson findPersonMongoAdapter) {
        return new FindPersonService(findPersonMongoAdapter);
    }
}
