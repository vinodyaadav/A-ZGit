/*
 * To change this license header private String  choose License Headers in Project Properties.
 * To change this template file private String  choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author RAKHI
 */
@Entity
@Table(name="salaryit")
public class salaryIt implements Serializable 
{

  /* public static List viewsalaryItDetailsMobileNo(String mobileNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List viewsalaryItDetailsFulName(String custName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    private int id;
    private String docType;
    private String itType;
    private String panNo ;
    private String custName ;
    private String surName ;
    private String dateOfBirth;
    private String contactNo;
    private String address ;
    private String itMakeValue ;
    private String textPaidArea;
    private String licPremPaid;
    private String medicalPrem;
    private String hraInterest;
    private String natureOfBuisness ;
    private String salaryRsMly;
    private String companyName ;
    private String post ;
    private String bnkAccNo;
    private String branch;
    private String ifscCode;
    private String micrCode ;
    private String additionalInfo1 ;
    private String additionalInfo2 ;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refAmt;
    private String submitDate;
    private String panCard ;
    private String aadharCard ;
    private String votingCard ;
    private String passportValid ;
    private String drivingLicn ;
    private String rationCard ;
    private String lightBill ;
    private String salaryItPaper ;
    private String canclCheq ;
    private String bankDetails ;
    private String investmentCopy ;
    private String loanEmi ;
    private String gumasta ;
    private String currentAcc ;
    private String investment ;
    private String Loan ;

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
     * @return the docType
     */
    public String getDocType() {
        return docType;
    }

    /**
     * @param docType fbrachthe docType to set
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * @return the itType
     */
    public String getItType() {
        return itType;
    }

    /**
     * @param itType the itType to set
     */
    public void setItType(String itType) {
        this.itType = itType;
    }

    /**
     * @return the panNo
     */
    public String getPanNo() {
        return panNo;
    }

