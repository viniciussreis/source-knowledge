package br.com.source.knowledge.mongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("person")
public class PersonMongoEntity {

    private String name;

}
