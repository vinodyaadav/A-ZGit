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
 * @author Mservices Demo
 */
@Entity
public class lic implements Serializable{
@Id
@GeneratedValue
private int licid;
private String docType;
private String submitDate;
private String custName;
    private String contactNo;
    private String isfn;
    private String isimhn;
    private String isdob;
    private String isaddress;
    private String isst;
    private String ispt;
    private String isvm;
    private String isnone;
    private String isht;
    private String iswt;
    private String isidm;
    private String isjod;
    private String isban;
    private String isbran;
    private String isifsc;
    private String isbankacc;
    private String isopno;
    private String isopno2;
    private String isocmpnm;
    private String isqyfmm;
    private String isfrae;
    private String ismrae;
    private String isbrae;
    private String issrae;
    private String ishwae;
    private String iscdae;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String isrene;
    private String brcr;
    private String sclvc;
    private String thbc;
    private String gc;
    private String ahecy;
    private String frif;
    private String sysp;
    private String adcd;
    private String pacr;
    private String drliva;
    private String vgid;
    private String pssprt;
    private String cdid;
    private String rncd;
    private String ltbl;
    private String arca;
    private String voigid;
    private String passp;
    private String bpass;
    private String irano;

    /**
     * @return the licid
     */
    public int getLicid() {
        return licid;
    }

