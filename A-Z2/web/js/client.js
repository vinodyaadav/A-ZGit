/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function generatePDF(custName,contactNo,subDate,formType)
{
     var custName =document.getElementById("custName").value;
      var contactNo =document.getElementById("contactNo").value;
      var subDate =document.getElementById("subDate").value;
      var formType =document.getElementById("formType").value;
      
      generatepdf(custName,contactNo,subDate,formType);
    
}

function addPassPortDetails() {

    var firstName = document.getElementById("firstName").value;
    var middleName = document.getElementById("middleName").value;
    var lastName = document.getElementById("lastName").value;
    var address = document.getElementById("address").value;
    var emailId = document.getElementById("emailId").value;
    var dob = document.getElementById("dob").value;
    var contactNo = document.getElementById("contactNo").value;

    var isMale = document.getElementById("optionsRadios1").checked;
    var male = "";
    if (isMale)
    {
        male = "Yes";
    }
    else
    {
        male = "No";
    }

    var isFemale = document.getElementById("optionsRadios2").checked;
    var female = "";
    if (isFemale)
    {
        female = "Yes";
    }
    else
    {
        female = "No";
    }

    var isbirthCert = document.getElementById("birthCert").checked;
    var birthCert = "";
    if (isbirthCert)
    {
        birthCert = "Yes";
    }
    else
    {
        birthCert = "No";
    }

    var isschoolCert = document.getElementById("schoolCert").checked;
    var schoolCert = "";
    if (isschoolCert)
    {
        schoolCert = "Yes";
    }
    else {
        schoolCert = "No";
    }

    var issscCert = document.getElementById("sscCert").checked;
    var sscCert = "";
    if (issscCert)
    {
        sscCert = "Yes";
    }
    else {
        sscCert = "No";
    }

    var ishscCert = document.getElementById("hscCert").checked;
    var hscCert = "";
    if (ishscCert)
    {
        hscCert = "Yes";
    }
    else
    {
        hscCert = "No";
    }

    var isahCert = document.getElementById("ahCert").checked;
    var ahCert = "";
    if (isahCert)
    {
        ahCert = "Yes";
    }
    else {
        ahCert = "No";
    }

    var ispanCert = document.getElementById("panCert").checked;
    var panCert = "";
    if (ispanCert)
    {
        panCert = "Yes";
    }
    else
    {
        panCert = "No";
    }

    var isvCert = document.getElementById("vCert").checked;
    var vCert = "";
    if (isvCert)
    {
        vCert = "Yes";
    }
    else
    {
        vCert = "No";
    }

    var isdlCert = document.getElementById("dlCert").checked;
    var dlCert = "";
    if (isdlCert)
    {
        dlCert = "Yes";
    }
    else
    {
        dlCert = "No";
    }

    var iscoCert = document.getElementById("coCert").checked;
    var coCert = "";
    if (iscoCert)
    {
        coCert = "Yes";
    }
    else
    {
        coCert = "No";
    }

    var isrCert = document.getElementById("rCert").checked;
    var rCert = "";
    if (isrCert)
    {
        rCert = "Yes";
    }
    else {
        rCert = "No";
    }

    var islCert = document.getElementById("lCert").checked;
    var lCert = "";
    if (islCert)
    {
        lCert = "Yes";
    }
    else
    {
        lCert = "No";
    }

    var issoCert = document.getElementById("soCert").checked;
    var soCert = "";
    if (issoCert)
    {
        soCert = "Yes";
    }
    else {
        soCert = "No";
    }

    var isgCert = document.getElementById("gCert").checked;
    var gCert = "";
    if (isgCert)
    {
        gCert = "Yes";
    }
    else {
        gCert = "No";
    }

    var isaCert = document.getElementById("aCert").checked;
    var aCert = "";
    if (isaCert)
    {
        aCert = "Yes";
    }
    else {
        aCert = "No";
    }

    var isvoCert = document.getElementById("voCert").checked;
    var voCert = "";
    if (isvoCert)
    {
        voCert = "Yes";
    }
    else
    {
        voCert = "No";
    }

    var isclCert = document.getElementById("clCert").checked;
    var clCert = "";
    if (isclCert)
    {
        clCert = "Yes";
    }
    else
    {
        clCert = "No";
    }

    var isbCert = document.getElementById("bCert").checked;
    var bCert = "";
    if (isbCert)
    {
        bCert = "Yes";
    }
    else
    {
        bCert = "No";
    }

    var ispCert = document.getElementById("pCert").checked;
    var pCert = "";
    if (ispCert)
    {
        pCert = "Yes";
    }
    else {
        pCert = "No";
    }

    addPassPort(firstName, middleName, lastName, address, emailId, contactNo, dob, male, female, birthCert, schoolCert, sscCert, hscCert, ahCert, panCert, vCert, dlCert, coCert, rCert, lCert, soCert, gCert, aCert, voCert, clCert, bCert, pCert);
}
   function addGrantRenewal(){
    
    var subDate = document.getElementById("subDate").value;
    //alert(subDate);
    var TheLicensingAuthority = document.getElementById("TheLicensingAuthority").value;
    var isMotorCyclewithoutgear = document.getElementById("MotorCyclewithoutgear").checked;
    var MotorCyclewithoutgear = "";
    if (isMotorCyclewithoutgear)
    {
        MotorCyclewithoutgear = "Yes";

    } else
    {
        MotorCyclewithoutgear = "No";

    }
    var isMotorCyclewithgear = document.getElementById("MotorCyclewithgear").checked;
    var MotorCyclewithgear = "";
    if (isMotorCyclewithgear)
    {
        MotorCyclewithgear = "Yes";

    } else {
        MotorCyclewithgear = "No";

    }
    var isInvalidCarriages = document.getElementById("InvalidCarriages").checked;
    var InvalidCarriages = "";
    if (isInvalidCarriages)
    {
        InvalidCarriages = "Yes";

    } else {
        InvalidCarriages = "No";

    }
    var isLightMotorVehicle = document.getElementById("LightMotorVehicle").checked;
    var LightMotorVehicle = "";
    if (isLightMotorVehicle)
    {
        LightMotorVehicle = "Yes";

    } else {
        LightMotorVehicle = "No";

    }
    var isMediumMotorCycle = document.getElementById("MediumMotorCycle").checked;
    var MediumMotorCycle = "";
    if (isMediumMotorCycle)
    {
        MediumMotorCycle = "Yes";

    } else {
        MediumMotorCycle = "No";

    }
    var isHeavygoodsVehicle = document.getElementById("HeavygoodsVehicle").checked;
    var HeavygoodsVehicle = "";
    if (isHeavygoodsVehicle)
    {
        HeavygoodsVehicle = "Yes";

    } else {
        HeavygoodsVehicle = "No";

    }
    var isHeavyPassengerMotorVehicle = document.getElementById("HeavyPassengerMotorVehicle").checked;
    var HeavyPassengerMotorVehicle = "";
    if (isHeavyPassengerMotorVehicle)
    {
        HeavyPassengerMotorVehicle = "Yes";

    } else {
        HeavyPassengerMotorVehicle = "No";

    }

    var isRoadRollers = document.getElementById("RoadRollers").checked;
    var RoadRollers = "";
    if (isRoadRollers)
    {
        RoadRollers = "Yes";

    } else {
        RoadRollers = "No";

    }
    var isMotorVehicleoffollowingdescription = document.getElementById("MotorVehicleoffollowingdescription").checked;
    var MotorVehicleoffollowingdescription = "";
    if (isMotorVehicleoffollowingdescription)
    {
        MotorVehicleoffollowingdescription = "Yes";

    } else {
        MotorVehicleoffollowingdescription = "No";

    }
    var custName = document.getElementById("custName").value;
    var Son = document.getElementById("Son").value;
    var address = document.getElementById("address").value;
    var TemporaryAddress = document.getElementById("TemporaryAddress").value;
    var contactNo = document.getElementById("contactNo").value;
    
    var datepicker = document.getElementById("datepicker").value;

    var EducationalQualification = document.getElementById("EducationalQualification").value;
    var IdentificationMark = document.getElementById("IdentificationMark").value;
    var BloodGroupwithRHfactor = document.getElementById("BloodGroupwithRHfactor").value;
    
    var decidedAmt = document.getElementById("decidedAmt").value;
    var advAmt = document.getElementById("advAmt").value;
    var balAmt = document.getElementById("balAmt").value;
    var refrencename = document.getElementById("refrencename").value;
    
    var Iholdaneffectivedrivinglicencetodrive = document.getElementById("Iholdaneffectivedrivinglicencetodrive").value;
    var Particulars = document.getElementById("Particulars").value;

    var Particularsof = document.getElementById("Particularsof").value;
    var Haveyoubeen = document.getElementById("Haveyoubeen").value;
    var IencloseMedical = document.getElementById("IencloseMedical").value;
    var issuedbythe = document.getElementById("issuedbythe").value;
    var IencloseDriving = document.getElementById("IencloseDriving").value;
    var issuedby = document.getElementById("issuedby").value;
     if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    else if(address==""){
          alert("Please Enter Permanent Address")
        document.getElementById("address").focus();
    }
     else if(contactNo==""){
          alert("Please Enter Contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(advAmt==""){
          alert("Please Enter  Amount Paid")
        document.getElementById("advAmt").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount")
        document.getElementById("balAmt").focus();
        
    }
    else{
    addgetGrantRenewal(subDate,TheLicensingAuthority, MotorCyclewithoutgear, MotorCyclewithgear, InvalidCarriages, LightMotorVehicle,
            MediumMotorCycle, HeavygoodsVehicle, HeavyPassengerMotorVehicle, RoadRollers, MotorVehicleoffollowingdescription,
            custName, Son, address, TemporaryAddress,contactNo, datepicker, EducationalQualification, IdentificationMark, BloodGroupwithRHfactor,
            decidedAmt,advAmt,balAmt,refrencename,Iholdaneffectivedrivinglicencetodrive, Particulars, Particularsof, Haveyoubeen, IencloseMedical, issuedbythe, IencloseDriving, issuedby);


}
  }


//function addlicdetails() {
//
//    var issnf = document.getElementById("snf").value;
//    var ismn = document.getElementById("mn").value;
//    var isfn = document.getElementById("fn").value;
//    var isimhn = document.getElementById("imhn").value;
//    var isdob = document.getElementById("dob").value;
//    var isflad = document.getElementById("flad").value;
//    var isst = document.getElementById("st").value;
//    var ispt = document.getElementById("pt").value;
//    var isvm = document.getElementById("vm").value;
//    var isnone = document.getElementById("none").value;
//    var isht = document.getElementById("ht").value;
//    var iswt = document.getElementById("wt").value;
//    var isidm = document.getElementById("idm").value;
//    var isjod = document.getElementById("jod").value;
//    var isban = document.getElementById("ban").value;
//    var isbran = document.getElementById("bran").value;
//    var isifsc = document.getElementById("ifsc").value;
//    var isbankacc = document.getElementById("bankacc").value;
//    var isopno = document.getElementById("opno").value;
//    var isopno2 = document.getElementById("opno2").value;
//    var isocmpnm = document.getElementById("ocmpnm").value;
//    var isqyfmm = document.getElementById("qyfmm").value;
//    var isfrae = document.getElementById("frae").value;
//    var ismrae = document.getElementById("mrae").value;
//    var isbrae = document.getElementById("brae").value;
//    var issrae = document.getElementById("srae").value;
//    var ishwae = document.getElementById("hwae").value;
//    var iscdae = document.getElementById("cdae").value;
//    var isdpat = document.getElementById("dpat").value;
//    var isapat = document.getElementById("apat").value;
//    var isblat = document.getElementById("blat").value;
//    var isrene = document.getElementById("rene").value;
//    
//    var isbrcr = document.getElementById("brcr").checked;
//    var brcr = "";
//    if (isbrcr)
//    {
//        brcr = "yes";
//
//    } else
//    {
//        brcr = "no";
//
//    }
//    var issclvc = document.getElementById("sclvc").checked;
//    var sclvc = "";
//    if (issclvc)
//    {
//        sclvc = "yes";
//
//    } else
//    {
//        sclvc = "no";
//
//    }
//    var isthbc = document.getElementById("thbc").checked;
//    var thbc = "";
//    if (isthbc)
//    {
//        thbc = "yes";
//
//    } else
//    {
//        thbc = "no";
//
//    }
//    var isthbd = document.getElementById("thbd").checked;
//    var thbd = "";
//    if (isthbd)
//    {
//        thbd = "yes";
//
//    } else
//    {
//        thbd = "no";
//
//    }
//    var isgc = document.getElementById("gc").checked;
//    var gc = "";
//    if (isgc)
//    {
//        gc = "yes";
//
//    } else
//    {
//        gc = "no";
//
//    }
//    var isahecy = document.getElementById("ahecy").checked;
//    var ahecy = "";
//    if (isahecy)
//    {
//        ahecy = "yes";
//
//    } else
//    {
//        ahecy = "no";
//
//    }
//    var isfrif = document.getElementById("frif").checked;
//    var frif = "";
//    if (isfrif)
//    {
//        frif = "yes";
//
//    } else
//    {
//        frif = "no";
//
//    }
//    var issysp = document.getElementById("sysp").checked;
//    var sysp = "";
//    if (issysp)
//    {
//        sysp = "yes";
//
//    } else
//    {
//        sysp = "no";
//
//    }
//    var isadcd = document.getElementById("adcd").checked;
//    var adcd = "";
//    if (isadcd)
//    {
//        adcd = "yes";
//
//    } else
//    {
//        adcd = "no";
//
//    }
//    var ispacr = document.getElementById("pacr").checked;
//    var pacr = "";
//    if (ispacr)
//    {
//        pacr = "yes";
//
//    } else
//    {
//        pacr = "no";
//
//    }
//    var isdrliva = document.getElementById("drliva").checked;
//    var drliva = "";
//    if (isdrliva)
//    {
//        drliva = "yes";
//
//    } else
//    {
//        drliva = "no";
//
//    }
//    var isvgid = document.getElementById("vgid").checked;
//    var vgid = "";
//    if (isvgid)
//    {
//        vgid = "yes";
//
//    } else
//    {
//        vgid = "no";
//
//    }
//    var ispssprt = document.getElementById("pssprt").checked;
//    var pssprt = "";
//    if (ispssprt)
//    {
//        pssprt = "yes";
//
//    } else
//    {
//        pssprt = "no";
//
//    }
//    var iscdid = document.getElementById("cdid").checked;
//    var cdid = "";
//    if (iscdid)
//    {
//        cdid = "yes";
//
//    } else
//    {
//        cdid = "no";
//
//    }
//    var isrncd = document.getElementById("rncd").checked;
//    var rncd = "";
//    if (isrncd)
//    {
//        rncd = "yes";
//
//    } else
//    {
//        rncd = "no";
//
//    }
//    var isltbl = document.getElementById("ltbl").checked;
//    var ltbl = "";
//    if (isltbl)
//    {
//        ltbl = "yes";
//
//    } else
//    {
//        ltbl = "no";
//
//    }
//    var isarca = document.getElementById("arca").checked;
//    var arca = "";
//    if (isarca)
//    {
//        arca = "yes";
//
//    } else
//    {
//        arca = "no";
//
//    }
//    var isvoigid = document.getElementById("voigid").checked;
//    var voigid = "";
//    if (voigid)
//    {
//        voigid = "yes";
//
//    } else
//    {
//        voigid = "no";
//
//    }
//    var ispassp = document.getElementById("passp").checked;
//    var passp = "";
//    if (ispassp)
//    {
//        passp = "yes";
//
//    } else
//    {
//        passp = "no";
//
//    }
//    var isbpass = document.getElementById("bpass").checked;
//    var bpass = "";
//    if (isbpass)
//    {
//        bpass = "yes";
//
//    } else
//    {
//        bpass = "no";
//
//    }
//    var isirano = document.getElementById("irano").checked;
//    var irano = "";
//    if (isirano)
//    {
//        irano = "yes";
//
//    } else
//    {
//        irano = "no";
//
//    }
//
//    addlic(issnf, ismn, isfn, isimhn, isdob, isflad, isst, ispt, isvm, isnone,isht, iswt, isidm,
//            isjod, isban, isbran, isifsc,isbankacc, isopno, isopno2, isocmpnm, isqyfmm, isfrae,
//          ismrae, isbrae, issrae, ishwae, iscdae,isdpat, isapat, isblat, isrene,brcr,
//            sclvc, thbc, gc, ahecy, frif, sysp, adcd, pacr, drliva, vgid, pssprt,
//            cdid, rncd, ltbl, arca, voigid, passp, bpass, irano);
//            }

function addGumastaDetails() {

var optionsRadios1 = document.getElementById("optionsRadios1").selected;
    var optionsRadios2 = document.getElementById("optionsRadios2").selected;
    var licenceNo = document.getElementById("licenceNo").value;
   
    var renewDate = document.getElementById("renewDate").value;
    var custName = document.getElementById("custName").value;
    var address = document.getElementById("address").value;
    var contactNo = document.getElementById("contactNo").value;
    var natureOfBuisness = document.getElementById("natureOfBuisness").value;
    var employeeQty = document.getElementById("employeeQty").value;
    var propertiorName = document.getElementById("propertiorName").value;
    var renew1 = document.getElementById("renew1").value;
    var renew2 = document.getElementById("renew2").value;
    var renew3 = document.getElementById("renew3").value;
      var decidedAmt=document.getElementById("decidedAmt").value;
    // alert("20"+decidedAmt);
    var amtPaid=document.getElementById("amtPaid").value;
    // alert("21"+amtPaid);
    var balAmt=document.getElementById("balAmt").value;
     // alert("22"+balAmt);
    var refAmt=document.getElementById("refAmt").value;
        var submitDate=document.getElementById("submitDate").value;

    var isadharCard = document.getElementById("adharCard").checked;
    var adharCard = "";
    if (isadharCard)
    {
        adharCard = "Yes";
    }
    else {
        adharCard = "No";
    }

    var isvotingCard = document.getElementById("votingCard").checked;
    var votingCard = "";
    if (isvotingCard)
    {
        votingCard = "Yes";
    }
    else
    {
        votingCard = "No";
    }

    var ispassport = document.getElementById("passport").checked;
    var passport = "";
    if (ispassport)
    {
        passport = "Yes";
    }
    else
    {
        passport = "No";
    }

    var isdrivingLicence = document.getElementById("drivingLicence").checked;
    var drivingLicence = "";
    if (isdrivingLicence)
    {
        drivingLicence = "Yes";
    }
    else
    {
        drivingLicence = "No";
    }

    var ispancard = document.getElementById("pancard").checked;
    var pancard = "";
    if (ispancard)
    {
        pancard = "Yes";
    }
    else {
        pancard = "No";
    }

    var islightBill = document.getElementById("lightBill").checked;
    var lightBill = "";
    if (islightBill)
    {
        lightBill = "Yes";
    }
    else
    {
        lightBill = "No";
    }


    var isrentAgreement = document.getElementById("rentAgreement").checked;
    var rentAgreement = "";
    if (isrentAgreement)
    {
        rentAgreement = "Yes";
    }
    else {
        rentAgreement = "No";
    }

    if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    else if(address==""){
          alert("Please Enter Permanent Address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(balAmt==""){
          alert("Please Enter Balance Amount")
        document.getElementById("balAmt").focus();
    
    }else if(amtPaid==""){
          alert("Please Enter Paid amount")
        document.getElementById("amtPaid").focus();
        
    }
    else if(submitDate==""){
          alert("Please Enter Submit Date")
        document.getElementById("submitDate").focus();
        
    }
    else{

    addGumasta(optionsRadios1,optionsRadios2,licenceNo, renewDate,contactNo, custName, address, natureOfBuisness, employeeQty, propertiorName, renew1, renew2, renew3,decidedAmt,amtPaid,balAmt,refAmt,submitDate ,lightBill, rentAgreement, pancard, drivingLicence, passport, votingCard, adharCard);

}}


function addViewReport()
  {
   
      var custName =document.getElementById("custName").value;
      var contactNo =document.getElementById("contactNo").value;
      var subDate =document.getElementById("subDate").value;
      var formType =document.getElementById("formType").value;
     
        if(formType=="Select"){
            alert("Please Select FormType")
            document.getElementById("formType").focus();
        }
        else{
    
        ViewReport(custName,contactNo,subDate,formType);
    }

}
function addmediclaim() {
   
     var documentType = document.getElementById("documentType").value;
   
    var oldPolicyNo = document.getElementById("oldPolicyNo").value;
    var companyName = document.getElementById("companyName").value;
    var renewDate = document.getElementById("renewDate").value;
    var customerName = document.getElementById("customerName").value;
    var middleName = document.getElementById("middleName").value;
    var lastName = document.getElementById("lastName").value;
    var husbandName = document.getElementById("husbandName").value;
    var dob = document.getElementById("dob").value;
    var address = document.getElementById("address").value;
    var contactNo = document.getElementById("contactNo").value;
    var memberFirstName = document.getElementById("memberFirstName").value;
    var age = document.getElementById("age").value;
    var secondMemberName = document.getElementById("secondMemberName").value;
    var secondMemberAge = document.getElementById("secondMemberAge").value;
    var thirdMemberName = document.getElementById("thirdMemberName").value;
    var thirdMemberAge = document.getElementById("thirdMemberAge").value;
    var fourthMemberName = document.getElementById("fourthMemberName").value;
    var fourthMemberAge = document.getElementById("fourthMemberAge").value;
    var fifthMemberName = document.getElementById("fifthMemberName").value;
    var fifthMemberAge = document.getElementById("fifthMemberAge").value;

    var isadharCard = document.getElementById("adharCard").checked;
    var adharCard = "";
    if (isadharCard)
    {
        adharCard = "Yes";
    }
    else {
        adharCard = "No";
    }

    var isvotingCard = document.getElementById("votingCard").checked;
    var votingCard = "";
    if (isvotingCard)
    {
        votingCard = "Yes";
    }
    else
    {
        votingCard = "No";
    }

    var ispassport = document.getElementById("passport").checked;
    var passport = "";
    if (ispassport)
    {
        passport = "Yes";
    }
    else
    {
        passport = "No";
    }

    var isdrivingLicence = document.getElementById("drivingLicence").checked;
    var drivingLicence = "";
    if (isdrivingLicence)
    {
        drivingLicence = "Yes";
    }
    else
    {
        drivingLicence = "No";
    }

    var ispancard = document.getElementById("pancard").checked;
    var pancard = "";
    if (ispancard)
    {
        pancard = "Yes";
    }
    else {
        pancard = "No";
    }

    var isadharCardadd = document.getElementById("adharCardadd").checked;
    var adharCardadd = "";
    if (isadharCardadd)
    {
        adharCardadd = "Yes";
    }
    else {
        adharCardadd = "No";
    }

    var isvotingCardadd = document.getElementById("votingCardadd").checked;
    var votingCardadd = "";
    if (isvotingCardadd)
    {
        votingCardadd = "Yes";
    }
    else
    {
        votingCardadd = "No";
    }

    var ispassportadd = document.getElementById("passportadd").checked;
    var passportadd = "";
    if (ispassportadd)
    {
        passportadd = "Yes";
    }
    else
    {
        passportadd = "No";
    }

    var isdrivingLicenceadd = document.getElementById("drivingLicenceadd").checked;
    var drivingLicenceadd = "";
    if (isdrivingLicenceadd)
    {
        drivingLicenceadd = "Yes";
    }
    else
    {
        drivingLicenceadd = "No";
    }
    var isbankpassbook = document.getElementById("bankpassbook").checked;
    var bankpassbook = "";
    if (isbankpassbook)
    {
        bankpassbook = "Yes";
    }
    else
    {
        bankpassbook = "No";
    }
    var iscorporateLetter = document.getElementById("corporateLetter").checked;
    var corporateLetter = "";
    if (iscorporateLetter)
    {
        corporateLetter = "Yes";
    }
    else
    {
        corporateLetter = "No";
    }
    var isrentAgreement = document.getElementById("rentAgreement").checked;
    var rentAgreement = "";
    if (isrentAgreement)
    {
        rentAgreement = "Yes";
    }
    else
    {
        rentAgreement = "No";
    }
    var isaddProofLightBill = document.getElementById("addProofLightBill").checked;
    var addProofLightBill = "";
    if (isaddProofLightBill)
    {
        addProofLightBill = "Yes";
    }
    else
    {
        addProofLightBill = "No";
    }

    var decideAmt = document.getElementById("decideAmt").value;
    var amountPaid = document.getElementById("amountPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var refName = document.getElementById("refName").value;
    var submitDate = document.getElementById("submitDate").value;
  if(customerName==""){
        alert("Please Enter First Name");
        document.getElementById("customerName").focus();
    }
     else if(address==""){
          alert("Please Enter Full Address");
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No");
        document.getElementById("contactNo").focus();
    }
    else if(decideAmt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decideAmt").focus();
    }else if(amountPaid==""){
          alert("Please Enter Amount Paid");
        document.getElementById("amountPaid").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmt").focus();
        
    }
    else{
    addmediclaimDetails(documentType,oldPolicyNo, companyName, renewDate, customerName, middleName, lastName, husbandName, dob, address, contactNo, memberFirstName, age, secondMemberName, secondMemberAge, thirdMemberName, thirdMemberAge, fourthMemberName, fourthMemberAge, fifthMemberName, fifthMemberAge, adharCard, votingCard, passport, drivingLicence, pancard, adharCardadd, votingCardadd, passportadd, drivingLicenceadd, bankpassbook, corporateLetter, rentAgreement, addProofLightBill, decideAmt, amountPaid, balAmt, refName, submitDate);
}
}
function addAdharCard()
{
    var oldAadharNo = document.getElementById("oldAadharNo").value;
    //  alert(oldAadharNo);
    var selfName = document.getElementById("selfName").value;
  //  alert(selfName);

    var contactNoNo = document.getElementById("contactNoNo").value;
 //   alert(contactNoNo);

    var fatherName = document.getElementById("fatherName").value;
  //  alert(fatherName);

    var surName = document.getElementById("surName").value;
//alert(surName);
    var husbandName = document.getElementById("husbandName").value;
   //     alert(husbandName);

    var dob = document.getElementById("dob").value;
  //  alert(dob);

    var address = document.getElementById("address").value;
 //   alert(address);

    var changesNote = document.getElementById("changesNote").value;
    var changesNote1 = document.getElementById("changesNote1").value;
    var changesNote2 = document.getElementById("changesNote2").value;
    var decidedAmtRs = document.getElementById("decidedAmtRs").value;
    var advamt = document.getElementById("advamt").value;
    var balamt = document.getElementById("balamt").value;
    var referanceName = document.getElementById("referanceName").value;
    var isbirthCert = document.getElementById("birthCert").checked;
    var birthCert = "";
    if (isbirthCert)
    {
        birthCert = "Yes";
    }
    else
    {
        birthCert = "No";
    }
    var isboardcert10 = document.getElementById("boardcert10").checked;
    var boardcert10 = "";
    if (isboardcert10)
    {
        boardcert10 = "Yes";
    }
    else
    {
        boardcert10 = "No";
    }
    var isboardcert12 = document.getElementById("boardcert12").checked;
    var boardcert12 = "";
    if (isboardcert12)
    {
        boardcert12 = "Yes";
    }
    else
    {
        boardcert12 = "No";
    }
    var isgraduateCopy = document.getElementById("graduateCopy").checked;
    var graduateCopy = "";
    if (isgraduateCopy)
    {
        graduateCopy = "Yes";
    }
    else
    {
        graduateCopy = "No";
    }
    var ishigheredu = document.getElementById("higheredu").checked;
    var higheredu = "";
    if (ishigheredu)
    {
        higheredu = "Yes";
    }
    else
    {
        higheredu = "No";
    }
    var isschoolcert = document.getElementById("schoolcert").checked;
    var schoolcert = "";
    if (isschoolcert)
    {
        schoolcert = "Yes";
    }
    else
    {
        schoolcert = "No";
    }
    var ispancard = document.getElementById("pancard").checked;
    var pancard = "";
    if (ispancard)
    {
        pancard = "Yes";
    }
    else
    {
        pancard = "No";
    }
    var ispassport = document.getElementById("passport").checked;
    var passport = "";
    if (ispassport)
    {
        passport = "Yes";
    }
    else
    {
        passport = "No";
    }
    var isdrivingLicence = document.getElementById("drivingLicence").checked;
    var drivingLicence = "";
    if (isdrivingLicence)
    {
        drivingLicence = "Yes";
    }
    else
    {
        drivingLicence = "No";
    }
    var isvotingId = document.getElementById("votingId").checked;
    var votingId = "";
    if (isvotingId)
    {
        votingId = "Yes";
    }
    else
    {
        votingId = "No";
    }
    var isRestLetter = document.getElementById("RestLetter").checked;
    var RestLetter = "";
    if (isRestLetter)
    {
        RestLetter = "Yes";
    }
    else
    {
        RestLetter = "No";
    }
    var isgovtbankpass = document.getElementById("govtbankpass").checked;
    var govtbankpass = "";
    if (isgovtbankpass)
    {
        govtbankpass = "Yes";
    }
    else
    {
        govtbankpass = "No";
    }
    var islicpolicy = document.getElementById("licpolicy").checked;
    var licpolicy = "";
    if (islicpolicy)
    {
        licpolicy = "Yes";
    }
    else
    {
        licpolicy = "No";
    }
    var isrenetedAgree = document.getElementById("renetedAgree").checked;
    var renetedAgree = "";
    if (isrenetedAgree)
    {
        renetedAgree = "Yes";
    }
    else
    {
        renetedAgree = "No";
    }
    var isrationcard = document.getElementById("rationcard").checked;
    var rationcard = "";
    if (isrationcard)
    {
        rationcard = "Yes";
    }
    else
    {
        rationcard = "No";
    }
    var isVotingid = document.getElementById("Votingid").checked;
    var Votingid = "";
    if (isVotingid)
    {
        Votingid = "Yes";
    }
    else
    {
        Votingid = "No";
    }
    var isPassportadd = document.getElementById("Passportadd").checked;
    var Passportadd = "";
    if (isPassportadd)
    {
        Passportadd = "Yes";
    }
    else
    {
        Passportadd = "No";
    }
    var isDrivinglic = document.getElementById("Drivinglic").checked;
    var Drivinglic = "";
    if (isDrivinglic)
    {
        Drivinglic = "Yes";
    }
    else
    {
        Drivinglic = "No";
    }
    var isPassbookBank = document.getElementById("PassbookBank").checked;
    var PassbookBank = "";
    if (isPassbookBank)
    {
        PassbookBank = "Yes";
    }
    else
    {
        PassbookBank = "No";
    }
    var islightbill = document.getElementById("lightbill").checked;
    var lightbill = "";
    if (islightbill)
    {
        lightbill = "Yes";
    }
    else
    {
        lightbill = "No";
    }
    var isbankStat = document.getElementById("bankStat").checked;
    var bankStat = "";
    if (isbankStat)
    {
        bankStat = "Yes";
    }
    else
    {
        bankStat = "No";
    }
    var isrentAgreement = document.getElementById("rentAgreement").checked;
    var rentAgreement = "";
    if (isrentAgreement)
    {
        rentAgreement = "Yes";
    }
    else
    {
        rentAgreement = "No";
    }

    addAdharCardDetails(oldAadharNo, selfName, contactNoNo, fatherName, husbandName, dob, address, changesNote, changesNote1, changesNote2, decidedAmtRs, advamt, balamt, referanceName, birthCert, boardcert10, boardcert12, graduateCopy, higheredu, schoolcert, pancard, passport, drivingLicence, votingId, RestLetter, govtbankpass, licpolicy, renetedAgree,
            rationcard, Votingid, Passportadd, Drivinglic, PassbookBank, lightbill, bankStat, rentAgreement);
}



/* 
 * To change this license header+ choose License Headers in Project Properties.
 * To change this template file+ choose Tools | Templates
 * and open the template in the editor.
 */

function addPassport2Details()
{


    var docType=document.getElementById("docType").value;
   // alert(docType);
    var optionsRadios1 = document.getElementById("optionsRadios1").selected;
    var optionsRadios2 = document.getElementById("optionsRadios2").selected;
    var custsrnm = document.getElementById("custsrnm").value;
    //alert(custsrnm);
    var custName = document.getElementById("custName").value;
    //alert(custfsnm);
    var custpsnm = document.getElementById("custpsnm").value;
    //alert(custpsnm);
    var dob = document.getElementById("dob").value;
    // alert(dob);
    var optionsRadios3 = document.getElementById("optionsRadios3").selected;
    var optionsRadios4 = document.getElementById("optionsRadios4").selected;
    var pob = document.getElementById("pob").value;
    //alert(pob);
    var tal = document.getElementById("tal").value;
    //alert(tal);
    var dist = document.getElementById("dist").value;
    //alert(dist);
    var ste = document.getElementById("ste").value;
    //alert(ste);
    var quali = document.getElementById("quali").value;
    //alert(quali);
    var optionsRadios5 = document.getElementById("optionsRadios5").selected;
    var optionsRadios6 = document.getElementById("optionsRadios6").selected;
    var optionsRadios7 = document.getElementById("optionsRadios7").selected;
    var optionsRadios8 = document.getElementById("optionsRadios8").selected;
    var optionsRadios9 = document.getElementById("optionsRadios9").selected;
    var optionsRadios10 = document.getElementById("optionsRadios10").selected;
    var optionsRadios11 = document.getElementById("optionsRadios11").selected;
    var vblmrk = document.getElementById("vblmrk").value;
    //alert(vblmrk);
    var address = document.getElementById("address").value;
    //alert(address);
    var contactNo = document.getElementById("contactNo").value;
    //alert(contactNo);
    
    var email = document.getElementById("email").value;
    //alert(email);
    var nmofp = document.getElementById("nmofp").value;
    //alert(nmofp);
    var dors = document.getElementById("dors").value;
    //alert(dors);
    var phno = document.getElementById("phno").value;
    //alert(phno);
    var whnm = document.getElementById("whnm").value;
    //alert(whnm);
    var fnm = document.getElementById("fnm").value;
    //alert(fnm);
    var mnm = document.getElementById("mnm").value;
    //alert(mnm);
    var pvadd = document.getElementById("pvadd").value;
    //alert(pvadd);
    var pin = document.getElementById("pin").value;
    //alert(pin);
    var doi = document.getElementById("doi").value;
    //alert(doi);
    var fno = document.getElementById("fno").value;
    //alert(fno);
    var poi = document.getElementById("poi").value;
    //alert(poi);
    var doe = document.getElementById("doe").value;
    //alert(doe);
    var flnm1 = document.getElementById("flnm1").value;
    //alert(flnm1);
    var add1 = document.getElementById("add1").value;
    //alert(add1);
    var mob1 = document.getElementById("mob1").value;
    //alert(mob1);
    var flnm2 = document.getElementById("flnm2").value;
    //alert(flnm2);
    var add2 = document.getElementById("add2").value;
    //alert(add2);
    var mob2 = document.getElementById("mob2").value;
    //alert(mob2);
    var optionsRadios12 = document.getElementById("optionsRadios12").selected;
    var optionsRadios13 = document.getElementById("optionsRadios13").selected;
    var decidedAmt = document.getElementById("decidedAmt").value;
    //alert(damt);
    var date1 = document.getElementById("date1").value;
    //alert(date1);
    var aamt = document.getElementById("aamt").value;
    //alert(aamt);
    var date2 = document.getElementById("date2").value;
    //alert(date2);
    var balAmt = document.getElementById("balAmt").value;
    //alert(bamt);
    var date3 = document.getElementById("date3").value;
    //alert(date3);
    var amtPaid=document.getElementById("amtPaid").value;
    //alert(amountPaid);
    var date4=document.getElementById("date4").value;
    //alert(date4);
    var submitDate=document.getElementById("submitDate").value;
    //alert("textend"+submitDate);



    var isbirthCert = document.getElementById("birthCert").checked;
    var birthCert = "";
    if (isbirthCert)
    {
        birthCert = "Yes";

    } else {
        birthCert = "No";

    }
    //alert(birthCert);                                                                                                                     
    var isschoolCert = document.getElementById("schoolCert").checked;
    var schoolCert = "";
    if (isschoolCert)
    {
        schoolCert = "Yes";

    } else
    {
        schoolCert = "No";

    }
    //alert(schoolCert);   

    var isssc = document.getElementById("ssc").checked;
    var ssc = "";
    if (isssc)
    {
        ssc = "Yes";

    } else {
        ssc = "No";

    }
    //alert(ssc);   
    var ishsc = document.getElementById("hsc").checked;
    var hsc = "";
    if (ishsc)
    {
        hsc = "Yes";

    } else {
        hsc = "No";

    }
    //alert(hsc);   
    var isahem = document.getElementById("ahem").checked;
    var ahem = "";
    if (isahem)
    {
        ahem = "Yes";

    } else {
        ahem = "No";

    }
    //alert(ahem);   

    var isgc = document.getElementById("gc").checked;
    var gc = "";
    if (isgc)
    {
        gc = "Yes";

    } else {
        gc = "No";

    }
    //alert(gc);   
    var ispc = document.getElementById("pc").checked;
    var pc = "";
    if (ispc)
    {
        pc = "Yes";

    } else {
        pc = "No";

    }
    //alert(pc);   
    var isvc = document.getElementById("vc").checked;
    var vc = "";
    if (isvc)
    {
        vc = "Yes";

    } else {
        vc = "No";

    }
    //alert(vc);    
    var isdl = document.getElementById("dl").checked;
    var dl = "";
    if (isdl)
    {
        dl = "Yes";

    } else {
        dl = "No";

    }
    //alert(dl);    
    var isci = document.getElementById("ci").checked;
    var ci = "";
    if (isci)
    {
        ci = "Yes";

    } else {
        ci = "No";

    }
    //alert(ci);   
    var isrc = document.getElementById("rc").checked;
    var rc = "";
    if (isrc)
    {
        rc = "Yes";

    } else {
        rc = "No";

    }
    //alert(rc);    
    var islbo = document.getElementById("lbo").checked;
    var lbo = "";
    if (islbo)
    {
        lbo = "Yes";

    } else {
        lbo = "No";

    }
    //alert(lbo);    

    var issl = document.getElementById("sl").checked;
    var sl = "";
    if (issl)
    {
        sl = "Yes";

    } else {
        sl = "No";

    }
    //alert(sl);   
    var isgbs = document.getElementById("gbs").checked;
    var gbs = "";
    if (isgbs)
    {
        gbs = "Yes";

    } else {
        gbs = "No";

    }
    //alert(gbs);   
    var isac = document.getElementById("ac").checked;
    var ac = "";
    if (isac)
    {
        ac = "Yes";

    } else {
        ac = "No";

    }
    //alert(ac);   
    var isvi = document.getElementById("vi").checked;
    var vi = "";
    if (isvi)
    {
        vi = "Yes";

    } else {
        vi = "No";

    }
    //alert(vi);   
    var iscl = document.getElementById("cl").checked;
    var cl = "";
    if (iscl)
    {
        cl = "Yes";

    } else {
        cl = "No";

    }
    //alert(cl);   
    var isgb = document.getElementById("gb").checked;
    var gb = "";
    if (isgb)
    {
        gb = "Yes";

    } else {
        gb = "No";

    }
    //alert(gb);   
    var islp = document.getElementById("lp").checked;
    var lp = "";
    if (islp)
    {
        lp = "Yes";

    } else {
        lp = "No";

    }
    //alert(lp);   
    var isiran = document.getElementById("iran").checked;
    var iran = "";
    if (isiran)
    {
        iran = "Yes";

    } else {
        iran = "No";

    }
     if(custName==""){
        alert("Please Enter First Name");
        document.getElementById("custName").focus();
    }
    else if(address==""){
          alert("Please Enter Present Address");
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No");
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decidedAmt").focus();
    }
    else if(balAmt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmt").focus();
        
    }
    else if(amtPaid==""){
          alert("Please Enter Amount Paid");
        document.getElementById("amtPaid").focus();
    
    }
    // alert("37"+iran);   

   else{ getPassport2Details(docType, optionsRadios1, optionsRadios2, custsrnm, custName, custpsnm, dob, optionsRadios3, optionsRadios4, pob, tal, dist, ste,
            quali, optionsRadios5, optionsRadios6, optionsRadios7, optionsRadios8, optionsRadios9, optionsRadios10,
            optionsRadios11, vblmrk, address, contactNo, email, nmofp, dors, phno, whnm, fnm, mnm, pvadd, pin, doi, fno, poi, doe, flnm1,
            add1, mob1, flnm2, add2, mob2, optionsRadios12, optionsRadios13, decidedAmt, date1, aamt, date2, balAmt, date3,amtPaid, date4,submitDate,  birthCert, schoolCert, ssc, hsc, ahem,
            gc, pc, vc, dl, ci, rc, lbo, sl, gbs, ac, vi, cl, gb, lp, iran);



}
}


function login_validation(){
    
    
    loginvalidation();
}

function getPancardDetail() {
   var docType = document.getElementById("docType").value;
   
    var CorrectionForm = document.getElementById("CorrectionForm").value;


    var OldpanNo = document.getElementById("OldpanNo").value;


    var custName = document.getElementById("custName").value;

    var FatherName = document.getElementById("FatherName").value;

    var SurName = document.getElementById("SurName").value;

    var HusbandName = document.getElementById("HusbandName").value;

    var Dob = document.getElementById("Dob").value;

    var address = document.getElementById("address").value;

    var contactNo = document.getElementById("contactNo").value;


    var isBirthCert = document.getElementById("BirthCert").checked;
    var BirthCert = "";
    if (isBirthCert)
    {
        BirthCert = "Yes";

    }
    else {
        BirthCert = "No";

    }

    var issscCert = document.getElementById("sscCert").checked;
    var sscCert = "";
    if (issscCert)
    {
        sscCert = "Yes";

    }
    else {
        sscCert = "No";

    }



    var ishscCert = document.getElementById("hscCert").checked;
    var hscCert = "";
    if (ishscCert)
    {
        hscCert = "Yes";

    }
    else {
        hscCert = "No";

    }


    var ismarriageCert = document.getElementById("marriageCert").checked;
    var marriageCert = "";
    if (ismarriageCert)
    {
        marriageCert = "Yes";

    }
    else {
        marriageCert = "No";

    }


    var ismagisrateCharge = document.getElementById("magisrateCharge").checked;
    var magisrateCharge = "";
    if (ismagisrateCharge)
    {
        magisrateCharge = "Yes";

    }
    else {
        magisrateCharge = "No";

    }

    var isadharCard = document.getElementById("adharCard").checked;
    var adharCard = "";
    if (isadharCard)
    {
        adharCard = "Yes";

    }
    else {
        adharCard = "No";

    }


    var ispassprtValid = document.getElementById("passprtValid").checked;
    var passprtValid = "";
    if (ispassprtValid)
    {
        passprtValid = "Yes";

    }
    else {
        passprtValid = "No";

    }

    var isdrivngLicn = document.getElementById("drivngLicn").checked;
    var drivngLicn = "";
    if (isdrivngLicn)
    {
        drivngLicn = "Yes";

    }
    else {
        drivngLicn = "No";

    }

        var isvotingId = document.getElementById("votingId").checked;
        var votingId = "";
        if (isvotingId)
        {
            votingId = "Yes";

        }
        else {
            votingId = "No";
        }


        var isdomicileCert = document.getElementById("domicileCert").checked;
        var domicileCert = "";
        if (isdomicileCert)
        {
            domicileCert = "Yes";

        }
        else {
            domicileCert = "No";
        }


        var isadharCard1 = document.getElementById("adharCard1").checked;
        var adharCard1 = "";
        if (isadharCard1)
        {
            adharCard1 = "Yes";

        }
        else {
            adharCard1 = "No";
        }



        var isvoteId = document.getElementById("voteId").checked;
        var voteId = "";
        if (isvoteId)
        {
            voteId = "Yes";

        }
        else {
            voteId = "No";
        }


        var ispassportValid = document.getElementById("passportValid").checked;
        var passportValid = "";
        if (ispassportValid)
        {
            passportValid = "Yes";

        }
        else {
            passportValid = "No";
        }


        var isdrivingLicvalid = document.getElementById("drivingLicvalid").checked;
        var drivingLicvalid = "";
        if (drivingLicvalid)
        {
            drivingLicvalid = "Yes";

        }
        else {
            drivingLicvalid = "No";
        }


        var isbankPaPhoto = document.getElementById("bankPaPhoto").checked;
        var bankPaPhoto = "";
        if (isbankPaPhoto)
        {
            bankPaPhoto = "Yes";

        }
        else {
            bankPaPhoto = "No";
        }


        var iscorpeterLetter = document.getElementById("corpeterLetter").checked;
        var corpeterLetter = "";
        if (iscorpeterLetter)
        {
            corpeterLetter = "Yes";

        }
        else {
            corpeterLetter = "No";
        }


        var isnotory = document.getElementById("notory").checked;
        var notory = "";
        if (isnotory)
        {
            notory = "Yes";

        }
        else {
            notory = "No";
        }


        var isaddProof = document.getElementById("addProof").checked;
        var addProof = "";
        if (isaddProof)
        {
            addProof = "Yes";

        }
        else {
            addProof = "No";
        }


        var isdomCert = document.getElementById("domCert").checked;
        var domCert = "";
        if (isdomCert)
        {
            domCert = "Yes";

        }
        else {
            domCert = "No";
        }

    var decidedAmt = document.getElementById("decidedAmt").value;
    var amtPaid = document.getElementById("amtPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var Remarknote = document.getElementById("Remarknote").value;
    var submitDate = document.getElementById("submitDate").value;
   

   if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    
    else if(address==""){
          alert("Please Enter address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(amtPaid==""){
          alert("Please Enter Amount Paid")
        document.getElementById("amtPaid").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount")
        document.getElementById("balAmt").focus();
     
    }
    
    else{
    

    addPancard(docType,CorrectionForm, OldpanNo, custName, FatherName, SurName, HusbandName, Dob, address, contactNo, BirthCert, sscCert, hscCert, marriageCert, magisrateCharge, adharCard, passprtValid, drivngLicn, votingId, domicileCert, adharCard1, voteId, passportValid, drivingLicvalid, bankPaPhoto, corpeterLetter, notory, addProof, domCert,decidedAmt,amtPaid,balAmt,Remarknote,submitDate );
    }
}    
    
    function getFoodLicenceDetails() {
    var documentType = document.getElementById("documentType").value;
    var food = document.getElementById("food").value;
    var renewdate = document.getElementById("renewdate").value;
    var customerName = document.getElementById("customerName").value;
     var contactNo = document.getElementById("contactNo").value;
    var addfull = document.getElementById("addfull").value;
    var nature = document.getElementById("nature").value;
    var empquantity = document.getElementById("empquantity").value;
    var prop = document.getElementById("prop").value;
    var partner = document.getElementById("partner").value;
    var water = document.getElementById("water").value;
    var product = document.getElementById("product").value;
    var turnover = document.getElementById("turnover").value;
    var ifr = document.getElementById("ifr").value;
    var changes = document.getElementById("changes").value;
    var decideAmnt = document.getElementById("decideAmnt").value;
    var amountPaid = document.getElementById("amountPaid").value;
    var balAmnt = document.getElementById("balAmnt").value;
    var refName = document.getElementById("refName").value;
    var submitDate = document.getElementById("submitDate").value;
    var AB = document.getElementById("AB").value;
    var chargesa = document.getElementById("chargesa").value;
    var chargesb = document.getElementById("chargesb").value;
    var chargesc = document.getElementById("chargesc").value;
    var isadhr = document.getElementById("adhr").checked;
    var adhr = "";
    if (isadhr) {
        adhr = "yes";
    }
    else {
        adhr = "no";
    }
    var isvot = document.getElementById("vot").checked;
    var vot = "";
    if (isvot) {
        vot = "yes";
    }
    else {
        vot = "no";
    }
    var ispass = document.getElementById("pass").checked;
    var pass = "";
    if (ispass) {
        pass = "yes";
    }
    else {
        pass = "no";
    }
    var isdri = document.getElementById("dri").checked;
    var dri = "";
    if (isdri) {
        dri = "yes";
    }
    else {
        dri = "no";
    }
    var ispan = document.getElementById("pan").checked;
    var pan = "";
    if (ispan) {
        pan = "yes";
    }
    else {
        pan = "no";
    }
    var islight = document.getElementById("light").checked;
    var light = "";
    if (islight) {
        light = "yes";
    }
    else {
        light = "no";
    }
    var isrent = document.getElementById("rent").checked;
    var rent = "";
    if (isrent) {
        rent = "yes";
    }
    else {
        rent = "no";
    }
    var islet = document.getElementById("let").checked;
    var let = "";
    if (islet) {
        let = "yes";
    }
    else {
        let = "no";
    }
    var ismap = document.getElementById("map").checked;
    var map = "";
    if (ismap) {
        map = "yes";
    }
    else {
        map = "no";
    }
    var isgum = document.getElementById("gum").checked;
    var gum = "";
    if (isgum) {
        gum = "yes";
    }
    else {
        gum = "no";
    }
    var isnoc = document.getElementById("noc").checked;
    var noc = "";
    if (isnoc) {
        noc = "yes";
    }
    else {
        noc = "no";
    }
    var isshop = document.getElementById("shop").checked;
    var shop = "";
    if (isshop) {
        shop = "yes";
    }
    else {
        shop = "no";
    }
    
    if(customerName==""){
        alert("Please Enter Firm/Company Name");
        document.getElementById("customerName").focus();
    }
     else if(contactNo==""){
          alert("Please Enter Contact No ");
        document.getElementById("contactNo").focus();
    }
    else if(addfull==""){
          alert("Please Enter Full Address");
        document.getElementById("addfull").focus();
    }
    
    else if(decideAmnt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decideAmnt").focus();
    }else if(amountPaid==""){
          alert("Please Enter  Amount Paid");
        document.getElementById("amountPaid").focus();
    
    }else if(balAmnt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmnt").focus();
        
    }

    else{addFoodLicenceDetails(documentType,food, renewdate, customerName,contactNo, addfull, nature, empquantity,
            prop, partner, water, product, turnover, ifr, changes, decideAmnt, amountPaid,
            balAmnt, refName,submitDate, adhr, vot, pass, dri, pan, light, rent, let, map, gum,
            noc, shop, AB, chargesa, chargesb, chargesc);}
}

 function getDrivingLicenceDetails() {
        var documentType = document.getElementById("documentType").value;

        var customerName = document.getElementById("customerName").value;
        var contactNo = document.getElementById("contactNo").value;

        var son = document.getElementById("son").value;

    var presentaddress = document.getElementById("presentaddress").value;

    var permanentaddress = document.getElementById("permanentaddress").value;

    var dateofbirth = document.getElementById("dateofbirth").value;

    var education = document.getElementById("education").value;

    var bloodgroup = document.getElementById("bloodgroup").value;

    var identificationmark = document.getElementById("identificationmark").value;

    var identificationmarks = document.getElementById("identificationmarks").value;

    var decideAmnt = document.getElementById("decideAmnt").value;

    var amountPaid = document.getElementById("amountPaid").value;
    var balAmnt = document.getElementById("balAmnt").value;
    var refName = document.getElementById("refName").value;
    var submitDate = document.getElementById("submitDate").value;

    var isYes1 = document.getElementById("radioa").checked;
    var radioa = "";
    if (isYes1) {
        radioa = "yes";
    }
    else {
        radioa = "no";
    }
    
    var isYes2 = document.getElementById("radiob").checked;
    var radiob = "";
    if (isYes2) {
        radiob = "yes";
    }
    else {
        radiob = "no";
    }
    var isYes3 = document.getElementById("radioc").checked;
    var radioc = "";
    if (isYes3) {
        radioc = "yes";
    }
    else {
        radioc = "no";
    }
    var isYes4 = document.getElementById("radiod").checked;
    var radiod = "";
    if (isYes4) {
        radiod = "yes";
    }
    else {
        radiod = "no";
    }
    var isYes5 = document.getElementById("radioe").checked;
    var radioe = "";
    if (isYes5) {
        radioe = "yes";
    }
    else {
        radioe = "no";
    }
    var isYes6 = document.getElementById("radiou").checked;
    var radiou = "";
    if (isYes6) {
        radiou = "yes";
    }
    else {
        radiou = "no";
    }
    var isYes7 = document.getElementById("radiop").checked;
    var radiop = "";
    if (isYes7) {
        radiop = "yes";
    }
    else {
        radiop = "no";
    }
     if(customerName==""){
        alert("Please Enter Applicant Name");
        document.getElementById("customerName").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No");
        document.getElementById("contactNo").focus();
    }
    else if(presentaddress==""){
          alert("Please Enter Present Address");
        document.getElementById("presentaddress").focus();
    }
    else if(decideAmnt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decideAmnt").focus();
    }else if(amountPaid==""){
          alert("Please Enter Amount Paid");
        document.getElementById("amountPaid").focus();
    
    }else if(balAmnt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmnt").focus();
        
    }
    else{
    addDrivingLicenceDetails(documentType, customerName,contactNo, son, presentaddress, permanentaddress, dateofbirth, education, bloodgroup, identificationmark, identificationmarks, decideAmnt, amountPaid, balAmnt, refName,submitDate, radioa, radiob, radioc, radiod, radioe, radiou, radiop);
}
}


function addmediclaim() {
     var documentType = document.getElementById("documentType").value;
    var oldPolicyNo = document.getElementById("oldPolicyNo").value;
    var companyName = document.getElementById("companyName").value;
    var renewDate = document.getElementById("renewDate").value;
    var customerName = document.getElementById("customerName").value;
    var middleName = document.getElementById("middleName").value;
    var lastName = document.getElementById("lastName").value;
    var husbandName = document.getElementById("husbandName").value;
    var dob = document.getElementById("dob").value;
    var address = document.getElementById("address").value;
    var contactNo = document.getElementById("contactNo").value;
    var memberFirstName = document.getElementById("memberFirstName").value;
    var age = document.getElementById("age").value;
    var secondMemberName = document.getElementById("secondMemberName").value;
    var secondMemberAge = document.getElementById("secondMemberAge").value;
    var thirdMemberName = document.getElementById("thirdMemberName").value;
    var thirdMemberAge = document.getElementById("thirdMemberAge").value;
    var fourthMemberName = document.getElementById("fourthMemberName").value;
    var fourthMemberAge = document.getElementById("fourthMemberAge").value;
    var fifthMemberName = document.getElementById("fifthMemberName").value;
    var fifthMemberAge = document.getElementById("fifthMemberAge").value;

    var isadharCard = document.getElementById("adharCard").checked;
    var adharCard = "";
    if (isadharCard)
    {
        adharCard = "Yes";
    }
    else {
        adharCard = "No";
    }

    var isvotingCard = document.getElementById("votingCard").checked;
    var votingCard = "";
    if (isvotingCard)
    {
        votingCard = "Yes";
    }
    else
    {
        votingCard = "No";
    }

    var ispassport = document.getElementById("passport").checked;
    var passport = "";
    if (ispassport)
    {
        passport = "Yes";
    }
    else
    {
        passport = "No";
    }

    var isdrivingLicence = document.getElementById("drivingLicence").checked;
    var drivingLicence = "";
    if (isdrivingLicence)
    {
        drivingLicence = "Yes";
    }
    else
    {
        drivingLicence = "No";
    }

    var ispancard = document.getElementById("pancard").checked;
    var pancard = "";
    if (ispancard)
    {
        pancard = "Yes";
    }
    else {
        pancard = "No";
    }

    var isadharCardadd = document.getElementById("adharCardadd").checked;
    var adharCardadd = "";
    if (isadharCardadd)
    {
        adharCardadd = "Yes";
    }
    else {
        adharCardadd = "No";
    }

    var isvotingCardadd = document.getElementById("votingCardadd").checked;
    var votingCardadd = "";
    if (isvotingCardadd)
    {
        votingCardadd = "Yes";
    }
    else
    {
        votingCardadd = "No";
    }

    var ispassportadd = document.getElementById("passportadd").checked;
    var passportadd = "";
    if (ispassportadd)
    {
        passportadd = "Yes";
    }
    else
    {
        passportadd = "No";
    }

    var isdrivingLicenceadd = document.getElementById("drivingLicenceadd").checked;
    var drivingLicenceadd = "";
    if (isdrivingLicenceadd)
    {
        drivingLicenceadd = "Yes";
    }
    else
    {
        drivingLicenceadd = "No";
    }
    var isbankpassbook = document.getElementById("bankpassbook").checked;
    var bankpassbook = "";
    if (isbankpassbook)
    {
        bankpassbook = "Yes";
    }
    else
    {
        bankpassbook = "No";
    }
    var iscorporateLetter = document.getElementById("corporateLetter").checked;
    var corporateLetter = "";
    if (iscorporateLetter)
    {
        corporateLetter = "Yes";
    }
    else
    {
        corporateLetter = "No";
    }
    var isrentAgreement = document.getElementById("rentAgreement").checked;
    var rentAgreement = "";
    if (isrentAgreement)
    {
        rentAgreement = "Yes";
    }
    else
    {
        rentAgreement = "No";
    }
    var isaddProofLightBill = document.getElementById("addProofLightBill").checked;
    var addProofLightBill = "";
    if (isaddProofLightBill)
    {
        addProofLightBill = "Yes";
    }
    else
    {
        addProofLightBill = "No";
    }

    var decideAmt = document.getElementById("decideAmt").value;
    var amountPaid = document.getElementById("amountPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var refName = document.getElementById("refName").value;
    var submitDate = document.getElementById("submitDate").value;
  
    addmediclaimDetails(documentType,oldPolicyNo, companyName, renewDate, customerName, middleName, lastName, husbandName, dob, address, contactNo, memberFirstName, age, secondMemberName, secondMemberAge, thirdMemberName, thirdMemberAge, fourthMemberName, fourthMemberAge, fifthMemberName, fifthMemberAge, adharCard, votingCard, passport, drivingLicence, pancard, adharCardadd, votingCardadd, passportadd, drivingLicenceadd, bankpassbook, corporateLetter, rentAgreement, addProofLightBill, decideAmt, amountPaid, balAmt, refName, submitDate);
}




function addSalaryItDetails()


{
   
    var itType =document.getElementById("itType").value;
    var panNo=document.getElementById("panNo").value;
    var docType=document.getElementById("docType").value;// alert(docType);
    
    var custName=document.getElementById("custName").value;alert(custName);
    var surName=document.getElementById("surName").value;
    var dateOfBirth=document.getElementById("dateOfBirth").value;
    var contactNo=document.getElementById("contactNo").value;// alert("Contact"+contactNo);
     var address = document.getElementById("address").value;// alert(address);
    var itMakeValue=document.getElementById("itMakeValue").value;
    var textPaidArea=document.getElementById("textPaidArea").value;
    var licPremPaid=document.getElementById("licPremPaid").value;
    var medicalPrem=document.getElementById("medicalPrem").value;
    var hraInterest=document.getElementById("hraInterest").value;
    var natureOfBuisness=document.getElementById("natureOfBuisness").value;
    var salaryRsMly=document.getElementById("salaryRsMly").value;
    var companyName=document.getElementById("companyName").value;
    var post=document.getElementById("post").value;
    var bnkAccNo=document.getElementById("bnkAccNo").value;
    
    var branch=document.getElementById("branch").value;
   
    
    var ifscCode=document.getElementById("ifscCode").value;
    // alert("16"+ifscCode);
    
    var micrCode=document.getElementById("micrCode").value;
    // alert("17"+micrCode);
    var additionalInfo1=document.getElementById("additionalInfo1").value;
    // alert("18"+additionalInfo1);
    var additionalInfo2=document.getElementById("additionalInfo2").value;
    // alert("19"+additionalInfo2);
    var decidedAmt=document.getElementById("decidedAmt").value;
    // alert("20"+decidedAmt);
    var amtPaid=document.getElementById("amtPaid").value;
    // alert("21"+amtPaid);
    var balAmt=document.getElementById("balAmt").value;
     // alert("22"+balAmt);
    var refAmt=document.getElementById("refAmt").value;
        var submitDate=document.getElementById("submitDate").value;
  // alert("23"+submitDate);
   
    // alert("24"+panCard);
    // alert("25"+aadharCard);
    // alert("26"+votingCard);
    // alert("27"+passportValid);
    // alert("28"+drivingLicn);
    // alert("29"+rationCard);
    // alert("30"+lightBill);
    // alert("31"+salaryItPaper);
    // alert("32"+canclCheq);
    // alert("33"+bankDetails);
    // alert("34"+investmentCopy);
    // alert("35"+loanEmi);
    // alert("36"+gumasta);
    // alert("37"+currentAcc);
    // alert("39"+investment);
    // alert("40"+Loan); 
    var ispanCard=document.getElementById("panCard").checked;
     var panCard="";
    if(ispanCard)
    {
        panCard="Yes";
        
    }
    else{
         panCard="No";
        
    }
    var isaadharCard=document.getElementById("aadharCard").checked;
     var aadharCard="";
    if(isaadharCard)
    {
        iran="Yes";
        
    }
    else{
         iran="No";
        
    }
    var isvotingCard=document.getElementById("votingCard").checked;
     var votingCard="";
    if(isvotingCard)
    {
        votingCard="Yes";
        
    }
    else{
         votingCard="No";
        
    }
     var ispassportValid=document.getElementById("passportValid").checked;
      var passportValid="";
    if(ispassportValid)
    {
        passportValid="Yes";
        
    }
    else{
         passportValid="No";
        
    }
    var isdrivingLicn=document.getElementById("drivingLicn").checked;
     var drivingLicn="";
    if(isdrivingLicn)
    {
        drivingLicn="Yes";
        
    }
    else{
         drivingLicn="No";
        
    }
    var isrationCard=document.getElementById("rationCard").checked;
     var rationCard="";
    if(isrationCard)
    {
        rationCard="Yes";
        
    }
    else{
         rationCard="No";
        
    }
    var islightBill=document.getElementById("lightBill").checked;
     var lightBill="";
    if(islightBill)
    {
        lightBill="Yes";
        
    }
    else{
         lightBill="No";
        
    }
    var issalaryItPaper=document.getElementById("salaryItPaper").checked;
     var salaryItPaper="";
    if(issalaryItPaper)
    {
        salaryItPaper="Yes";
        
    }
    else{
         salaryItPaper="No";
        
    }
    var iscanclCheq=document.getElementById("canclCheq").checked;
     var canclCheq="";
    if(iscanclCheq)
    {
        canclCheq="Yes";
        
    }
    else{
         canclCheq="No";
        
    }
    var isbankDetails=document.getElementById("bankDetails").checked;
     var bankDetails="";
    if(isbankDetails)
    {
        bankDetails="Yes";
        
    }
    else{
         bankDetails="No";
        
    }
     var isinvstmntCopy=document.getElementById("investmentCopy").checked;
      var investmentCopy="";
    if(isinvstmntCopy)
    {
        investmentCopy="Yes";
        
    }
    else{
         investmentCopy="No";
        
    }
     
    var isloanEmi=document.getElementById("loanEmi").checked;
     var loanEmi="";
    if(isloanEmi)
    {
        loanEmi="Yes";
        
    }
    else{
         loanEmi="No";
        
    }
    var isgumasta=document.getElementById("gumasta").checked;
     var gumasta="";
    if(isgumasta)
    {
        gumasta="Yes";
        
    }
    else{
         gumasta="No";
        
    }
    var iscurrentAcc=document.getElementById("currentAcc").checked;
     var currentAcc="";
    if(iscurrentAcc)
    {
        currentAcc="Yes";
        
    }
    else{
         currentAcc="No";
        
    }
    var isinvestment=document.getElementById("investment").checked;
     var investment="";
    if(isinvestment)
    {
        investment="Yes";
        
    }
    else{
         investment="No";
        
    }
    var isLoan=document.getElementById("Loan").checked;
     var Loan="";
    if(isLoan)
    {
        Loan="Yes";
        
    }
    else{
         Loan="No";
        
    }
 
      if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    else if(address==""){
          alert("Please Enter Permanent Address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(balAmt==""){
          alert("Please Enter Balance Amount")
        document.getElementById("balAmt").focus();
    
    }else if(amtPaid==""){
          alert("Please Enter Balance amount")
        document.getElementById("amtPaid").focus();
        
    }
    else if(submitDate==""){
          alert("Please Enter Submit Date")
        document.getElementById("submitDate").focus();
        
    }
    else{

    addSalaryIt(docType,itType,panNo,custName,surName,dateOfBirth,contactNo,address,itMakeValue,textPaidArea,licPremPaid,
              medicalPrem,hraInterest,natureOfBuisness,salaryRsMly,companyName,post,bnkAccNo,branch,ifscCode,micrCode,additionalInfo1,
              additionalInfo2,decidedAmt,amtPaid,balAmt,refAmt,submitDate,panCard,aadharCard,votingCard,passportValid,drivingLicn,rationCard,
              lightBill,salaryItPaper,canclCheq,bankDetails,investmentCopy,loanEmi,gumasta,currentAcc,investment,Loan);                              
 
 
 
 }}
function addLoanFileDetails() {
    var docType = document.getElementById("docType").value;
    var Loan = document.getElementById("oro").value;
    var amt = document.getElementById("amt").value;
    var pann = document.getElementById("pann").value;
    var contactNo = document.getElementById("contactNo").value;
    var custName = document.getElementById("custName").value;
    var Dob1 = document.getElementById("Dob1").value;
    var add3 = document.getElementById("add3").value;
    var buss = document.getElementById("buss").value;
    var sal2 = document.getElementById("sal2").value;
    var com = document.getElementById("com").value;
    var post1 = document.getElementById("post1").value;
    var exp = document.getElementById("exp").value;
    var qual = document.getElementById("qual").value;
    var rem = document.getElementById("rem").value;
    var info = document.getElementById("info").value;
    var decidedAmt = document.getElementById("decidedAmt").value;
    var amtPaid = document.getElementById("amtPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var refName = document.getElementById("refName").value;
     var submitDate = document.getElementById("submitDate").value;
    var iscard = document.getElementById("card").checked;
    var card = "";
    if (iscard) {
        card = "yes";
    }
    else {
        card = "no";
    }
    var isvoti = document.getElementById("voti").checked;
    var voti = "";
    if (isvoti) {
        voti = "yes";
    }
    else {
        voti = "no";
    }
    var isvalid = document.getElementById("valid").checked;
    var valid = "";
    if (isvalid) {
        valid = "yes";
    }
    else {
        valid = "no";
    }
    var islice = document.getElementById("lice").checked;
    var lice = "";
    if (islice) {
        lice = "yes";
    }
    else {
        lice = "no";
    }
    var iscard2 = document.getElementById("card2").checked;
    var card2 = "";
    if (iscard2) {
        card2 = "yes";
    }
    else {
        card2 = "no";
    }
    var iscard1 = document.getElementById("card1").checked;
    var card1 = "";
    if (iscard1) {
        card1 = "yes";
    }
    else {
        card1 = "no";
    }
    var isvotin = document.getElementById("votin").checked;
    var votin = "";
    if (isvotin) {
        votin = "yes";
    }
    else {
        votin = "no";
    }
    var israt = document.getElementById("rat").checked;
    var rat = "";
    if (israt) {
        rat = "yes";
    }
    else {
        rat = "no";
    }
    var isbill = document.getElementById("bill").checked;
    var bill = "";
    if (isbill) {
        bill = "yes";
    }
    else {
        bill = "no";
    }
    var isresi = document.getElementById("resi").checked;
    var resi = "";
    if (isresi) {
        resi = "yes";
    }
    else {
        resi = "no";
    }
    var isgovt = document.getElementById("govt").checked;
    var govt = "";
    if (isgovt) {
        govt = "yes";
    }
    else {
        govt = "no";
    }
    var islic = document.getElementById("lic").checked;
    var lic = "";
    if (islic) {
        lic = "yes";
    }
    else {
        lic = "no";
    }
    var isnot = document.getElementById("not").checked;
    var not = "";
    if (isnot) {
        not = "yes";
    }
    else {
        not = "no";
    }
    var isform1 = document.getElementById("form1").checked;
    var form1 = "";
    if (isform1) {
        form1 = "yes";
    }
    else {
        form1 = "no";
    }
    var isfile = document.getElementById("file").checked;
    var file = "";
    if (isfile) {
        file = "yes";
    }
    else {
        file = "no";
    }
    var isbank = document.getElementById("bank").checked;
    var bank = "";
    if (isbank) {
        bank = "yes";
    }
    else {
        bank = "no";
    }
    var isinvest = document.getElementById("invest").checked;
    var invest = "";
    if (isinvest) {
        invest = "yes";
    }
    else {
        invest = "no";
    }
    var ispay = document.getElementById("pay").checked;
    var pay = "";
    if (ispay) {
        pay = "yes";
    }
    else {
        pay = "no";
    }
    var isexist = document.getElementById("exist").checked;
    var exist = "";
    if (isexist) {
        exist = "yes";
    }
    else {
        exist = "no";
    }
    var isbussi = document.getElementById("bussi").checked;
    var bussi = "";
    if (isbussi) {
        bussi = "yes";
    }
    else {
        bussi = "no";
    }
    var iscurr = document.getElementById("curr").checked;
    var curr = "";
    if (iscurr) {
        curr = "yes";
    }
    else {
        curr = "no";
    }
    var isproper = document.getElementById("proper").checked;
    var proper = "";
    if (isproper) {
        proper = "yes";
    }
    else {
        proper = "no";
    }
    if(contactNo==""){
        alert("Please Enter Contact No");
        document.getElementById("contactNo").focus();
    }
    else if(custName==""){
        alert("Please Enter Customer Name");
        document.getElementById("custName").focus();
    }
    else if(add3==""){
          alert("Please Enter Full Address");
        document.getElementById("add3").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decidedAmt").focus();
    }else if(amtPaid==""){
          alert("Please Enter  Amount Paid");
        document.getElementById("amtPaid").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmt").focus();
        
    }
    else{

    getLoanDetails(docType,Loan, amt, pann,contactNo, custName, Dob1, add3, buss, sal2, com, post1, exp, qual, rem, info, decidedAmt, amtPaid, balAmt, refName,submitDate, card, voti, valid, lice, card2, card1, votin, rat, bill, resi, govt, lic, not, form1, file, bank, invest, pay, exist, bussi, curr, proper);
}
}



function getRationcardDetail() {
    var docType = document.getElementById("docType").value;

    var UpadationChange = document.getElementById("UpadationChange").value;


    var custName = document.getElementById("custName").value;


    var Dob = document.getElementById("Dob").value;

    var address = document.getElementById("address").value;

    var contactNo = document.getElementById("contactNo").value;

    var natureBusiness = document.getElementById("natureBusiness").value;

    var ylyAmt = document.getElementById("ylyAmt").value;

    var gasName = document.getElementById("gasName").value;

    var gasGiverName = document.getElementById("gasGiverName").value;

    var memFirstName1 = document.getElementById("memFirstName1").value;


    var memFirstName2 = document.getElementById("memFirstName2").value;


    var secMemName1 = document.getElementById("secMemName1").value;


    var secMemName2 = document.getElementById("secMemName2").value;


    var ThirdMemName1 = document.getElementById("ThirdMemName1").value;


    var ThirdMemName2 = document.getElementById("ThirdMemName2").value;


    var fourthMemName1 = document.getElementById("fourthMemName1").value;


    var fourthMemName2 = document.getElementById("fourthMemName2").value;

    var fifthMemName1 = document.getElementById("fifthMemName1").value;


    var fifthMemName2 = document.getElementById("fifthMemName2").value;

    var isPancard = document.getElementById("Pancard").checked;
    var Pancard = "";
    if (isPancard)
    {
        Pancard = "Yes";

    }
    else {
        Pancard = "No";

    }


    var isvotingId = document.getElementById("votingId").checked;
    var votingId = "";
    if (isvotingId)
    {
        votingId = "Yes";

    }
    else {
        votingId = "No";

    }



    var ispassportValid = document.getElementById("passportValid").checked;
    var passportValid = "";
    if (ispassportValid)
    {
        passportValid = "Yes";

    }
    else {
        passportValid = "No";

    }


    var isDrivingLicn = document.getElementById("DrivingLicn").checked;
    var DrivingLicn = "";
    if (isDrivingLicn)
    {
        DrivingLicn = "Yes";

    }
    else {
        DrivingLicn = "No";

    }

    var isadharCard = document.getElementById("adharCard").checked;
    var adharCard = "";
    if (isadharCard)
    {
        adharCard = "Yes";

    }
    else {
        adharCard = "No";

    }


    var islightBill = document.getElementById("lightBill").checked;
    var lightBill = "";
    if (islightBill)
    {
        lightBill = "Yes";

    }
    else {
        lightBill = "No";
    }


    var isadharCard1 = document.getElementById("adharCard1").checked;
    var adharCard1 = "";
    if (isadharCard1)
    {
        adharCard1 = "Yes";

    }
    else {
        adharCard1 = "No";
    }


    var isvoteId = document.getElementById("voteId").checked;
    var voteId = "";
    if (isvoteId)
    {
        voteId = "Yes";

    }
    else {
        voteId = "No";
    }


    var issocResiLet = document.getElementById("socResiLet").checked;
    var socResiLet = "";
    if (issocResiLet)
    {
        socResiLet = "Yes";

    }
    else {
        socResiLet = "No";
    }


    var isgovtBankPass = document.getElementById("govtBankPass").checked;
    var govtBankPass = "";
    if (govtBankPass)
    {
        govtBankPass = "Yes";

    }
    else {
        govtBankPass = "No";
    }


    var isrentedNotary = document.getElementById("rentedNotary").checked;
    var rentedNotary = "";
    if (isrentedNotary)
    {
        rentedNotary = "Yes";

    }
    else {
        rentedNotary = "No";
    }


    var isownrLightBillNoc = document.getElementById("ownrLightBillNoc").checked;
    var ownrLightBillNoc = "";
    if (isownrLightBillNoc)
    {
        ownrLightBillNoc = "Yes";

    }
    else {
        ownrLightBillNoc = "No";
    }


    var isform16lstThreeyrs = document.getElementById("form16lstThreeyrs").checked;
    var form16lstThreeyrs = "";
    if (isform16lstThreeyrs)
    {
        form16lstThreeyrs = "Yes";

    }
    else {
        form16lstThreeyrs = "No";
    }


    var isItFile = document.getElementById("ItFile").checked;
    var ItFile = "";
    if (isItFile)
    {
        ItFile = "Yes";

    }
    else {
        ItFile = "No";
    }


    var isgasBook = document.getElementById("gasBook").checked;
    var gasBook = "";
    if (isgasBook)
    {
        gasBook = "Yes";

    }
    else {
        gasBook = "No";
    }

    var istalathiCert = document.getElementById("talathiCert").checked;
    var talathiCert = "";
    if (istalathiCert)
    {
        talathiCert = "Yes";

    }
    else {
        talathiCert = "No";
    }

    var decidedAmt = document.getElementById("decidedAmt").value;
    var amtPaid = document.getElementById("amtPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var Remarknote = document.getElementById("Remarknote").value;
    var submitDate = document.getElementById("submitDate").value;

	if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    
    else if(address==""){
          alert("Please Enter address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(amtPaid==""){
          alert("Please Enter Amount Paid")
        document.getElementById("amtPaid").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount")
        document.getElementById("balAmt").focus();
        
    }
    
    else{




    getRationcard(docType,UpadationChange, custName, Dob,address, contactNo, natureBusiness, ylyAmt, 
    gasName, gasGiverName, memFirstName1, memFirstName2, secMemName1, secMemName2, ThirdMemName1,
    ThirdMemName1, ThirdMemName2, fourthMemName1, fourthMemName2, fifthMemName1, fifthMemName2, Pancard,
    votingId, passportValid, DrivingLicn, adharCard, lightBill, adharCard1, voteId, socResiLet, govtBankPass,
    rentedNotary, ownrLightBillNoc, form16lstThreeyrs, ItFile, gasBook, talathiCert,decidedAmt,
    amtPaid,balAmt,Remarknote,submitDate);


    }
}


function get2w() {
    var docType = document.getElementById("docType").value;

    var custName = document.getElementById("custName").value;

    var middleName = document.getElementById("middleName").value;

    var lastName = document.getElementById("lastName").value;

    var address = document.getElementById("address").value;

    var contactNo = document.getElementById("contactNo").value;

    var landmarkaddnear = document.getElementById("landmarkaddnear").value;

    var vehicleno = document.getElementById("vehicleno").value;

    var whichbikedetail = document.getElementById("whichbikedetail").value;

    var modelyear = document.getElementById("modelyear").value;

    var lstyrpolicydetail = document.getElementById("lstyrpolicydetail").value;

    var bikecolour = document.getElementById("bikecolour").value;

    var loanhyponame = document.getElementById("loanhyponame").value;

    var decidedAmt = document.getElementById("decidedAmt").value;

    var amtPaid = document.getElementById("amtPaid").value;

   var balAmt = document.getElementById("balAmt").value;
   
    var Remarknote = document.getElementById("Remarknote").value;
    
    var submitDate = document.getElementById("submitDate").value;

  
    var isphotobike = document.getElementById("photobike").checked;
    var photobike = "";
    if (isphotobike)
    {
        photobike = "Yes";

    }
    else {
        photobike = "No";

    }

    var isoldrcbookxrx = document.getElementById("oldrcbookxrx").checked;
    var oldrcbookxrx = "";
    if (isoldrcbookxrx)
    {
        oldrcbookxrx = "Yes";

    }
    else {
        oldrcbookxrx = "No";

    }

    var isoldinsrncecpyxrx = document.getElementById("oldinsrncecpyxrx").checked;
    var oldinsrncecpyxrx = "";
    if (isoldinsrncecpyxrx)
    {
        oldinsrncecpyxrx = "Yes";

    }
    else {
        oldinsrncecpyxrx = "No";


    }
    var isletterncb = document.getElementById("letterncb").checked;
    var letterncb = "";
    if (isletterncb)
    {
        letterncb = "Yes";

    }
    else {
        letterncb = "No";

    }
     if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    
    else if(address==""){
          alert("Please Enter address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(amtPaid==""){
          alert("Please Enter Amount Paid")
        document.getElementById("amtPaid").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount")
        document.getElementById("balAmt").focus();
    
    }
    
    else{
    
    

    add2w(docType,custName, middleName, lastName, address,contactNo,landmarkaddnear, vehicleno, whichbikedetail, modelyear,
            lstyrpolicydetail, bikecolour, loanhyponame, decidedAmt, amtPaid,balAmt,Remarknote,submitDate,photobike,oldrcbookxrx,oldinsrncecpyxrx,letterncb);
    }
}


function addAdharCard()
{
     var docType = document.getElementById("docType").value;
    var oldAadharNo = document.getElementById("oldAadharNo").value;
    var custName = document.getElementById("custName").value;
    var contactNo = document.getElementById("contactNo").value;
    var fatherName = document.getElementById("fatherName").value
    var surName = document.getElementById("surName").value;
    var husbandName = document.getElementById("husbandName").value;
    var dob = document.getElementById("dob").value;
    var address = document.getElementById("address").value;
    var changesNote = document.getElementById("changesNote").value;
    var changesNote1 = document.getElementById("changesNote1").value;
    var decidedAmt = document.getElementById("decidedAmt").value;
    var amtPaid = document.getElementById("amtPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var Remarknote = document.getElementById("Remarknote").value;
    var submitDate = document.getElementById("submitDate").value;
    var isbirthCert = document.getElementById("birthCert").checked;
    var birthCert = "";
    if (isbirthCert)
    {
        birthCert = "Yes";
    }
    else
    {
        birthCert = "No";
    }
    var isboardcert10 = document.getElementById("boardcert10").checked;
    var boardcert10 = "";
    if (isboardcert10)
    {
        boardcert10 = "Yes";
    }
    else
    {
        boardcert10 = "No";
    }
    var isboardcert12 = document.getElementById("boardcert12").checked;
    var boardcert12 = "";
    if (isboardcert12)
    {
        boardcert12 = "Yes";
    }
    else
    {
        boardcert12 = "No";
    }
    var isgraduateCopy = document.getElementById("graduateCopy").checked;
    var graduateCopy = "";
    if (isgraduateCopy)
    {
        graduateCopy = "Yes";
    }
    else
    {
        graduateCopy = "No";
    }
    var ishigheredu = document.getElementById("higheredu").checked;
    var higheredu = "";
    if (ishigheredu)
    {
        higheredu = "Yes";
    }
    else
    {
        higheredu = "No";
    }
    var isschoolcert = document.getElementById("schoolcert").checked;
    var schoolcert = "";
    if (isschoolcert)
    {
        schoolcert = "Yes";
    }
    else
    {
        schoolcert = "No";
    }
    var ispancard = document.getElementById("pancard").checked;
    var pancard = "";
    if (ispancard)
    {
        pancard = "Yes";
    }
    else
    {
        pancard = "No";
    }
    var ispassport = document.getElementById("passport").checked;
    var passport = "";
    if (ispassport)
    {
        passport = "Yes";
    }
    else
    {
        passport = "No";
    }
    var isdrivingLicence = document.getElementById("drivingLicence").checked;
    var drivingLicence = "";
    if (isdrivingLicence)
    {
        drivingLicence = "Yes";
    }
    else
    {
        drivingLicence = "No";
    }
    var isvoteId = document.getElementById("voteId").checked;
    var voteId = "";
    if (isvoteId)
    {
        voteId = "Yes";
    }
    else
    {
        voteId = "No";
    }
    var isRestLetter = document.getElementById("RestLetter").checked;
    var RestLetter = "";
    if (isRestLetter)
    {
        RestLetter = "Yes";
    }
    else
    {
        RestLetter = "No";
    }
    var isgovtbankpass = document.getElementById("govtbankpass").checked;
    var govtbankpass = "";
    if (isgovtbankpass)
    {
        govtbankpass = "Yes";
    }
    else
    {
        govtbankpass = "No";
    }
    var islicpolicy = document.getElementById("licpolicy").checked;
    var licpolicy = "";
    if (islicpolicy)
    {
        licpolicy = "Yes";
    }
    else
    {
        licpolicy = "No";
    }
    var isrenetedAgree = document.getElementById("renetedAgree").checked;
    var renetedAgree = "";
    if (isrenetedAgree)
    {
        renetedAgree = "Yes";
    }
    else
    {
        renetedAgree = "No";
    }
    var isrationcard = document.getElementById("rationcard").checked;
    var rationcard = "";
    if (isrationcard)
    {
        rationcard = "Yes";
    }
    else
    {
        rationcard = "No";
    }
    var isVotingid = document.getElementById("Votingid").checked;
    var Votingid = "";
    if (isVotingid)
    {
        Votingid = "Yes";
    }
    else
    {
        Votingid = "No";
    }
    var isPassportadd = document.getElementById("Passportadd").checked;
    var Passportadd = "";
    if (isPassportadd)
    {
        Passportadd = "Yes";
    }
    else
    {
        Passportadd = "No";
    }
    var isDrivinglic = document.getElementById("Drivinglic").checked;
    var Drivinglic = "";
    if (isDrivinglic)
    {
        Drivinglic = "Yes";
    }
    else
    {
        Drivinglic = "No";
    }
    var isPassbookBank = document.getElementById("PassbookBank").checked;
    var PassbookBank = "";
    if (isPassbookBank)
    {
        PassbookBank = "Yes";
    }
    else
    {
        PassbookBank = "No";
    }
    var islightbill = document.getElementById("lightbill").checked;
    var lightbill = "";
    if (islightbill)
    {
        lightbill = "Yes";
    }
    else
    {
        lightbill = "No";
    }
    var isbankStat = document.getElementById("bankStat").checked;
    var bankStat = "";
    if (isbankStat)
    {
        bankStat = "Yes";
    }
    else
    {
        bankStat = "No";
    }
    var isrentAgreement = document.getElementById("rentAgreement").checked;
    var rentAgreement = "";
    if (isrentAgreement)
    {
        rentAgreement = "Yes";
    }
    else
    {
        rentAgreement = "No";
    }


   if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    
    else if(address==""){
          alert("Please Enter address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(amtPaid==""){
          alert("Please Enter Amount Paid")
        document.getElementById("amtPaid").focus();
        
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount")
        document.getElementById("balAmt").focus();
        
    }
    
    else{



    addAdharCardDetails(docType,oldAadharNo, custName, contactNo, fatherName, husbandName, dob, address, changesNote, changesNote1, decidedAmt, amtPaid,balAmt,Remarknote,submitDate,
birthCert, boardcert10, boardcert12, graduateCopy, higheredu, schoolcert, pancard, passport, drivingLicence, voteId, RestLetter, govtbankpass, licpolicy, renetedAgree,
            rationcard, Votingid, Passportadd, Drivinglic, PassbookBank, lightbill, bankStat, rentAgreement);
}
}


function addlicdetails() {
var docType = document.getElementById("docType").value;
var submitDate = document.getElementById("submitDate").value;

    var custName = document.getElementById("custName").value;
    var contactNo = document.getElementById("contactNo").value;
    var fn = document.getElementById("fn").value;
    var imhn = document.getElementById("imhn").value;
    var dob = document.getElementById("dob").value;
    var address = document.getElementById("address").value;
    var st = document.getElementById("st").value;
    var pt = document.getElementById("pt").value;
    var vm = document.getElementById("vm").value;
    var none = document.getElementById("none").value;
    var ht = document.getElementById("ht").value;
    var wt = document.getElementById("wt").value;
    var idm = document.getElementById("idm").value;
    var jod = document.getElementById("jod").value;
    var ban = document.getElementById("ban").value;
    var bran = document.getElementById("bran").value;
    var ifsc = document.getElementById("ifsc").value;
    var bankacc = document.getElementById("bankacc").value;
    var opno = document.getElementById("opno").value;
    var opno2 = document.getElementById("opno2").value;
    var ocmpnm = document.getElementById("ocmpnm").value;
    var qyfmm = document.getElementById("qyfmm").value;
    var frae = document.getElementById("frae").value;
    var mrae = document.getElementById("mrae").value;
    var brae = document.getElementById("brae").value;
    var srae = document.getElementById("srae").value;
    var hwae = document.getElementById("hwae").value;
    var cdae = document.getElementById("cdae").value;
    var decidedAmt = document.getElementById("decidedAmt").value;
    var amtPaid = document.getElementById("amtPaid").value;
    var balAmt = document.getElementById("balAmt").value;
    var rene = document.getElementById("rene").value;
    
    var isbrcr = document.getElementById("brcr").checked;
    var brcr = "";
    if (isbrcr)
    {
        brcr = "yes";

    } else
    {
        brcr = "no";

    }
    var issclvc = document.getElementById("sclvc").checked;
    var sclvc = "";
    if (issclvc)
    {
        sclvc = "yes";

    } else
    {
        sclvc = "no";

    }
    var isthbc = document.getElementById("thbc").checked;
    var thbc = "";
    if (isthbc)
    {
        thbc = "yes";

    } else
    {
        thbc = "no";

    }
    var isthbd = document.getElementById("thbd").checked;
    var thbd = "";
    if (isthbd)
    {
        thbd = "yes";

    } else
    {
        thbd = "no";

    }
    var isgc = document.getElementById("gc").checked;
    var gc = "";
    if (isgc)
    {
        gc = "yes";

    } else
    {
        gc = "no";

    }
    var isahecy = document.getElementById("ahecy").checked;
    var ahecy = "";
    if (isahecy)
    {
        ahecy = "yes";

    } else
    {
        ahecy = "no";

    }
    var isfrif = document.getElementById("frif").checked;
    var frif = "";
    if (isfrif)
    {
        frif = "yes";

    } else
    {
        frif = "no";

    }
    var issysp = document.getElementById("sysp").checked;
    var sysp = "";
    if (issysp)
    {
        sysp = "yes";

    } else
    {
        sysp = "no";

    }
    var isadcd = document.getElementById("adcd").checked;
    var adcd = "";
    if (isadcd)
    {
        adcd = "yes";

    } else
    {
        adcd = "no";

    }
    var ispacr = document.getElementById("pacr").checked;
    var pacr = "";
    if (ispacr)
    {
        pacr = "yes";

    } else
    {
        pacr = "no";

    }
    var isdrliva = document.getElementById("drliva").checked;
    var drliva = "";
    if (isdrliva)
    {
        drliva = "yes";

    } else
    {
        drliva = "no";

    }
    var isvgid = document.getElementById("vgid").checked;
    var vgid = "";
    if (isvgid)
    {
        vgid = "yes";

    } else
    {
        vgid = "no";

    }
    var ispssprt = document.getElementById("pssprt").checked;
    var pssprt = "";
    if (ispssprt)
    {
        pssprt = "yes";

    } else
    {
        pssprt = "no";

    }
    var iscdid = document.getElementById("cdid").checked;
    var cdid = "";
    if (iscdid)
    {
        cdid = "yes";

    } else
    {
        cdid = "no";

    }
    var isrncd = document.getElementById("rncd").checked;
    var rncd = "";
    if (isrncd)
    {
        rncd = "yes";

    } else
    {
        rncd = "no";

    }
    var isltbl = document.getElementById("ltbl").checked;
    var ltbl = "";
    if (isltbl)
    {
        ltbl = "yes";

    } else
    {
        ltbl = "no";

    }
    var isarca = document.getElementById("arca").checked;
    var arca = "";
    if (isarca)
    {
        arca = "yes";

    } else
    {
        arca = "no";

    }
    var isvoigid = document.getElementById("voigid").checked;
    var voigid = "";
    if (isvoigid)
    {
        voigid = "yes";

    } else
    {
        voigid = "no";

    }
    var ispassp = document.getElementById("passp").checked;
    var passp = "";
    if (ispassp)
    {
        passp = "yes";

    } else
    {
        passp = "no";

    }
    var isbpass = document.getElementById("bpass").checked;
    var bpass = "";
    if (isbpass)
    {
        bpass = "yes";

    } else
    {
        bpass = "no";

    }
    var isirano = document.getElementById("irano").checked;
    var irano = "";
    if (isirano)
    {
        irano = "yes";

    } else
    {
        irano = "no";

    }
    
     if(custName==""){
        alert("Please Enter Customer Name")
        document.getElementById("custName").focus();
    }
    else if(address==""){
          alert("Please Enter Permanent Address")
        document.getElementById("address").focus();
    }
    else if(contactNo==""){
          alert("Please Enter Contact No")
        document.getElementById("contactNo").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount")
        document.getElementById("decidedAmt").focus();
    }else if(balAmt==""){
          alert("Please Enter Balance Amount")
        document.getElementById("balAmt").focus();
    
    }else if(amtPaid==""){
          alert("Please Enter Balance amount")
        document.getElementById("amtPaid").focus();
        
    }
    else if(submitDate==""){
          alert("Please Enter Submit Date")
        document.getElementById("submitDate").focus();
        
    }
    else{



    addlic(custName,docType,submitDate,contactNo, fn, imhn, dob, address, st, pt, vm, none,ht, wt, idm,
            jod, ban, bran, ifsc,bankacc, opno, opno2, ocmpnm, qyfmm, frae,thbd,
          mrae, brae, srae, hwae, cdae, decidedAmt, amtPaid, balAmt, rene,brcr,
            sclvc, thbc, gc, ahecy, frif, sysp, adcd, pacr, drliva, vgid, pssprt,
            cdid, rncd, ltbl, arca, voigid, passp, bpass, irano);
            }
            }

function otherworkdetails()
  {
      var subDate =document.getElementById("subDate").value;
      var FormType =document.getElementById("FormType").value;
      var WorkName =document.getElementById("WorkName").value;
      var custName =document.getElementById("custName").value;
      var contactNo =document.getElementById("contactNo").value;
      
      var dob =document.getElementById("dob").value;
      var ADDFULL =document.getElementById("ADDFULL").value;
      var NOTESOFREMARK =document.getElementById("NOTESOFREMARK").value;
      var decidedAmt =document.getElementById("decidedAmt").value;
      var advAmt =document.getElementById("advAmt").value;
      var balAmt =document.getElementById("balAmt").value;
      var REFRENCENAME =document.getElementById("REFRENCENAME").value;
      var isPANCARD =document.getElementById("PANCARD").checked;
    var PANCARD = "";
    if (isPANCARD)
    {
        PANCARD = "Yes";
    }
    else {
        PANCARD = "No";
    }
      var isPASSPORTVALID =document.getElementById("PASSPORTVALID").checked;
    var PASSPORTVALID = "";
    if (isPASSPORTVALID)
    {
        PASSPORTVALID = "Yes";
    }
    else {
        PASSPORTVALID = "No";
    }
      
    var isDRIVLICNVALID =document.getElementById("DRIVLICNVALID").checked;
    var DRIVLICNVALID = "";
    if (isDRIVLICNVALID)
    {
        DRIVLICNVALID = "Yes";
    }
    else {
        DRIVLICNVALID = "No";
    }  
    
    var isVOTINGID =document.getElementById("VOTINGID").checked;
    var VOTINGID = "";
    if (isVOTINGID)
    {
        VOTINGID = "Yes";
    }
    else {
        VOTINGID = "No";
    }
      var isAADHARCARD =document.getElementById("AADHARCARD").checked;
    var AADHARCARD = "";
    if (isAADHARCARD)
    {
        AADHARCARD = "Yes";
    }
    else {
        AADHARCARD = "No";
    }
      var isRATIONCARD =document.getElementById("RATIONCARD").checked;
    var RATIONCARD = "";
    if (isRATIONCARD)
    {
        RATIONCARD = "Yes";
    }
    else {
        RATIONCARD = "No";
    }
      var isLIGHTBILL =document.getElementById("LIGHTBILL").checked;
    var LIGHTBILL = "";
    if (isLIGHTBILL)
    {
        LIGHTBILL = "Yes";
    }
    else {
        LIGHTBILL = "No";
    }
      var isAADHARCARD1 =document.getElementById("AADHARCARD1").checked;
    var AADHARCARD1 = "";
    if (isAADHARCARD1)
    {
        AADHARCARD1 = "Yes";
    }
    else {
        AADHARCARD1 = "No";
    }
      
      var isSOCIETYRESILETTER =document.getElementById("SOCIETYRESILETTER").checked;
    var SOCIETYRESILETTER = "";
    if (isSOCIETYRESILETTER)
    {
        SOCIETYRESILETTER = "Yes";
    }
    else {
        SOCIETYRESILETTER = "No";
    }
      var isGOVTBANKPASSBOOK =document.getElementById("GOVTBANKPASSBOOK").checked;
    var GOVTBANKPASSBOOK = "";
    if (isGOVTBANKPASSBOOK)
    {
        GOVTBANKPASSBOOK = "Yes";
    }
    else {
        GOVTBANKPASSBOOK = "No";
    }
       var isLICPOLICY =document.getElementById("LICPOLICY").checked;
    var LICPOLICY = "";
    if (isLICPOLICY)
    {
        LICPOLICY = "Yes";
    }
    else {
        LICPOLICY = "No";
    }
      var isRENETDAGREEMENT =document.getElementById("RENETDAGREEMENT").checked;
    var RENETDAGREEMENT = "";
    if (isRENETDAGREEMENT)
    {
        RENETDAGREEMENT = "Yes";
    }
    else {
        RENETDAGREEMENT = "No";
    }
          var OTHERWORK =document.getElementById("OTHERWORK").value;

      if(custName==""){
        alert("Please Enter Customer Name");
        document.getElementById("custName").focus();
    }
      else if(contactNo==""){
          alert("Please Enter Contact No");
        document.getElementById("contactNo").focus();
    }
    
    else if(ADDFULL==""){
          alert("Please Enter Full Address");
        document.getElementById("ADDFULL").focus();
    }
    else if(decidedAmt==""){
          alert("Please Enter Decided Amount");
        document.getElementById("decidedAmt").focus();
    }else if(advAmt==""){
          alert("Please Enter Amount Paid");
        document.getElementById("advAmt").focus();
    
    }else if(balAmt==""){
          alert("Please Enter Balance amount");
        document.getElementById("balAmt").focus();
        
    }
    else{
        Viewotherwork(subDate,FormType,WorkName,custName,contactNo,dob,ADDFULL,NOTESOFREMARK,decidedAmt,advAmt,balAmt,REFRENCENAME,isPANCARD,
        isPASSPORTVALID,isDRIVLICNVALID,isVOTINGID,isAADHARCARD,isRATIONCARD,isLIGHTBILL,isAADHARCARD1,isSOCIETYRESILETTER,isGOVTBANKPASSBOOK,isLICPOLICY,isRENETDAGREEMENT,OTHERWORK);

}
  }

