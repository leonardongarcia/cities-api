package com.github.leonardo.citiesapi.countries.repository;

import com.github.leonardo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