    /**
     * @param panNo the panNo to set
     */
    public void setPanNo(String panNo) {
        this.panNo = panNo;
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
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
     * @return the itMakeValue
     */
    public String getItMakeValue() {
        return itMakeValue;
    }

    /**
     * @param itMakeValue the itMakeValue to set
     */
    public void setItMakeValue(String itMakeValue) {
        this.itMakeValue = itMakeValue;
    }

    /**
     * @return the textPaidArea
     */
    public String getTextPaidArea() {
        return textPaidArea;
    }

    /**
     * @param textPaidArea the textPaidArea to set
     */
    public void setTextPaidArea(String textPaidArea) {
        this.textPaidArea = textPaidArea;
    }

    /**
     * @return the licPremPaid
     */
    public String getLicPremPaid() {
        return licPremPaid;
    }

    /**
     * @param licPremPaid the licPremPaid to set
     */
    public void setLicPremPaid(String licPremPaid) {
        this.licPremPaid = licPremPaid;
    }

    /**
     * @return the medicalPrem
     */
    public String getMedicalPrem() {
        return medicalPrem;
    }

    /**
     * @param medicalPrem the medicalPrem to set
     */
    public void setMedicalPrem(String medicalPrem) {
        this.medicalPrem = medicalPrem;
    }

    /**
     * @return the hraInterest
     */
    public String getHraInterest() {
        return hraInterest;
    }

    /**
     * @param hraInterest the hraInterest to set
     */
    public void setHraInterest(String hraInterest) {
        this.hraInterest = hraInterest;
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
     * @return the salaryRsMly
     */
    public String getSalaryRsMly() {
        return salaryRsMly;
    }

    /**
     * @param salaryRsMly the salaryRsMly to set
     */
    public void setSalaryRsMly(String salaryRsMly) {
        this.salaryRsMly = salaryRsMly;
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
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the bnkAccNo
     */
    public String getBnkAccNo() {
        return bnkAccNo;
    }

    /**
     * @param bnkAccNo the bnkAccNo to set
     */
    public void setBnkAccNo(String bnkAccNo) {
        this.bnkAccNo = bnkAccNo;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the ifscCode
     */
    public String getIfscCode() {
        return ifscCode;
    }

    /**
     * @param ifscCode the ifscCode to set
     */
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    /**
     * @return the micrCode
     */
    public String getMicrCode() {
        return micrCode;
    }

    /**
     * @param micrCode the micrCode to set
     */
    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    /**
     * @return the additionalInfo1
     */
    public String getAdditionalInfo1() {
        return additionalInfo1;
    }

    /**
     * @param additionalInfo1 the additionalInfo1 to set
     */
    public void setAdditionalInfo1(String additionalInfo1) {
        this.additionalInfo1 = additionalInfo1;
    }

    /**
     * @return the additionalInfo2
     */
    public String getAdditionalInfo2() {
        return additionalInfo2;
    }

    /**
     * @param additionalInfo2 the additionalInfo2 to set
     */
    public void setAdditionalInfo2(String additionalInfo2) {
        this.additionalInfo2 = additionalInfo2;
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
     * @return the panCard
     */
    public String getPanCard() {
        return panCard;
    }

    /**
     * @param panCard the panCard to set
     */
    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    /**
     * @return the aadharCard
     */
    public String getAadharCard() {
        return aadharCard;
    }

    /**
     * @param aadharCard the aadharCard to set
     */
    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
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
     * @return the drivingLicn
     */
    public String getDrivingLicn() {
        return drivingLicn;
    }

    /**
     * @param drivingLicn the drivingLicn to set
     */
    public void setDrivingLicn(String drivingLicn) {
        this.drivingLicn = drivingLicn;
    }

    /**
     * @return the rationCard
     */
    public String getRationCard() {
        return rationCard;
    }

    /**
     * @param rationCard the rationCard to set
     */
    public void setRationCard(String rationCard) {
        this.rationCard = rationCard;
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
     * @return the salaryItPaper
     */
    public String getSalaryItPaper() {
        return salaryItPaper;
    }

    /**
     * @param salaryItPaper the salaryItPaper to set
     */
    public void setSalaryItPaper(String salaryItPaper) {
        this.salaryItPaper = salaryItPaper;
    }

    /**
     * @return the canclCheq
     */
    public String getCanclCheq() {
        return canclCheq;
    }

    /**
     * @param canclCheq the canclCheq to set
     */
    public void setCanclCheq(String canclCheq) {
        this.canclCheq = canclCheq;
    }

    /**
     * @return the bankDetails
     */
    public String getBankDetails() {
        return bankDetails;
    }

    /**
     * @param bankDetails the bankDetails to set
     */
    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    /**
     * @return the investmentCopy
     */
    public String getInvestmentCopy() {
        return investmentCopy;
    }

    /**
     * @param investmentCopy the investmentCopy to set
     */
    public void setInvestmentCopy(String investmentCopy) {
        this.investmentCopy = investmentCopy;
    }

    /**
     * @return the loanEmi
     */
    public String getLoanEmi() {
        return loanEmi;
    }

    /**
     * @param loanEmi the loanEmi to set
     */
    public void setLoanEmi(String loanEmi) {
        this.loanEmi = loanEmi;
    }

    /**
     * @return the gumasta
     */
    public String getGumasta() {
        return gumasta;
    }

    /**
     * @param gumasta the gumasta to set
     */
    public void setGumasta(String gumasta) {
        this.gumasta = gumasta;
    }

    /**
     * @return the currentAcc
     */
    public String getCurrentAcc() {
        return currentAcc;
    }

    /**
     * @param currentAcc the currentAcc to set
     */
    public void setCurrentAcc(String currentAcc) {
        this.currentAcc = currentAcc;
    }

    /**
     * @return the investment
     */
    public String getInvestment() {
        return investment;
    }

    /**
     * @param investment the investment to set
     */
    public void setInvestment(String investment) {
        this.investment = investment;
    }

    /**
     * @return the Loan
     */
    public String getLoan() {
        return Loan;
    }

    /**
     * @param Loan the Loan to set
     */
    public void setLoan(String Loan) {
        this.Loan = Loan;
    }
}