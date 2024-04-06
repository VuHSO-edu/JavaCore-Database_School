package countrymager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */


        // Test original data
        testOriginalData();
        System.out.println();

        // Test sorting by population
        testSortIncreasingByPopulation();
        System.out.println();
        testSortDecreasingByPopulation();
        System.out.println();

        // Test sorting by area
        testSortIncreasingByArea();
        System.out.println();
        testSortDecreasingByArea();
        System.out.println();

        // Test sorting by GDP
        testSortIncreasingByGdp();
        System.out.println();
        testSortDecreasingByGdp();
        System.out.println();

        // Test filtering by continent
        testFilterAfricaCountry();
        System.out.println();
        testFilterAsiaCountry();
        System.out.println();
        testFilterEuropeCountry();
        System.out.println();
        testFilterNorthAmericaCountry();
        System.out.println();
        testFilterOceaniaCountry();
        System.out.println();
        testFilterSouthAmericaCountry();
        System.out.println();

        // Test filtering by population
        testFilterMostPopulousCountries();
        System.out.println();
        testFilterLeastPopulousCountries();
        System.out.println();

        // Test filtering by area
        testFilterLargestAreaCountries();
        System.out.println();
        testFilterSmallestAreaCountries();
        System.out.println();

        // Test filtering by GDP
        testFilterHighestGdpCountries();
        System.out.println();
        testFilterLowestGdpCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);

                Country country;
                switch (continent) {
                    case "Africa":
                        country = new AfricaCountry(code, name, population, area, gdp);
                        break;
                    case "Asia":
                        country = new AsiaCountry(code, name, population, area, gdp);
                        break;
                    case "Europe":
                        country = new EuropeCountry(code, name, population, area, gdp);
                        break;
                    case "North America":
                        country = new NorthAmericaCountry(code, name, population, area, gdp);
                        break;
                    case "Oceania":
                        country = new OceaniaCountry(code, name, population, area, gdp);
                        break;
                    case "South America":
                        country = new SouthAmericaCountry(code, name, population, area, gdp);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid continent: " + continent);
                }

                countryManager.append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        CountryArrayManager.print(countries);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        CountryArrayManager.print(countries);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        CountryArrayManager.print(countries);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        CountryArrayManager.print(countries);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        CountryArrayManager.print(countries);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        AfricaCountry[] countries = countryManager.filterAfricaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        AsiaCountry[] countries = countryManager.filterAsiaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        EuropeCountry[] countries = countryManager.filterEuropeCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] countries = countryManager.filterNorthAmericaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        OceaniaCountry[] countries = countryManager.filterOceaniaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] countries = countryManager.filterSouthAmericaCountry();
        CountryArrayManager.print(countries);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(10);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(10);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(10);
        CountryArrayManager.print(countries);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(10);
        CountryArrayManager.print(countries);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(10);
        CountryArrayManager.print(countries);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(10);
        CountryArrayManager.print(countries);
    }
}

