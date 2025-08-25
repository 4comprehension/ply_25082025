package com.pivovarit.domain.rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RentalConfiguration {

    @Bean
    public MovieRepository movieRepository() {
        return new InMemoryMovieRepository();
    }

    @Bean
    public RentalFacade movieService(MovieRepository movieRepository) {
        return new RentalFacade(movieRepository);
    }
}
