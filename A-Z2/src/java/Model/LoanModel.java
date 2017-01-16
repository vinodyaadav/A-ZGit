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
@Table(name="loanModel")

public class LoanModel {
    private int licenceid;
    private String docType;
    private String Loan;
    private String amt;
    private String pann;
     private String contactNo;
    private String custName;
    private String Dob1;
    private String add3;
    private String buss;
    private String sal2;
    private String com;
    private String post1;
    private String exp;
    private String qual;
    private String rem;
    private String info;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refName;
    private String submitDate;
    private String card;
    private String voti;
    private String valid;
    private String lice;
    private String card2;
    private String card1;
    private String votin;
    private String rat;
    private String bill;
    private String resi;
    private String govt;
    private String lic;
    private String notes;
    private String form1;
    private String file;
    private String bank;
    private String invest;
    private String pay;
    private String exist;
    private String bussi;
    private String curr;
    private String proper;

    
    
    
   @Id
    @GenericGenerator(name="generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    /**
     * @return the licenceid
     */
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

    /**
     * @return the amt
     */
    public String getAmt() {
        return amt;
    }

    /**
     * @param amt the amt to set
     */
    public void setAmt(String amt) {
        this.amt = amt;
    }

    /**
     * @return the pann
     */
    public String getPann() {
        return pann;
    }

    /**
     * @param pann the pann to set
     */
    public void setPann(String pann) {
        this.pann = pann;
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
     * @return the Dob1
     */
    public String getDob1() {
        return Dob1;
    }

    /**
     * @param Dob1 the Dob1 to set
     */
    public void setDob1(String Dob1) {
        this.Dob1 = Dob1;
    }

    /**
     * @return the add3
     */
    public String getAdd3() {
        return add3;
    }

    /**
     * @param add3 the add3 to set
     */
    public void setAdd3(String add3) {
        this.add3 = add3;
    }

    /**
     * @return the buss
     */
    public String getBuss() {
        return buss;
    }

    /**
     * @param buss the buss to set
     */
    public void setBuss(String buss) {
        this.buss = buss;
    }

    /**
     * @return the sal2
     */
    public String getSal2() {
        return sal2;
    }

    /**
     * @param sal2 the sal2 to set
     */
    public void setSal2(String sal2) {
        this.sal2 = sal2;
    }

    /**
     * @return the com
     */
    public String getCom() {
        return com;
    }

    /**
     * @param com the com to set
     */
    public void setCom(String com) {
        this.com = com;
    }

    /**
     * @return the post1
     */
    public String getPost1() {
        return post1;
    }

    /**
     * @param post1 the post1 to set
     */
    public void setPost1(String post1) {
        this.post1 = post1;
    }

    /**
     * @return the exp
     */
    public String getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(String exp) {
        this.exp = exp;
    }

    /**
     * @return the qual
     */
    public String getQual() {
        return qual;
    }

    /**
     * @param qual the qual to set
     */
    public void setQual(String qual) {
        this.qual = qual;
    }

    /**
     * @return the rem
     */
    public String getRem() {
        return rem;
    }

    /**
     * @param rem the rem to set
     */
    public void setRem(String rem) {
        this.rem = rem;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
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
     * @return the card
     */
    public String getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * @return the voti
     */
    public String getVoti() {
        return voti;
    }

    /**
     * @param voti the voti to set
     */
    public void setVoti(String voti) {
        this.voti = voti;
    }

    /**
     * @return the valid
     */
    public String getValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * @return the lice
     */
    public String getLice() {
        return lice;
    }

    /**
     * @param lice the lice to set
     */
    public void setLice(String lice) {
        this.lice = lice;
    }

    /**
     * @return the card2
     */
    public String getCard2() {
        return card2;
    }

    /**
     * @param card2 the card2 to set
     */
    public void setCard2(String card2) {
        this.card2 = card2;
    }

    /**
     * @return the card1
     */
    public String getCard1() {
        return card1;
    }

    /**
     * @param card1 the card1 to set
     */
    public void setCard1(String card1) {
        this.card1 = card1;
    }

    /**
     * @return the votin
     */
    public String getVotin() {
        return votin;
    }

    /**
     * @param votin the votin to set
     */
    public void setVotin(String votin) {
        this.votin = votin;
    }

    /**
     * @return the rat
     */
    public String getRat() {
        return rat;
    }

    /**
     * @param rat the rat to set
     */
    public void setRat(String rat) {
        this.rat = rat;
    }

    /**
     * @return the bill
     */
    public String getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(String bill) {
        this.bill = bill;
    }

    /**
     * @return the resi
     */
    public String getResi() {
        return resi;
    }

    /**
     * @param resi the resi to set
     */
    public void setResi(String resi) {
        this.resi = resi;
    }

    /**
     * @return the govt
     */
    public String getGovt() {
        return govt;
    }

    /**
     * @param govt the govt to set
     */
    public void setGovt(String govt) {
        this.govt = govt;
    }

    /**
     * @return the lic
     */
    public String getLic() {
        return lic;
    }

    /**
     * @param lic the lic to set
     */
    public void setLic(String lic) {
        this.lic = lic;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the form1
     */
    public String getForm1() {
        return form1;
    }

    /**
     * @param form1 the form1 to set
     */
    public void setForm1(String form1) {
        this.form1 = form1;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * @return the invest
     */
    public String getInvest() {
        return invest;
    }

    /**
     * @param invest the invest to set
     */
    public void setInvest(String invest) {
        this.invest = invest;
    }

    /**
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * @return the exist
     */
    public String getExist() {
        return exist;
    }

    /**
     * @param exist the exist to set
     */
    public void setExist(String exist) {
        this.exist = exist;
    }

    /**
     * @return the bussi
     */
    public String getBussi() {
        return bussi;
    }

    /**
     * @param bussi the bussi to set
     */
    public void setBussi(String bussi) {
        this.bussi = bussi;
    }

    /**
     * @return the curr
     */
    public String getCurr() {
        return curr;
    }

    /**
     * @param curr the curr to set
     */
    public void setCurr(String curr) {
        this.curr = curr;
    }

    /**
     * @return the proper
     */
    public String getProper() {
        return proper;
    }

    /**
     * @param proper the proper to set
     */
    public void setProper(String proper) {
        this.proper = proper;
    }

    

   

    
    
    
}
