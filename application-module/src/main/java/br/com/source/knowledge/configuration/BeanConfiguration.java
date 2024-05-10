package br.com.source.knowledge.configuration;

import br.com.source.knowledge.interactor.port.inbound.FindPersonUseCase;
import br.com.source.knowledge.interactor.port.inbound.InsertPersonUseCase;
import br.com.source.knowledge.interactor.service.FindPersonService;
import br.com.source.knowledge.interactor.service.InsertPersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public InsertPersonUseCase insertPersonService() {
        return new InsertPersonService();
    }

    @Bean
    public FindPersonUseCase findPersonService() {
        return new FindPersonService();
    }
}
