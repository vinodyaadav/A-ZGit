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
public class addGrantRenewal implements Serializable{


   
    private int grantrenewalid;
    private String submitDate;
    private String TheLicensingAuthority;
    private String MotorCyclewithoutgear;

    private String MotorCyclewithgear;
    private String InvalidCarriages;
    private String LightMotorVehicle;

    private String MediumMotorCycle;
    private String HeavygoodsVehicle;
    private String HeavyPassengerMotorVehicle;
    private String RoadRollers;
    private String MotorVehicleoffollowingdescription;
    private String custName;
    private String Son;
    private String address;
    private String TemporaryAddress;
    private String contactNo;

   
    
    private String datepicker;
    private String EducationalQualification;
    private String IdentificationMark;
    private String BloodGroupwithRHfactor;
 
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String refrencename;
    
    private String Iholdaneffectivedrivinglicencetodrive;
    private String Particulars;
    private String Particularsof;
    private String Haveyoubeen;
    private String IencloseMedical;
    private String issuedbythe;
    private String IencloseDriving;
    private String issuedby;

    /**
     * @return the grantrenewalid
     */
   
     @Id   
    @GenericGenerator(name="generator",strategy = "increment")
    @GeneratedValue(generator = "generator")
    public int getGrantrenewalid() {
        return grantrenewalid;
    }

