package io.github.wellvergton.citiesapi.countries.repository;

import io.github.wellvergton.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {}

