/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CustReport;
import Model.aadharCard;
import Model.lic;
import Model.passport2;
import Model.PanCard;
import Model.salaryIt;
import Model.RationCard;
import Model.lic;
import Model.salaryIt;
import Model.otherwork;
import Model.FoodModel;
import Model.DrivingModel;
import Model.LoanModel;
import Model.mediclaim;

import  Model.twowfourwh;
import java.util.List;
import Model.addGrantRenewal;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.aadharCardServices;
import services.licServices;
import services.passport2Services;
import services.salaryItServices;
import services.twowfourwServices;
import services.PanCardService;
import services.RationCardService;
import services.addGrantRenewalServices;
import services.otherworkServices;
import services.LoanService;
import services.foodServices;
import services.drivingServices;
import services.mediclaimServices;
import services.salaryItServices;

/**
 *
 * @author ravi
 */
public class aadharController extends AbstractController {
private mediclaimServices mediclaimservices;
    private passport2Services passServices;
        private salaryItServices salItServices;
    private aadharCardServices adCServices;
    private licServices lServices;
    private salaryItServices salServices;
    private PanCardService pcardservice;
    private RationCardService rServices;
    private twowfourwServices tservice;
    private otherworkServices othServices;
    private drivingServices driving1;
    private foodServices foodservice;
    private LoanService loanServices;

 

    public void setOthServices(otherworkServices othServices) {
        this.othServices = othServices;
    }
    private addGrantRenewalServices grServices;
    
  public void setSalItServices(salaryItServices salItServices) {
        this.salItServices = salItServices;
    }
    public void setGrServices(addGrantRenewalServices grServices) {
        this.grServices = grServices;
    }
     public void setMediclaimservices(mediclaimServices mediclaimservices) {
        this.mediclaimservices = mediclaimservices;
    }
   
//    public passport2Services getPassServices() {
//        return passServices;
//    }
//public void setOthServices(otherworkServices othServices) {
//        this.othServices = othServices;
//    }
//
//    public void setGrServices(addGrantRenewalServices grServices) {
//        this.grServices = grServices;
//    }
//    c
//
//    public void setlServices(licServices lServices) {
//        this.lServices = lServices;
//    }
    
    public void setLoanServices(LoanService loanServices) {
        this.loanServices = loanServices;
    }

    public void setFoodservice(foodServices foodservice) {
        this.foodservice = foodservice;
    }

    public void setDriving1(drivingServices driving1) {
        this.driving1 = driving1;
    }

    
    
    public void setPassServices(passport2Services passServices) {
        this.passServices = passServices;
    }

    public void setSalServices(salaryItServices salServices) {
        this.salServices = salServices;
    }

    public licServices getlServices() {
        return lServices;
    }

    public void setlServices(licServices lServices) {
        this.lServices = lServices;
    }

    public void setAdCServices(aadharCardServices adCServices) {

        this.adCServices = adCServices;
    }

    public aadharCardServices getAdCServices() {
        return adCServices;
    }

    public salaryItServices getSalServices() {
        return salServices;
    }
     public void setrServices(RationCardService rServices) {
        this.rServices = rServices;
    }

    public void setPcardservice(PanCardService pcardservice) {
        this.pcardservice = pcardservice;
    }

    public void setTservice(twowfourwServices tservice) {
        this.tservice = tservice;

    }

    ModelAndView mv = new ModelAndView();

    @RequestMapping(method = RequestMethod.POST)
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //To change body of generated methods, choose Tools | Templates.
        String action = "";
        String sessionId = "";
        HttpSession session = request.getSession(true);
        sessionId = session.getId();
        action = ServletRequestUtils.getStringParameter(request, "actionFrom");

        if (action.equals("addGumastaDetail")) {

            Integer licenceNo = ServletRequestUtils.getIntParameter(request, "licenceNo");
            String renewDate = ServletRequestUtils.getStringParameter(request, "renewDate");
            String companyName = ServletRequestUtils.getStringParameter(request, "companyName");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String natureOfBuisness = ServletRequestUtils.getStringParameter(request, "natureOfBuisness");
            String employeeQty = ServletRequestUtils.getStringParameter(request, "employeeQty");
            String propertiorName = ServletRequestUtils.getStringParameter(request, "propertiorName");
            String renew1 = ServletRequestUtils.getStringParameter(request, "renew1");
            String renew2 = ServletRequestUtils.getStringParameter(request, "renew2");
            String renew3 = ServletRequestUtils.getStringParameter(request, "renew3");
            String decidedAmtRs = ServletRequestUtils.getStringParameter(request, "decidedAmtRs");
            String decidedAmtRs1 = ServletRequestUtils.getStringParameter(request, "decidedAmtRs1");
            String creditAmtRs = ServletRequestUtils.getStringParameter(request, "creditAmtRs");
            String creditAmtRs1 = ServletRequestUtils.getStringParameter(request, "creditAmtRs1");
            String balanceAmtRs = ServletRequestUtils.getStringParameter(request, "balanceAmtRs");
            String balanceAmtRs1 = ServletRequestUtils.getStringParameter(request, "balanceAmtRs1");
            String referanceName = ServletRequestUtils.getStringParameter(request, "referanceName");
            String referanceName1 = ServletRequestUtils.getStringParameter(request, "referanceName1");
            String lightBill = ServletRequestUtils.getRequiredStringParameter(request, "lightBill");
            String rentAgreement = ServletRequestUtils.getRequiredStringParameter(request, "rentAgreement");
            String pancard = ServletRequestUtils.getRequiredStringParameter(request, "pancard");
            String drivingLicence = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicence");
            String passport = ServletRequestUtils.getRequiredStringParameter(request, "passport");
            String votingCard = ServletRequestUtils.getRequiredStringParameter(request, "votingCard");
            String adharCard = ServletRequestUtils.getRequiredStringParameter(request, "adharCard");
            String decidedamt = ServletRequestUtils.getRequiredStringParameter(request, "decidedamt");
            String decidedamt1 = ServletRequestUtils.getRequiredStringParameter(request, "decidedamt1");
            String creditamt = ServletRequestUtils.getRequiredStringParameter(request, "creditamt");
            String creditamt1 = ServletRequestUtils.getRequiredStringParameter(request, "creditamt1");
            String balanceamt = ServletRequestUtils.getRequiredStringParameter(request, "balanceamt");
            String balanceamt1 = ServletRequestUtils.getRequiredStringParameter(request, "balanceamt1");
            String reference = ServletRequestUtils.getRequiredStringParameter(request, "reference");
            String reference1 = ServletRequestUtils.getRequiredStringParameter(request, "reference1");

            mv.setViewName("index");
            return mv;
        }

        
        
        if (action.equals("generatereportdetails")) {
            String SLASH="/";
             String columnHeader = "Sr.No,Customer Name,Contact  No,Address ,Decided Amount,Credited Amount ,Balance Amount";
            String pdfFileName = "C:\\Users\\ravi\\Desktop\\Sagar\\A-Z2\\web\\";
             String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String subDate = ServletRequestUtils.getStringParameter(request, "subDate");
            String formType = ServletRequestUtils.getStringParameter(request, "formType");
         pdfFileName= pdfFileName  + "Reports" + SLASH + "StudentUnderGuideReport.pdf";
//              viewReport vr= new viewReport();
//              vr.setCustName(CustName);
//              vr.setContactNo(contactNo);
//             vr.setSubDate(subDate);
//              vr.setFormType(formType);
             
            List custDetails=lServices.viewCustomerReport(contactNo, custName, subDate, formType);
             saveFacultyReportToPDF1(pdfFileName, columnHeader, custDetails);
            
               mv.setViewName("viewReportDetails");
               mv.addObject("custDetails",custDetails);
               mv.addObject("custName",custName);
               mv.addObject("contactNo",contactNo);
               mv.addObject("subDate",subDate);
               mv.addObject("formType",formType);
               
            return mv;
        }

        
        
        
        
        
         if (action.equals("showPdf")) {
               String SLASH="/";
             String pdfFileName = "C:\\Users\\ravi\\Desktop\\Sagar\\A-Z2\\web\\";
             pdfFileName= pdfFileName  + "Reports" + SLASH + "StudentUnderGuideReport.pdf";
            File file = new File(pdfFileName);
                        System.out.println("Looking for file " + file.getAbsolutePath());
                        streamImageFile(file, response);
        }
        
