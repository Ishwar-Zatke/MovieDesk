package dev.ishwar.Movies;
//import dev.ishwar.Movies.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;

import java.time.LocalDateTime;

public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private Review review;
    @Autowired
    private MongoTemplate mongoTemplate; //Way to talk to repo


    //Look for movie given ImdbId and associate the created review for id
    public Review createReview(String reviewBody, String imdbId){
        Review review = reviewRepository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));
        //Associating with one of the movies
        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;

    }
}











