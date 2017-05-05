package reservation;

import javax.validation.constraints.NotNull;


public class Person {
    
    @NotNull(message = "Enter your name")
    private String name;
    
    @NotNull(message = "Enter your surname")
    private String surname;
    
    @NotNull(message = "Enter your email")
    private String mail;
    
    @NotNull(message = "Enter your phone")
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
