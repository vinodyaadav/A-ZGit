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
    private String fn;
    private String imhn;
    private String dob;
    private String address;
    private String st;
    private String pt;
    private String vm;
    private String none;
    private String ht;
    private String wt;
    private String idm;
    private String jod;
    private String ban;
    private String bran;
    private String ifsc;
    private String bankacc;
    private String opno;
    private String opno2;
    private String ocmpnm;
    private String qyfmm;
    private String frae;
    private String mrae;
    private String brae;
    private String srae;
    private String hwae;
    private String cdae;
    private String decidedAmt;
    private String amtPaid;
    private String balAmt;
    private String rene;
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
     * @return the fn
     */
    public String getFn() {
        return fn;
    }

    /**
     * @param fn the fn to set
     */
    public void setFn(String fn) {
        this.fn = fn;
    }

    /**
     * @return the imhn
     */
    public String getImhn() {
        return imhn;
    }

    /**
     * @param imhn the imhn to set
     */
    public void setImhn(String imhn) {
        this.imhn = imhn;
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
     * @return the st
     */
    public String getSt() {
        return st;
    }

    /**
     * @param st the st to set
     */
    public void setSt(String st) {
        this.st = st;
    }

    /**
     * @return the pt
     */
    public String getPt() {
        return pt;
    }

    /**
     * @param pt the pt to set
     */
    public void setPt(String pt) {
        this.pt = pt;
    }

    /**
     * @return the vm
     */
    public String getVm() {
        return vm;
    }

    /**
     * @param vm the vm to set
     */
    public void setVm(String vm) {
        this.vm = vm;
    }

    /**
     * @return the none
     */
    public String getNone() {
        return none;
    }

    /**
     * @param none the none to set
     */
    public void setNone(String none) {
        this.none = none;
    }

    /**
     * @return the ht
     */
    public String getHt() {
        return ht;
    }

    /**
     * @param ht the ht to set
     */
    public void setHt(String ht) {
        this.ht = ht;
    }

    /**
     * @return the wt
     */
    public String getWt() {
        return wt;
    }

    /**
     * @param wt the wt to set
     */
    public void setWt(String wt) {
        this.wt = wt;
    }

    /**
     * @return the idm
     */
    public String getIdm() {
        return idm;
    }

    /**
     * @param idm the idm to set
     */
    public void setIdm(String idm) {
        this.idm = idm;
    }

    /**
     * @return the jod
     */
    public String getJod() {
        return jod;
    }

    /**
     * @param jod the jod to set
     */
    public void setJod(String jod) {
        this.jod = jod;
    }

    /**
     * @return the ban
     */
    public String getBan() {
        return ban;
    }

    /**
     * @param ban the ban to set
     */
    public void setBan(String ban) {
        this.ban = ban;
    }

    /**
     * @return the bran
     */
    public String getBran() {
        return bran;
    }

    /**
     * @param bran the bran to set
     */
    public void setBran(String bran) {
        this.bran = bran;
    }

    /**
     * @return the ifsc
     */
    public String getIfsc() {
        return ifsc;
    }

    /**
     * @param ifsc the ifsc to set
     */
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    /**
     * @return the bankacc
     */
    public String getBankacc() {
        return bankacc;
    }

    /**
     * @param bankacc the bankacc to set
     */
    public void setBankacc(String bankacc) {
        this.bankacc = bankacc;
    }

    /**
     * @return the opno
     */
    public String getOpno() {
        return opno;
    }

    /**
     * @param opno the opno to set
     */
    public void setOpno(String opno) {
        this.opno = opno;
    }

    /**
     * @return the opno2
     */
    public String getOpno2() {
        return opno2;
    }

    /**
     * @param opno2 the opno2 to set
     */
    public void setOpno2(String opno2) {
        this.opno2 = opno2;
    }

    /**
     * @return the ocmpnm
     */
    public String getOcmpnm() {
        return ocmpnm;
    }

    /**
     * @param ocmpnm the ocmpnm to set
     */
    public void setOcmpnm(String ocmpnm) {
        this.ocmpnm = ocmpnm;
    }

    /**
     * @return the qyfmm
     */
    public String getQyfmm() {
        return qyfmm;
    }

    /**
     * @param qyfmm the qyfmm to set
     */
    public void setQyfmm(String qyfmm) {
        this.qyfmm = qyfmm;
    }

    /**
     * @return the frae
     */
    public String getFrae() {
        return frae;
    }

    /**
     * @param frae the frae to set
     */
    public void setFrae(String frae) {
        this.frae = frae;
    }

    /**
     * @return the mrae
     */
    public String getMrae() {
        return mrae;
    }

    /**
     * @param mrae the mrae to set
     */
    public void setMrae(String mrae) {
        this.mrae = mrae;
    }

    /**
     * @return the brae
     */
    public String getBrae() {
        return brae;
    }

    /**
     * @param brae the brae to set
     */
    public void setBrae(String brae) {
        this.brae = brae;
    }

    /**
     * @return the srae
     */
    public String getSrae() {
        return srae;
    }

    /**
     * @param srae the srae to set
     */
    public void setSrae(String srae) {
        this.srae = srae;
    }

    /**
     * @return the hwae
     */
    public String getHwae() {
        return hwae;
    }

    /**
     * @param hwae the hwae to set
     */
    public void setHwae(String hwae) {
        this.hwae = hwae;
    }

    /**
     * @return the cdae
     */
    public String getCdae() {
        return cdae;
    }

    /**
     * @param cdae the cdae to set
     */
    public void setCdae(String cdae) {
        this.cdae = cdae;
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
     * @return the rene
     */
    public String getRene() {
        return rene;
    }

    /**
     * @param rene the rene to set
     */
    public void setRene(String rene) {
        this.rene = rene;
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