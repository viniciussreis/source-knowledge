package br.com.source.knowledge.mongo.repository;

import br.com.source.knowledge.mongo.entity.PersonMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonMongoRepository extends MongoRepository<PersonMongoEntity, String> {
}
