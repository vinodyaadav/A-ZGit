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
@Table(name = "drivingmodel")
public class DrivingModel {

    private int licenceid;
    private String docType;
    private String custName;
    private String contactNo;
    private String son;
    private String address;
    private String permanentaddress;
    private String dateofbirth;
    private String education;
    private String bloodgroup;
    private String identificationmark;
    private String identificationmarks;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refName;
    private String submitDate;
    private String radioa;
    private String radiob;
    private String radioc;
    private String radiod;
    private String radioe;
    private String radiou;
    private String radiop;

    /**
     * @return the licenceid
     */
   

    /**
     * @return the licenceid
     */
     @Id
    @GenericGenerator(name = "generator", strategy = "increment")
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
     * @return the son
     */
    public String getSon() {
        return son;
    }

    /**
     * @param son the son to set
     */
    public void setSon(String son) {
        this.son = son;
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
     * @return the permanentaddress
     */
    public String getPermanentaddress() {
        return permanentaddress;
    }

    /**
     * @param permanentaddress the permanentaddress to set
     */
    public void setPermanentaddress(String permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    /**
     * @return the dateofbirth
     */
    public String getDateofbirth() {
        return dateofbirth;
    }

    /**
     * @param dateofbirth the dateofbirth to set
     */
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    /**
     * @return the education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return the bloodgroup
     */
    public String getBloodgroup() {
        return bloodgroup;
    }

    /**
     * @param bloodgroup the bloodgroup to set
     */
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    /**
     * @return the identificationmark
     */
    public String getIdentificationmark() {
        return identificationmark;
    }

    /**
     * @param identificationmark the identificationmark to set
     */
    public void setIdentificationmark(String identificationmark) {
        this.identificationmark = identificationmark;
    }

    /**
     * @return the identificationmarks
     */
    public String getIdentificationmarks() {
        return identificationmarks;
    }

    /**
     * @param identificationmarks the identificationmarks to set
     */
    public void setIdentificationmarks(String identificationmarks) {
        this.identificationmarks = identificationmarks;
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
     * @return the radioa
     */
    public String getRadioa() {
        return radioa;
    }

    /**
     * @param radioa the radioa to set
     */
    public void setRadioa(String radioa) {
        this.radioa = radioa;
    }

    /**
     * @return the radiob
     */
    public String getRadiob() {
        return radiob;
    }

    /**
     * @param radiob the radiob to set
     */
    public void setRadiob(String radiob) {
        this.radiob = radiob;
    }

    /**
     * @return the radioc
     */
    public String getRadioc() {
        return radioc;
    }

    /**
     * @param radioc the radioc to set
     */
    public void setRadioc(String radioc) {
        this.radioc = radioc;
    }

    /**
     * @return the radiod
     */
    public String getRadiod() {
        return radiod;
    }

    /**
     * @param radiod the radiod to set
     */
    public void setRadiod(String radiod) {
        this.radiod = radiod;
    }

    /**
     * @return the radioe
     */
    public String getRadioe() {
        return radioe;
    }

    /**
     * @param radioe the radioe to set
     */
    public void setRadioe(String radioe) {
        this.radioe = radioe;
    }

    /**
     * @return the radiou
     */
    public String getRadiou() {
        return radiou;
    }

    /**
     * @param radiou the radiou to set
     */
    public void setRadiou(String radiou) {
        this.radiou = radiou;
    }

    /**
     * @return the radiop
     */
    public String getRadiop() {
        return radiop;
    }

    /**
     * @param radiop the radiop to set
     */
    public void setRadiop(String radiop) {
        this.radiop = radiop;
    }
 
}