    /**
     * @param licid the licid to set
     */
    public void setLicid(int licid) {
        this.licid = licid;
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
     * @return the isfn
     */
    public String getIsfn() {
        return isfn;
    }

    /**
     * @param isfn the isfn to set
     */
    public void setIsfn(String isfn) {
        this.isfn = isfn;
    }

    /**
     * @return the isimhn
     */
    public String getIsimhn() {
        return isimhn;
    }

    /**
     * @param isimhn the isimhn to set
     */
    public void setIsimhn(String isimhn) {
        this.isimhn = isimhn;
    }

    /**
     * @return the isdob
     */
    public String getIsdob() {
        return isdob;
    }

    /**
     * @param isdob the isdob to set
     */
    public void setIsdob(String isdob) {
        this.isdob = isdob;
    }

    /**
     * @return the isaddress
     */
    public String getIsaddress() {
        return isaddress;
    }

    /**
     * @param isaddress the isaddress to set
     */
    public void setIsaddress(String isaddress) {
        this.isaddress = isaddress;
    }

    /**
     * @return the isst
     */
    public String getIsst() {
        return isst;
    }

    /**
     * @param isst the isst to set
     */
    public void setIsst(String isst) {
        this.isst = isst;
    }

    /**
     * @return the ispt
     */
    public String getIspt() {
        return ispt;
    }

    /**
     * @param ispt the ispt to set
     */
    public void setIspt(String ispt) {
        this.ispt = ispt;
    }

    /**
     * @return the isvm
     */
    public String getIsvm() {
        return isvm;
    }

    /**
     * @param isvm the isvm to set
     */
    public void setIsvm(String isvm) {
        this.isvm = isvm;
    }

    /**
     * @return the isnone
     */
    public String getIsnone() {
        return isnone;
    }

    /**
     * @param isnone the isnone to set
     */
    public void setIsnone(String isnone) {
        this.isnone = isnone;
    }

    /**
     * @return the isht
     */
    public String getIsht() {
        return isht;
    }

    /**
     * @param isht the isht to set
     */
    public void setIsht(String isht) {
        this.isht = isht;
    }

    /**
     * @return the iswt
     */
    public String getIswt() {
        return iswt;
    }

    /**
     * @param iswt the iswt to set
     */
    public void setIswt(String iswt) {
        this.iswt = iswt;
    }

    /**
     * @return the isidm
     */
    public String getIsidm() {
        return isidm;
    }

    /**
     * @param isidm the isidm to set
     */
    public void setIsidm(String isidm) {
        this.isidm = isidm;
    }

    /**
     * @return the isjod
     */
    public String getIsjod() {
        return isjod;
    }

    /**
     * @param isjod the isjod to set
     */
    public void setIsjod(String isjod) {
        this.isjod = isjod;
    }

    /**
     * @return the isban
     */
    public String getIsban() {
        return isban;
    }

    /**
     * @param isban the isban to set
     */
    public void setIsban(String isban) {
        this.isban = isban;
    }

    /**
     * @return the isbran
     */
    public String getIsbran() {
        return isbran;
    }

    /**
     * @param isbran the isbran to set
     */
    public void setIsbran(String isbran) {
        this.isbran = isbran;
    }

    /**
     * @return the isifsc
     */
    public String getIsifsc() {
        return isifsc;
    }

    /**
     * @param isifsc the isifsc to set
     */
    public void setIsifsc(String isifsc) {
        this.isifsc = isifsc;
    }

    /**
     * @return the isbankacc
     */
    public String getIsbankacc() {
        return isbankacc;
    }

    /**
     * @param isbankacc the isbankacc to set
     */
    public void setIsbankacc(String isbankacc) {
        this.isbankacc = isbankacc;
    }

    /**
     * @return the isopno
     */
    public String getIsopno() {
        return isopno;
    }

    /**
     * @param isopno the isopno to set
     */
    public void setIsopno(String isopno) {
        this.isopno = isopno;
    }

    /**
     * @return the isopno2
     */
    public String getIsopno2() {
        return isopno2;
    }

    /**
     * @param isopno2 the isopno2 to set
     */
    public void setIsopno2(String isopno2) {
        this.isopno2 = isopno2;
    }

    /**
     * @return the isocmpnm
     */
    public String getIsocmpnm() {
        return isocmpnm;
    }

    /**
     * @param isocmpnm the isocmpnm to set
     */
    public void setIsocmpnm(String isocmpnm) {
        this.isocmpnm = isocmpnm;
    }

    /**
     * @return the isqyfmm
     */
    public String getIsqyfmm() {
        return isqyfmm;
    }

    /**
     * @param isqyfmm the isqyfmm to set
     */
    public void setIsqyfmm(String isqyfmm) {
        this.isqyfmm = isqyfmm;
    }

    /**
     * @return the isfrae
     */
    public String getIsfrae() {
        return isfrae;
    }

    /**
     * @param isfrae the isfrae to set
     */
    public void setIsfrae(String isfrae) {
        this.isfrae = isfrae;
    }

    /**
     * @return the ismrae
     */
    public String getIsmrae() {
        return ismrae;
    }

    /**
     * @param ismrae the ismrae to set
     */
    public void setIsmrae(String ismrae) {
        this.ismrae = ismrae;
    }

    /**
     * @return the isbrae
     */
    public String getIsbrae() {
        return isbrae;
    }

    /**
     * @param isbrae the isbrae to set
     */
    public void setIsbrae(String isbrae) {
        this.isbrae = isbrae;
    }

    /**
     * @return the issrae
     */
    public String getIssrae() {
        return issrae;
    }

    /**
     * @param issrae the issrae to set
     */
    public void setIssrae(String issrae) {
        this.issrae = issrae;
    }

    /**
     * @return the ishwae
     */
    public String getIshwae() {
        return ishwae;
    }

    /**
     * @param ishwae the ishwae to set
     */
    public void setIshwae(String ishwae) {
        this.ishwae = ishwae;
    }

    /**
     * @return the iscdae
     */
    public String getIscdae() {
        return iscdae;
    }

    /**
     * @param iscdae the iscdae to set
     */
    public void setIscdae(String iscdae) {
        this.iscdae = iscdae;
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
     * @return the isrene
     */
    public String getIsrene() {
        return isrene;
    }

    /**
     * @param isrene the isrene to set
     */
    public void setIsrene(String isrene) {
        this.isrene = isrene;
    }

    /**
     * @return the brcr
     */
    public String getBrcr() {
        return brcr;
    }

    /**
     * @param brcr the brcr to set
     */
    public void setBrcr(String brcr) {
        this.brcr = brcr;
    }

    /**
     * @return the sclvc
     */
    public String getSclvc() {
        return sclvc;
    }

    /**
     * @param sclvc the sclvc to set
     */
    public void setSclvc(String sclvc) {
        this.sclvc = sclvc;
    }

    /**
     * @return the thbc
     */
    public String getThbc() {
        return thbc;
    }

    /**
     * @param thbc the thbc to set
     */
    public void setThbc(String thbc) {
        this.thbc = thbc;
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
     * @return the ahecy
     */
    public String getAhecy() {
        return ahecy;
    }

    /**
     * @param ahecy the ahecy to set
     */
    public void setAhecy(String ahecy) {
        this.ahecy = ahecy;
    }

    /**
     * @return the frif
     */
    public String getFrif() {
        return frif;
    }

    /**
     * @param frif the frif to set
     */
    public void setFrif(String frif) {
        this.frif = frif;
    }

    /**
     * @return the sysp
     */
    public String getSysp() {
        return sysp;
    }

    /**
     * @param sysp the sysp to set
     */
    public void setSysp(String sysp) {
        this.sysp = sysp;
    }

    /**
     * @return the adcd
     */
    public String getAdcd() {
        return adcd;
    }

    /**
     * @param adcd the adcd to set
     */
    public void setAdcd(String adcd) {
        this.adcd = adcd;
    }

    /**
     * @return the pacr
     */
    public String getPacr() {
        return pacr;
    }

    /**
     * @param pacr the pacr to set
     */
    public void setPacr(String pacr) {
        this.pacr = pacr;
    }

    /**
     * @return the drliva
     */
    public String getDrliva() {
        return drliva;
    }

    /**
     * @param drliva the drliva to set
     */
    public void setDrliva(String drliva) {
        this.drliva = drliva;
    }

    /**
     * @return the vgid
     */
    public String getVgid() {
        return vgid;
    }

    /**
     * @param vgid the vgid to set
     */
    public void setVgid(String vgid) {
        this.vgid = vgid;
    }

    /**
     * @return the pssprt
     */
    public String getPssprt() {
        return pssprt;
    }

    /**
     * @param pssprt the pssprt to set
     */
    public void setPssprt(String pssprt) {
        this.pssprt = pssprt;
    }

    /**
     * @return the cdid
     */
    public String getCdid() {
        return cdid;
    }

    /**
     * @param cdid the cdid to set
     */
    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    /**
     * @return the rncd
     */
    public String getRncd() {
        return rncd;
    }

    /**
     * @param rncd the rncd to set
     */
    public void setRncd(String rncd) {
        this.rncd = rncd;
    }

    /**
     * @return the ltbl
     */
    public String getLtbl() {
        return ltbl;
    }

    /**
     * @param ltbl the ltbl to set
     */
    public void setLtbl(String ltbl) {
        this.ltbl = ltbl;
    }

    /**
     * @return the arca
     */
    public String getArca() {
        return arca;
    }

    /**
     * @param arca the arca to set
     */
    public void setArca(String arca) {
        this.arca = arca;
    }

    /**
     * @return the voigid
     */
    public String getVoigid() {
        return voigid;
    }

    /**
     * @param voigid the voigid to set
     */
    public void setVoigid(String voigid) {
        this.voigid = voigid;
    }

    /**
     * @return the passp
     */
    public String getPassp() {
        return passp;
    }

    /**
     * @param passp the passp to set
     */
    public void setPassp(String passp) {
        this.passp = passp;
    }

    /**
     * @return the bpass
     */
    public String getBpass() {
        return bpass;
    }

    /**
     * @param bpass the bpass to set
     */
    public void setBpass(String bpass) {
        this.bpass = bpass;
    }

    /**
     * @return the irano
     */
    public String getIrano() {
        return irano;
    }

    /**
     * @param irano the irano to set
     */
    public void setIrano(String irano) {
        this.irano = irano;
    }


}
   
 