        if (action.equals("addmediclaim")) {
            String documentType = ServletRequestUtils.getRequiredStringParameter(request, "documentType");
            String oldPolicyNo = ServletRequestUtils.getRequiredStringParameter(request, "oldPolicyNo");
            String renewDate = ServletRequestUtils.getStringParameter(request, "renewDate");
            String companyName = ServletRequestUtils.getStringParameter(request, "companyName");
            String customerName = ServletRequestUtils.getStringParameter(request, "customerName");
            String middleName = ServletRequestUtils.getStringParameter(request, "middleName");
            String lastName = ServletRequestUtils.getStringParameter(request, "lastName");
            String husbandName = ServletRequestUtils.getStringParameter(request, "husbandName");
            String dob = ServletRequestUtils.getStringParameter(request, "dob");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String memberFirstName = ServletRequestUtils.getStringParameter(request, "memberFirstName");
            String age = ServletRequestUtils.getStringParameter(request, "age");
            String secondMemberName = ServletRequestUtils.getStringParameter(request, "secondMemberName");
            String secondMemberAge = ServletRequestUtils.getStringParameter(request, "secondMemberAge");
            String thirdMemberName = ServletRequestUtils.getStringParameter(request, "thirdMemberName");
            String thirdMemberAge = ServletRequestUtils.getStringParameter(request, "thirdMemberAge");
            String fourthMemberName = ServletRequestUtils.getStringParameter(request, "fourthMemberName");
            String fourthMemberAge = ServletRequestUtils.getStringParameter(request, "fourthMemberAge");
            String fifthMemberName = ServletRequestUtils.getRequiredStringParameter(request, "fifthMemberName");
            String fifthMemberAge = ServletRequestUtils.getRequiredStringParameter(request, "fifthMemberAge");
            String adharCard = ServletRequestUtils.getRequiredStringParameter(request, "adharCard");
            String votingCard = ServletRequestUtils.getRequiredStringParameter(request, "votingCard");
            String passport = ServletRequestUtils.getRequiredStringParameter(request, "passport");
            String drivingLicence = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicence");
            String pancard = ServletRequestUtils.getRequiredStringParameter(request, "pancard");
            String adharCardadd = ServletRequestUtils.getRequiredStringParameter(request, "adharCardadd");
            String votingCardadd = ServletRequestUtils.getRequiredStringParameter(request, "votingCardadd");
            String passportadd = ServletRequestUtils.getRequiredStringParameter(request, "passportadd");
            String drivingLicenceadd = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicenceadd");
            String bankpassbook = ServletRequestUtils.getRequiredStringParameter(request, "bankpassbook");
            String corporateLetter = ServletRequestUtils.getRequiredStringParameter(request, "corporateLetter");
            String rentAgreement = ServletRequestUtils.getRequiredStringParameter(request, "rentAgreement");
            String addProofLightBill = ServletRequestUtils.getRequiredStringParameter(request, "addProofLightBill");
            String decideAmt = ServletRequestUtils.getRequiredStringParameter(request, "decideAmt");
            String amountPaid = ServletRequestUtils.getRequiredStringParameter(request, "amountPaid");
            String balAmt = ServletRequestUtils.getRequiredStringParameter(request, "balAmt");
            String refName = ServletRequestUtils.getRequiredStringParameter(request, "refName");
            String submitDate = ServletRequestUtils.getRequiredStringParameter(request, "submitDate");
          

            mediclaim Mediclaim = new mediclaim();
            
            Mediclaim.setDocType(documentType);
            Mediclaim.setOldPolicyNo(oldPolicyNo);
            Mediclaim.setRenewDate(renewDate);
            Mediclaim.setCompanyName(companyName);
            Mediclaim.setCustName(customerName);
            Mediclaim.setMiddleName(middleName);
            Mediclaim.setLastName(lastName);
            Mediclaim.setHusbandName(husbandName);
            Mediclaim.setDob(dob);
            Mediclaim.setAddress(address);
            Mediclaim.setContactNo(contactNo);
            Mediclaim.setMemberFirstName(memberFirstName);
            Mediclaim.setAge(age);
            Mediclaim.setSecondMemberName(secondMemberName);
            Mediclaim.setSecondMemberAge(secondMemberAge);
            Mediclaim.setThirdMemberName(thirdMemberName);
            Mediclaim.setThirdMemberAge(thirdMemberAge);
            Mediclaim.setFourthMemberName(fourthMemberName);
            Mediclaim.setFourthMemberAge(fourthMemberAge);
            Mediclaim.setFifthMemberName(fifthMemberName);
            Mediclaim.setFifthMemberAge(fifthMemberAge);
            Mediclaim.setAdharCard(adharCard);
            Mediclaim.setVotingCard(votingCard);
            Mediclaim.setPassport(passport);
            Mediclaim.setDrivingLicence(drivingLicence);
            Mediclaim.setPancard(pancard);
            Mediclaim.setAdharCardadd(adharCardadd);
            Mediclaim.setVotingCardadd(votingCardadd);
            Mediclaim.setPassportadd(passportadd);
            Mediclaim.setDrivingLicenceadd(drivingLicenceadd);
            Mediclaim.setBankpassbook(bankpassbook);
            Mediclaim.setCorporateLetter(corporateLetter);
            Mediclaim.setRentAgreement(rentAgreement);
            Mediclaim.setAddProofLightBill(addProofLightBill);
            Mediclaim.setDecidedAmt(decideAmt);
            Mediclaim.setAmtPaid(amountPaid);
            Mediclaim.setBalAmt(balAmt);
            Mediclaim.setRefName(refName);
            Mediclaim.setSubmitDate(submitDate);

            int mediclaim = mediclaimservices.addmediclaim(Mediclaim);

            mv.setViewName("index");
            return mv;
        }

        
        
        if (action.equals("addmediclaim")) {
            Integer oldPolicyNo = ServletRequestUtils.getIntParameter(request, "oldPolicyNo");
            String renewDate = ServletRequestUtils.getStringParameter(request, "renewDate");
            String companyName = ServletRequestUtils.getStringParameter(request, "companyName");
            String firstName = ServletRequestUtils.getStringParameter(request, "firstName");
            String middleName = ServletRequestUtils.getStringParameter(request, "middleName");
            String lastName = ServletRequestUtils.getStringParameter(request, "lastName");
            String husbandName = ServletRequestUtils.getStringParameter(request, "husbandName");
            String dob = ServletRequestUtils.getStringParameter(request, "dob");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String memberFirstName = ServletRequestUtils.getStringParameter(request, "memberFirstName");
            String age = ServletRequestUtils.getStringParameter(request, "age");
            String secondMemberName = ServletRequestUtils.getStringParameter(request, "secondMemberName");
            String secondMemberAge = ServletRequestUtils.getStringParameter(request, "secondMemberAge");
            String thirdMemberName = ServletRequestUtils.getStringParameter(request, "thirdMemberName");
            String thirdMemberAge = ServletRequestUtils.getStringParameter(request, "thirdMemberAge");
            String fourthMemberName = ServletRequestUtils.getStringParameter(request, "fourthMemberName");
            String fourthMemberAge = ServletRequestUtils.getStringParameter(request, "fourthMemberAge");
            String fifthMemberName = ServletRequestUtils.getRequiredStringParameter(request, "fifthMemberName");
            String fifthMemberAge = ServletRequestUtils.getRequiredStringParameter(request, "fifthMemberAge");
            String adharCard = ServletRequestUtils.getRequiredStringParameter(request, "adharCard");
            String votingCard = ServletRequestUtils.getRequiredStringParameter(request, "votingCard");
            String passport = ServletRequestUtils.getRequiredStringParameter(request, "passport");
            String drivingLicence = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicence");
            String pancard = ServletRequestUtils.getRequiredStringParameter(request, "pancard");
            String adharCardadd = ServletRequestUtils.getRequiredStringParameter(request, "adharCardadd");
            String votingCardadd = ServletRequestUtils.getRequiredStringParameter(request, "votingCardadd");
            String passportadd = ServletRequestUtils.getRequiredStringParameter(request, "passportadd");
            String drivingLicenceadd = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicenceadd");
            String bankpassbook = ServletRequestUtils.getRequiredStringParameter(request, "bankpassbook");
            String corporateLetter = ServletRequestUtils.getRequiredStringParameter(request, "corporateLetter");
            String rentAgreement = ServletRequestUtils.getRequiredStringParameter(request, "rentAgreement");
            String addProofLightBill = ServletRequestUtils.getRequiredStringParameter(request, "addProofLightBill");
            String decidedamt = ServletRequestUtils.getRequiredStringParameter(request, "decidedamt");
            String decidedamt1 = ServletRequestUtils.getRequiredStringParameter(request, "decidedamt1");
            String creditamt = ServletRequestUtils.getRequiredStringParameter(request, "creditamt");
            String creditamt1 = ServletRequestUtils.getRequiredStringParameter(request, "creditamt1");
            String balanceamt = ServletRequestUtils.getRequiredStringParameter(request, "balanceamt");
            String balanceamt1 = ServletRequestUtils.getRequiredStringParameter(request, "balanceamt1");
            String reference = ServletRequestUtils.getRequiredStringParameter(request, "reference");
            String reference1 = ServletRequestUtils.getRequiredStringParameter(request, "reference1");

            mv.setViewName("index");
            return mv;
        }
          if (action.equals("getLoan")) {
            String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String Loan = ServletRequestUtils.getStringParameter(request, "Loan");
            String amt = ServletRequestUtils.getStringParameter(request, "amt");
            String pann = ServletRequestUtils.getStringParameter(request, "pann");
             String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String Dob1 = ServletRequestUtils.getStringParameter(request, "Dob1");
            String add3 = ServletRequestUtils.getStringParameter(request, "add3");
            String buss = ServletRequestUtils.getStringParameter(request, "buss");
            String sal2 = ServletRequestUtils.getStringParameter(request, "sal2");
            String com = ServletRequestUtils.getStringParameter(request, "com");
            String post1 = ServletRequestUtils.getStringParameter(request, "post1");
            String exp = ServletRequestUtils.getStringParameter(request, "exp");
            String qual = ServletRequestUtils.getStringParameter(request, "qual");
            String rem = ServletRequestUtils.getStringParameter(request, "rem");
            String info = ServletRequestUtils.getStringParameter(request, "info");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String refName = ServletRequestUtils.getStringParameter(request, "refName");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String card = ServletRequestUtils.getStringParameter(request, "card");
            String voti = ServletRequestUtils.getStringParameter(request, "voti");
            String valid = ServletRequestUtils.getStringParameter(request, "valid");
            String lice = ServletRequestUtils.getStringParameter(request, "lice");
            String card2 = ServletRequestUtils.getStringParameter(request, "card2");
            String card1 = ServletRequestUtils.getStringParameter(request, "card1");
            String votin = ServletRequestUtils.getStringParameter(request, "votin");
            String rat = ServletRequestUtils.getStringParameter(request, "rat");
            String bill = ServletRequestUtils.getStringParameter(request, "bill");
            String resi = ServletRequestUtils.getStringParameter(request, "resi");
            String govt = ServletRequestUtils.getStringParameter(request, "govt");
            String lic = ServletRequestUtils.getStringParameter(request, "lic");
            String not = ServletRequestUtils.getStringParameter(request, "not");
            String form1 = ServletRequestUtils.getStringParameter(request, "form1");
            String file = ServletRequestUtils.getStringParameter(request, "file");
            String bank = ServletRequestUtils.getStringParameter(request, "bank");
            String invest = ServletRequestUtils.getStringParameter(request, "invest");
            String pay = ServletRequestUtils.getStringParameter(request, "pay");
            String exist = ServletRequestUtils.getStringParameter(request, "exist");
            String bussi = ServletRequestUtils.getStringParameter(request, "bussi");
            String curr = ServletRequestUtils.getStringParameter(request, "curr");
            String proper = ServletRequestUtils.getStringParameter(request, "proper");
            LoanModel loanmodel = new LoanModel();
            //  loanmodel.setLicenceid(licenceid);
            loanmodel.setDocType(docType);
            loanmodel.setLoan(Loan);
            loanmodel.setAmt(amt);
            loanmodel.setPann(pann);
            loanmodel.setContactNo(contactNo);
            loanmodel.setCustName(custName);
            loanmodel.setDob1(Dob1);
            loanmodel.setAdd3(add3);
            loanmodel.setBuss(buss);
            loanmodel.setSal2(sal2);
            loanmodel.setCom(com);
            loanmodel.setPost1(post1);
            loanmodel.setExp(exp);
            loanmodel.setQual(qual);
            loanmodel.setRem(rem);
            loanmodel.setInfo(info);
            loanmodel.setDecidedAmt(decidedAmt);
            loanmodel.setAmtPaid(amtPaid);
            loanmodel.setBalAmt(balAmt);
            loanmodel.setRefName(refName);
            loanmodel.setSubmitDate(submitDate);
            loanmodel.setCard(card);
            loanmodel.setVoti(voti);
            loanmodel.setValid(valid);
            loanmodel.setLice(lice);
            loanmodel.setCard2(card2);
            loanmodel.setCard1(card1);
            loanmodel.setVotin(votin);
            loanmodel.setRat(rat);
            loanmodel.setBill(bill);
            loanmodel.setResi(resi);
            loanmodel.setGovt(govt);
            loanmodel.setLic(lic);
            loanmodel.setNotes(not);
            loanmodel.setForm1(form1);
            loanmodel.setFile(file);
            loanmodel.setBank(bank);
            loanmodel.setInvest(invest);
            loanmodel.setPay(pay);
            loanmodel.setExist(exist);
            loanmodel.setBussi(bussi);
            loanmodel.setCurr(curr);
            loanmodel.setProper(proper);
            int loan1 = loanServices.addLoan(loanmodel);
              //List loanList1 = loanServices.viewLoanDetailsByContactNo(contactNo);
            mv.setViewName("index");
            return mv;
        }

        
        if (action.equals("addDrivingLicence")) {
            //Integer licenceid=ServletRequestUtils.getIntParameter(request, "licenceid");
            String documentType = ServletRequestUtils.getStringParameter(request, "documentType");
             String customerName = ServletRequestUtils.getStringParameter(request, "customerName");
             String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String son = ServletRequestUtils.getStringParameter(request, "son");
            String presentaddress = ServletRequestUtils.getStringParameter(request, "presentaddress");
            String permanentaddress = ServletRequestUtils.getStringParameter(request, "permanentaddress");
            String dateofbirth = ServletRequestUtils.getStringParameter(request, "dateofbirth");
            String education = ServletRequestUtils.getStringParameter(request, "education");
            String bloodgroup = ServletRequestUtils.getStringParameter(request, "bloodgroup");
            String identificationmark = ServletRequestUtils.getStringParameter(request, "identificationmark");
            String identificationmarks = ServletRequestUtils.getStringParameter(request, "identificationmarks");
            String decideAmnt = ServletRequestUtils.getStringParameter(request, "decideAmnt");
            String amountPaid = ServletRequestUtils.getStringParameter(request, "amountPaid");
            String balAmnt = ServletRequestUtils.getStringParameter(request, "balAmnt");
            String refName = ServletRequestUtils.getStringParameter(request, "refName");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String radioa = ServletRequestUtils.getStringParameter(request, "radioa");
            String radiob = ServletRequestUtils.getStringParameter(request, "radiob");
            String radioc = ServletRequestUtils.getStringParameter(request, "radioc");
            String radiod = ServletRequestUtils.getStringParameter(request, "radiod");
            String radioe = ServletRequestUtils.getStringParameter(request, "radioe");
            String radiou = ServletRequestUtils.getStringParameter(request, "radiou");
            String radiop = ServletRequestUtils.getStringParameter(request, "radiop");

            DrivingModel driving = new DrivingModel();
            //driving.setLicenceid(licenceid);
            driving.setDocType(documentType);
            driving.setCustName(customerName);
            driving.setContactNo(contactNo);
            driving.setSon(son);
            driving.setAddress(presentaddress);
            driving.setPermanentaddress(permanentaddress);
            driving.setDateofbirth(dateofbirth);
            driving.setEducation(education);
            driving.setBloodgroup(bloodgroup);
            driving.setIdentificationmark(identificationmark);
            driving.setIdentificationmarks(identificationmarks);
            driving.setDecidedAmt(decideAmnt);
            driving.setAmtPaid(amountPaid);
            driving.setBalAmt(balAmnt);
            driving.setRefName(refName);
            driving.setSubmitDate(submitDate);
            driving.setRadioa(radioa);
            driving.setRadiob(radiob);
            driving.setRadioc(radioc);
            driving.setRadiod(radiod);
            driving.setRadioe(radioe);
            driving.setRadiou(radiou);
            driving.setRadiop(radiop);
            int driv = driving1.addDriving(driving);
            List drivingList=driving1.viewDrivingDetailsByContact(contactNo);
            mv.setViewName("index");
            return mv;
        }

        
        
        
        
        
        
        
         if (action.equals("addFoodLicence")) {
            //Integer licenceid=ServletRequestUtils.getIntParameter(request, "licenceid");
            String documentType = ServletRequestUtils.getStringParameter(request, "documentType");
            String food = ServletRequestUtils.getStringParameter(request, "food");
            String renewdate = ServletRequestUtils.getStringParameter(request, "renewdate");
            String customerName = ServletRequestUtils.getStringParameter(request, "customerName");
             String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String addfull = ServletRequestUtils.getStringParameter(request, "addfull");
            String nature = ServletRequestUtils.getStringParameter(request, "nature");
            String empquantity = ServletRequestUtils.getStringParameter(request, "empquantity");
            String prop = ServletRequestUtils.getStringParameter(request, "prop");
            String partner = ServletRequestUtils.getStringParameter(request, "partner");
            String water = ServletRequestUtils.getStringParameter(request, "water");
            String product = ServletRequestUtils.getStringParameter(request, "product");
            String turnover = ServletRequestUtils.getStringParameter(request, "turnover");
            String ifr = ServletRequestUtils.getStringParameter(request, "ifr");
            String changes = ServletRequestUtils.getStringParameter(request, "changes");
            String decideAmnt = ServletRequestUtils.getStringParameter(request, "decideAmnt");
            String amountPaid = ServletRequestUtils.getStringParameter(request, "amountPaid");
            String balAmnt = ServletRequestUtils.getStringParameter(request, "balAmnt");
            String refName = ServletRequestUtils.getStringParameter(request, "refName");
             String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String adhr = ServletRequestUtils.getStringParameter(request, "adhr");
            String vot = ServletRequestUtils.getStringParameter(request, "vot");
            String pass = ServletRequestUtils.getStringParameter(request, "pass");
            String dri = ServletRequestUtils.getStringParameter(request, "dri");
            String pan = ServletRequestUtils.getStringParameter(request, "pan");
            String light = ServletRequestUtils.getStringParameter(request, "light");
            String rent = ServletRequestUtils.getStringParameter(request, "rent");
            String let = ServletRequestUtils.getStringParameter(request, "let");
            String map = ServletRequestUtils.getStringParameter(request, "map");
            String gum = ServletRequestUtils.getStringParameter(request, "gum");
            String noc = ServletRequestUtils.getStringParameter(request, "noc");
            String shop = ServletRequestUtils.getStringParameter(request, "shop");
            String AB = ServletRequestUtils.getStringParameter(request, "AB");
            String chargesa = ServletRequestUtils.getStringParameter(request, "chargesa");
            String chargesb = ServletRequestUtils.getStringParameter(request, "chargesb");
            String chargesc = ServletRequestUtils.getStringParameter(request, "chargesc");
            FoodModel foodmodel = new FoodModel();
            // foodmodel.setLicenceid(licenceid);
            foodmodel.setDocType(documentType);
            foodmodel.setFood(food);
            foodmodel.setRenewdate(renewdate);
            foodmodel.setCustName(customerName);
            foodmodel.setContactNo(contactNo);
            foodmodel.setAddress(addfull);
            foodmodel.setNature(nature);
            foodmodel.setEmpquantity(empquantity);
            foodmodel.setProp(prop);
            foodmodel.setPartner(partner);
            foodmodel.setWater(water);
            foodmodel.setProduct(product);
            foodmodel.setTurnover(turnover);
            foodmodel.setIfr(ifr);
            foodmodel.setChanges(changes);
            foodmodel.setDecidedAmt(decideAmnt);
            foodmodel.setAmtPaid(amountPaid);
            foodmodel.setBalAmt(balAmnt);
            foodmodel.setRefName(refName);
            foodmodel.setSubmitDate(submitDate);
            foodmodel.setAdhr(adhr);
            foodmodel.setVot(vot);
            foodmodel.setPass(pass);
            foodmodel.setDri(dri);
            foodmodel.setPan(pan);
            foodmodel.setLight(light);
            foodmodel.setRent(rent);
            foodmodel.setLet(let);
            foodmodel.setMap(map);
            foodmodel.setGum(gum);
            foodmodel.setNoc(noc);
            foodmodel.setShop(shop);
            foodmodel.setAB(AB);
            foodmodel.setChargesa(chargesa);
            foodmodel.setChargesb(chargesb);
            foodmodel.setChargesc(chargesc);

            int foodlicense = foodservice.addfoodlicence(foodmodel);
           /* List foodList1 = foodservice.viewfoodDetailCompany(firm);
            List foodList2 = foodservice.viewfoodDetailPropertiorName(prop);*/
            List foodList3=foodservice.viewfoodDetailContact(contactNo);
            mv.setViewName("index");
            return mv;
        }

        
        
        
        
