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
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author Mservices Demo
 */
@Entity
public class otherwork implements Serializable{
    
    @Id   
    @GenericGenerator(name="generator",strategy = "increment")
    @GeneratedValue(generator = "generator")
    private int otherworkid;
    private String FormType;
    private String submitDate;
    private String WorkName;
    private String custName;
    private String contactNo;
    private String dob;
    private String address;
    private String NOTESOFREMARK;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String REFRENCENAME;
    private String isPANCARD;
    private String isPASSPORTVALID;
    private String isDRIVLICNVALID;
    private String isVOTINGID;
    private String isAADHARCARD;
    private String isRATIONCARD;
    private String isLIGHTBILL;
    private String isAADHARCARD1;
    private String isSOCIETYRESILETTER;
    private String isGOVTBANKPASSBOOK;
    private String isLICPOLICY;
    private String isRENETDAGREEMENT;
    private String OTHERWORK;

    /**
     * @return the otherworkid
     */
    public int getOtherworkid() {
        return otherworkid;
    }

    /**
     * @param otherworkid the otherworkid to set
     */
    public void setOtherworkid(int otherworkid) {
        this.otherworkid = otherworkid;
    }

    /**
     * @return the FormType
     */
    public String getFormType() {
        return FormType;
    }

    /**
     * @param FormType the FormType to set
     */
    public void setFormType(String FormType) {
        this.FormType = FormType;
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
     * @return the WorkName
     */
    public String getWorkName() {
        return WorkName;
    }

    /**
     * @param WorkName the WorkName to set
     */
    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
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
     * @return the NOTESOFREMARK
     */
    public String getNOTESOFREMARK() {
        return NOTESOFREMARK;
    }

    /**
     * @param NOTESOFREMARK the NOTESOFREMARK to set
     */
    public void setNOTESOFREMARK(String NOTESOFREMARK) {
        this.NOTESOFREMARK = NOTESOFREMARK;
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
     * @return the REFRENCENAME
     */
    public String getREFRENCENAME() {
        return REFRENCENAME;
    }

    /**
     * @param REFRENCENAME the REFRENCENAME to set
     */
    public void setREFRENCENAME(String REFRENCENAME) {
        this.REFRENCENAME = REFRENCENAME;
    }

    /**
     * @return the isPANCARD
     */
    public String getIsPANCARD() {
        return isPANCARD;
    }

    /**
     * @param isPANCARD the isPANCARD to set
     */
    public void setIsPANCARD(String isPANCARD) {
        this.isPANCARD = isPANCARD;
    }

    /**
     * @return the isPASSPORTVALID
     */
    public String getIsPASSPORTVALID() {
        return isPASSPORTVALID;
    }

    /**
     * @param isPASSPORTVALID the isPASSPORTVALID to set
     */
    public void setIsPASSPORTVALID(String isPASSPORTVALID) {
        this.isPASSPORTVALID = isPASSPORTVALID;
    }

    /**
     * @return the isDRIVLICNVALID
     */
    public String getIsDRIVLICNVALID() {
        return isDRIVLICNVALID;
    }

    /**
     * @param isDRIVLICNVALID the isDRIVLICNVALID to set
     */
    public void setIsDRIVLICNVALID(String isDRIVLICNVALID) {
        this.isDRIVLICNVALID = isDRIVLICNVALID;
    }

    /**
     * @return the isVOTINGID
     */
    public String getIsVOTINGID() {
        return isVOTINGID;
    }

    /**
     * @param isVOTINGID the isVOTINGID to set
     */
    public void setIsVOTINGID(String isVOTINGID) {
        this.isVOTINGID = isVOTINGID;
    }

    /**
     * @return the isAADHARCARD
     */
    public String getIsAADHARCARD() {
        return isAADHARCARD;
    }

    /**
     * @param isAADHARCARD the isAADHARCARD to set
     */
    public void setIsAADHARCARD(String isAADHARCARD) {
        this.isAADHARCARD = isAADHARCARD;
    }

    /**
     * @return the isRATIONCARD
     */
    public String getIsRATIONCARD() {
        return isRATIONCARD;
    }

    /**
     * @param isRATIONCARD the isRATIONCARD to set
     */
    public void setIsRATIONCARD(String isRATIONCARD) {
        this.isRATIONCARD = isRATIONCARD;
    }

    /**
     * @return the isLIGHTBILL
     */
    public String getIsLIGHTBILL() {
        return isLIGHTBILL;
    }

    /**
     * @param isLIGHTBILL the isLIGHTBILL to set
     */
    public void setIsLIGHTBILL(String isLIGHTBILL) {
        this.isLIGHTBILL = isLIGHTBILL;
    }

    /**
     * @return the isAADHARCARD1
     */
    public String getIsAADHARCARD1() {
        return isAADHARCARD1;
    }

    /**
     * @param isAADHARCARD1 the isAADHARCARD1 to set
     */
    public void setIsAADHARCARD1(String isAADHARCARD1) {
        this.isAADHARCARD1 = isAADHARCARD1;
    }

    /**
     * @return the isSOCIETYRESILETTER
     */
    public String getIsSOCIETYRESILETTER() {
        return isSOCIETYRESILETTER;
    }

    /**
     * @param isSOCIETYRESILETTER the isSOCIETYRESILETTER to set
     */
    public void setIsSOCIETYRESILETTER(String isSOCIETYRESILETTER) {
        this.isSOCIETYRESILETTER = isSOCIETYRESILETTER;
    }

    /**
     * @return the isGOVTBANKPASSBOOK
     */
    public String getIsGOVTBANKPASSBOOK() {
        return isGOVTBANKPASSBOOK;
    }

    /**
     * @param isGOVTBANKPASSBOOK the isGOVTBANKPASSBOOK to set
     */
    public void setIsGOVTBANKPASSBOOK(String isGOVTBANKPASSBOOK) {
        this.isGOVTBANKPASSBOOK = isGOVTBANKPASSBOOK;
    }

    /**
     * @return the isLICPOLICY
     */
    public String getIsLICPOLICY() {
        return isLICPOLICY;
    }

    /**
     * @param isLICPOLICY the isLICPOLICY to set
     */
    public void setIsLICPOLICY(String isLICPOLICY) {
        this.isLICPOLICY = isLICPOLICY;
    }

    /**
     * @return the isRENETDAGREEMENT
     */
    public String getIsRENETDAGREEMENT() {
        return isRENETDAGREEMENT;
    }

    /**
     * @param isRENETDAGREEMENT the isRENETDAGREEMENT to set
     */
    public void setIsRENETDAGREEMENT(String isRENETDAGREEMENT) {
        this.isRENETDAGREEMENT = isRENETDAGREEMENT;
    }

    /**
     * @return the OTHERWORK
     */
    public String getOTHERWORK() {
        return OTHERWORK;
    }

    /**
     * @param OTHERWORK the OTHERWORK to set
     */
    public void setOTHERWORK(String OTHERWORK) {
        this.OTHERWORK = OTHERWORK;
    }

    
    
}