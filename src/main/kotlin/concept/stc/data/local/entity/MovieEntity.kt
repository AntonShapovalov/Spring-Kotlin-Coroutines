package concept.stc.data.local.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

/**
 * Represents movie entity in database.
 *
 * @param id the auto generated primary key.
 * @param title the movie title.
 * @param year the movie year.
 * @param imdbID the IMDB id.
 * @param type the type of movie, e.g. "movie", "game" etc.
 * @param poster the movie poster url.
 */
@Table("movies")
data class MovieEntity(
    @Id
    @Column(value = "id") val id: Int? = null,
    @Column(value = "title") val title: String,
    @Column(value = "movie_year") val year: String,
    @Column(value = "imdb_id") val imdbID: String,
    @Column(value = "type") val type: String,
    @Column(value = "poster") val poster: String
)