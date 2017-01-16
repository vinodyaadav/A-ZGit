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
 * @author M-Services
 */
@Entity
public class mediclaim implements Serializable {

   
    private int id;
    private String docType;
    private String oldPolicyNo;
    private String renewDate;
    private String companyName;
    private String custName;
    private String middleName;
    private String lastName;
    private String husbandName;
    private String dob;
    private String address;
    private String contactNo;
    private String memberFirstName;
    private String age;
    private String secondMemberName;
    private String secondMemberAge;
    private String thirdMemberName;
    private String thirdMemberAge;
    private String fourthMemberName;
    private String fourthMemberAge;
    private String fifthMemberName;
    private String fifthMemberAge;
    private String adharCard;
    private String votingCard;
    private String passport;
    private String drivingLicence;
    private String pancard;
    private String adharCardadd;
    private String votingCardadd;
    private String passportadd;
    private String drivingLicenceadd;
    private String bankpassbook;
    private String corporateLetter;
    private String rentAgreement;
    private String addProofLightBill;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refName;
    private String submitDate;


    
    
   

    /**
     * @return the id
     */
     @GeneratedValue
    @Id
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
     * @return the oldPolicyNo
     */
    public String getOldPolicyNo() {
        return oldPolicyNo;
    }

    /**
     * @param oldPolicyNo the oldPolicyNo to set
     */
    public void setOldPolicyNo(String oldPolicyNo) {
        this.oldPolicyNo = oldPolicyNo;
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
     * @return the husbandName
     */
    public String getHusbandName() {
        return husbandName;
    }

    /**
     * @param husbandName the husbandName to set
     */
    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
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
     * @return the memberFirstName
     */
    public String getMemberFirstName() {
        return memberFirstName;
    }

    /**
     * @param memberFirstName the memberFirstName to set
     */
    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the secondMemberName
     */
    public String getSecondMemberName() {
        return secondMemberName;
    }

    /**
     * @param secondMemberName the secondMemberName to set
     */
    public void setSecondMemberName(String secondMemberName) {
        this.secondMemberName = secondMemberName;
    }

    /**
     * @return the secondMemberAge
     */
    public String getSecondMemberAge() {
        return secondMemberAge;
    }

    /**
     * @param secondMemberAge the secondMemberAge to set
     */
    public void setSecondMemberAge(String secondMemberAge) {
        this.secondMemberAge = secondMemberAge;
    }

    /**
     * @return the thirdMemberName
     */
    public String getThirdMemberName() {
        return thirdMemberName;
    }

    /**
     * @param thirdMemberName the thirdMemberName to set
     */
    public void setThirdMemberName(String thirdMemberName) {
        this.thirdMemberName = thirdMemberName;
    }

    /**
     * @return the thirdMemberAge
     */
    public String getThirdMemberAge() {
        return thirdMemberAge;
    }

    /**
     * @param thirdMemberAge the thirdMemberAge to set
     */
    public void setThirdMemberAge(String thirdMemberAge) {
        this.thirdMemberAge = thirdMemberAge;
    }

    /**
     * @return the fourthMemberName
     */
    public String getFourthMemberName() {
        return fourthMemberName;
    }

    /**
     * @param fourthMemberName the fourthMemberName to set
     */
    public void setFourthMemberName(String fourthMemberName) {
        this.fourthMemberName = fourthMemberName;
    }

    /**
     * @return the fourthMemberAge
     */
    public String getFourthMemberAge() {
        return fourthMemberAge;
    }

    /**
     * @param fourthMemberAge the fourthMemberAge to set
     */
    public void setFourthMemberAge(String fourthMemberAge) {
        this.fourthMemberAge = fourthMemberAge;
    }

    /**
     * @return the fifthMemberName
     */
    public String getFifthMemberName() {
        return fifthMemberName;
    }

    /**
     * @param fifthMemberName the fifthMemberName to set
     */
    public void setFifthMemberName(String fifthMemberName) {
        this.fifthMemberName = fifthMemberName;
    }

    /**
     * @return the fifthMemberAge
     */
    public String getFifthMemberAge() {
        return fifthMemberAge;
    }

    /**
     * @param fifthMemberAge the fifthMemberAge to set
     */
    public void setFifthMemberAge(String fifthMemberAge) {
        this.fifthMemberAge = fifthMemberAge;
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
     * @return the adharCardadd
     */
    public String getAdharCardadd() {
        return adharCardadd;
    }

    /**
     * @param adharCardadd the adharCardadd to set
     */
    public void setAdharCardadd(String adharCardadd) {
        this.adharCardadd = adharCardadd;
    }

    /**
     * @return the votingCardadd
     */
    public String getVotingCardadd() {
        return votingCardadd;
    }

    /**
     * @param votingCardadd the votingCardadd to set
     */
    public void setVotingCardadd(String votingCardadd) {
        this.votingCardadd = votingCardadd;
    }

    /**
     * @return the passportadd
     */
    public String getPassportadd() {
        return passportadd;
    }

    /**
     * @param passportadd the passportadd to set
     */
    public void setPassportadd(String passportadd) {
        this.passportadd = passportadd;
    }

    /**
     * @return the drivingLicenceadd
     */
    public String getDrivingLicenceadd() {
        return drivingLicenceadd;
    }

    /**
     * @param drivingLicenceadd the drivingLicenceadd to set
     */
    public void setDrivingLicenceadd(String drivingLicenceadd) {
        this.drivingLicenceadd = drivingLicenceadd;
    }

    /**
     * @return the bankpassbook
     */
    public String getBankpassbook() {
        return bankpassbook;
    }

    /**
     * @param bankpassbook the bankpassbook to set
     */
    public void setBankpassbook(String bankpassbook) {
        this.bankpassbook = bankpassbook;
    }

    /**
     * @return the corporateLetter
     */
    public String getCorporateLetter() {
        return corporateLetter;
    }

    /**
     * @param corporateLetter the corporateLetter to set
     */
    public void setCorporateLetter(String corporateLetter) {
        this.corporateLetter = corporateLetter;
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
     * @return the addProofLightBill
     */
    public String getAddProofLightBill() {
        return addProofLightBill;
    }

    /**
     * @param addProofLightBill the addProofLightBill to set
     */
    public void setAddProofLightBill(String addProofLightBill) {
        this.addProofLightBill = addProofLightBill;
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
 
}
