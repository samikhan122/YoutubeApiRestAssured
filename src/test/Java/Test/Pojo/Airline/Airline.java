package Test.Pojo.Airline;

import lombok.Builder;
import lombok.Data;
@Data   // this will generate data and set it into the setters
@Builder // this will help to create the request builder
public class Airline {
    //lombok dependency is used for annotation
    private int id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String head_quarters;
    private String website;
    private String established;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getHead_quarters() {
        return head_quarters;
    }

    public void setHead_quarters(String head_quarters) {
        this.head_quarters = head_quarters;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEstablished() {
        return established;
    }

    public void setEstablished(String established) {
        this.established = established;
    }
}
