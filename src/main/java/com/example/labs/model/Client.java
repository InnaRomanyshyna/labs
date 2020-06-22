package com.example.labs.model;
import javax.persistence.*;
import java.util.UUID;
@Table(name = "clients")
@Entity
public class Client {
    @Id
    @Column(name ="client_id")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    @Column(name ="first_name")
    private String firstName;
    @Column(name ="last_name")
    private String lastName;
    @Column(name ="adress")
    private String adress;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER)
    //@OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name ="phone_id")
   // @Column(name ="phone")
    private Phone phone;
    private String email;
    @Column(name ="password")
    private String password;

    public Client() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Client(UUID id, String firstName, String lastName, String adress, Phone phone, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}
