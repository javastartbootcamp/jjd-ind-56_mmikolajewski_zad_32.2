package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.stereotype.Service;
import pl.javastart.jpaoptimalization.country.Country;
import pl.javastart.jpaoptimalization.country.CountryRepository;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;
    private final CountryRepository countryRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository, CountryRepository countryRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
        this.countryRepository = countryRepository;
    }

    public List<CountryLanguage> findAll() {
        return countryLanguageRepository.findAll();
    }


    public Map<String, List<String>> getLanguageAndCountriesDtoList() {
        Map<String, List<String>> languageAndCountries = new TreeMap<>();
        List<CountryLanguage> languages = countryLanguageRepository.findAll();
        Map<String, Country> countriesByCode = countryRepository.findAll().stream().collect(Collectors.toMap(Country::getCode, Function.identity()));

        languages
                .forEach(language-> {
                    if (languageAndCountries.containsKey(language.getLanguage())) {
                        List<String> listOfCountries = languageAndCountries.get(language.getLanguage());
                        listOfCountries.add(countriesByCode.get(language.getCountryCode()).getName());
                    } else {
                        ArrayList<String> listOfCountries = new ArrayList<>();
                        listOfCountries.add(countriesByCode.get(language.getCountryCode()).getName());
                        languageAndCountries.put(language.getLanguage(), listOfCountries);
                    }
                });
        return languageAndCountries;
    }

}
