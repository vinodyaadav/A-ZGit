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
public class RationCard implements Serializable {

    @Id
    @GeneratedValue
    private int rationId;

    public int getRationId() {
        return rationId;
    }

    public void setRationId(int rationId) {
        this.rationId = rationId;
    }
    private String docType;
    private String UpadationChange;
    private String custName;
    private String Dob;
    private String address;
    private String contactNo;
    private String natureBusiness;
    private String ylyAmt;
    private String gasName;
    private String gasGiverName;
    private String memFirstName1;
    private String memFirstName2;
    private String secMemName1;
    private String secMemName2;
    private String ThirdMemName1;
    private String ThirdMemName2;
    private String fourthMemName1;
    private String fourthMemName2;
    private String fifthMemName1;
    private String fifthMemName2;
    private String Pancard;
    private String votingId;
    private String passportValid;
    private String DrivingLicn;
    private String adharCard;
    private String lightBill;
    private String adharCard1;
    private String voteId;
    private String socResiLet;
    private String rentedNotary;
    private String ownrLightBillNoc;
    private String form16lstThreeyrs;
    private String ItFile;
    private String gasBook;
    private String talathiCert;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String Remarknote;
    private String submitDate;

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
     * @return the UpadationChange
     */
    public String getUpadationChange() {
        return UpadationChange;
    }

