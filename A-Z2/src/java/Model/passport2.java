/*
 * To change this license header,String  choose License Headers in Project Properties.
 * To change this template file,String  choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author M-Services
 */

@Entity
@Table(name="passport")
public class passport2 implements Serializable
{
    @Id
    @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator",strategy="increment")
    
    private int id;
    private String docType;
    private String optionsRadios1 ;
    private String optionsRadios2 ;
    private String custsrnm ;
    private String custName ;
    private String custpsnm ;
    private String dob;
    private String optionsRadios3 ;
    private String optionsRadios4 ;
    private String pob ;
    private String tal;
    private String dist;
    private String ste ;

    private String quali;
    private String optionsRadios5;
    private String optionsRadios6;
    private String optionsRadios7;
    private String optionsRadios8;
    private String optionsRadios9;
    private String optionsRadios10;
    private String optionsRadios11;
    private String vblmrk;
    private String address;
    private String contactNo;
    private String email ;
    private String nmofp;
    private String dors;
    private String phno;
    private String whnm;
    private String fnm;
    private String mnm ;
    private String pvadd;
    private String pin;
    private String doi;
    private String poi;
    private String fno;
    private String doe;
    private String flnm1;
    private String add1;

    private String mob1;
    private String flnm2;
    private String add2;
    private String mob2;
    private String optionsRadios12;
    private String optionsRadios13;
    private String decidedAmt;
    private String date1;
    private String aamt;
    private String date2;
    private String balAmt;
    private String date3;
    private String amtPaid;
    private String date4;
    private String submitDate;
    private String birthCert;
    private String schoolCert ;
    private String ssc;
    private String hsc;
    private String ahem;
    private String gc;
    private String pc;
    private String vc;
    private String dl;
    private String ci;
    private String rc;
    private String lbo;
    private String sl;
    private String gbs;
    private String ac;
    private String vi;
    private String cl;
    private String gb;
    private String lp;
    private String iran;

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

    /**
     * @return the custsrnm
     */
    public String getCustsrnm() {
        return custsrnm;
    }

