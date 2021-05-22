package io.github.wellvergton.citiesapi;

import io.github.wellvergton.citiesapi.countries.Country;
import io.github.wellvergton.citiesapi.repository.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

	private CountryRepository repository;

	public CountryResource(CountryRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<Country> countries() {
		return repository.findAll();
	}
}