    /**
     * @param grantrenewalid the grantrenewalid to set
     */
    public void setGrantrenewalid(int grantrenewalid) {
        this.grantrenewalid = grantrenewalid;
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
     * @return the TheLicensingAuthority
     */
    public String getTheLicensingAuthority() {
        return TheLicensingAuthority;
    }

    /**
     * @param TheLicensingAuthority the TheLicensingAuthority to set
     */
    public void setTheLicensingAuthority(String TheLicensingAuthority) {
        this.TheLicensingAuthority = TheLicensingAuthority;
    }

    /**
     * @return the MotorCyclewithoutgear
     */
    public String getMotorCyclewithoutgear() {
        return MotorCyclewithoutgear;
    }

    /**
     * @param MotorCyclewithoutgear the MotorCyclewithoutgear to set
     */
    public void setMotorCyclewithoutgear(String MotorCyclewithoutgear) {
        this.MotorCyclewithoutgear = MotorCyclewithoutgear;
    }

    /**
     * @return the MotorCyclewithgear
     */
    public String getMotorCyclewithgear() {
        return MotorCyclewithgear;
    }

    /**
     * @param MotorCyclewithgear the MotorCyclewithgear to set
     */
    public void setMotorCyclewithgear(String MotorCyclewithgear) {
        this.MotorCyclewithgear = MotorCyclewithgear;
    }

    /**
     * @return the InvalidCarriages
     */
    public String getInvalidCarriages() {
        return InvalidCarriages;
    }

    /**
     * @param InvalidCarriages the InvalidCarriages to set
     */
    public void setInvalidCarriages(String InvalidCarriages) {
        this.InvalidCarriages = InvalidCarriages;
    }

    /**
     * @return the LightMotorVehicle
     */
    public String getLightMotorVehicle() {
        return LightMotorVehicle;
    }

    /**
     * @param LightMotorVehicle the LightMotorVehicle to set
     */
    public void setLightMotorVehicle(String LightMotorVehicle) {
        this.LightMotorVehicle = LightMotorVehicle;
    }

    /**
     * @return the MediumMotorCycle
     */
    public String getMediumMotorCycle() {
        return MediumMotorCycle;
    }

    /**
     * @param MediumMotorCycle the MediumMotorCycle to set
     */
    public void setMediumMotorCycle(String MediumMotorCycle) {
        this.MediumMotorCycle = MediumMotorCycle;
    }

    /**
     * @return the HeavygoodsVehicle
     */
    public String getHeavygoodsVehicle() {
        return HeavygoodsVehicle;
    }

    /**
     * @param HeavygoodsVehicle the HeavygoodsVehicle to set
     */
    public void setHeavygoodsVehicle(String HeavygoodsVehicle) {
        this.HeavygoodsVehicle = HeavygoodsVehicle;
    }

    /**
     * @return the HeavyPassengerMotorVehicle
     */
    public String getHeavyPassengerMotorVehicle() {
        return HeavyPassengerMotorVehicle;
    }

    /**
     * @param HeavyPassengerMotorVehicle the HeavyPassengerMotorVehicle to set
     */
    public void setHeavyPassengerMotorVehicle(String HeavyPassengerMotorVehicle) {
        this.HeavyPassengerMotorVehicle = HeavyPassengerMotorVehicle;
    }

    /**
     * @return the RoadRollers
     */
    public String getRoadRollers() {
        return RoadRollers;
    }

    /**
     * @param RoadRollers the RoadRollers to set
     */
    public void setRoadRollers(String RoadRollers) {
        this.RoadRollers = RoadRollers;
    }

    /**
     * @return the MotorVehicleoffollowingdescription
     */
    public String getMotorVehicleoffollowingdescription() {
        return MotorVehicleoffollowingdescription;
    }

    /**
     * @param MotorVehicleoffollowingdescription the MotorVehicleoffollowingdescription to set
     */
    public void setMotorVehicleoffollowingdescription(String MotorVehicleoffollowingdescription) {
        this.MotorVehicleoffollowingdescription = MotorVehicleoffollowingdescription;
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
     * @return the Son
     */
    public String getSon() {
        return Son;
    }

    /**
     * @param Son the Son to set
     */
    public void setSon(String Son) {
        this.Son = Son;
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
     * @return the TemporaryAddress
     */
    public String getTemporaryAddress() {
        return TemporaryAddress;
    }

    /**
     * @param TemporaryAddress the TemporaryAddress to set
     */
    public void setTemporaryAddress(String TemporaryAddress) {
        this.TemporaryAddress = TemporaryAddress;
    }

    /**
     * @return the datepicker
     */
    public String getDatepicker() {
        return datepicker;
    }

    /**
     * @param datepicker the datepicker to set
     */
    public void setDatepicker(String datepicker) {
        this.datepicker = datepicker;
    }

    /**
     * @return the EducationalQualification
     */
    public String getEducationalQualification() {
        return EducationalQualification;
    }

    /**
     * @param EducationalQualification the EducationalQualification to set
     */
    public void setEducationalQualification(String EducationalQualification) {
        this.EducationalQualification = EducationalQualification;
    }

    /**
     * @return the IdentificationMark
     */
    public String getIdentificationMark() {
        return IdentificationMark;
    }

    /**
     * @param IdentificationMark the IdentificationMark to set
     */
    public void setIdentificationMark(String IdentificationMark) {
        this.IdentificationMark = IdentificationMark;
    }

    /**
     * @return the BloodGroupwithRHfactor
     */
    public String getBloodGroupwithRHfactor() {
        return BloodGroupwithRHfactor;
    }

    /**
     * @param BloodGroupwithRHfactor the BloodGroupwithRHfactor to set
     */
    public void setBloodGroupwithRHfactor(String BloodGroupwithRHfactor) {
        this.BloodGroupwithRHfactor = BloodGroupwithRHfactor;
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
     * @return the refrencename
     */
    public String getRefrencename() {
        return refrencename;
    }

    /**
     * @param refrencename the refrencename to set
     */
    public void setRefrencename(String refrencename) {
        this.refrencename = refrencename;
    }

    /**
     * @return the Iholdaneffectivedrivinglicencetodrive
     */
    public String getIholdaneffectivedrivinglicencetodrive() {
        return Iholdaneffectivedrivinglicencetodrive;
    }

    /**
     * @param Iholdaneffectivedrivinglicencetodrive the Iholdaneffectivedrivinglicencetodrive to set
     */
    public void setIholdaneffectivedrivinglicencetodrive(String Iholdaneffectivedrivinglicencetodrive) {
        this.Iholdaneffectivedrivinglicencetodrive = Iholdaneffectivedrivinglicencetodrive;
    }

    /**
     * @return the Particulars
     */
    public String getParticulars() {
        return Particulars;
    }

    /**
     * @param Particulars the Particulars to set
     */
    public void setParticulars(String Particulars) {
        this.Particulars = Particulars;
    }

    /**
     * @return the Particularsof
     */
    public String getParticularsof() {
        return Particularsof;
    }

    /**
     * @param Particularsof the Particularsof to set
     */
    public void setParticularsof(String Particularsof) {
        this.Particularsof = Particularsof;
    }

    /**
     * @return the Haveyoubeen
     */
    public String getHaveyoubeen() {
        return Haveyoubeen;
    }

    /**
     * @param Haveyoubeen the Haveyoubeen to set
     */
    public void setHaveyoubeen(String Haveyoubeen) {
        this.Haveyoubeen = Haveyoubeen;
    }

    /**
     * @return the IencloseMedical
     */
    public String getIencloseMedical() {
        return IencloseMedical;
    }

    /**
     * @param IencloseMedical the IencloseMedical to set
     */
    public void setIencloseMedical(String IencloseMedical) {
        this.IencloseMedical = IencloseMedical;
    }

    /**
     * @return the issuedbythe
     */
    public String getIssuedbythe() {
        return issuedbythe;
    }

    /**
     * @param issuedbythe the issuedbythe to set
     */
    public void setIssuedbythe(String issuedbythe) {
        this.issuedbythe = issuedbythe;
    }

    /**
     * @return the IencloseDriving
     */
    public String getIencloseDriving() {
        return IencloseDriving;
    }

    /**
     * @param IencloseDriving the IencloseDriving to set
     */
    public void setIencloseDriving(String IencloseDriving) {
        this.IencloseDriving = IencloseDriving;
    }

    /**
     * @return the issuedby
     */
    public String getIssuedby() {
        return issuedby;
    }

    /**
     * @param issuedby the issuedby to set
     */
    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
    }
   public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
   
    
}