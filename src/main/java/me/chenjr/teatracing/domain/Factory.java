package me.chenjr.teatracing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Factory {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;

    @Override
    public String toString() {
        return name ;
    }

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
    }

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
}
