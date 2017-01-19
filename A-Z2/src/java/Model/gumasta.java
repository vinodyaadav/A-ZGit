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
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.bind.ServletRequestUtils;

/**
 *
 * @author Amit Mehta
 */
@Entity
@Table(name="gumasta")
public class gumasta implements Serializable {

    private int id;
    private String optionsRadios1;
    private String optionsRadios2;
    private String licenceNo;
    private String renewDate;
    private String contactNo;
    private String custName;
    private String address;
    private String natureOfBuisness;
    private String employeeQty;
    private String propertiorName;
    private String renew1;
    private String renew2;
    private String renew3;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refAmt;
    private String submitDate;
    private String lightBill;
    private String rentAgreement;
    private String pancard;
    private String drivingLicence;
    private String passport;
    private String votingCard;
    private String adharCard;


  
    
    
    
     @Id
    @GenericGenerator(name = "generator", strategy="increment")
    @GeneratedValue(generator = "generator")

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the licenceNo
     */
    public String getLicenceNo() {
        return licenceNo;
    }

    /**
     * @param licenceNo the licenceNo to set
     */
    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    /**
     * @return the renewDate
     */
    public String getRenewDate() {
        return renewDate;
    }

    /**
     * @param renewDate the renewDate to set
     */
    public void setRenewDate(String renewDate) {
        this.renewDate = renewDate;
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
     * @return the natureOfBuisness
     */
    public String getNatureOfBuisness() {
        return natureOfBuisness;
    }

    /**
     * @param natureOfBuisness the natureOfBuisness to set
     */
    public void setNatureOfBuisness(String natureOfBuisness) {
        this.natureOfBuisness = natureOfBuisness;
    }

    /**
     * @return the employeeQty
     */
    public String getEmployeeQty() {
        return employeeQty;
    }

    /**
     * @param employeeQty the employeeQty to set
     */
    public void setEmployeeQty(String employeeQty) {
        this.employeeQty = employeeQty;
    }

    /**
     * @return the propertiorName
     */
    public String getPropertiorName() {
        return propertiorName;
    }

    /**
     * @param propertiorName the propertiorName to set
     */
    public void setPropertiorName(String propertiorName) {
        this.propertiorName = propertiorName;
    }

    /**
     * @return the renew1
     */
    public String getRenew1() {
        return renew1;
    }

    /**
     * @param renew1 the renew1 to set
     */
    public void setRenew1(String renew1) {
        this.renew1 = renew1;
    }

    /**
     * @return the renew2
     */
    public String getRenew2() {
        return renew2;
    }

    /**
     * @param renew2 the renew2 to set
     */
    public void setRenew2(String renew2) {
        this.renew2 = renew2;
    }

    /**
     * @return the renew3
     */
    public String getRenew3() {
        return renew3;
    }

    /**
     * @param renew3 the renew3 to set
     */
    public void setRenew3(String renew3) {
        this.renew3 = renew3;
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
     * @return the refAmt
     */
    public String getRefAmt() {
        return refAmt;
    }

    /**
     * @param refAmt the refAmt to set
     */
    public void setRefAmt(String refAmt) {
        this.refAmt = refAmt;
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
     * @return the lightBill
     */
    public String getLightBill() {
        return lightBill;
    }

    /**
     * @param lightBill the lightBill to set
     */
    public void setLightBill(String lightBill) {
        this.lightBill = lightBill;
    }

    /**
     * @return the rentAgreement
     */
    public String getRentAgreement() {
        return rentAgreement;
    }

    /**
     * @param rentAgreement the rentAgreement to set
     */
    public void setRentAgreement(String rentAgreement) {
        this.rentAgreement = rentAgreement;
    }

    /**
     * @return the pancard
     */
    public String getPancard() {
        return pancard;
    }

    /**
     * @param pancard the pancard to set
     */
    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    /**
     * @return the drivingLicence
     */
    public String getDrivingLicence() {
        return drivingLicence;
    }

    /**
     * @param drivingLicence the drivingLicence to set
     */
    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    /**
     * @return the passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * @param passport the passport to set
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * @return the votingCard
     */
    public String getVotingCard() {
        return votingCard;
    }

    /**
     * @param votingCard the votingCard to set
     */
    public void setVotingCard(String votingCard) {
        this.votingCard = votingCard;
    }

    /**
     * @return the adharCard
     */
    public String getAdharCard() {
        return adharCard;
    }

    /**
     * @param adharCard the adharCard to set
     */
    public void setAdharCard(String adharCard) {
        this.adharCard = adharCard;
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
     * @return the optionsRadios1
     */
    public String getOptionsRadios1() {
        return optionsRadios1;
    }

    /**
     * @param optionsRadios1 the optionsRadios1 to set
     */
    public void setOptionsRadios1(String optionsRadios1) {
        this.optionsRadios1 = optionsRadios1;
    }

    /**
     * @return the optionsRadios2
     */
    public String getOptionsRadios2() {
        return optionsRadios2;
    }

    /**
     * @param optionsRadios2 the optionsRadios2 to set
     */
    public void setOptionsRadios2(String optionsRadios2) {
        this.optionsRadios2 = optionsRadios2;
    }

    }