        if (action.equals("addlic1")) {
            //     Integer licid=ServletRequestUtils.getIntParameter(request,"licid");
            String iscustName = ServletRequestUtils.getStringParameter(request, "iscustName");
            String isdocType = ServletRequestUtils.getStringParameter(request, "isdocType");
            String issubmitDate = ServletRequestUtils.getStringParameter(request, "issubmitDate");

            String iscontactNo = ServletRequestUtils.getStringParameter(request, "iscontactNo");
            String isfn = ServletRequestUtils.getStringParameter(request, "isfn");
            String isimhn = ServletRequestUtils.getStringParameter(request, "isimhn");
            String isdob = ServletRequestUtils.getStringParameter(request, "isdob");
            String isaddress = ServletRequestUtils.getStringParameter(request, "isaddress");
            String isst = ServletRequestUtils.getStringParameter(request, "isst");
            String ispt = ServletRequestUtils.getStringParameter(request, "ispt");
            String isvm = ServletRequestUtils.getStringParameter(request, "isvm");
            String isnone = ServletRequestUtils.getStringParameter(request, "isnone");
            String isht = ServletRequestUtils.getStringParameter(request, "isht");
            String iswt = ServletRequestUtils.getStringParameter(request, "iswt");
            String isidm = ServletRequestUtils.getStringParameter(request, "isidm");
            String isjod = ServletRequestUtils.getStringParameter(request, "isjod");
            String isban = ServletRequestUtils.getStringParameter(request, "isban");
            String isbran = ServletRequestUtils.getStringParameter(request, "isbran");
            String isifsc = ServletRequestUtils.getStringParameter(request, "isifsc");
            String isbankacc = ServletRequestUtils.getStringParameter(request, "isbankacc");
            String isopno = ServletRequestUtils.getStringParameter(request, "isopno");
            String isopno2 = ServletRequestUtils.getStringParameter(request, "isopno2");
            String isocmpnm = ServletRequestUtils.getStringParameter(request, "isocmpnm");
            String isqyfmm = ServletRequestUtils.getStringParameter(request, "isqyfmm");
            String isfrae = ServletRequestUtils.getStringParameter(request, "isfrae");
            String ismrae = ServletRequestUtils.getStringParameter(request, "ismrae");
            String isbrae = ServletRequestUtils.getStringParameter(request, "isbrae");
            String issrae = ServletRequestUtils.getStringParameter(request, "issrae");
            String ishwae = ServletRequestUtils.getStringParameter(request, "ishwae");
            String iscdae = ServletRequestUtils.getStringParameter(request, "iscdae");
            String isdecidedAmt = ServletRequestUtils.getStringParameter(request, "isdecidedAmt");
            String isbalAmt = ServletRequestUtils.getStringParameter(request, "isbalAmt");
            String isamtPaid = ServletRequestUtils.getStringParameter(request, "isamtPaid");
            String isrene = ServletRequestUtils.getStringParameter(request, "isrene");
            String brcr = ServletRequestUtils.getStringParameter(request, "brcr");
            String sclvc = ServletRequestUtils.getStringParameter(request, "sclvc");
            String thbc = ServletRequestUtils.getStringParameter(request, "thbc");
            String gc = ServletRequestUtils.getStringParameter(request, "gc");
            String ahecy = ServletRequestUtils.getStringParameter(request, "ahecy");
            String frif = ServletRequestUtils.getStringParameter(request, "frif");
            String sysp = ServletRequestUtils.getStringParameter(request, "sysp");
            String adcd = ServletRequestUtils.getStringParameter(request, "adcd");
            String pacr = ServletRequestUtils.getStringParameter(request, "pacr");
            String drliva = ServletRequestUtils.getStringParameter(request, "drliva");
            String vgid = ServletRequestUtils.getStringParameter(request, "vgid");
            String pssprt = ServletRequestUtils.getStringParameter(request, "pssprt");
            String cdid = ServletRequestUtils.getStringParameter(request, "cdid");
            String rncd = ServletRequestUtils.getStringParameter(request, "rncd");
            String ltbl = ServletRequestUtils.getStringParameter(request, "ltbl");
            String voigid = ServletRequestUtils.getStringParameter(request, "voigid");
            String passp = ServletRequestUtils.getStringParameter(request, "passp");
            String bpass = ServletRequestUtils.getStringParameter(request, "bpass");
            String irano = ServletRequestUtils.getStringParameter(request, "irano");

            lic li = new lic();

            li.setCustName(iscustName);
            li.setDocType(isdocType);
            li.setSubmitDate(issubmitDate);
            li.setDecidedAmt(isdecidedAmt);
            li.setIsfn(isfn);
            li.setIsimhn(isimhn);
            li.setIsdob(isdob);
            li.setIsaddress(isaddress);
            li.setIsst(isst);
            li.setIspt(ispt);
            li.setIsvm(isvm);
            li.setIsnone(isnone);
            li.setIsht(isht);
            li.setIswt(iswt);
            li.setIsidm(isidm);
            li.setIsjod(isjod);
            li.setIsban(isban);
            li.setIsfrae(isfrae);
            li.setIsmrae(ismrae);
            li.setIssrae(issrae);
            li.setIsbran(isbran);
            li.setIsifsc(isifsc);
            li.setIsbankacc(isbankacc);
            li.setIsopno(isopno);
            li.setIsopno2(isopno2);
            li.setIsocmpnm(isocmpnm);
            li.setIsqyfmm(isqyfmm);
            li.setIshwae(ishwae);
            li.setIscdae(iscdae);
            li.setContactNo(iscontactNo);
            li.setAmtPaid(isamtPaid);
            li.setBalAmt(isbalAmt);
            li.setIsrene(isrene);
            li.setBrcr(brcr);
            li.setSclvc(sclvc);
            li.setThbc(thbc);
            li.setGc(gc);
            li.setAhecy(ahecy);
            li.setFrif(frif);
            li.setSysp(sysp);
            li.setAdcd(adcd);
            li.setPacr(pacr);
            li.setDrliva(drliva);
            li.setVgid(vgid);
            li.setPassp(passp);
            li.setBpass(bpass);
            li.setIrano(irano);

            int addlic = lServices.addLic(li);

            List liclist = lServices.viewlicDetailsMobileNo(iscontactNo);
            List liclist1 = lServices.viewlicDetailsCustomerName(iscustName);

            mv.setViewName("index");
            return mv;
        }
        
        
         if (action.equals("addSalaryIt"))
{
            String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String itType = ServletRequestUtils.getStringParameter(request, "itType");
            String panNo = ServletRequestUtils.getStringParameter(request, "panNo");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String surName = ServletRequestUtils.getStringParameter(request, "surName");
            String dateOfBirth = ServletRequestUtils.getStringParameter(request, "dateOfBirth");
             String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String itMakeValue = ServletRequestUtils.getStringParameter(request, "itMakeValue");
            String textPaidArea = ServletRequestUtils.getStringParameter(request, "textPaidArea");
            String licPremPaid = ServletRequestUtils.getStringParameter(request, "licPremPaid");
            String medicalPrem = ServletRequestUtils.getStringParameter(request, "medicalPrem");
            String hraInterest = ServletRequestUtils.getStringParameter(request, "hraInterest");
            String natureOfBuisness = ServletRequestUtils.getStringParameter(request, "natureOfBuisness");
            String salaryRsMly = ServletRequestUtils.getStringParameter(request, "salaryRsMly");
            String companyName = ServletRequestUtils.getStringParameter(request, "companyName");
            String post = ServletRequestUtils.getStringParameter(request, "post");
            String bnkAccNo = ServletRequestUtils.getStringParameter(request, "bnkAccNo");
            String branch = ServletRequestUtils.getStringParameter(request, "branch");
            String ifscCode = ServletRequestUtils.getStringParameter(request, "ifscCode");
            String micrCode = ServletRequestUtils.getStringParameter(request, "micrCode");
            String additionalInfo1 = ServletRequestUtils.getStringParameter(request, "additionalInfo1");
            String additionalInfo2 = ServletRequestUtils.getStringParameter(request, "additionalInfo2");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String refAmt = ServletRequestUtils.getStringParameter(request, "refAmt");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String panCard = ServletRequestUtils.getStringParameter(request, "panCard");
            String aadharCard = ServletRequestUtils.getStringParameter(request, "aadharCard");
            String votingCard = ServletRequestUtils.getStringParameter(request, "votingCard");
            String passportValid = ServletRequestUtils.getStringParameter(request, "passportValid");
            String drivingLicn = ServletRequestUtils.getStringParameter(request, "drivingLicn");
            String rationCard = ServletRequestUtils.getStringParameter(request, "rationCard");
            String lightBill = ServletRequestUtils.getStringParameter(request, "lightBill");
            String salaryItPaper = ServletRequestUtils.getStringParameter(request, "salaryItPaper");
            String canclCheq = ServletRequestUtils.getStringParameter(request, "canclCheq");
            String bankDetails = ServletRequestUtils.getStringParameter(request, "bankDetails");
            String investmentCopy = ServletRequestUtils.getStringParameter(request, "investmentCopy");
            String loanEmi = ServletRequestUtils.getStringParameter(request, "loanEmi");
            String gumasta = ServletRequestUtils.getStringParameter(request, "gumasta");
            String currentAcc = ServletRequestUtils.getStringParameter(request, "currentAcc");
            String investment = ServletRequestUtils.getStringParameter(request, "investment");
            String Loan = ServletRequestUtils.getStringParameter(request, "Loan");
       
            salaryIt SalaryIt=new salaryIt();

            
            SalaryIt.setItType(itType);
            SalaryIt.setDocType(docType);
            SalaryIt.setPanNo(panNo);
            SalaryIt.setCustName(custName);
            SalaryIt.setSurName(surName);
            SalaryIt.setDateOfBirth(dateOfBirth);
            SalaryIt.setContactNo(contactNo);
            SalaryIt.setAddress(address);
            SalaryIt.setItMakeValue(itMakeValue);
            SalaryIt.setTextPaidArea(textPaidArea);
            SalaryIt.setLicPremPaid(licPremPaid);
            SalaryIt.setMedicalPrem(medicalPrem);
            SalaryIt.setHraInterest(hraInterest);
            SalaryIt.setNatureOfBuisness(natureOfBuisness);
            SalaryIt.setSalaryRsMly(salaryRsMly);
            SalaryIt.setSalaryItPaper(salaryItPaper);
            SalaryIt.setCompanyName(companyName);
            SalaryIt.setPost(post);
            SalaryIt.setBnkAccNo(bnkAccNo);
            SalaryIt.setBranch(branch);
            SalaryIt.setIfscCode(ifscCode);
            SalaryIt.setMicrCode(micrCode);
            SalaryIt.setAdditionalInfo1(additionalInfo1);
            SalaryIt.setAdditionalInfo2(additionalInfo2);
            SalaryIt.setDecidedAmt(decidedAmt);
            SalaryIt.setAmtPaid(amtPaid);
            SalaryIt.setBalAmt(balAmt);
            SalaryIt.setRefAmt(refAmt);
            SalaryIt.setSubmitDate(submitDate);
            SalaryIt.setPanCard(panCard);
            SalaryIt.setAadharCard(aadharCard);
            SalaryIt.setVotingCard(votingCard);
            SalaryIt.setPassportValid(passportValid);
            SalaryIt.setDrivingLicn(drivingLicn);
            SalaryIt.setRationCard(rationCard);
            SalaryIt.setLightBill(lightBill);
            SalaryIt.setSalaryItPaper(salaryItPaper);
            SalaryIt.setCanclCheq(canclCheq);
            SalaryIt.setBankDetails(bankDetails);
            SalaryIt.setInvestmentCopy(investmentCopy);
            SalaryIt.setLoanEmi(loanEmi);
            SalaryIt.setGumasta(gumasta);
            SalaryIt.setCurrentAcc(currentAcc);
            SalaryIt.setInvestment(investment);
            SalaryIt.setLoan(Loan);
            
             int SalIt=salItServices.addsalaryIt(SalaryIt);
             
         List viewsalaryItDetailsCustName=salItServices.viewsalaryItDetailsCustName(custName);
         List viewsalaryItDetailsContactNo=salItServices.viewsalaryItDetailsContactNo(contactNo);
             
        mv.setViewName("index");
        return mv;
        }
        
        
        
        
        
        
        
        
        
        
        