    /**
     * @param UpadationChange the UpadationChange to set
     */
    public void setUpadationChange(String UpadationChange) {
        this.UpadationChange = UpadationChange;
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
     * @return the natureBusiness
     */
    public String getNatureBusiness() {
        return natureBusiness;
    }

    /**
     * @param natureBusiness the natureBusiness to set
     */
    public void setNatureBusiness(String natureBusiness) {
        this.natureBusiness = natureBusiness;
    }

    /**
     * @return the ylyAmt
     */
    public String getYlyAmt() {
        return ylyAmt;
    }

    /**
     * @param ylyAmt the ylyAmt to set
     */
    public void setYlyAmt(String ylyAmt) {
        this.ylyAmt = ylyAmt;
    }

    /**
     * @return the gasName
     */
    public String getGasName() {
        return gasName;
    }

    /**
     * @param gasName the gasName to set
     */
    public void setGasName(String gasName) {
        this.gasName = gasName;
    }

    /**
     * @return the gasGiverName
     */
    public String getGasGiverName() {
        return gasGiverName;
    }

    /**
     * @param gasGiverName the gasGiverName to set
     */
    public void setGasGiverName(String gasGiverName) {
        this.gasGiverName = gasGiverName;
    }

    /**
     * @return the memFirstName1
     */
    public String getMemFirstName1() {
        return memFirstName1;
    }

    /**
     * @param memFirstName1 the memFirstName1 to set
     */
    public void setMemFirstName1(String memFirstName1) {
        this.memFirstName1 = memFirstName1;
    }

    /**
     * @return the memFirstName2
     */
    public String getMemFirstName2() {
        return memFirstName2;
    }

    /**
     * @param memFirstName2 the memFirstName2 to set
     */
    public void setMemFirstName2(String memFirstName2) {
        this.memFirstName2 = memFirstName2;
    }

    /**
     * @return the secMemName1
     */
    public String getSecMemName1() {
        return secMemName1;
    }

    /**
     * @param secMemName1 the secMemName1 to set
     */
    public void setSecMemName1(String secMemName1) {
        this.secMemName1 = secMemName1;
    }

    /**
     * @return the secMemName2
     */
    public String getSecMemName2() {
        return secMemName2;
    }

    /**
     * @param secMemName2 the secMemName2 to set
     */
    public void setSecMemName2(String secMemName2) {
        this.secMemName2 = secMemName2;
    }

    /**
     * @return the ThirdMemName1
     */
    public String getThirdMemName1() {
        return ThirdMemName1;
    }

    /**
     * @param ThirdMemName1 the ThirdMemName1 to set
     */
    public void setThirdMemName1(String ThirdMemName1) {
        this.ThirdMemName1 = ThirdMemName1;
    }

    /**
     * @return the ThirdMemName2
     */
    public String getThirdMemName2() {
        return ThirdMemName2;
    }

    /**
     * @param ThirdMemName2 the ThirdMemName2 to set
     */
    public void setThirdMemName2(String ThirdMemName2) {
        this.ThirdMemName2 = ThirdMemName2;
    }

    /**
     * @return the fourthMemName1
     */
    public String getFourthMemName1() {
        return fourthMemName1;
    }

    /**
     * @param fourthMemName1 the fourthMemName1 to set
     */
    public void setFourthMemName1(String fourthMemName1) {
        this.fourthMemName1 = fourthMemName1;
    }

    /**
     * @return the fourthMemName2
     */
    public String getFourthMemName2() {
        return fourthMemName2;
    }

    /**
     * @param fourthMemName2 the fourthMemName2 to set
     */
    public void setFourthMemName2(String fourthMemName2) {
        this.fourthMemName2 = fourthMemName2;
    }

    /**
     * @return the fifthMemName1
     */
    public String getFifthMemName1() {
        return fifthMemName1;
    }

    /**
     * @param fifthMemName1 the fifthMemName1 to set
     */
    public void setFifthMemName1(String fifthMemName1) {
        this.fifthMemName1 = fifthMemName1;
    }

    /**
     * @return the fifthMemName2
     */
    public String getFifthMemName2() {
        return fifthMemName2;
    }

    /**
     * @param fifthMemName2 the fifthMemName2 to set
     */
    public void setFifthMemName2(String fifthMemName2) {
        this.fifthMemName2 = fifthMemName2;
    }

    /**
     * @return the Pancard
     */
    public String getPancard() {
        return Pancard;
    }

    /**
     * @param Pancard the Pancard to set
     */
    public void setPancard(String Pancard) {
        this.Pancard = Pancard;
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
     * @return the DrivingLicn
     */
    public String getDrivingLicn() {
        return DrivingLicn;
    }

    /**
     * @param DrivingLicn the DrivingLicn to set
     */
    public void setDrivingLicn(String DrivingLicn) {
        this.DrivingLicn = DrivingLicn;
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
     * @return the socResiLet
     */
    public String getSocResiLet() {
        return socResiLet;
    }

    /**
     * @param socResiLet the socResiLet to set
     */
    public void setSocResiLet(String socResiLet) {
        this.socResiLet = socResiLet;
    }

    /**
     * @return the rentedNotary
     */
    public String getRentedNotary() {
        return rentedNotary;
    }

    /**
     * @param rentedNotary the rentedNotary to set
     */
    public void setRentedNotary(String rentedNotary) {
        this.rentedNotary = rentedNotary;
    }

    /**
     * @return the ownrLightBillNoc
     */
    public String getOwnrLightBillNoc() {
        return ownrLightBillNoc;
    }

    /**
     * @param ownrLightBillNoc the ownrLightBillNoc to set
     */
    public void setOwnrLightBillNoc(String ownrLightBillNoc) {
        this.ownrLightBillNoc = ownrLightBillNoc;
    }

    /**
     * @return the form16lstThreeyrs
     */
    public String getForm16lstThreeyrs() {
        return form16lstThreeyrs;
    }

    /**
     * @param form16lstThreeyrs the form16lstThreeyrs to set
     */
    public void setForm16lstThreeyrs(String form16lstThreeyrs) {
        this.form16lstThreeyrs = form16lstThreeyrs;
    }

    /**
     * @return the ItFile
     */
    public String getItFile() {
        return ItFile;
    }

    /**
     * @param ItFile the ItFile to set
     */
    public void setItFile(String ItFile) {
        this.ItFile = ItFile;
    }

    /**
     * @return the gasBook
     */
    public String getGasBook() {
        return gasBook;
    }

    /**
     * @param gasBook the gasBook to set
     */
    public void setGasBook(String gasBook) {
        this.gasBook = gasBook;
    }

    /**
     * @return the talathiCert
     */
    public String getTalathiCert() {
        return talathiCert;
    }

    /**
     * @param talathiCert the talathiCert to set
     */
    public void setTalathiCert(String talathiCert) {
        this.talathiCert = talathiCert;
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
