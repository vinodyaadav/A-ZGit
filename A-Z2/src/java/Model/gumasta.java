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
import org.springframework.web.bind.ServletRequestUtils;

/**
 *
 * @author Amit Mehta
 */
@Entity
public class gumasta implements Serializable {

    private int id;
    private int licenceNo;
    private String renewDate;
    private String companyName;
    private String address;
    private String natureOfBuisness;
    private String employeeQty;
    private String propertiorName;
    private String renew1;
    private String renew2;
    private String renew3;
    private String decidedAmtRs;
    private String decidedAmtRs1;
    private String creditAmtRs;
    private String creditAmtRs1;
    private String balanceAmtRs1;
    private String balanceAmtRs;
    private String referanceName1;
    private String referanceName;
    private String lightBill;
    private String rentAgreement;
    private String pancard;
    private String drivingLicence;
    private String passport;
    private String votingCard;
    private String adharCard;
    private String decidedamt;
    private String decidedamt1;
    private String creditamt;
    private String creditamt1;
    private String balanceamt;
    private String balanceamt1;
    private String reference;
    private String reference1;

  
    
    
    
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the licenceNo
     */
    public int getLicenceNo() {
        return licenceNo;
    }

    /**
     * @param licenceNo the licenceNo to set
     */
    public void setLicenceNo(int licenceNo) {
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
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
     * @return the decidedAmtRs
     */
    public String getDecidedAmtRs() {
        return decidedAmtRs;
    }

    /**
     * @param decidedAmtRs the decidedAmtRs to set
     */
    public void setDecidedAmtRs(String decidedAmtRs) {
        this.decidedAmtRs = decidedAmtRs;
    }

    /**
     * @return the decidedAmtRs1
     */
    public String getDecidedAmtRs1() {
        return decidedAmtRs1;
    }

    /**
     * @param decidedAmtRs1 the decidedAmtRs1 to set
     */
    public void setDecidedAmtRs1(String decidedAmtRs1) {
        this.decidedAmtRs1 = decidedAmtRs1;
    }

    /**
     * @return the creditAmtRs
     */
    public String getCreditAmtRs() {
        return creditAmtRs;
    }

    /**
     * @param creditAmtRs the creditAmtRs to set
     */
    public void setCreditAmtRs(String creditAmtRs) {
        this.creditAmtRs = creditAmtRs;
    }

    /**
     * @return the creditAmtRs1
     */
    public String getCreditAmtRs1() {
        return creditAmtRs1;
    }

    /**
     * @param creditAmtRs1 the creditAmtRs1 to set
     */
    public void setCreditAmtRs1(String creditAmtRs1) {
        this.creditAmtRs1 = creditAmtRs1;
    }

    /**
     * @return the balanceAmtRs1
     */
    public String getBalanceAmtRs1() {
        return balanceAmtRs1;
    }

    /**
     * @param balanceAmtRs1 the balanceAmtRs1 to set
     */
    public void setBalanceAmtRs1(String balanceAmtRs1) {
        this.balanceAmtRs1 = balanceAmtRs1;
    }

    /**
     * @return the balanceAmtRs
     */
    public String getBalanceAmtRs() {
        return balanceAmtRs;
    }

    /**
     * @param balanceAmtRs the balanceAmtRs to set
     */
    public void setBalanceAmtRs(String balanceAmtRs) {
        this.balanceAmtRs = balanceAmtRs;
    }

    /**
     * @return the referanceName1
     */
    public String getReferanceName1() {
        return referanceName1;
    }

    /**
     * @param referanceName1 the referanceName1 to set
     */
    public void setReferanceName1(String referanceName1) {
        this.referanceName1 = referanceName1;
    }

    /**
     * @return the referanceName
     */
    public String getReferanceName() {
        return referanceName;
    }

    /**
     * @param referanceName the referanceName to set
     */
    public void setReferanceName(String referanceName) {
        this.referanceName = referanceName;
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
     * @return the decidedamt
     */
    public String getDecidedamt() {
        return decidedamt;
    }

    /**
     * @param decidedamt the decidedamt to set
     */
    public void setDecidedamt(String decidedamt) {
        this.decidedamt = decidedamt;
    }

    /**
     * @return the decidedamt1
     */
    public String getDecidedamt1() {
        return decidedamt1;
    }

    /**
     * @param decidedamt1 the decidedamt1 to set
     */
    public void setDecidedamt1(String decidedamt1) {
        this.decidedamt1 = decidedamt1;
    }

    /**
     * @return the creditamt
     */
    public String getCreditamt() {
        return creditamt;
    }

    /**
     * @param creditamt the creditamt to set
     */
    public void setCreditamt(String creditamt) {
        this.creditamt = creditamt;
    }

    /**
     * @return the creditamt1
     */
    public String getCreditamt1() {
        return creditamt1;
    }

    /**
     * @param creditamt1 the creditamt1 to set
     */
    public void setCreditamt1(String creditamt1) {
        this.creditamt1 = creditamt1;
    }

    /**
     * @return the balanceamt
     */
    public String getBalanceamt() {
        return balanceamt;
    }

    /**
     * @param balanceamt the balanceamt to set
     */
    public void setBalanceamt(String balanceamt) {
        this.balanceamt = balanceamt;
    }

    /**
     * @return the balanceamt1
     */
    public String getBalanceamt1() {
        return balanceamt1;
    }

    /**
     * @param balanceamt1 the balanceamt1 to set
     */
    public void setBalanceamt1(String balanceamt1) {
        this.balanceamt1 = balanceamt1;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the reference1
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * @param reference1 the reference1 to set
     */
    public void setReference1(String reference1) {
        this.reference1 = reference1;
    }

    
}