         if (action.equals("addotherwork1")) {
            String FormType = ServletRequestUtils.getStringParameter(request, "FormType");
             String subDate = ServletRequestUtils.getStringParameter(request, "subDate");
            String WorkName = ServletRequestUtils.getStringParameter(request, "WorkName");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String dob = ServletRequestUtils.getStringParameter(request, "dob");
            String ADDFULL = ServletRequestUtils.getStringParameter(request, "ADDFULL");
            String NOTESOFREMARK = ServletRequestUtils.getStringParameter(request, "NOTESOFREMARK");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String advAmt = ServletRequestUtils.getStringParameter(request, "advAmt");
            String REFRENCENAME = ServletRequestUtils.getStringParameter(request, "REFRENCENAME");
            String isPANCARD = ServletRequestUtils.getStringParameter(request, "isPANCARD");
            String isPASSPORTVALID = ServletRequestUtils.getStringParameter(request, "isPASSPORTVALID");
            String isDRIVLICNVALID = ServletRequestUtils.getStringParameter(request, "isDRIVLICNVALID");
            String isVOTINGID = ServletRequestUtils.getStringParameter(request, "isVOTINGID");
            String isAADHARCARD = ServletRequestUtils.getStringParameter(request, "isAADHARCARD");
            String isRATIONCARD = ServletRequestUtils.getStringParameter(request, "isRATIONCARD");
            String isLIGHTBILL = ServletRequestUtils.getStringParameter(request, "isLIGHTBILL");
            String isAADHARCARD1 = ServletRequestUtils.getStringParameter(request, "isAADHARCARD1");
            String isSOCIETYRESILETTER = ServletRequestUtils.getStringParameter(request, "isSOCIETYRESILETTER");
            String isGOVTBANKPASSBOOK = ServletRequestUtils.getStringParameter(request, "isGOVTBANKPASSBOOK");
            String isLICPOLICY = ServletRequestUtils.getStringParameter(request, "isLICPOLICY");
            String isRENETDAGREEMENT = ServletRequestUtils.getStringParameter(request, "isRENETDAGREEMENT");
            String OTHERWORK = ServletRequestUtils.getStringParameter(request, "OTHERWORK");

            otherwork ow = new otherwork();

            ow.setFormType(FormType);
            ow.setSubmitDate(subDate);
            ow.setWorkName(WorkName);
            ow.setCustName(custName);
            ow.setContactNo(contactNo);
            ow.setDob(dob);
            ow.setAddress(ADDFULL);
            ow.setNOTESOFREMARK(NOTESOFREMARK);
            ow.setDecidedAmt(decidedAmt);
            
            ow.setBalAmt(balAmt);
            ow.setAmtPaid(advAmt);
            ow.setREFRENCENAME(REFRENCENAME);
            ow.setIsPANCARD(isPANCARD);
            ow.setIsPASSPORTVALID(isPASSPORTVALID);
            ow.setIsDRIVLICNVALID(isDRIVLICNVALID);
            ow.setIsVOTINGID(isVOTINGID);
            ow.setIsAADHARCARD(isAADHARCARD);
            ow.setIsRATIONCARD(isRATIONCARD);
            ow.setIsLIGHTBILL(isLIGHTBILL);
            ow.setIsAADHARCARD1(isAADHARCARD1);
            ow.setIsSOCIETYRESILETTER(isSOCIETYRESILETTER);
            ow.setIsGOVTBANKPASSBOOK(isGOVTBANKPASSBOOK);
            ow.setIsLICPOLICY(isLICPOLICY);
            ow.setIsRENETDAGREEMENT(isRENETDAGREEMENT);
            ow.setOTHERWORK(OTHERWORK);
            

            int addotherwork = othServices.addOtherwork(ow);
            
            List otherworkList = othServices.viewotherworkDetailsCustomerName(custName);

            mv.setViewName("index");
            return mv;

        }

        
        if (action.equals("addgetGrantRenewal1")) {
            String subDate = ServletRequestUtils.getStringParameter(request, "subDate");
            String TheLicensingAuthority = ServletRequestUtils.getStringParameter(request, "TheLicensingAuthority");
            String MotorCyclewithoutgear = ServletRequestUtils.getStringParameter(request, "MotorCyclewithoutgear");
            String MotorCyclewithgear = ServletRequestUtils.getStringParameter(request, "MotorCyclewithgear");
            String InvalidCarriages = ServletRequestUtils.getStringParameter(request, "InvalidCarriages");
            String LightMotorVehicle = ServletRequestUtils.getStringParameter(request, "LightMotorVehicle");
            String MediumMotorCycle = ServletRequestUtils.getStringParameter(request, "MediumMotorCycle");
            String HeavygoodsVehicle = ServletRequestUtils.getStringParameter(request, "HeavygoodsVehicle");
            String RoadRollers = ServletRequestUtils.getStringParameter(request, "HeavyPassengerMotorVehicle");
            String MotorVehicleoffollowingdescription = ServletRequestUtils.getStringParameter(request, "isMotorVehicleoffollowingdescription");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String Son = ServletRequestUtils.getStringParameter(request, "Son");
            String PermanentAddress = ServletRequestUtils.getStringParameter(request, "PermanentAddress");
            String TemporaryAddress = ServletRequestUtils.getStringParameter(request, "TemporaryAddress");
            String datepicker = ServletRequestUtils.getStringParameter(request, "datepicker");
            String EducationalQualification = ServletRequestUtils.getStringParameter(request, "EducationalQualification");
            String IdentificationMark = ServletRequestUtils.getStringParameter(request, "IdentificationMark");
            String BloodGroupwithRHfactor = ServletRequestUtils.getStringParameter(request, "BloodGroupwithRHfactor");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String advAmt = ServletRequestUtils.getStringParameter(request, "advAmt");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String refrencename = ServletRequestUtils.getStringParameter(request, "refrencename");

            String Iholdaneffectivedrivinglicencetodrive = ServletRequestUtils.getStringParameter(request, "Iholdaneffectivedrivinglicencetodrive");
            String Particulars = ServletRequestUtils.getStringParameter(request, "Particulars");
            String Particularsof = ServletRequestUtils.getStringParameter(request, "Particularsof");
            String Haveyoubeen = ServletRequestUtils.getStringParameter(request, "Haveyoubeen");
            String issuedbythe = ServletRequestUtils.getStringParameter(request, "issuedbythe");
            String IencloseMedical = ServletRequestUtils.getStringParameter(request, "IencloseMedical");
            String IencloseDriving = ServletRequestUtils.getStringParameter(request, "IencloseDriving");
            String issuedby = ServletRequestUtils.getStringParameter(request, "issuedby");

            addGrantRenewal gr = new addGrantRenewal();
            gr.setSubmitDate(subDate);
            gr.setTheLicensingAuthority(TheLicensingAuthority);
            gr.setMotorCyclewithoutgear(MotorCyclewithoutgear);
            gr.setMotorCyclewithgear(MotorCyclewithgear);
            gr.setInvalidCarriages(InvalidCarriages);
            gr.setLightMotorVehicle(LightMotorVehicle);
            gr.setMediumMotorCycle(MediumMotorCycle);
            gr.setHeavygoodsVehicle(HeavygoodsVehicle);
            gr.setRoadRollers(RoadRollers);
            gr.setMotorVehicleoffollowingdescription(MotorVehicleoffollowingdescription);
            gr.setCustName(custName);
            gr.setSon(Son);
            gr.setAddress(PermanentAddress);
            gr.setTemporaryAddress(TemporaryAddress);
            gr.setDatepicker(datepicker);
            gr.setEducationalQualification(EducationalQualification);
            gr.setIdentificationMark(IdentificationMark);
            gr.setBloodGroupwithRHfactor(BloodGroupwithRHfactor);
            gr.setDecidedAmt(decidedAmt);
            gr.setAmtPaid(action);
            gr.setBalAmt(balAmt);
            gr.setRefrencename(refrencename);

            gr.setIholdaneffectivedrivinglicencetodrive(Iholdaneffectivedrivinglicencetodrive);
            gr.setParticulars(Particulars);
            gr.setParticularsof(Particularsof);
            gr.setHaveyoubeen(Haveyoubeen);
            gr.setIssuedby(issuedby);
            gr.setIssuedbythe(issuedbythe);
            gr.setIencloseDriving(IencloseDriving);
            gr.setIencloseMedical(IencloseMedical);

            int addaddgrantrenewal = grServices.addaddgrantrenewal(gr);
            if(addaddgrantrenewal==1){
                mv.setViewName("messagePage");
                mv.addObject("msg","Save Successfully");
            return mv;
                
            }

         //   List grantrenewallist = grServices.viewgrantrenewalDetailsCustomerName(custName);
            
            else{
            mv.setViewName("messagePage");
            mv.addObject("msg","Error While Saving");
            return mv;}
        }

        
//        if (action.equals("addaadharCardDetail")) {
//
//            String oldAadharNo = ServletRequestUtils.getRequiredStringParameter(request, "oldAadharNo");
//            String selfName = ServletRequestUtils.getStringParameter(request, "selfName");
//            String mobNo = ServletRequestUtils.getStringParameter(request, "mobNo");
//            String fatherName = ServletRequestUtils.getStringParameter(request, "fatherName");
//            String husbandName = ServletRequestUtils.getStringParameter(request, "husbandName");
//            String dob = ServletRequestUtils.getStringParameter(request, "dob");
//            String address = ServletRequestUtils.getStringParameter(request, "address");
//            String changesNote = ServletRequestUtils.getStringParameter(request, "changesNote");
//            String changesNote1 = ServletRequestUtils.getStringParameter(request, "changesNote1");
//            String changesNote2 = ServletRequestUtils.getStringParameter(request, "changesNote2");
//            String decidedAmtRs = ServletRequestUtils.getStringParameter(request, "decidedAmtRs");
//            String advamt = ServletRequestUtils.getStringParameter(request, "advamt");
//            String balamt = ServletRequestUtils.getStringParameter(request, "balamt");
//            String referanceName = ServletRequestUtils.getStringParameter(request, "referanceName");
//            String birthCert = ServletRequestUtils.getStringParameter(request, "birthCert");
//            String boardcert10 = ServletRequestUtils.getStringParameter(request, "boardcert10");
//            String boardcert12 = ServletRequestUtils.getStringParameter(request, "boardcert12");
//            String graduateCopy = ServletRequestUtils.getStringParameter(request, "graduateCopy");
//            String higheredu = ServletRequestUtils.getRequiredStringParameter(request, "higheredu");
//            String schoolcert = ServletRequestUtils.getRequiredStringParameter(request, "schoolcert");
//            String pancard = ServletRequestUtils.getRequiredStringParameter(request, "pancard");
//            String passport = ServletRequestUtils.getRequiredStringParameter(request, "passport");
//            String drivingLicence = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicence");
//            String votingId = ServletRequestUtils.getRequiredStringParameter(request, "votingId");
//            String RestLetter = ServletRequestUtils.getRequiredStringParameter(request, "RestLetter");
//            String govtbankpass = ServletRequestUtils.getRequiredStringParameter(request, "govtbankpass");
//            String licpolicy = ServletRequestUtils.getRequiredStringParameter(request, "licpolicy");
//            String renetedAgree = ServletRequestUtils.getRequiredStringParameter(request, "renetedAgree");
//            String rationcard = ServletRequestUtils.getRequiredStringParameter(request, "rationcard");
//            String Votingid = ServletRequestUtils.getRequiredStringParameter(request, "Votingid");
//            String Passportadd = ServletRequestUtils.getRequiredStringParameter(request, "Passportadd");
//            String Drivinglic = ServletRequestUtils.getRequiredStringParameter(request, "Drivinglic");
//            String PassbookBank = ServletRequestUtils.getRequiredStringParameter(request, "PassbookBank");
//            String lightbill = ServletRequestUtils.getRequiredStringParameter(request, "lightbill");
//            String bankStat = ServletRequestUtils.getRequiredStringParameter(request, "bankStat");
//            String rentAgreement = ServletRequestUtils.getRequiredStringParameter(request, "rentAgreement");
//
//            aadharCard AadharCard = new aadharCard();
//            AadharCard.setOldAadharNo(oldAadharNo);
//            AadharCard.setSelfName(selfName);
//            AadharCard.setMobNo(mobNo);
//            AadharCard.setFatherName(fatherName);
//            AadharCard.setHusbandName(husbandName);
//            AadharCard.setDob(dob);
//            AadharCard.setAddress(address);
//            AadharCard.setChangesNote(changesNote);
//            AadharCard.setChangesNote1(changesNote1);
//            AadharCard.setChangesNote2(changesNote2);
//            AadharCard.setDecidedAmtRs(decidedAmtRs);
//            AadharCard.setAdvamt(advamt);
//            AadharCard.setBalamt(balamt);
//            AadharCard.setReferanceName(referanceName);
//            AadharCard.setBirthCert(birthCert);
//            AadharCard.setBoardcert10(boardcert10);
//            AadharCard.setBoardcert12(boardcert12);
//            AadharCard.setGraduateCopy(graduateCopy);
//            AadharCard.setHigheredu(higheredu);
//            AadharCard.setSchoolcert(schoolcert);
//            AadharCard.setPancard(pancard);
//            AadharCard.setPassport(passport);
//            AadharCard.setDrivingLicence(drivingLicence);
//            AadharCard.setVotingId(votingId);
//            AadharCard.setRestLetter(RestLetter);
//            AadharCard.setGovtbankpass(govtbankpass);
//            AadharCard.setLicpolicy(licpolicy);
//            AadharCard.setRenetedAgree(renetedAgree);
//            AadharCard.setRationcard(rationcard);
//            AadharCard.setVotingid(Votingid);
//            AadharCard.setPassportadd(Passportadd);
//            AadharCard.setDrivinglic(Drivinglic);
//            AadharCard.setPassbookBank(PassbookBank);
//            AadharCard.setLightbill(lightbill);
//            AadharCard.setBankStat(bankStat);
//            AadharCard.setRentAgreement(rentAgreement);
//
//            lic Lic = new lic();
//            salaryIt salIt = new salaryIt();
//            // int addlic=lServices.addLic(Lic);
//
//            int aadharList = adCServices.addAadharCard(AadharCard);
//
//            // int SalIt=salItServices.addsalaryIt(salIt);
//            mv.setViewName("index");
//            return mv;
//        }
            if (action.equals("addRationcard")) {
             String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String UpadationChange = ServletRequestUtils.getStringParameter(request, "UpadationChange");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String Dob = ServletRequestUtils.getStringParameter(request, "Dob");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String natureBusiness = ServletRequestUtils.getStringParameter(request, "natureBusiness");
            String ylyAmt = ServletRequestUtils.getStringParameter(request, "ylyAmt");
            String gasName = ServletRequestUtils.getStringParameter(request, "gasName");
            String gasGiverName = ServletRequestUtils.getStringParameter(request, "gasGiverName");
            String memFirstName1 = ServletRequestUtils.getStringParameter(request, "memFirstName1");
            String memFirstName2 = ServletRequestUtils.getStringParameter(request, "memFirstName2");
            String secMemName1 = ServletRequestUtils.getStringParameter(request, "secMemName1");
            String secMemName2 = ServletRequestUtils.getStringParameter(request, "secMemName2");
            String ThirdMemName1 = ServletRequestUtils.getStringParameter(request, "ThirdMemName1");
            String ThirdMemName2 = ServletRequestUtils.getStringParameter(request, "ThirdMemName2");
            String fourthMemName1 = ServletRequestUtils.getStringParameter(request, "fourthMemName1");
            String fourthMemName2 = ServletRequestUtils.getStringParameter(request, "fourthMemName2");
            String fifthMemName1 = ServletRequestUtils.getStringParameter(request, "fifthMemName1");
            String fifthMemName2 = ServletRequestUtils.getStringParameter(request, "fifthMemName2");
            String Pancard = ServletRequestUtils.getStringParameter(request, "Pancard");
            String votingId = ServletRequestUtils.getStringParameter(request, "votingId");
            String passportValid = ServletRequestUtils.getStringParameter(request, "passportValid");
            String DrivingLicn = ServletRequestUtils.getStringParameter(request, "DrivingLicn");
            String adharCard = ServletRequestUtils.getStringParameter(request, "adharCard");
            String lightBill = ServletRequestUtils.getStringParameter(request, "lightBill");
            String adharCard1 = ServletRequestUtils.getStringParameter(request, "adharCard1");
            String voteId = ServletRequestUtils.getStringParameter(request, "voteId");
            String socResiLet = ServletRequestUtils.getStringParameter(request, "socResiLet");
            String rentedNotary = ServletRequestUtils.getStringParameter(request, "rentedNotary");
            String ownrLightBillNoc = ServletRequestUtils.getStringParameter(request, "ownrLightBillNoc");
            String form16lstThreeyrs = ServletRequestUtils.getStringParameter(request, "form16lstThreeyrs");
            String ItFile = ServletRequestUtils.getStringParameter(request, "ItFile");
            String gasBook = ServletRequestUtils.getStringParameter(request, "gasBook");
            String talathiCert = ServletRequestUtils.getStringParameter(request, "talathiCert");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String Remarknote = ServletRequestUtils.getStringParameter(request, "Remarknote");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");

            //Set value For Saving into Database
            RationCard rationCard = new RationCard();
            rationCard.setDocType(docType);
            rationCard.setUpadationChange(UpadationChange);
            rationCard.setCustName(custName);
            rationCard.setDob(Dob);
            rationCard.setAddress(address);
            rationCard.setContactNo(contactNo);
            rationCard.setNatureBusiness(natureBusiness);
            rationCard.setYlyAmt(ylyAmt);
            rationCard.setGasName(gasName);
            rationCard.setGasGiverName(gasGiverName);
            rationCard.setMemFirstName1(memFirstName1);
            rationCard.setMemFirstName2(memFirstName2);
            rationCard.setSecMemName1(secMemName1);
            rationCard.setSecMemName2(secMemName2);
            rationCard.setThirdMemName1(ThirdMemName1);
            rationCard.setThirdMemName2(ThirdMemName2);
            rationCard.setFourthMemName1(fourthMemName1);
            rationCard.setFourthMemName2(fourthMemName2);
            rationCard.setFifthMemName1(fifthMemName1);
            rationCard.setPancard(Pancard);
            rationCard.setVotingId(votingId);
            rationCard.setPassportValid(passportValid);
            rationCard.setDrivingLicn(DrivingLicn);
            rationCard.setAdharCard(adharCard);
            rationCard.setLightBill(lightBill);
            rationCard.setAdharCard1(adharCard1);
            rationCard.setVoteId(voteId);
            rationCard.setSocResiLet(socResiLet);
            rationCard.setRentedNotary(rentedNotary);
            rationCard.setOwnrLightBillNoc(ownrLightBillNoc);
            rationCard.setForm16lstThreeyrs(form16lstThreeyrs);
            rationCard.setItFile(ItFile);
            rationCard.setGasName(gasName);
            rationCard.setTalathiCert(talathiCert);
            rationCard.setDecidedAmt(decidedAmt);
            rationCard.setAmtPaid(amtPaid);
            rationCard.setBalAmt(balAmt);
            rationCard.setRemarknote(Remarknote);
            rationCard.setSubmitDate(submitDate);
  

            int RationCard = rServices.addRation(rationCard);
           List RationCardList=rServices.viewRationCardDetailsCustomerName(custName);
            mv.setViewName("index");
            return mv;
        }
             if (action.equals("addaadharCardDetail")) {

            String docType = ServletRequestUtils.getRequiredStringParameter(request, "docType");
            String oldAadharNo = ServletRequestUtils.getRequiredStringParameter(request, "oldAadharNo");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String fatherName = ServletRequestUtils.getStringParameter(request, "fatherName");
            String husbandName = ServletRequestUtils.getStringParameter(request, "husbandName");
            String dob = ServletRequestUtils.getStringParameter(request, "dob");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String changesNote = ServletRequestUtils.getStringParameter(request, "changesNote");
            String changesNote1 = ServletRequestUtils.getStringParameter(request, "changesNote1");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String Remarknote = ServletRequestUtils.getStringParameter(request, "Remarknote");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String birthCert = ServletRequestUtils.getStringParameter(request, "birthCert");
            String boardcert10 = ServletRequestUtils.getStringParameter(request, "boardcert10");
            String boardcert12 = ServletRequestUtils.getStringParameter(request, "boardcert12");
            String graduateCopy = ServletRequestUtils.getStringParameter(request, "graduateCopy");
            String higheredu = ServletRequestUtils.getRequiredStringParameter(request, "higheredu");
            String schoolcert = ServletRequestUtils.getRequiredStringParameter(request, "schoolcert");
            String pancard = ServletRequestUtils.getRequiredStringParameter(request, "pancard");
            String passport = ServletRequestUtils.getRequiredStringParameter(request, "passport");
            String drivingLicence = ServletRequestUtils.getRequiredStringParameter(request, "drivingLicence");
            String votingId = ServletRequestUtils.getRequiredStringParameter(request, "votingId");
            String RestLetter = ServletRequestUtils.getRequiredStringParameter(request, "RestLetter");
            String govtbankpass = ServletRequestUtils.getRequiredStringParameter(request, "govtbankpass");
            String licpolicy = ServletRequestUtils.getRequiredStringParameter(request, "licpolicy");
            String renetedAgree = ServletRequestUtils.getRequiredStringParameter(request, "renetedAgree");
            String rationcard = ServletRequestUtils.getRequiredStringParameter(request, "rationcard");
            String Votingid = ServletRequestUtils.getRequiredStringParameter(request, "Votingid");
            String Passportadd = ServletRequestUtils.getRequiredStringParameter(request, "Passportadd");
            String Drivinglic = ServletRequestUtils.getRequiredStringParameter(request, "Drivinglic");
            String PassbookBank = ServletRequestUtils.getRequiredStringParameter(request, "PassbookBank");
            String lightbill = ServletRequestUtils.getRequiredStringParameter(request, "lightbill");
            String bankStat = ServletRequestUtils.getRequiredStringParameter(request, "bankStat");
            String rentAgreement = ServletRequestUtils.getRequiredStringParameter(request, "rentAgreement");

            aadharCard AadharCard = new aadharCard();
            AadharCard.setDocType(docType);
            AadharCard.setOldAadharNo(oldAadharNo);
            AadharCard.setCustName(custName);
            AadharCard.setContactNo(contactNo);
            AadharCard.setFatherName(fatherName);
            AadharCard.setHusbandName(husbandName);
            AadharCard.setDob(dob);
            AadharCard.setAddress(address);
            AadharCard.setChangesNote(changesNote);
            AadharCard.setChangesNote1(changesNote1);
            AadharCard.setDecidedAmt(decidedAmt);
            AadharCard.setAmtPaid(amtPaid);
            AadharCard.setBalAmt(balAmt);
            AadharCard.setRemarknote(Remarknote);
            AadharCard.setSubmitDate(submitDate);
            AadharCard.setBirthCert(birthCert);
            AadharCard.setBoardcert10(boardcert10);
            AadharCard.setBoardcert12(boardcert12);
            AadharCard.setGraduateCopy(graduateCopy);
            AadharCard.setHigheredu(higheredu);
            AadharCard.setSchoolcert(schoolcert);
            AadharCard.setPancard(pancard);
            AadharCard.setPassport(passport);
            AadharCard.setDrivingLicence(drivingLicence);
            AadharCard.setVotingId(votingId);
            AadharCard.setRestLetter(RestLetter);
            AadharCard.setGovtbankpass(govtbankpass);
            AadharCard.setLicpolicy(licpolicy);
            AadharCard.setRenetedAgree(renetedAgree);
            AadharCard.setRationcard(rationcard);
            AadharCard.setVotingid(Votingid);
            AadharCard.setPassportadd(Passportadd);
            AadharCard.setDrivinglic(Drivinglic);
            AadharCard.setPassbookBank(PassbookBank);
            AadharCard.setLightbill(lightbill);
            AadharCard.setBankStat(bankStat);
            AadharCard.setRentAgreement(rentAgreement);

//            lic Lic=new lic();
//            salaryIt salIt=new salaryIt();
            lic Lic = new lic();
            salaryIt salIt = new salaryIt();

           // int addlic=lServices.addLic(Lic);
            int aadharList = adCServices.addAadharCard(AadharCard);

            // int SalIt=salItServices.addsalaryIt(salIt);
            mv.setViewName("index");
            return mv;
        }

