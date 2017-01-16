/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class twowfourwh implements Serializable {
 
  
    @Id
    @GeneratedValue
    private int TwowId;
    private String docType;
    private String custName;
    private String middleName;
    private String lastName;
    private String address;
    private String contactNo;
    private String landmarkaddnear;
    private String vehicleno;
    private String whichbikedetail;
    private String modelyear;
    private String lstyrpolicydetail;
    private String bikecolour;
    private String loanhyponame;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String Remarknote;
    private String submitDate;
    private String photobike;
    private String oldrcbookxrx;
    private String oldinsrncecpyxrx;
    private String letterncb;

    /**
     * @return the TwowId
     */
    public int getTwowId() {
        return TwowId;
    }

    /**
     * @param TwowId the TwowId to set
     */
    public void setTwowId(int TwowId) {
        this.TwowId = TwowId;
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
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the landmarkaddnear
     */
    public String getLandmarkaddnear() {
        return landmarkaddnear;
    }

    /**
     * @param landmarkaddnear the landmarkaddnear to set
     */
    public void setLandmarkaddnear(String landmarkaddnear) {
        this.landmarkaddnear = landmarkaddnear;
    }

    /**
     * @return the vehicleno
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
     * @param vehicleno the vehicleno to set
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    /**
     * @return the whichbikedetail
     */
    public String getWhichbikedetail() {
        return whichbikedetail;
    }

    /**
     * @param whichbikedetail the whichbikedetail to set
     */
    public void setWhichbikedetail(String whichbikedetail) {
        this.whichbikedetail = whichbikedetail;
    }

    /**
     * @return the modelyear
     */
    public String getModelyear() {
        return modelyear;
    }

    /**
     * @param modelyear the modelyear to set
     */
    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }

    /**
     * @return the lstyrpolicydetail
     */
    public String getLstyrpolicydetail() {
        return lstyrpolicydetail;
    }

    /**
     * @param lstyrpolicydetail the lstyrpolicydetail to set
     */
    public void setLstyrpolicydetail(String lstyrpolicydetail) {
        this.lstyrpolicydetail = lstyrpolicydetail;
    }

    /**
     * @return the bikecolour
     */
    public String getBikecolour() {
        return bikecolour;
    }

    /**
     * @param bikecolour the bikecolour to set
     */
    public void setBikecolour(String bikecolour) {
        this.bikecolour = bikecolour;
    }

    /**
     * @return the loanhyponame
     */
    public String getLoanhyponame() {
        return loanhyponame;
    }

    /**
     * @param loanhyponame the loanhyponame to set
     */
    public void setLoanhyponame(String loanhyponame) {
        this.loanhyponame = loanhyponame;
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
     * @return the Remarknote
     */
    public String getRemarknote() {
        return Remarknote;
    }

    /**
     * @param Remarknote the Remarknote to set
     */
    public void setRemarknote(String Remarknote) {
        this.Remarknote = Remarknote;
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
     * @return the photobike
     */
    public String getPhotobike() {
        return photobike;
    }

    /**
     * @param photobike the photobike to set
     */
    public void setPhotobike(String photobike) {
        this.photobike = photobike;
    }

    /**
     * @return the oldrcbookxrx
     */
    public String getOldrcbookxrx() {
        return oldrcbookxrx;
    }

    /**
     * @param oldrcbookxrx the oldrcbookxrx to set
     */
    public void setOldrcbookxrx(String oldrcbookxrx) {
        this.oldrcbookxrx = oldrcbookxrx;
    }

    /**
     * @return the oldinsrncecpyxrx
     */
    public String getOldinsrncecpyxrx() {
        return oldinsrncecpyxrx;
    }

    /**
     * @param oldinsrncecpyxrx the oldinsrncecpyxrx to set
     */
    public void setOldinsrncecpyxrx(String oldinsrncecpyxrx) {
        this.oldinsrncecpyxrx = oldinsrncecpyxrx;
    }

    /**
     * @return the letterncb
     */
    public String getLetterncb() {
        return letterncb;
    }

    /**
     * @param letterncb the letterncb to set
     */
    public void setLetterncb(String letterncb) {
        this.letterncb = letterncb;
    }


}
