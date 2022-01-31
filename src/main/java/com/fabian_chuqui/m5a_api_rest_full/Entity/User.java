package com.fabian_chuqui.m5a_api_rest_full.Entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
public class User implements Serializable {


    private static final long serialVersionUID=-9069060843698080433L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
    @Column(length =50)
private String name;
private String clave;

@Column(name="mail",nullable = false,length = 50,unique = true)
private String email;
private Boolean enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
