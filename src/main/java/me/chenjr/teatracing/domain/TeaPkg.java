package me.chenjr.teatracing.domain;


import javax.persistence.*;

@Entity
@Table(name = "TeaPkg")
public class TeaPkg {


    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long  id;

    private String factory;
    private int factoryid;

    private String master;
    private long masterid;

    public int getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(int factoryid) {
        this.factoryid = factoryid;
    }

    public long getMasterid() {
        return masterid;
    }

    public void setMasterid(long masterid) {
        this.masterid = masterid;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    private String seller;
    private int sellerid;
    private String pic;
    private Long teacode;

    public TeaPkg() {

    }

    public TeaPkg(String factory, String master, String seller) {
        this.factory = factory;
        this.master = master;
        this.seller = seller;
//        this.teacode =
    }

   /* GETTER SETTER */

    public void setId(Long id) {
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

    public Long getId() {
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

    public Long getTeacode() {
        return teacode;
    }

    public void setTeacode(Long teacode) {
        this.teacode = teacode;
    }
}
