package pl.javastart.jpaoptimalization.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.javastart.jpaoptimalization.countrylanguage.CountryAndLanguageDto;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT new pl.javastart.jpaoptimalization.country.CountryWithBiggestCityAndPopulationDto(c.name, a.name, a.population) " +
            "FROM Country c " +
            "JOIN c.cities a " +
            "WHERE a.population is null OR a.population = (SELECT MAX(a2.population) FROM City a2 WHERE a2.country = c) " +
            "ORDER BY c.name ASC ")
    List<CountryWithBiggestCityAndPopulationDto> findAllWithTheBiggerCityAndPopulation();

        @Query("SELECT new pl.javastart.jpaoptimalization.countrylanguage.CountryAndLanguageDto(c.name, c.languages ) " +
            "FROM Country c " +
            "JOIN c.languages l " +
            "WHERE l.countryCode = c.code " +
            "ORDER BY c.name ASC ")
    List<CountryAndLanguageDto> findAllWithLanguage();

}
