package com.pivovarit.domain.rental;

import com.pivovarit.domain.descriptions.Description;
import com.pivovarit.domain.descriptions.DescriptionsFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RentalConfiguration {

    @Bean
    public DescriptionsFacade descriptionsFacade() {
        return new DescriptionsFacade();
    }

    @Bean
    public DescriptionsRepository descriptionsRepository(DescriptionsFacade descriptionsFacade) {
        return id -> descriptionsFacade.getDescription(id).map(Description::description);
    }

    @Bean
    public MovieRepository movieRepository() {
        return new InMemoryMovieRepository();
    }

    @Bean
    public RentalFacade movieService(MovieRepository movieRepository, DescriptionsRepository descriptionsRepository) {
        return new RentalFacade(movieRepository, descriptionsRepository);
    }
}