 if (action.equals("add2w1")) {
             String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String middleName = ServletRequestUtils.getStringParameter(request, "middleName");
            String lastName = ServletRequestUtils.getStringParameter(request, "lastName");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String landmarkaddnear = ServletRequestUtils.getStringParameter(request, "landmarkaddnear");
            String vehicleno = ServletRequestUtils.getStringParameter(request, "vehicleno");
            String whichbikedetail = ServletRequestUtils.getStringParameter(request, "whichbikedetail");
            String modelyear = ServletRequestUtils.getStringParameter(request, "modelyear");
            String lstyrpolicydetail = ServletRequestUtils.getStringParameter(request, "lstyrpolicydetail");
            String bikecolour = ServletRequestUtils.getStringParameter(request, "bikecolour");
            String loanhyponame = ServletRequestUtils.getStringParameter(request, "loanhyponame");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String Remarknote = ServletRequestUtils.getStringParameter(request, "Remarknote");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
            String photobike = ServletRequestUtils.getStringParameter(request, "photobike");
            String oldrcbookxrx = ServletRequestUtils.getStringParameter(request, "oldrcbookxrx");
            String oldinsrncecpyxrx = ServletRequestUtils.getStringParameter(request, "oldinsrncecpyxrx");
            String letterncb = ServletRequestUtils.getStringParameter(request, "letterncb");


            //Set value For Saving into Database
            twowfourwh TwowFourw = new twowfourwh();
            TwowFourw.setDocType(docType);
            TwowFourw.setCustName(custName);
            TwowFourw.setMiddleName(middleName);
            TwowFourw.setAddress(address);
            TwowFourw.setContactNo(contactNo);
            TwowFourw.setLandmarkaddnear(landmarkaddnear);
            TwowFourw.setVehicleno(vehicleno);
            TwowFourw.setWhichbikedetail(whichbikedetail);
            TwowFourw.setModelyear(modelyear);
            TwowFourw.setLstyrpolicydetail(lstyrpolicydetail);
            TwowFourw.setBikecolour(bikecolour);
            TwowFourw.setLoanhyponame(loanhyponame);
            TwowFourw.setDecidedAmt(decidedAmt);
            TwowFourw.setAmtPaid(amtPaid);
            TwowFourw.setBalAmt(balAmt);
            TwowFourw.setRemarknote(Remarknote);
            TwowFourw.setSubmitDate(submitDate);
            TwowFourw.setPhotobike(photobike);
            TwowFourw.setOldrcbookxrx(oldrcbookxrx);
            TwowFourw.setOldinsrncecpyxrx(oldinsrncecpyxrx);
            TwowFourw.setLetterncb(letterncb);

            int twowFourwh = tservice.addTwowfourw(TwowFourw);
            List twowfourwhList=tservice.viewtwowfourwhDetailsCustomerName(custName);

            mv.setViewName("index");
            return mv;
        }

      

        
        
        
if (action.equals("openRationCard"))
{
 mv.setViewName("RationCard");
        return mv;

}
if (action.equals("openOtherWork"))
{
 mv.setViewName("otherwork");
        return mv;

}
if (action.equals("openPassport"))
{
 mv.setViewName("passport");
        return mv;

}
if (action.equals("openReport"))
{
 mv.setViewName("report");
        return mv;

}


if (action.equals("openTwbikeInsurance"))
{
 mv.setViewName("TwbikeInsurance");
        return mv;

}
if (action.equals("openPancard"))
{
 mv.setViewName("Pancard");
        return mv;
}
if (action.equals("openGumasta"))
{
 mv.setViewName("gumasta");
        return mv;
}
if (action.equals("openLearningDriving"))
{
 mv.setViewName("driving");
        return mv;
}
if (action.equals("openGrantRenewal"))
{
 mv.setViewName("grantrenewal");
        return mv;
}
if (action.equals("openAadharCard"))
{
 mv.setViewName("aadharCard");
        return mv;
}

if (action.equals("openLic"))
{
 mv.setViewName("lic");
        return mv;
}

if (action.equals("openLoanFile"))
{
 mv.setViewName("loanfile");
        return mv;
}
if (action.equals("openMediclaim"))
{
 mv.setViewName("mediclaim");
        return mv;
}
if (action.equals("openSalaryIt"))
{
 mv.setViewName("salary_It");
        return mv;
}
if (action.equals("openFoodLicence"))
{
 mv.setViewName("FoodLicence");
        return mv;
}




