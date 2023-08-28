package dev.ishwar.Movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data // for getter setter
@AllArgsConstructor //Constructor annotaion
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;
}
