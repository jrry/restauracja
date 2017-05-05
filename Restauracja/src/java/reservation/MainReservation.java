
package reservation;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import json.Reservation;

@ManagedBean
@ViewScoped
public class MainReservation implements Serializable {
    
    private Person person;
    private Table table;
    private Calendar calendar;
    private Reservation reservation;

    public MainReservation() {
        person = new Person();
        table = new Table();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }
    
    public void save() {
        calendar = new GregorianCalendar();
        calendar.setTime(table.getDate());
        reservation = new Reservation(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR), calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), table.getQuantity());
        
    }
    
}
