package pl.javastart.jpaoptimalization.countrylanguage;

import java.util.Collection;
import java.util.List;

public class CountryAndLanguageDto {
    private String countryName;
    private Collection<CountryLanguage> languages;

    public CountryAndLanguageDto(String countryName, Collection<CountryLanguage> languages) {
        this.countryName = countryName;
        this.languages = languages;
    }

    public String getCountryName() {
        return countryName;
    }

    public Collection<CountryLanguage> getLanguages() {
        return languages;
    }
}
