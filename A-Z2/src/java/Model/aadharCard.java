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


/**
 *
 * @author M-Services
 */
@Entity
public class aadharCard implements Serializable{

    
    @Id
    @GeneratedValue
    private int id;
    private String docType;
    private String oldAadharNo;
    private String custName;
    private String contactNo;
    private String fatherName;
    private String husbandName;
    private String dob;
    private String address;
    private String changesNote;
    private String changesNote1;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String Remarknote;
    private String submitDate;
    private String birthCert;
    private String boardcert10;
    private String boardcert12;
    private String graduateCopy;
    private String higheredu;
    private String schoolcert;
    private String pancard;
    private String passport;
    private String drivingLicence;
    private String votingId;
    private String RestLetter;
    private String govtbankpass;
    private String licpolicy;
    private String renetedAgree;
    private String rationcard;
    private String Votingid;
    private String Passportadd;
    private String Drivinglic;
    private String PassbookBank;
    private String lightbill;
    private String bankStat;
    private String rentAgreement;

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
     * @return the oldAadharNo
     */
    public String getOldAadharNo() {
        return oldAadharNo;
    }

    /**
     * @param oldAadharNo the oldAadharNo to set
     */
    public void setOldAadharNo(String oldAadharNo) {
        this.oldAadharNo = oldAadharNo;
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
     * @return the fatherName
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * @param fatherName the fatherName to set
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
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
     * @return the changesNote
     */
    public String getChangesNote() {
        return changesNote;
    }

    /**
     * @param changesNote the changesNote to set
     */
    public void setChangesNote(String changesNote) {
        this.changesNote = changesNote;
    }

    /**
     * @return the changesNote1
     */
    public String getChangesNote1() {
        return changesNote1;
    }

    /**
     * @param changesNote1 the changesNote1 to set
     */
    public void setChangesNote1(String changesNote1) {
        this.changesNote1 = changesNote1;
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
     * @return the birthCert
     */
    public String getBirthCert() {
        return birthCert;
    }

    /**
     * @param birthCert the birthCert to set
     */
    public void setBirthCert(String birthCert) {
        this.birthCert = birthCert;
    }

    /**
     * @return the boardcert10
     */
    public String getBoardcert10() {
        return boardcert10;
    }

    /**
     * @param boardcert10 the boardcert10 to set
     */
    public void setBoardcert10(String boardcert10) {
        this.boardcert10 = boardcert10;
    }

    /**
     * @return the boardcert12
     */
    public String getBoardcert12() {
        return boardcert12;
    }

    /**
     * @param boardcert12 the boardcert12 to set
     */
    public void setBoardcert12(String boardcert12) {
        this.boardcert12 = boardcert12;
    }

    /**
     * @return the graduateCopy
     */
    public String getGraduateCopy() {
        return graduateCopy;
    }

    /**
     * @param graduateCopy the graduateCopy to set
     */
    public void setGraduateCopy(String graduateCopy) {
        this.graduateCopy = graduateCopy;
    }

    /**
     * @return the higheredu
     */
    public String getHigheredu() {
        return higheredu;
    }

    /**
     * @param higheredu the higheredu to set
     */
    public void setHigheredu(String higheredu) {
        this.higheredu = higheredu;
    }

    /**
     * @return the schoolcert
     */
    public String getSchoolcert() {
        return schoolcert;
    }

    /**
     * @param schoolcert the schoolcert to set
     */
    public void setSchoolcert(String schoolcert) {
        this.schoolcert = schoolcert;
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
     * @return the votingId
     */
    public String getVotingId() {
        return votingId;
    }

    /**
     * @param votingId the votingId to set
     */
    public void setVotingId(String votingId) {
        this.votingId = votingId;
    }

    /**
     * @return the RestLetter
     */
    public String getRestLetter() {
        return RestLetter;
    }

    /**
     * @param RestLetter the RestLetter to set
     */
    public void setRestLetter(String RestLetter) {
        this.RestLetter = RestLetter;
    }

    /**
     * @return the govtbankpass
     */
    public String getGovtbankpass() {
        return govtbankpass;
    }

    /**
     * @param govtbankpass the govtbankpass to set
     */
    public void setGovtbankpass(String govtbankpass) {
        this.govtbankpass = govtbankpass;
    }

    /**
     * @return the licpolicy
     */
    public String getLicpolicy() {
        return licpolicy;
    }

    /**
     * @param licpolicy the licpolicy to set
     */
    public void setLicpolicy(String licpolicy) {
        this.licpolicy = licpolicy;
    }

    /**
     * @return the renetedAgree
     */
    public String getRenetedAgree() {
        return renetedAgree;
    }

    /**
     * @param renetedAgree the renetedAgree to set
     */
    public void setRenetedAgree(String renetedAgree) {
        this.renetedAgree = renetedAgree;
    }

    /**
     * @return the rationcard
     */
    public String getRationcard() {
        return rationcard;
    }

    /**
     * @param rationcard the rationcard to set
     */
    public void setRationcard(String rationcard) {
        this.rationcard = rationcard;
    }

    /**
     * @return the Votingid
     */
    public String getVotingid() {
        return Votingid;
    }

    /**
     * @param Votingid the Votingid to set
     */
    public void setVotingid(String Votingid) {
        this.Votingid = Votingid;
    }

    /**
     * @return the Passportadd
     */
    public String getPassportadd() {
        return Passportadd;
    }

    /**
     * @param Passportadd the Passportadd to set
     */
    public void setPassportadd(String Passportadd) {
        this.Passportadd = Passportadd;
    }

    /**
     * @return the Drivinglic
     */
    public String getDrivinglic() {
        return Drivinglic;
    }

    /**
     * @param Drivinglic the Drivinglic to set
     */
    public void setDrivinglic(String Drivinglic) {
        this.Drivinglic = Drivinglic;
    }

    /**
     * @return the PassbookBank
     */
    public String getPassbookBank() {
        return PassbookBank;
    }

    /**
     * @param PassbookBank the PassbookBank to set
     */
    public void setPassbookBank(String PassbookBank) {
        this.PassbookBank = PassbookBank;
    }

    /**
     * @return the lightbill
     */
    public String getLightbill() {
        return lightbill;
    }

    /**
     * @param lightbill the lightbill to set
     */
    public void setLightbill(String lightbill) {
        this.lightbill = lightbill;
    }

    /**
     * @return the bankStat
     */
    public String getBankStat() {
        return bankStat;
    }

    /**
     * @param bankStat the bankStat to set
     */
    public void setBankStat(String bankStat) {
        this.bankStat = bankStat;
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

    

}
