package reservation;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Table implements Serializable {
    
    @NotNull(message = "Specify number of places")
    @Min(value = 1, message = "Min. 1 table")
    private Integer quantity;
    
    @NotNull(message = "Specify date and time of reservation")
    @Future(message = "Specify a date in the future")
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
