package reservation;

import java.util.Date;
import javax.validation.constraints.NotNull;


public class Table {
    
    @NotNull(message = "Specify number of places")
    private Integer quantity;
    
    @NotNull(message = "Specify date and time of reservation")
    private Date date;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