  if (action.equals("viewreportdetails")) {
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String subDate = ServletRequestUtils.getStringParameter(request, "subDate");
            String formType = ServletRequestUtils.getStringParameter(request, "formType");
//              viewReport vr= new viewReport();
//              vr.setCustName(CustName);
//              vr.setContactNo(contactNo);
//             vr.setSubDate(subDate);
//              vr.setFormType(formType);
             
            List custDetails=lServices.viewCustomerReport(contactNo, custName, subDate, formType);
               mv.setViewName("viewReportDetails");
               mv.addObject("custDetails",custDetails);
               mv.addObject("custName",custName);
               mv.addObject("contactNo",contactNo);
               mv.addObject("subDate",subDate);
               mv.addObject("formType",formType);
               
            return mv;
        }

      

 if(action.equals("addPancard")) {
            String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String CorrectionForm = ServletRequestUtils.getStringParameter(request, "CorrectionForm");
            String OldpanNo = ServletRequestUtils.getStringParameter(request, "OldpanNo");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String FatherName = ServletRequestUtils.getStringParameter(request, "FatherName");
            String SurName = ServletRequestUtils.getStringParameter(request, "SurName");
            String HusbandName = ServletRequestUtils.getStringParameter(request, "HusbandName");
            String Dob = ServletRequestUtils.getStringParameter(request, "Dob");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo = ServletRequestUtils.getStringParameter(request, "contactNo");
            String BirthCert = ServletRequestUtils.getStringParameter(request, "BirthCert");
            String sscCert = ServletRequestUtils.getStringParameter(request, "sscCert");
            String hscCert = ServletRequestUtils.getStringParameter(request, "hscCert");
            String marriageCert = ServletRequestUtils.getStringParameter(request, "marriageCert");
            String magisrateCharge = ServletRequestUtils.getStringParameter(request, "magisrateCharge");
            String adharCard = ServletRequestUtils.getStringParameter(request, "adharCard");
            String passprtValid = ServletRequestUtils.getStringParameter(request, "passprtValid");
            String drivngLicn = ServletRequestUtils.getStringParameter(request, "drivngLicn");
            String votingId = ServletRequestUtils.getStringParameter(request, "votingId");
            String domicileCert = ServletRequestUtils.getStringParameter(request, "domicileCert");
            String adharCard1 = ServletRequestUtils.getStringParameter(request, "adharCard1");
            String voteId = ServletRequestUtils.getStringParameter(request, "voteId");
            String passportValid = ServletRequestUtils.getStringParameter(request, "passportValid");
            String drivingLicvalid = ServletRequestUtils.getStringParameter(request, "drivingLicvalid");
            String bankPaPhoto = ServletRequestUtils.getStringParameter(request, "bankPaPhoto");
            String corpeterLetter = ServletRequestUtils.getStringParameter(request, "corpeterLetter");
            String notory = ServletRequestUtils.getStringParameter(request, "notory");
            String addProof = ServletRequestUtils.getStringParameter(request, "addProof");
            String domCert = ServletRequestUtils.getStringParameter(request, "domCert");
            String decidedAmt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String amtPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String balAmt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String Remarknote = ServletRequestUtils.getStringParameter(request, "Remarknote");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");
           
            
            
            
            //Set value For Saving into Database
            PanCard pancard = new PanCard();
            pancard.setDocType(docType);
            pancard.setCorrectionForm(CorrectionForm);
            pancard.setOldpanNo(OldpanNo);
            pancard.setCustName(custName);
            pancard.setFatherName(FatherName);
            pancard.setSurName(SurName);
            pancard.setHusbandName(HusbandName);
            pancard.setDob(Dob);
            pancard.setAddress(address);
            pancard.setContactNo(contactNo);
            pancard.setBirthCert(BirthCert);
            pancard.setSscCert(sscCert);
            pancard.setHscCert(hscCert);
            pancard.setMarriageCert(marriageCert);
            pancard.setMagisrateCharge(magisrateCharge);
            pancard.setAdharCard(adharCard);
            pancard.setPassportValid(passportValid);
            pancard.setDrivngLicn(drivngLicn);
            pancard.setVotingId(votingId);
            pancard.setDomicileCert(domicileCert);
            pancard.setAdharCard1(adharCard1);
            pancard.setVoteId(voteId);
            pancard.setPassportValid(passportValid);
            pancard.setDrivingLicvalid(drivingLicvalid);
            pancard.setBankPaPhoto(bankPaPhoto);
            pancard.setCorpeterLetter(corpeterLetter);
            pancard.setNotory(notory);
            pancard.setAddProof(addProof);
            pancard.setDomCert(domCert);
            pancard.setDecidedAmt(decidedAmt);
            pancard.setAmtPaid(amtPaid);
            pancard.setBalAmt(balAmt);
            pancard.setRemarknote(Remarknote);
            pancard.setSubmitDate(submitDate);
     

            int PanCard = pcardservice.addPanCard(pancard);

//            List PanCardList=pcardservice.viewPanCardDetailsCustomerName(custName);
            mv.setViewName("index");
            return mv;
        }
        
         

        

