//package proj10.mailorder;

/**
 *creates the address objects and deals with address object data
 */
public class Address {

    private final String streetAddress;      //separated street address
    private final String city;               //separated city name
    private final String state;              //separated state name
    private final int zip;    //separated zip number

    /**
     * create an address object
     *
     * @param streetAddress address
     * @param city city
     * @param state state
     * @param zip zip
     */
    public Address(String streetAddress, String city, String state, int zip) {

        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
/**
 * Zip getter
 * @return zip value
 */
    public int getZip() {
        return this.zip;
    }

    /**
     * returns address as a string for specific address object
     */
    @Override
    public String toString() {
        return String.format("%s\n%s, %s %05d", this.streetAddress,
                this.city, this.state, this.zip);
    }

    /**
     * breaks apart address into streetAddress, city, state, and zip
     */
    public static Address parse(String streetAddress, String cityStateZip) {
        String city = cityStateZip.substring(0, cityStateZip.indexOf(','));
        String state = cityStateZip.substring(city.length() + 2, cityStateZip.
                lastIndexOf(' '));
        int zip = Integer.parseInt(cityStateZip.substring(cityStateZip.
                lastIndexOf(' ') + 1, cityStateZip.length()));

        return new Address(streetAddress, city, state, zip);
    }
}
