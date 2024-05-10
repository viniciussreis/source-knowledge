package br.com.source.knowledge.mongo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("person")
public class PersonMongoEntity {

    @Id
    private String id;

    private String name;

}
