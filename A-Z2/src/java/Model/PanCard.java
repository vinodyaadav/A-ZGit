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
 * @author Admin
 */
@Entity
public class PanCard implements Serializable{
  @Id             
   @GeneratedValue
    private int pancardId;
    private String CorrectionForm;
    private String docType;
    private String OldpanNo;
    private String custName;
    private String FatherName;
    private String SurName;
    private String HusbandName;
    private String Dob;
    private String address;
    private String contactNo;
    private String BirthCert;
    private String sscCert;
    private String hscCert;
    private String marriageCert;
    private String magisrateCharge;
    private String adharCard; 
    private String passprtValid;
    private String drivngLicn;
    private String votingId;
    private String domicileCert;
    private String adharCard1;
    private String voteId;
    private String passportValid;
    private String drivingLicvalid;
    private String bankPaPhoto;
    private String corpeterLetter;
    private String notory;
    private String addProof;
    private String domCert;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String Remarknote;
    private String submitDate;

    /**
     * @return the pancardId
     */
    public int getPancardId() {
        return pancardId;
    }

    /**
     * @param pancardId the pancardId to set
     */
    public void setPancardId(int pancardId) {
        this.pancardId = pancardId;
    }

    /**
     * @return the CorrectionForm
     */
    public String getCorrectionForm() {
        return CorrectionForm;
    }

    /**
     * @param CorrectionForm the CorrectionForm to set
     */
    public void setCorrectionForm(String CorrectionForm) {
        this.CorrectionForm = CorrectionForm;
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
     * @return the OldpanNo
     */
    public String getOldpanNo() {
        return OldpanNo;
    }

    /**
     * @param OldpanNo the OldpanNo to set
     */
    public void setOldpanNo(String OldpanNo) {
        this.OldpanNo = OldpanNo;
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
     * @return the FatherName
     */
    public String getFatherName() {
        return FatherName;
    }

    /**
     * @param FatherName the FatherName to set
     */
    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }

    /**
     * @return the SurName
     */
    public String getSurName() {
        return SurName;
    }

    /**
     * @param SurName the SurName to set
     */
    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    /**
     * @return the HusbandName
     */
    public String getHusbandName() {
        return HusbandName;
    }

    /**
     * @param HusbandName the HusbandName to set
     */
    public void setHusbandName(String HusbandName) {
        this.HusbandName = HusbandName;
    }

    /**
     * @return the Dob
     */
    public String getDob() {
        return Dob;
    }

    /**
     * @param Dob the Dob to set
     */
    public void setDob(String Dob) {
        this.Dob = Dob;
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
     * @return the BirthCert
     */
    public String getBirthCert() {
        return BirthCert;
    }

    /**
     * @param BirthCert the BirthCert to set
     */
    public void setBirthCert(String BirthCert) {
        this.BirthCert = BirthCert;
    }

    /**
     * @return the sscCert
     */
    public String getSscCert() {
        return sscCert;
    }

    /**
     * @param sscCert the sscCert to set
     */
    public void setSscCert(String sscCert) {
        this.sscCert = sscCert;
    }

    /**
     * @return the hscCert
     */
    public String getHscCert() {
        return hscCert;
    }

    /**
     * @param hscCert the hscCert to set
     */
    public void setHscCert(String hscCert) {
        this.hscCert = hscCert;
    }

    /**
     * @return the marriageCert
     */
    public String getMarriageCert() {
        return marriageCert;
    }

    /**
     * @param marriageCert the marriageCert to set
     */
    public void setMarriageCert(String marriageCert) {
        this.marriageCert = marriageCert;
    }

    /**
     * @return the magisrateCharge
     */
    public String getMagisrateCharge() {
        return magisrateCharge;
    }

    /**
     * @param magisrateCharge the magisrateCharge to set
     */
    public void setMagisrateCharge(String magisrateCharge) {
        this.magisrateCharge = magisrateCharge;
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
     * @return the passprtValid
     */
    public String getPassprtValid() {
        return passprtValid;
    }

    /**
     * @param passprtValid the passprtValid to set
     */
    public void setPassprtValid(String passprtValid) {
        this.passprtValid = passprtValid;
    }

    /**
     * @return the drivngLicn
     */
    public String getDrivngLicn() {
        return drivngLicn;
    }

    /**
     * @param drivngLicn the drivngLicn to set
     */
    public void setDrivngLicn(String drivngLicn) {
        this.drivngLicn = drivngLicn;
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
     * @return the domicileCert
     */
    public String getDomicileCert() {
        return domicileCert;
    }

    /**
     * @param domicileCert the domicileCert to set
     */
    public void setDomicileCert(String domicileCert) {
        this.domicileCert = domicileCert;
    }

    /**
     * @return the adharCard1
     */
    public String getAdharCard1() {
        return adharCard1;
    }

    /**
     * @param adharCard1 the adharCard1 to set
     */
    public void setAdharCard1(String adharCard1) {
        this.adharCard1 = adharCard1;
    }

    /**
     * @return the voteId
     */
    public String getVoteId() {
        return voteId;
    }

    /**
     * @param voteId the voteId to set
     */
    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    /**
     * @return the passportValid
     */
    public String getPassportValid() {
        return passportValid;
    }

    /**
     * @param passportValid the passportValid to set
     */
    public void setPassportValid(String passportValid) {
        this.passportValid = passportValid;
    }

    /**
     * @return the drivingLicvalid
     */
    public String getDrivingLicvalid() {
        return drivingLicvalid;
    }

    /**
     * @param drivingLicvalid the drivingLicvalid to set
     */
    public void setDrivingLicvalid(String drivingLicvalid) {
        this.drivingLicvalid = drivingLicvalid;
    }

    /**
     * @return the bankPaPhoto
     */
    public String getBankPaPhoto() {
        return bankPaPhoto;
    }

    /**
     * @param bankPaPhoto the bankPaPhoto to set
     */
    public void setBankPaPhoto(String bankPaPhoto) {
        this.bankPaPhoto = bankPaPhoto;
    }

    /**
     * @return the corpeterLetter
     */
    public String getCorpeterLetter() {
        return corpeterLetter;
    }

    /**
     * @param corpeterLetter the corpeterLetter to set
     */
    public void setCorpeterLetter(String corpeterLetter) {
        this.corpeterLetter = corpeterLetter;
    }

    /**
     * @return the notory
     */
    public String getNotory() {
        return notory;
    }

    /**
     * @param notory the notory to set
     */
    public void setNotory(String notory) {
        this.notory = notory;
    }

    /**
     * @return the addProof
     */
    public String getAddProof() {
        return addProof;
    }

    /**
     * @param addProof the addProof to set
     */
    public void setAddProof(String addProof) {
        this.addProof = addProof;
    }

    /**
     * @return the domCert
     */
    public String getDomCert() {
        return domCert;
    }

    /**
     * @param domCert the domCert to set
     */
    public void setDomCert(String domCert) {
        this.domCert = domCert;
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

    
}
