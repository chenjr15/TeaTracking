package me.chenjr.teatracing.domain;


import javax.persistence.*;

@Entity
@Table(name = "TeaPkg")
public class TeaPkg {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "teapkg_id_inst")
    @TableGenerator(name = "teapkg_id_inst")
    @Column(name = "ID")
    private Long  id;

    private String factory;
    private Long factoryid;

    private String master;
    private Long masterid;

    private boolean forsell;


    private String seller;
    private Long sellerid;
    private String pic;
    private Long teacode;

    public TeaPkg() {
        forsell = true;

    }

    public TeaPkg(String factory, String master, String seller) {
        this.factory = factory;
        this.master = master;
        this.seller = seller;
        forsell = true;
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

    public Long getFactoryid() {
        return factoryid;
    }

    public void setFactoryid(Long factoryid) {
        this.factoryid = factoryid;
    }

    public Long getMasterid() {
        return masterid;
    }

    public void setMasterid(Long masterid) {
        this.masterid = masterid;
    }

    public Long getSellerid() {
        return sellerid;
    }

    public void setSellerid(Long sellerid) {
        this.sellerid = sellerid;
    }

    public Long getTeacode() {
        return teacode;
    }

    public void setTeacode(Long teacode) {
        this.teacode = teacode;
    }

    public boolean isForsell() {
        return forsell;
    }

    public void setForsell(boolean forsell) {
        this.forsell = forsell;
    }
}
