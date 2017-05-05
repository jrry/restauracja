package reservation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Person {
    
    @NotNull(message = "Enter your name")
    @Size(min = 2, max = 50, message = "Min. 2 and max. 50 characters")
    private String name;
    
    @NotNull(message = "Enter your surname")
    @Size(min = 2, max = 50, message = "Min. 2 and max. 50 characters")
    private String surname;
    
    @NotNull(message = "Enter your email")
    @Size(max = 100, message = "Too long email address")
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$", message = "Invalid email address")
    private String mail;
    
    @NotNull(message = "Enter your phone")
    @Pattern(regexp = "([0-9]{9})", message = "Enter 9 numbers only")
    private Integer phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
}
