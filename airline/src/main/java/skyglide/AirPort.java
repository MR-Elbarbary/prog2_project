package skyglide;

public class AirPort {
    private String code;
    private String name;
    private String city;
    private String country;
    private Double longitude;
    private Double latitude;
    AirPort(String code, String name,
    String city, String country, Double longitude, Double latitude){
        this.name = name;
        this.code = code;
        this.city = city;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public String getCity() {
        return city;
    }
    public String getCode() {
        return code;
    }
    public String getCountry() {
        return country;
    }
    public Double getLatitude() {
        return latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public String getName() {
        return name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public void setName(String name) {
        this.name = name;
    }
}
