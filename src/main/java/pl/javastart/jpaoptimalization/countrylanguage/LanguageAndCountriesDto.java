package pl.javastart.jpaoptimalization.countrylanguage;

import pl.javastart.jpaoptimalization.country.Country;

import java.util.List;

public class LanguageAndCountriesDto {
    private String countryName;
    private List<Country> countries;

    public LanguageAndCountriesDto(String countryName, List<Country> countries) {
        this.countryName = countryName;
        this.countries = countries;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
