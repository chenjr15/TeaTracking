package me.chenjr.teatracing.domain;

import javax.persistence.*;

@Entity
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "factory_id_inst")
    @TableGenerator(name = "factory_id_inst")
    @Column(name = "ID")
    private long id;
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
}
