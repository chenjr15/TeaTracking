package me.chenjr.teatracing.domain;

import javax.persistence.*;

@Entity
public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "master_id_inst")
    @TableGenerator(name = "master_id_inst")
    @Column(name = "ID")
    private Long id;
    private String name;
    private int made;

    public Master() {
    }

    public Master(String name) {
        this.name = name;
        this.made = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
