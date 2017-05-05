package json;


public class Reservation {
    private Integer day;
    private Integer month;
    private Integer year;
    private Integer hour;
    private Integer minutes;
    private Integer guests;

    public Reservation(Integer day, Integer month, Integer year, Integer hour, Integer minutes, Integer guests) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.guests = guests;
    }
    
    
}
