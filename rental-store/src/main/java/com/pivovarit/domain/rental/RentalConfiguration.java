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
    public DescriptionsRepository descriptionsRepository() {
        return new StaticDescriptionsRepository();
    }

    @Bean
    public RentalFacade movieService(MovieRepository movieRepository, DescriptionsRepository descriptionsRepository) {
        return new RentalFacade(movieRepository, descriptionsRepository);
    }
}
