package pl.javastart.jpaoptimalization.country;

public class CountryWithBiggestCityAndPopulationDto {

    private String countryName;
    private String biggestCity;
    private Integer population;

    public CountryWithBiggestCityAndPopulationDto(String countryName, String biggestCity, Integer population) {
        this.countryName = countryName;
        this.biggestCity = biggestCity;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getBiggestCity() {
        return biggestCity;
    }

    public Integer getPopulation() {
        return population;
    }
}
