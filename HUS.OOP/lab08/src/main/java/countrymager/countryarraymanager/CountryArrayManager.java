package countrymager.countryarraymanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> c1.getPopulation() - c2.getPopulation());
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> c2.getPopulation() - c1.getPopulation());
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> (int) (c1.getArea() - c2.getArea()));
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> (int) (c2.getArea() - c1.getArea()));
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> (int) (c1.getGdp() - c2.getGdp()));
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        Arrays.sort(newArray, (c1, c2) -> (int) (c2.getGdp() - c1.getGdp()));
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        List<AfricaCountry> africaCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) country);
            }
        }

        return africaCountries.toArray(new AfricaCountry[0]);

    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        List<AsiaCountry> asiaCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) country);
            }
        }

        return asiaCountries.toArray(new AsiaCountry[0]);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        List<EuropeCountry> europeCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) country);
            }
        }

        return europeCountries.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) country);
            }
        }

        return northAmericaCountries.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) country);
            }
        }

        return oceaniaCountries.toArray(new OceaniaCountry[0]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();

        for (Country country : this.countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) country);
            }
        }

        return southAmericaCountries.toArray(new SouthAmericaCountry[0]);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingInt(Country::getPopulation).reversed())
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingInt(Country::getPopulation))
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingDouble(Country::getArea).reversed())
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingDouble(Country::getArea))
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingDouble(Country::getGdp).reversed())
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        return Arrays.stream(this.countries)
                .filter(country -> country != null)
                .sorted(Comparator.comparingDouble(Country::getGdp))
                .limit(howMany)
                .toArray(Country[]::new);
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}

