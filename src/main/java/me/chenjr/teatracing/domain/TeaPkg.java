package me.chenjr.teatracing.domain;


import javax.persistence.*;

@Entity
@Table(name = "TeaPkg")
public class TeaPkg {


    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int  id;

    private String factory;

    private String master;
    private String seller;
    private String pic;

    public TeaPkg() {

    }

    public TeaPkg(String factory, String master, String seller) {
        this.factory = factory;
        this.master = master;
        this.seller = seller;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public String getFactory() {
        return factory;
    }

    public String getMaster() {
        return master;
    }

    public String getSeller() {
        return seller;
    }

    public String getPic() {
        return pic;
    }
}
