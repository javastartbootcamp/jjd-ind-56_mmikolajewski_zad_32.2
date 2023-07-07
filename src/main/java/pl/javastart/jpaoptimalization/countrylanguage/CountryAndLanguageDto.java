package pl.javastart.jpaoptimalization.countrylanguage;

import java.util.List;

public class CountryAndLanguageDto {
    private String countryName;
    private List<CountryLanguage> languages;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<CountryLanguage> languages) {
        this.languages = languages;
    }
}
