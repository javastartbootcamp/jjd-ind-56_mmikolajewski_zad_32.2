package pl.javastart.jpaoptimalization.country;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryWithBiggestCityAndPopulationDto> findAllCountriesWithBiggestCitiesAndPopulation() {
        return countryRepository.findAllWithTheBiggerCityAndPopulation();
    }

    public List<Country> findAllWithLanguage() {
        return countryRepository.findAllWithLanguage();
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Map<String, List<Country>> findAllAndMapTo() {
        List<Country> all = countryRepository.findAll();
        Map<String, List<Country>> collect = all.stream().collect(Collectors.groupingBy(Country::getCode));
        return collect;
    }
}
