package me.chenjr.teatracing.domain;

import javax.persistence.*;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "seller_id_inst")
    @TableGenerator(name = "seller_id_inst")
    @Column(name = "ID")
    private int id;
    private String name;

    public Seller() {
    }

    public Seller(String name) {
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
    @Override
    public String toString() {
        return name ;
    }

}
