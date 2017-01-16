/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Shekhar
 */
public class CustReport {
    private String custName;


    private String contactNo;
    private String address;
    private int decidedAmt;
    private int amtPaid;
    private int balAmt;
    public CustReport(String custName, String contactNo, String address, int decidedAmt, int amtPaid, int balAmt) {
        this.custName = custName;
        this.contactNo = contactNo;
        this.address = address;
        this.decidedAmt = decidedAmt;
        this.amtPaid = amtPaid;
        this.balAmt = balAmt;
        
    }
     
    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDecidedAmt(int decidedAmt) {
        this.decidedAmt = decidedAmt;
    }

    public void setBalAmt(int balAmt) {
        this.balAmt = balAmt;
    }

    public void setAmtPaid(int amtPaid) {
        this.amtPaid = amtPaid;
    }

    public int getDecidedAmt() {
        return decidedAmt;
    }

    public int getBalAmt() {
        return balAmt;
    }

    public int getAmtPaid() {
        return amtPaid;
    }

   

    public String getCustName() {
        return custName;
    }

   

    public String getContactNo() {
        return contactNo;
    }


    public String getAddress() {
        return address;
    }

  
}