    /**
     * @param custsrnm the custsrnm to set
     */
    public void setCustsrnm(String custsrnm) {
        this.custsrnm = custsrnm;
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
     * @return the custpsnm
     */
    public String getCustpsnm() {
        return custpsnm;
    }

    /**
     * @param custpsnm the custpsnm to set
     */
    public void setCustpsnm(String custpsnm) {
        this.custpsnm = custpsnm;
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
     * @return the optionsRadios3
     */
    public String getOptionsRadios3() {
        return optionsRadios3;
    }

    /**
     * @param optionsRadios3 the optionsRadios3 to set
     */
    public void setOptionsRadios3(String optionsRadios3) {
        this.optionsRadios3 = optionsRadios3;
    }

    /**
     * @return the optionsRadios4
     */
    public String getOptionsRadios4() {
        return optionsRadios4;
    }

    /**
     * @param optionsRadios4 the optionsRadios4 to set
     */
    public void setOptionsRadios4(String optionsRadios4) {
        this.optionsRadios4 = optionsRadios4;
    }

    /**
     * @return the pob
     */
    public String getPob() {
        return pob;
    }

    /**
     * @param pob the pob to set
     */
    public void setPob(String pob) {
        this.pob = pob;
    }

    /**
     * @return the tal
     */
    public String getTal() {
        return tal;
    }

    /**
     * @param tal the tal to set
     */
    public void setTal(String tal) {
        this.tal = tal;
    }

    /**
     * @return the dist
     */
    public String getDist() {
        return dist;
    }

    /**
     * @param dist the dist to set
     */
    public void setDist(String dist) {
        this.dist = dist;
    }

    /**
     * @return the ste
     */
    public String getSte() {
        return ste;
    }

    /**
     * @param ste the ste to set
     */
    public void setSte(String ste) {
        this.ste = ste;
    }

    /**
     * @return the quali
     */
    public String getQuali() {
        return quali;
    }

    /**
     * @param quali the quali to set
     */
    public void setQuali(String quali) {
        this.quali = quali;
    }

    /**
     * @return the optionsRadios5
     */
    public String getOptionsRadios5() {
        return optionsRadios5;
    }

    /**
     * @param optionsRadios5 the optionsRadios5 to set
     */
    public void setOptionsRadios5(String optionsRadios5) {
        this.optionsRadios5 = optionsRadios5;
    }

    /**
     * @return the optionsRadios6
     */
    public String getOptionsRadios6() {
        return optionsRadios6;
    }

    /**
     * @param optionsRadios6 the optionsRadios6 to set
     */
    public void setOptionsRadios6(String optionsRadios6) {
        this.optionsRadios6 = optionsRadios6;
    }

    /**
     * @return the optionsRadios7
     */
    public String getOptionsRadios7() {
        return optionsRadios7;
    }

    /**
     * @param optionsRadios7 the optionsRadios7 to set
     */
    public void setOptionsRadios7(String optionsRadios7) {
        this.optionsRadios7 = optionsRadios7;
    }

    /**
     * @return the optionsRadios8
     */
    public String getOptionsRadios8() {
        return optionsRadios8;
    }

    /**
     * @param optionsRadios8 the optionsRadios8 to set
     */
    public void setOptionsRadios8(String optionsRadios8) {
        this.optionsRadios8 = optionsRadios8;
    }

    /**
     * @return the optionsRadios9
     */
    public String getOptionsRadios9() {
        return optionsRadios9;
    }

    /**
     * @param optionsRadios9 the optionsRadios9 to set
     */
    public void setOptionsRadios9(String optionsRadios9) {
        this.optionsRadios9 = optionsRadios9;
    }

    /**
     * @return the optionsRadios10
     */
    public String getOptionsRadios10() {
        return optionsRadios10;
    }

    /**
     * @param optionsRadios10 the optionsRadios10 to set
     */
    public void setOptionsRadios10(String optionsRadios10) {
        this.optionsRadios10 = optionsRadios10;
    }

    /**
     * @return the optionsRadios11
     */
    public String getOptionsRadios11() {
        return optionsRadios11;
    }

    /**
     * @param optionsRadios11 the optionsRadios11 to set
     */
    public void setOptionsRadios11(String optionsRadios11) {
        this.optionsRadios11 = optionsRadios11;
    }

    /**
     * @return the vblmrk
     */
    public String getVblmrk() {
        return vblmrk;
    }

    /**
     * @param vblmrk the vblmrk to set
     */
    public void setVblmrk(String vblmrk) {
        this.vblmrk = vblmrk;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nmofp
     */
    public String getNmofp() {
        return nmofp;
    }

    /**
     * @param nmofp the nmofp to set
     */
    public void setNmofp(String nmofp) {
        this.nmofp = nmofp;
    }

    /**
     * @return the dors
     */
    public String getDors() {
        return dors;
    }

    /**
     * @param dors the dors to set
     */
    public void setDors(String dors) {
        this.dors = dors;
    }

    /**
     * @return the phno
     */
    public String getPhno() {
        return phno;
    }

    /**
     * @param phno the phno to set
     */
    public void setPhno(String phno) {
        this.phno = phno;
    }

    /**
     * @return the whnm
     */
    public String getWhnm() {
        return whnm;
    }

    /**
     * @param whnm the whnm to set
     */
    public void setWhnm(String whnm) {
        this.whnm = whnm;
    }

    /**
     * @return the fnm
     */
    public String getFnm() {
        return fnm;
    }

    /**
     * @param fnm the fnm to set
     */
    public void setFnm(String fnm) {
        this.fnm = fnm;
    }

    /**
     * @return the mnm
     */
    public String getMnm() {
        return mnm;
    }

    /**
     * @param mnm the mnm to set
     */
    public void setMnm(String mnm) {
        this.mnm = mnm;
    }

    /**
     * @return the pvadd
     */
    public String getPvadd() {
        return pvadd;
    }

    /**
     * @param pvadd the pvadd to set
     */
    public void setPvadd(String pvadd) {
        this.pvadd = pvadd;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the doi
     */
    public String getDoi() {
        return doi;
    }

    /**
     * @param doi the doi to set
     */
    public void setDoi(String doi) {
        this.doi = doi;
    }

    /**
     * @return the poi
     */
    public String getPoi() {
        return poi;
    }

    /**
     * @param poi the poi to set
     */
    public void setPoi(String poi) {
        this.poi = poi;
    }

    /**
     * @return the fno
     */
    public String getFno() {
        return fno;
    }

    /**
     * @param fno the fno to set
     */
    public void setFno(String fno) {
        this.fno = fno;
    }

    /**
     * @return the doe
     */
    public String getDoe() {
        return doe;
    }

    /**
     * @param doe the doe to set
     */
    public void setDoe(String doe) {
        this.doe = doe;
    }

    /**
     * @return the flnm1
     */
    public String getFlnm1() {
        return flnm1;
    }

    /**
     * @param flnm1 the flnm1 to set
     */
    public void setFlnm1(String flnm1) {
        this.flnm1 = flnm1;
    }

    /**
     * @return the add1
     */
    public String getAdd1() {
        return add1;
    }

    /**
     * @param add1 the add1 to set
     */
    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    /**
     * @return the mob1
     */
    public String getMob1() {
        return mob1;
    }

    /**
     * @param mob1 the mob1 to set
     */
    public void setMob1(String mob1) {
        this.mob1 = mob1;
    }

    /**
     * @return the flnm2
     */
    public String getFlnm2() {
        return flnm2;
    }

    /**
     * @param flnm2 the flnm2 to set
     */
    public void setFlnm2(String flnm2) {
        this.flnm2 = flnm2;
    }

    /**
     * @return the add2
     */
    public String getAdd2() {
        return add2;
    }

    /**
     * @param add2 the add2 to set
     */
    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    /**
     * @return the mob2
     */
    public String getMob2() {
        return mob2;
    }

    /**
     * @param mob2 the mob2 to set
     */
    public void setMob2(String mob2) {
        this.mob2 = mob2;
    }

    /**
     * @return the optionsRadios12
     */
    public String getOptionsRadios12() {
        return optionsRadios12;
    }

    /**
     * @param optionsRadios12 the optionsRadios12 to set
     */
    public void setOptionsRadios12(String optionsRadios12) {
        this.optionsRadios12 = optionsRadios12;
    }

    /**
     * @return the optionsRadios13
     */
    public String getOptionsRadios13() {
        return optionsRadios13;
    }

    /**
     * @param optionsRadios13 the optionsRadios13 to set
     */
    public void setOptionsRadios13(String optionsRadios13) {
        this.optionsRadios13 = optionsRadios13;
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
     * @return the date1
     */
    public String getDate1() {
        return date1;
    }

    /**
     * @param date1 the date1 to set
     */
    public void setDate1(String date1) {
        this.date1 = date1;
    }

    /**
     * @return the aamt
     */
    public String getAamt() {
        return aamt;
    }

    /**
     * @param aamt the aamt to set
     */
    public void setAamt(String aamt) {
        this.aamt = aamt;
    }

    /**
     * @return the date2
     */
    public String getDate2() {
        return date2;
    }

    /**
     * @param date2 the date2 to set
     */
    public void setDate2(String date2) {
        this.date2 = date2;
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
     * @return the date3
     */
    public String getDate3() {
        return date3;
    }

    /**
     * @param date3 the date3 to set
     */
    public void setDate3(String date3) {
        this.date3 = date3;
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
     * @return the date4
     */
    public String getDate4() {
        return date4;
    }

    /**
     * @param date4 the date4 to set
     */
    public void setDate4(String date4) {
        this.date4 = date4;
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
     * @return the schoolCert
     */
    public String getSchoolCert() {
        return schoolCert;
    }

    /**
     * @param schoolCert the schoolCert to set
     */
    public void setSchoolCert(String schoolCert) {
        this.schoolCert = schoolCert;
    }

    /**
     * @return the ssc
     */
    public String getSsc() {
        return ssc;
    }

    /**
     * @param ssc the ssc to set
     */
    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    /**
     * @return the hsc
     */
    public String getHsc() {
        return hsc;
    }

    /**
     * @param hsc the hsc to set
     */
    public void setHsc(String hsc) {
        this.hsc = hsc;
    }

    /**
     * @return the ahem
     */
    public String getAhem() {
        return ahem;
    }

    /**
     * @param ahem the ahem to set
     */
    public void setAhem(String ahem) {
        this.ahem = ahem;
    }

    /**
     * @return the gc
     */
    public String getGc() {
        return gc;
    }

    /**
     * @param gc the gc to set
     */
    public void setGc(String gc) {
        this.gc = gc;
    }

    /**
     * @return the pc
     */
    public String getPc() {
        return pc;
    }

    /**
     * @param pc the pc to set
     */
    public void setPc(String pc) {
        this.pc = pc;
    }

    /**
     * @return the vc
     */
    public String getVc() {
        return vc;
    }

    /**
     * @param vc the vc to set
     */
    public void setVc(String vc) {
        this.vc = vc;
    }

    /**
     * @return the dl
     */
    public String getDl() {
        return dl;
    }

    /**
     * @param dl the dl to set
     */
    public void setDl(String dl) {
        this.dl = dl;
    }

    /**
     * @return the ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * @return the rc
     */
    public String getRc() {
        return rc;
    }

    /**
     * @param rc the rc to set
     */
    public void setRc(String rc) {
        this.rc = rc;
    }

    /**
     * @return the lbo
     */
    public String getLbo() {
        return lbo;
    }

    /**
     * @param lbo the lbo to set
     */
    public void setLbo(String lbo) {
        this.lbo = lbo;
    }

    /**
     * @return the sl
     */
    public String getSl() {
        return sl;
    }

    /**
     * @param sl the sl to set
     */
    public void setSl(String sl) {
        this.sl = sl;
    }

    /**
     * @return the gbs
     */
    public String getGbs() {
        return gbs;
    }

    /**
     * @param gbs the gbs to set
     */
    public void setGbs(String gbs) {
        this.gbs = gbs;
    }

    /**
     * @return the ac
     */
    public String getAc() {
        return ac;
    }

    /**
     * @param ac the ac to set
     */
    public void setAc(String ac) {
        this.ac = ac;
    }

    /**
     * @return the vi
     */
    public String getVi() {
        return vi;
    }

    /**
     * @param vi the vi to set
     */
    public void setVi(String vi) {
        this.vi = vi;
    }

    /**
     * @return the cl
     */
    public String getCl() {
        return cl;
    }

    /**
     * @param cl the cl to set
     */
    public void setCl(String cl) {
        this.cl = cl;
    }

    /**
     * @return the gb
     */
    public String getGb() {
        return gb;
    }

    /**
     * @param gb the gb to set
     */
    public void setGb(String gb) {
        this.gb = gb;
    }

    /**
     * @return the lp
     */
    public String getLp() {
        return lp;
    }

    /**
     * @param lp the lp to set
     */
    public void setLp(String lp) {
        this.lp = lp;
    }

    /**
     * @return the iran
     */
    public String getIran() {
        return iran;
    }

    /**
     * @param iran the iran to set
     */
    public void setIran(String iran) {
        this.iran = iran;
    }

  
    }

   
   