        if (action.equals("addPassport2")) {
            String docType = ServletRequestUtils.getStringParameter(request, "docType");
            String optionsRadios1 = ServletRequestUtils.getStringParameter(request, "optionsRadios1");
            String optionsRadios2 = ServletRequestUtils.getStringParameter(request, "optionsRadios2");
            String custsrnm = ServletRequestUtils.getStringParameter(request, "custsrnm");
            String custName = ServletRequestUtils.getStringParameter(request, "custName");
            String custpsnm = ServletRequestUtils.getStringParameter(request, "custpsnm");
            String dob = ServletRequestUtils.getStringParameter(request, "dob");
            String optionsRadios3 = ServletRequestUtils.getStringParameter(request, "optionsRadios3");
            String optionsRadios4 = ServletRequestUtils.getStringParameter(request, "optionsRadios4");
            String pob = ServletRequestUtils.getStringParameter(request, "pob");
            String tal = ServletRequestUtils.getStringParameter(request, "tal");
            String dist = ServletRequestUtils.getStringParameter(request, "dist");
            String ste = ServletRequestUtils.getStringParameter(request, "ste");

            String quali = ServletRequestUtils.getStringParameter(request, "quali");
            String optionsRadios5 = ServletRequestUtils.getStringParameter(request, "optionsRadios5");
            String optionsRadios6 = ServletRequestUtils.getStringParameter(request, "optionsRadios6");
            String optionsRadios7 = ServletRequestUtils.getStringParameter(request, "optionsRadios7");
            String optionsRadios8 = ServletRequestUtils.getStringParameter(request, "optionsRadios8");
            String optionsRadios9 = ServletRequestUtils.getStringParameter(request, "optionsRadios9");
            String optionsRadios10 = ServletRequestUtils.getStringParameter(request, "optionsRadios10");

            String optionsRadios11 = ServletRequestUtils.getStringParameter(request, "optionsRadios11");
            String vblmrk = ServletRequestUtils.getStringParameter(request, "vblmrk");
            String address = ServletRequestUtils.getStringParameter(request, "address");
            String contactNo= ServletRequestUtils.getStringParameter(request, "contactNo");
            String email = ServletRequestUtils.getStringParameter(request, "email");
            String nmofp = ServletRequestUtils.getStringParameter(request, "nmofp");
            String dors = ServletRequestUtils.getStringParameter(request, "dors");
            String phno = ServletRequestUtils.getStringParameter(request, "phno");
            String whnm = ServletRequestUtils.getStringParameter(request, "whnm");
            String fnm = ServletRequestUtils.getStringParameter(request, "fnm");
            String mnm = ServletRequestUtils.getStringParameter(request, "mnm");
            String pvadd = ServletRequestUtils.getStringParameter(request, "pvadd");
            String pin = ServletRequestUtils.getStringParameter(request, "pin");
            String doi = ServletRequestUtils.getStringParameter(request, "doi");
            String fno = ServletRequestUtils.getStringParameter(request, "fno");
            String poi = ServletRequestUtils.getStringParameter(request, "poi");
            String doe = ServletRequestUtils.getStringParameter(request, "doe");
            String flnm1 = ServletRequestUtils.getStringParameter(request, "flnm1");

            String add1 = ServletRequestUtils.getStringParameter(request, "add1");
            String mob1 = ServletRequestUtils.getStringParameter(request, "mob1");
            String flnm2 = ServletRequestUtils.getStringParameter(request, "flnm2");
            String add2 = ServletRequestUtils.getStringParameter(request, "add2");
            String mob2 = ServletRequestUtils.getStringParameter(request, "mob2");
            String optionsRadios12 = ServletRequestUtils.getStringParameter(request, "optionsRadios12");
            String optionsRadios13 = ServletRequestUtils.getStringParameter(request, "optionsRadios13");
            String damt = ServletRequestUtils.getStringParameter(request, "decidedAmt");
            String date1 = ServletRequestUtils.getStringParameter(request, "date1");
            String aamt = ServletRequestUtils.getStringParameter(request, "aamt");
            String date2 = ServletRequestUtils.getStringParameter(request, "date2");
            String bamt = ServletRequestUtils.getStringParameter(request, "balAmt");
            String date3 = ServletRequestUtils.getStringParameter(request, "date3");
            String amountPaid = ServletRequestUtils.getStringParameter(request, "amtPaid");
            String date4 = ServletRequestUtils.getStringParameter(request, "date4");
            String submitDate = ServletRequestUtils.getStringParameter(request, "submitDate");

            String birthCert = ServletRequestUtils.getStringParameter(request, "birthCert");
            String schoolCert = ServletRequestUtils.getStringParameter(request, "schoolCert");
            String ssc = ServletRequestUtils.getStringParameter(request, "ssc");
            String hsc = ServletRequestUtils.getStringParameter(request, "hsc");
            String ahem = ServletRequestUtils.getStringParameter(request, "ahem");

            String gc = ServletRequestUtils.getStringParameter(request, "gc");
            String pc = ServletRequestUtils.getStringParameter(request, "pc");
            String vc = ServletRequestUtils.getStringParameter(request, "vc");
            String dl = ServletRequestUtils.getStringParameter(request, "dl");
            String ci = ServletRequestUtils.getStringParameter(request, "ci");
            String rc = ServletRequestUtils.getStringParameter(request, "rc");
            String lbo = ServletRequestUtils.getStringParameter(request, "lbo");
            String sl = ServletRequestUtils.getStringParameter(request, "sl");
            String gbs = ServletRequestUtils.getStringParameter(request, "gbs");
            String ac = ServletRequestUtils.getStringParameter(request, "ac");
            String vi = ServletRequestUtils.getStringParameter(request, "vi");
            String cl = ServletRequestUtils.getStringParameter(request, "cl");
            String gb = ServletRequestUtils.getStringParameter(request, "gb");
            String lp = ServletRequestUtils.getStringParameter(request, "lp");
            String iran = ServletRequestUtils.getStringParameter(request, "iran");

            passport2 pass = new passport2();
            pass.setDocType(docType);
            pass.setOptionsRadios1(optionsRadios1);
            pass.setOptionsRadios2(optionsRadios2);
            pass.setCustName(custName);
            pass.setCustpsnm(custpsnm);
            pass.setCustsrnm(custsrnm);
            pass.setDob(dob);
            pass.setOptionsRadios3(optionsRadios3);
            pass.setOptionsRadios4(optionsRadios4);
            pass.setPob(pob);
            pass.setTal(tal);
            pass.setDist(dist);
            pass.setSte(ste);

            pass.setQuali(quali);
            pass.setOptionsRadios5(optionsRadios5);
            pass.setOptionsRadios6(optionsRadios6);
            pass.setOptionsRadios7(optionsRadios7);
            pass.setOptionsRadios8(optionsRadios8);
            pass.setOptionsRadios9(optionsRadios9);
            pass.setOptionsRadios10(optionsRadios10);

            pass.setOptionsRadios11(optionsRadios11);
            pass.setVblmrk(vblmrk);
            pass.setAddress(address);
            pass.setContactNo(contactNo);
            pass.setEmail(email);
            pass.setNmofp(nmofp);
            pass.setDors(dors);
            pass.setPhno(phno);
            pass.setWhnm(whnm);
            pass.setFnm(fnm);
            pass.setMnm(mnm);
            pass.setPvadd(pvadd);
            pass.setPin(pin);
            pass.setDoi(doi);
            pass.setFno(fno);
            pass.setPoi(poi);
            pass.setDoe(doe);
            pass.setFlnm1(flnm1);

            pass.setAdd1(add1);
            pass.setMob1(mob1);
            pass.setFlnm2(flnm2);
            pass.setAdd2(add2);
            pass.setMob2(mob2);
            pass.setOptionsRadios12(optionsRadios12);
            pass.setOptionsRadios13(optionsRadios13);
            pass.setDecidedAmt(damt);
            pass.setDate1(date1);
            pass.setAamt(aamt);
            pass.setDate2(date2);
            pass.setBalAmt(bamt);
            pass.setDate3(date3);
            pass.setAmtPaid(amountPaid);
            pass.setDate4(date4);
            pass.setSubmitDate(submitDate);

            pass.setBirthCert(birthCert);
            pass.setSchoolCert(schoolCert);
            pass.setSsc(ssc);
            pass.setHsc(hsc);
            pass.setAhem(ahem);

            pass.setGc(gc);
            pass.setPc(pc);
            pass.setVc(vc);
            pass.setDl(dl);
            pass.setCi(ci);
            pass.setRc(rc);
            pass.setLbo(lbo);
            pass.setSl(sl);
            pass.setGbs(gbs);
            pass.setAc(ac);
            pass.setVi(vi);
            pass.setCl(cl);
            pass.setGb(gb);
            pass.setLp(lp);
            pass.setIran(iran);
try{
            int Pass = passServices.addPassport2(pass);

               
        }
        catch(Exception e){
          System.out.println(e);
        }     
     
            mv.setViewName("index");
            return mv;

        }

