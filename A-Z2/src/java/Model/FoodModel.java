/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Debuggerrr
 */
@Entity
@Table(name="foodmodel")
public class FoodModel {

    private int licenceid;
    private String docType;
    private String food;
    private String renewdate;
    private String custName;
     private String contactNo;
    private String address;
    private String nature;
    private String empquantity;
    private String prop;
    private String partner;
    private String water;
    private String product;
    private String turnover;
    private String ifr;
    private String changes;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refName;
    private String submitDate;
    private String adhr;
    private String vot;
    private String pass;
    private String dri;
    private String pan;
    private String light;
    private String rent;
    private String let;
    private String map;
    private String gum;
    private String noc;
    private String shop;
    private String AB;
    private String chargesa;
    private String chargesb;
    private String chargesc;

    /**
     * @return the licenceid
     */
   

    /**
     * @return the licenceid
     */
     @Id
    @GenericGenerator(name="generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    public int getLicenceid() {
        return licenceid;
    }

    /**
     * @param licenceid the licenceid to set
     */
    public void setLicenceid(int licenceid) {
        this.licenceid = licenceid;
    }

    /**
     * @return the docType
     */
    public String getDocType() {
        return docType;
    }

    /**
     * @param docType the docType to set
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @return the renewdate
     */
    public String getRenewdate() {
        return renewdate;
    }

    /**
     * @param renewdate the renewdate to set
     */
    public void setRenewdate(String renewdate) {
        this.renewdate = renewdate;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(String nature) {
        this.nature = nature;
    }

    /**
     * @return the empquantity
     */
    public String getEmpquantity() {
        return empquantity;
    }

    /**
     * @param empquantity the empquantity to set
     */
    public void setEmpquantity(String empquantity) {
        this.empquantity = empquantity;
    }

    /**
     * @return the prop
     */
    public String getProp() {
        return prop;
    }

    /**
     * @param prop the prop to set
     */
    public void setProp(String prop) {
        this.prop = prop;
    }

    /**
     * @return the partner
     */
    public String getPartner() {
        return partner;
    }

    /**
     * @param partner the partner to set
     */
    public void setPartner(String partner) {
        this.partner = partner;
    }

    /**
     * @return the water
     */
    public String getWater() {
        return water;
    }

    /**
     * @param water the water to set
     */
    public void setWater(String water) {
        this.water = water;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the turnover
     */
    public String getTurnover() {
        return turnover;
    }

    /**
     * @param turnover the turnover to set
     */
    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    /**
     * @return the ifr
     */
    public String getIfr() {
        return ifr;
    }

    /**
     * @param ifr the ifr to set
     */
    public void setIfr(String ifr) {
        this.ifr = ifr;
    }

    /**
     * @return the changes
     */
    public String getChanges() {
        return changes;
    }

    /**
     * @param changes the changes to set
     */
    public void setChanges(String changes) {
        this.changes = changes;
    }

    /**
     * @return the decidedAmt
     */
    public String getDecidedAmt() {
        return decidedAmt;
    }

    /**
     * @param decidedAmt the decidedAmt to set
     */
    public void setDecidedAmt(String decidedAmt) {
        this.decidedAmt = decidedAmt;
    }

    /**
     * @return the amtPaid
     */
    public String getAmtPaid() {
        return amtPaid;
    }

    /**
     * @param amtPaid the amtPaid to set
     */
    public void setAmtPaid(String amtPaid) {
        this.amtPaid = amtPaid;
    }

    /**
     * @return the balAmt
     */
    public String getBalAmt() {
        return balAmt;
    }

    /**
     * @param balAmt the balAmt to set
     */
    public void setBalAmt(String balAmt) {
        this.balAmt = balAmt;
    }

    /**
     * @return the refName
     */
    public String getRefName() {
        return refName;
    }

    /**
     * @param refName the refName to set
     */
    public void setRefName(String refName) {
        this.refName = refName;
    }

    /**
     * @return the submitDate
     */
    public String getSubmitDate() {
        return submitDate;
    }

    /**
     * @param submitDate the submitDate to set
     */
    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * @return the adhr
     */
    public String getAdhr() {
        return adhr;
    }

    /**
     * @param adhr the adhr to set
     */
    public void setAdhr(String adhr) {
        this.adhr = adhr;
    }

    /**
     * @return the vot
     */
    public String getVot() {
        return vot;
    }

    /**
     * @param vot the vot to set
     */
    public void setVot(String vot) {
        this.vot = vot;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the dri
     */
    public String getDri() {
        return dri;
    }

    /**
     * @param dri the dri to set
     */
    public void setDri(String dri) {
        this.dri = dri;
    }

    /**
     * @return the pan
     */
    public String getPan() {
        return pan;
    }

    /**
     * @param pan the pan to set
     */
    public void setPan(String pan) {
        this.pan = pan;
    }

    /**
     * @return the light
     */
    public String getLight() {
        return light;
    }

    /**
     * @param light the light to set
     */
    public void setLight(String light) {
        this.light = light;
    }

    /**
     * @return the rent
     */
    public String getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    /**
     * @return the let
     */
    public String getLet() {
        return let;
    }

    /**
     * @param let the let to set
     */
    public void setLet(String let) {
        this.let = let;
    }

    /**
     * @return the map
     */
    public String getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(String map) {
        this.map = map;
    }

    /**
     * @return the gum
     */
    public String getGum() {
        return gum;
    }

    /**
     * @param gum the gum to set
     */
    public void setGum(String gum) {
        this.gum = gum;
    }

    /**
     * @return the noc
     */
    public String getNoc() {
        return noc;
    }

    /**
     * @param noc the noc to set
     */
    public void setNoc(String noc) {
        this.noc = noc;
    }

    /**
     * @return the shop
     */
    public String getShop() {
        return shop;
    }

    /**
     * @param shop the shop to set
     */
    public void setShop(String shop) {
        this.shop = shop;
    }

    /**
     * @return the AB
     */
    public String getAB() {
        return AB;
    }

    /**
     * @param AB the AB to set
     */
    public void setAB(String AB) {
        this.AB = AB;
    }

    /**
     * @return the chargesa
     */
    public String getChargesa() {
        return chargesa;
    }

    /**
     * @param chargesa the chargesa to set
     */
    public void setChargesa(String chargesa) {
        this.chargesa = chargesa;
    }

    /**
     * @return the chargesb
     */
    public String getChargesb() {
        return chargesb;
    }

    /**
     * @param chargesb the chargesb to set
     */
    public void setChargesb(String chargesb) {
        this.chargesb = chargesb;
    }

    /**
     * @return the chargesc
     */
    public String getChargesc() {
        return chargesc;
    }

    /**
     * @param chargesc the chargesc to set
     */
    public void setChargesc(String chargesc) {
        this.chargesc = chargesc;
    }
  
}
