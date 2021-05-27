package io.github.wellvergton.citiesapi.countries;

import io.github.wellvergton.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}

