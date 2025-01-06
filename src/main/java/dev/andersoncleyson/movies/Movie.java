package dev.andersoncleyson.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")

@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds;

    public ObjectId getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getTrailerLink() {
        return trailerLink;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getPoster() {
        return poster;
    }

    public List<String> getBackdrops() {
        return backdrops;
    }

    public List<Review> getReviewIds() {
        return reviewIds;
    }
}