        mv.setViewName("index");
        return mv;
    }
    
    
     private void streamImageFile(File file, HttpServletResponse response) {
        // find the right MIME type and set it as content 
        String a = getContentType(file);
        response.setContentType(a);
        String fileName = file.getName();
        response.setHeader("Content-Disposition", "inline; filename=" + fileName);
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            response.setContentLength((int) file.length());
            // Use Buffered Stream for reading/writing.
            bis = new BufferedInputStream(new FileInputStream(file));
            bos = new BufferedOutputStream(response.getOutputStream());

            byte[] buff = new byte[(int) file.length()];
            int bytesRead;

            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    // To late to do anything about it now, we may have already sent some data to user.
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    // To late to do anything about it now, we may have already sent some data to user.
                }
            }
        }
    }
     
     
    private String getContentType(File file) {
        if (file.getName().length() > 0) {
            String[] parts = file.getName().split("\\.");
            if (parts.length > 0) {
                // only last part interests me
                String extention = parts[parts.length - 1];
                if (extention.equalsIgnoreCase("jpg")) {
                    return "image/jpg";
                } else if (extention.equalsIgnoreCase("pdf")) {
                    
                    return "application/pdf";
                }
            }
        }
        throw new RuntimeException("Can not find content type for the file " + file.getAbsolutePath());

    }

    
    
    
     private void saveFacultyReportToPDF1(String pdfFileName, String columnHeader, List studentList) {
        try {
            Document document = new Document();
            int noOfColumns = 0;
            //pdfFileName=modulePath+"Reports"+SLASH+"AllStudentReport.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(new File(pdfFileName)));
            document.open();
            String[] columnLabel = columnHeader.split(",");
            noOfColumns = columnLabel.length;
            PdfPTable table = new PdfPTable(noOfColumns);
            Font ftBold = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD);
            Font ftNormal = new Font(Font.FontFamily.TIMES_ROMAN, 7, Font.NORMAL);
            for (int i = 0; i < columnLabel.length; i++) {
                PdfPCell cell = new PdfPCell(new Paragraph(columnLabel[i], ftBold));
                table.addCell(cell);
            }
            for (int i = 0; i < studentList.size(); i++) {
                String srNo = Integer.toString(i + 1);
                CustReport student = (CustReport) studentList.get(i);
                PdfPCell cell1 = new PdfPCell(new Paragraph(srNo, ftNormal));
                table.addCell(cell1);
                 for (int j = 1; j < noOfColumns; j++) {
                    String excelCellValues = getExcelCellValue1(student);
                    String[] cellData = excelCellValues.split("~");
                    PdfPCell cell2 = new PdfPCell(new Paragraph(cellData[j - 1], ftNormal));
                    table.addCell(cell2);
                }
                
            }
            document.add(table);
            document.close();
        } catch (IOException ie) {
        } catch (Exception e) {
            

        }
    }
  
   private String getExcelCellValue1(CustReport student) {
        String cellValue = "";
        cellValue = student.getCustName()+ "~" + student.getContactNo() + "~" + student.getAddress() + "~" + student.getDecidedAmt() + "~" + student.getAmtPaid() + "~"+  student.getBalAmt();
        
        return cellValue;
    }
   
    
    
}
    /**
     * @return the passServices
     */

