package JavaLabs.JavaLab1;

public record TouristTicket (String hotelCategory, String season, int numberOfTourists, int duration, int price, String country)
{

    public static String company = "TravelComp";

    public TouristTicket() {
        this("unknown","year",0,0,0, "World");
    }
//hhh
    public TouristTicket(String hotelCategory, String season, int numberOfTourists) {
        this(hotelCategory, season, numberOfTourists, 364, 0, "World");

    }

    public TouristTicket(final String hotelCategory, final String season, final int numberOfTourists, final int duration, final int price,final String country) {
        this.hotelCategory = hotelCategory;
        this.season = season;
        this.numberOfTourists = numberOfTourists;
        this.duration = duration;
        this.price = price;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Hotel category: " + hotelCategory + "," + " " +
                "Season: " + season + ","
                + " Number of tourists: " + numberOfTourists + "," + " Duration: " + duration + "," + " Price: " + price + ","
                + " Country " + country + ".";
    }

    public static String returnCompany() {
        return "Our company: " + company + ".";
    }
}











































