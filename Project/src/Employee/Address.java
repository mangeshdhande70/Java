package Employee;

public class Address {


    private String city;
    private Integer pinCode;

    public Address(String city, Integer pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public Integer getPinCode() {
        return pinCode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
