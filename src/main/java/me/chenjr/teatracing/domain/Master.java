package me.chenjr.teatracing.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Master {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private int made;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
        this.made = 0;
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
    @Override
    public String toString() {
        return name ;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }
}
