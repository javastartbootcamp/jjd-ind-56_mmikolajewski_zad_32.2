package pl.javastart.jpaoptimalization.country;

import org.springframework.stereotype.Service;
import pl.javastart.jpaoptimalization.countrylanguage.CountryAndLanguageDto;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryWithBiggestCityAndPopulationDto> findAllCountriesWithBiggestCitiesAndPopulation() {
        return countryRepository.findAllWithTheBiggerCityAndPopulation();
    }

    public List<CountryAndLanguageDto> findAllWithLanguage() {
        return countryRepository.findAllWithLanguage();
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
