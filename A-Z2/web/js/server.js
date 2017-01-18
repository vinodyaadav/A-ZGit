/* 
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 * 
 */


function createHTTPObj() {
    var http = null;
    if (window.XMLHttpRequest)
        http = new XMLHttpRequest();
    else if (window.ActiveXObject)
        http = new ActiveXObject("Microsoft.XMLHTTP");
    return http;
}

function generatepdf(custName,contactNo,subDate,formType)
{

   
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            
            alert("PDF report generated successfully")
                document.getElementById("showLink").style.display = 'block';
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('custName=' + encodeURIComponent(custName)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&subDate=' + encodeURIComponent(subDate)
            + '&formType=' + encodeURIComponent(formType)
            + '&actionFrom=' + encodeURIComponent('generatereportdetails'));
}








function getLoanDetails(docType, Loan, amt, pann, contactNo, custName, Dob1, add3, buss, sal2, com, post1, exp, qual, rem, info, decidedAmt, amtPaid, balAmt, refName, submitDate, card, voti, valid, lice, card2, card1, votin, rat, bill, resi, govt, lic, not, form1, file, bank, invest, pay, exist, bussi, curr, proper) {
  
    /* alert(customerName);
     alert(Dob1);
     alert(add3);
     alert(buss);
     alert(sal2);
     alert(com);
     alert(post1);
     alert(exp);
     alert(qual);
     alert(rem);

    /* alert(card);
     alert(voti);
     alert(valid);
     alert(lice);
     alert(card2);
     alert(card1);
     alert(votin);
     alert(rat);
     alert(bill);
     alert(resi);
     alert(govt);
     alert(lic);
     alert(not);
     alert(form1);
     alert(file);
     alert(bank);
     alert(invest);
     alert(pay);
     alert(exist);
     alert(bussi);
     alert(curr);
     alert(proper);*/

    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&docType=' + encodeURIComponent(docType)
            + '&Loan=' + encodeURIComponent(Loan)
            + '&amt=' + encodeURIComponent(amt)
            + '&pann=' + encodeURIComponent(pann)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&custName=' + encodeURIComponent(custName)
            + '&Dob1=' + encodeURIComponent(Dob1)
            + '&add3=' + encodeURIComponent(add3)
            + '&buss=' + encodeURIComponent(buss)
            + '&sal2=' + encodeURIComponent(sal2)
            + '&com=' + encodeURIComponent(com)
            + '&post1=' + encodeURIComponent(post1)
            + '&exp=' + encodeURIComponent(exp)
            + '&qual=' + encodeURIComponent(qual)
            + '&rem=' + encodeURIComponent(rem)
            + '&info=' + encodeURIComponent(info)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&refName=' + encodeURIComponent(refName)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&card=' + encodeURIComponent(card)
            + '&voti=' + encodeURIComponent(voti)
            + '&valid=' + encodeURIComponent(valid)
            + '&lice=' + encodeURIComponent(lice)
            + '&card2=' + encodeURIComponent(card2)
            + '&card1=' + encodeURIComponent(card1)
            + '&votin=' + encodeURIComponent(votin)
            + '&rat=' + encodeURIComponent(rat)
            + '&bill=' + encodeURIComponent(bill)
            + '&resi=' + encodeURIComponent(resi)
            + '&govt=' + encodeURIComponent(govt)
            + '&lic=' + encodeURIComponent(lic)
            + '&not=' + encodeURIComponent(not)
            + '&form1=' + encodeURIComponent(form1)
            + '&file=' + encodeURIComponent(file)
            + '&bank=' + encodeURIComponent(bank)
            + '&invest=' + encodeURIComponent(invest)
            + '&pay=' + encodeURIComponent(pay)
            + '&exist=' + encodeURIComponent(exist)
            + '&bussi=' + encodeURIComponent(bussi)
            + '&curr=' + encodeURIComponent(curr)
            + '&proper=' + encodeURIComponent(proper)
            + '&actionFrom=' + encodeURIComponent('getLoan'));
}


function addDrivingLicenceDetails(documentType, customerName, contactNo, son, presentaddress, permanentaddress, dateofbirth, education, bloodgroup, identificationmark, identificationmarks, decideAmnt, amountPaid, balAmnt, refName, submitDate, radioa, radiob, radioc, radiod, radioe, radiou, radiop) {
//    alert(documentType);
//    alert(customerName);
//    alert(contactNo);
//    alert(son);
//    alert(presentaddress);
//    alert(permanentaddress);
//    alert(dateofbirth);
//    alert(education);
//    alert(bloodgroup);
//    alert(identificationmark);
//    alert(identificationmarks);
//    alert(decideAmnt);
//    alert(amountPaid);
//    alert(balAmnt);
//    alert(refName);
//    alert(submitDate);
//    alert(radioa);
//    alert(radiob);
//    alert(radioc);
//    alert(radiod);
//    alert(radioe);
//    alert(radiou);
//    alert(radiop);

    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&documentType=' + encodeURIComponent(documentType)
            + '&customerName=' + encodeURIComponent(customerName)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&son=' + encodeURIComponent(son)
            + '&presentaddress=' + encodeURIComponent(presentaddress)
            + '&permanentaddress=' + encodeURIComponent(permanentaddress)
            + '&dateofbirth=' + encodeURIComponent(dateofbirth)
            + '&education=' + encodeURIComponent(education)
            + '&bloodgroup=' + encodeURIComponent(bloodgroup)
            + '&identificationmark=' + encodeURIComponent(identificationmark)
            + '&identificationmarks=' + encodeURIComponent(identificationmarks)
            + '&decideAmnt=' + encodeURIComponent(decideAmnt)
            + '&amountPaid=' + encodeURIComponent(amountPaid)
            + '&balAmnt=' + encodeURIComponent(balAmnt)
            + '&refName=' + encodeURIComponent(refName)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&radioa=' + encodeURIComponent(radioa)
            + '&radiob=' + encodeURIComponent(radiob)
            + '&radioc=' + encodeURIComponent(radioc)
            + '&radiod=' + encodeURIComponent(radiod)
            + '&radioe=' + encodeURIComponent(radioe)
            + '&radiou=' + encodeURIComponent(radiou)
            + '&radiop=' + encodeURIComponent(radiop)
            + '&actionFrom=' + encodeURIComponent('addDrivingLicence'));
}


function addmediclaimDetails(documentType,oldPolicyNo, companyName, renewDate, customerName, middleName, lastName, husbandName, dob, address, contactNo, memberFirstName, age, secondMemberName, secondMemberAge, thirdMemberName, thirdMemberAge, fourthMemberName, fourthMemberAge, fifthMemberName, fifthMemberAge, adharCard, votingCard, passport, drivingLicence, pancard, adharCardadd, votingCardadd, passportadd, drivingLicenceadd, bankpassbook, corporateLetter, rentAgreement, addProofLightBill, decideAmt, amountPaid, balAmt, refName, submitDate) {


    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

           if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

    http.send('documentType=' + encodeURIComponent(documentType)
            + '&oldPolicyNo=' + encodeURIComponent(oldPolicyNo)
            + '&renewDate=' + encodeURIComponent(renewDate)
            + '&companyName=' + encodeURIComponent(companyName)
            + '&customerName=' + encodeURIComponent(customerName)
            + '&middleName=' + encodeURIComponent(middleName)
            + '&lastName=' + encodeURIComponent(lastName)
            + '&husbandName=' + encodeURIComponent(husbandName)
            + '&dob=' + encodeURIComponent(dob)
            + '&address=' + encodeURIComponent(address)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&memberFirstName=' + encodeURIComponent(memberFirstName)
            + '&age=' + encodeURIComponent(age)
            + '&secondMemberName=' + encodeURIComponent(secondMemberName)
            + '&secondMemberAge=' + encodeURIComponent(secondMemberAge)
            + '&thirdMemberName=' + encodeURIComponent(thirdMemberName)
            + '&thirdMemberAge=' + encodeURIComponent(thirdMemberAge)
            + '&fourthMemberName=' + encodeURIComponent(fourthMemberName)
            + '&fourthMemberAge=' + encodeURIComponent(fourthMemberAge)
            + '&fifthMemberName=' + encodeURIComponent(fifthMemberName)
            + '&fifthMemberAge=' + encodeURIComponent(fifthMemberAge)
            + '&adharCard=' + encodeURIComponent(adharCard)
            + '&votingCard=' + encodeURIComponent(votingCard)
            + '&passport=' + encodeURIComponent(passport)
            + '&drivingLicence=' + encodeURIComponent(drivingLicence)
            + '&pancard=' + encodeURIComponent(pancard)
            + '&adharCardadd=' + encodeURIComponent(adharCardadd)
            + '&votingCardadd=' + encodeURIComponent(votingCardadd)
            + '&passportadd=' + encodeURIComponent(passportadd)
            + '&drivingLicenceadd=' + encodeURIComponent(drivingLicenceadd)
            + '&bankpassbook=' + encodeURIComponent(bankpassbook)
            + '&corporateLetter=' + encodeURIComponent(corporateLetter)
            + '&rentAgreement=' + encodeURIComponent(rentAgreement)
            + '&addProofLightBill=' + encodeURIComponent(addProofLightBill)
            + '&decideAmt=' + encodeURIComponent(decideAmt)
            + '&amountPaid=' + encodeURIComponent(amountPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&refName=' + encodeURIComponent(refName)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&actionFrom=' + encodeURIComponent('addmediclaim'));
}




function addSalaryIt(docType,itType,panNo,custName,surName,dateOfBirth,contactNo,address,itMakeValue,textPaidArea,licPremPaid, medicalPrem,hraInterest,natureOfBuisness,salaryRsMly,companyName,post,bnkAccNo,branch,ifscCode,micrCode,additionalInfo1, additionalInfo2,decidedAmt,amtPaid,balAmt,refAmt,submitDate,panCard,aadharCard,votingCard,passportValid,drivingLicn,rationCard,lightBill,salaryItPaper,canclCheq,bankDetails,investmentCopy,loanEmi,gumasta,currentAcc,investment,Loan)
{
   /* alert(docType);
    alert(itType);
    alert(panNo);
    alert(custName);
    alert(surName);
    alert(dateOfBirth);
    alert(address);
    alert(itMakeValue);
    alert(textPaidArea);
    alert(licPremPaid);
    alert(medicalPrem);
    alert(hraInterest);
    alert(natureOfBuisness);
    alert(salaryRsMly);
    alert(companyName);
    alert(post);
    alert(bnkAccNo);
    alert(ifscCode);
    alert(micrCode);
    alert(additionalInfo1);
    alert(additionalInfo2);
    alert(decidedAmt);
    alert(amtPaid);
    alert(refAmt);
    alert(submitDate);
    alert("24"+panCard);
    alert("25"+aadharCard);
    alert("26"+votingCard);
    alert("27"+passportValid);
    alert("28"+drivingLicn);
    alert("29"+rationCard);
    alert("30"+lightBill);
    alert("31"+salaryItPaper);
    alert("32"+canclCheq);
    alert("33"+bankDetails);
    alert("34"+investmentCopy);
    alert("35"+loanEmi);
    alert("36"+gumasta);
    alert("37"+currentAcc);
    alert("39"+investment);
    alert("40"+Loan); 
    alert("Contact"+contactNo);
    alert("Branch"+branch);
     alert("34"+investmentCopy);*/
    
    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
                if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
            document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&itType=' + encodeURIComponent(itType)
            + '&docType=' + encodeURIComponent(docType)
            + '&panNo=' + encodeURIComponent(panNo)
            + '&custName=' + encodeURIComponent(custName)
            + '&surName=' + encodeURIComponent(surName)
            + '&dateOfBirth=' + encodeURIComponent(dateOfBirth)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&address=' + encodeURIComponent(address)
            + '&itMakeValue=' + encodeURIComponent(itMakeValue)
            + '&textPaidArea=' + encodeURIComponent(textPaidArea)
            + '&licPremPaid=' + encodeURIComponent(licPremPaid)
            + '&medicalPrem=' + encodeURIComponent(medicalPrem)
            + '&hraInterest=' + encodeURIComponent(hraInterest)
            + '&natureOfBuisness=' + encodeURIComponent(natureOfBuisness)
            + '&salaryRsMly=' + encodeURIComponent(salaryRsMly)
            + '&companyName=' + encodeURIComponent(companyName)
            + '&post=' + encodeURIComponent(post)
            + '&bnkAccNo=' + encodeURIComponent(bnkAccNo)
            + '&branch=' + encodeURIComponent(branch)
            + '&ifscCode=' + encodeURIComponent(ifscCode)
            + '&micrCode=' + encodeURIComponent(micrCode)
            + '&additionalInfo1=' + encodeURIComponent(additionalInfo1)
            + '&additionalInfo2=' + encodeURIComponent(additionalInfo2)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&refAmt=' + encodeURIComponent(refAmt)
            + '&submitDate=' + encodeURIComponent(submitDate)
    
            + '&panCard=' + encodeURIComponent(panCard)
            + '&aadharCard=' + encodeURIComponent(aadharCard)
            + '&votingCard=' + encodeURIComponent(votingCard)
            + '&passportValid=' + encodeURIComponent(passportValid)
            + '&drivingLicn=' + encodeURIComponent(drivingLicn)
            + '&rationCard=' + encodeURIComponent(rationCard)
            + '&lightBill=' + encodeURIComponent(lightBill)
            + '&salaryItPaper=' + encodeURIComponent(salaryItPaper)
            + '&canclCheq=' + encodeURIComponent(canclCheq)
            + '&bankDetails=' + encodeURIComponent(bankDetails)
            + '&loanEmi=' + encodeURIComponent(loanEmi)
            + '&investmentCopy=' + encodeURIComponent(investmentCopy)
            + '&gumasta=' + encodeURIComponent(gumasta)
            + '&currentAcc=' + encodeURIComponent(currentAcc)
            + '&investment=' + encodeURIComponent(investment)
            + '&Loan=' + encodeURIComponent(Loan)
            + '&actionFrom=' + encodeURIComponent('addSalaryIt'));
}


function  addFoodLicenceDetails(documentType, food, renewdate, customerName, contactNo, addfull, nature, empquantity,
        prop, partner, water, product, turnover, ifr, changes, decideAmnt, amountPaid,
        balAmnt, refName, submitDate, adhr, vot, pass, dri, pan, light, rent, let, map, gum,
        noc, shop, AB, chargesa, chargesb, chargesc) {
  //  alert(food);
    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }
    };

    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

    http.send('&documentType=' + encodeURIComponent(documentType)
            + '&food=' + encodeURIComponent(food)
            + '&renewdate=' + encodeURIComponent(renewdate)
            + '&customerName=' + encodeURIComponent(customerName)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&addfull=' + encodeURIComponent(addfull)
            + '&nature=' + encodeURIComponent(nature)
            + '&empquantity=' + encodeURIComponent(empquantity)
            + '&prop=' + encodeURIComponent(prop)
            + '&partner=' + encodeURIComponent(partner)
            + '&water=' + encodeURIComponent(water)
            + '&product=' + encodeURIComponent(product)
            + '&turnover=' + encodeURIComponent(turnover)
            + '&ifr=' + encodeURIComponent(ifr)
            + '&changes=' + encodeURIComponent(changes)
            + '&decideAmnt=' + encodeURIComponent(decideAmnt)
            + '&amountPaid=' + encodeURIComponent(amountPaid)
            + '&balAmnt=' + encodeURIComponent(balAmnt)
            + '&refName=' + encodeURIComponent(refName)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&adhr=' + encodeURIComponent(adhr)
            + '&vot=' + encodeURIComponent(vot)
            + '&pass=' + encodeURIComponent(pass)
            + '&dri=' + encodeURIComponent(dri)
            + '&pan=' + encodeURIComponent(pan)
            + '&light=' + encodeURIComponent(light)
            + '&rent=' + encodeURIComponent(rent)
            + '&let=' + encodeURIComponent(let)
            + '&map=' + encodeURIComponent(map)
            + '&gum=' + encodeURIComponent(gum)
            + '&noc=' + encodeURIComponent(noc)
            + '&shop=' + encodeURIComponent(shop)
            + '&AB=' + encodeURIComponent(AB)
            + '&chargesa=' + encodeURIComponent(chargesa)
            + '&chargesb=' + encodeURIComponent(chargesb)
            + '&chargesc=' + encodeURIComponent(chargesc)
            + '&actionFrom=' + encodeURIComponent('addFoodLicence'));

}


function addGumasta(licenceNo, renewDate, companyName, address, natureOfBuisness, employeeQty, propertiorName, renew1, renew2, renew3, decidedAmtRs, decidedAmtRs1, creditAmtRs, creditAmtRs1, balanceAmtRs, balanceAmtRs1, referanceName, referanceName1, lightBill, rentAgreement, pancard, drivingLicence, passport, votingCard, adharCard, decidedamt, decidedamt1, creditamt, creditamt1, balanceamt, balanceamt1, reference, reference1)
{
    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('licenceNo=' + encodeURIComponent(licenceNo)
            + '&renewDate=' + encodeURIComponent(renewDate)
            + '&companyName=' + encodeURIComponent(companyName)
            + '&address=' + encodeURIComponent(address)
            + '&natureOfBuisness=' + encodeURIComponent(natureOfBuisness)
            + '&employeeQty=' + encodeURIComponent(employeeQty)
            + '&propertiorName=' + encodeURIComponent(propertiorName)
            + '&renew1=' + encodeURIComponent(renew1)
            + '&renew2=' + encodeURIComponent(renew2)
            + '&renew3=' + encodeURIComponent(renew3)
            + '&decidedAmtRs=' + encodeURIComponent(decidedAmtRs)
            + '&decidedAmtRs1=' + encodeURIComponent(decidedAmtRs1)
            + '&creditAmtRs=' + encodeURIComponent(creditAmtRs)
            + '&creditAmtRs1=' + encodeURIComponent(creditAmtRs1)
            + '&balanceAmtRs=' + encodeURIComponent(balanceAmtRs)
            + '&balanceAmtRs1=' + encodeURIComponent(balanceAmtRs1)
            + '&referanceName=' + encodeURIComponent(referanceName)
            + '&referanceName1=' + encodeURIComponent(referanceName1)

            + '&lightBill=' + encodeURIComponent(lightBill)
            + '&rentAgreement=' + encodeURIComponent(rentAgreement)
            + '&pancard=' + encodeURIComponent(pancard)
            + '&drivingLicence=' + encodeURIComponent(drivingLicence)
            + '&passport=' + encodeURIComponent(passport)
            + '&votingCard=' + encodeURIComponent(votingCard)
            + '&adharCard=' + encodeURIComponent(adharCard)
            + '&decidedamt=' + encodeURIComponent(decidedamt)
            + '&decidedamt1=' + encodeURIComponent(decidedamt1)
            + '&creditamt=' + encodeURIComponent(creditamt)
            + '&creditamt1=' + encodeURIComponent(creditamt1)
            + '&balanceamt=' + encodeURIComponent(balanceamt)
            + '&balanceamt1=' + encodeURIComponent(balanceamt1)
            + '&reference=' + encodeURIComponent(reference)
            + '&reference1=' + encodeURIComponent(reference1)
            + '&actionFrom=' + encodeURIComponent('addGumastaDetail'));
}



function addmediclaimDetails(documentType,oldPolicyNo, companyName, renewDate, customerName, middleName, lastName, husbandName, dob, address, contactNo, memberFirstName, age, secondMemberName, secondMemberAge, thirdMemberName, thirdMemberAge, fourthMemberName, fourthMemberAge, fifthMemberName, fifthMemberAge, adharCard, votingCard, passport, drivingLicence, pancard, adharCardadd, votingCardadd, passportadd, drivingLicenceadd, bankpassbook, corporateLetter, rentAgreement, addProofLightBill, decideAmt, amountPaid, balAmt, refName, submitDate) {


    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

    http.send('documentType=' + encodeURIComponent(documentType)
            + '&oldPolicyNo=' + encodeURIComponent(oldPolicyNo)
            + '&renewDate=' + encodeURIComponent(renewDate)
            + '&companyName=' + encodeURIComponent(companyName)
            + '&customerName=' + encodeURIComponent(customerName)
            + '&middleName=' + encodeURIComponent(middleName)
            + '&lastName=' + encodeURIComponent(lastName)
            + '&husbandName=' + encodeURIComponent(husbandName)
            + '&dob=' + encodeURIComponent(dob)
            + '&address=' + encodeURIComponent(address)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&memberFirstName=' + encodeURIComponent(memberFirstName)
            + '&age=' + encodeURIComponent(age)
            + '&secondMemberName=' + encodeURIComponent(secondMemberName)
            + '&secondMemberAge=' + encodeURIComponent(secondMemberAge)
            + '&thirdMemberName=' + encodeURIComponent(thirdMemberName)
            + '&thirdMemberAge=' + encodeURIComponent(thirdMemberAge)
            + '&fourthMemberName=' + encodeURIComponent(fourthMemberName)
            + '&fourthMemberAge=' + encodeURIComponent(fourthMemberAge)
            + '&fifthMemberName=' + encodeURIComponent(fifthMemberName)
            + '&fifthMemberAge=' + encodeURIComponent(fifthMemberAge)
            + '&adharCard=' + encodeURIComponent(adharCard)
            + '&votingCard=' + encodeURIComponent(votingCard)
            + '&passport=' + encodeURIComponent(passport)
            + '&drivingLicence=' + encodeURIComponent(drivingLicence)
            + '&pancard=' + encodeURIComponent(pancard)
            + '&adharCardadd=' + encodeURIComponent(adharCardadd)
            + '&votingCardadd=' + encodeURIComponent(votingCardadd)
            + '&passportadd=' + encodeURIComponent(passportadd)
            + '&drivingLicenceadd=' + encodeURIComponent(drivingLicenceadd)
            + '&bankpassbook=' + encodeURIComponent(bankpassbook)
            + '&corporateLetter=' + encodeURIComponent(corporateLetter)
            + '&rentAgreement=' + encodeURIComponent(rentAgreement)
            + '&addProofLightBill=' + encodeURIComponent(addProofLightBill)
            + '&decideAmt=' + encodeURIComponent(decideAmt)
            + '&amountPaid=' + encodeURIComponent(amountPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&refName=' + encodeURIComponent(refName)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&actionFrom=' + encodeURIComponent('addmediclaim'));
}



function addAdharCardDetails(oldAadharNo, selfName, mobNo, fatherName, husbandName, dob, address, changesNote, changesNote1, changesNote2, decidedAmtRs, advamt, balamt, referanceName, birthCert, boardcert10, boardcert12, graduateCopy, higheredu, schoolcert, pancard, passport, drivingLicence, votingId, RestLetter, govtbankpass, licpolicy, renetedAgree,
        rationcard, Votingid, Passportadd, Drivinglic, PassbookBank, lightbill, bankStat, rentAgreement)
{
    
 /*   alert(oldAadharNo);
alert(selfName);
alert(mobNo);
alert(fatherName);
alert(husbandName);
alert(dob);
alert(address);
alert(changesNote);
alert(changesNote1);
alert(changesNote2);
alert(decidedAmtRs);
alert(advamt);
alert(balamt);
alert(referanceName);
alert("1"+birthCert);
alert("2"+boardcert10);
alert("3"+boardcert12);
alert("4"+graduateCopy);
alert("5"+higheredu);
alert("6"+schoolcert);
alert("7"+pancard);
alert("8"+passport);
alert("9"+drivingLicence);
alert("10"+votingId);
alert("11"+RestLetter);
alert("12"+govtbankpass);
alert("13"+licpolicy);
alert("14"+renetedAgree);
alert("15"+rationcard);
alert("16"+Votingid);
alert("17"+Passportadd);
alert("18"+Drivinglic);
alert("19"+PassbookBank);
alert("20"+lightbill);
alert("21"+bankStat);
alert("22"+rentAgreement);
    */

    var http = createHTTPObj();
    http.onreadystatechange = function()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
             
            document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('oldAadharNo=' + encodeURIComponent(oldAadharNo)
            + '&selfName=' + encodeURIComponent(selfName)
            + '&mobNo=' + encodeURIComponent(mobNo)
            + '&fatherName=' + encodeURIComponent(fatherName)
            + '&husbandName=' + encodeURIComponent(husbandName)
            + '&dob=' + encodeURIComponent(dob)
            + '&address=' + encodeURIComponent(address)
            + '&changesNote=' + encodeURIComponent(changesNote)
            + '&changesNote1=' + encodeURIComponent(changesNote1)
            + '&changesNote2=' + encodeURIComponent(changesNote2)
            + '&decidedAmtRs=' + encodeURIComponent(decidedAmtRs)
            + '&advamt=' + encodeURIComponent(advamt)
            + '&balamt=' + encodeURIComponent(balamt)
            + '&referanceName=' + encodeURIComponent(referanceName)
            + '&birthCert=' + encodeURIComponent(birthCert)
            + '&boardcert10=' + encodeURIComponent(boardcert10)
            + '&boardcert12=' + encodeURIComponent(boardcert12)
            + '&graduateCopy=' + encodeURIComponent(graduateCopy)
            + '&higheredu=' + encodeURIComponent(higheredu)
            + '&schoolcert=' + encodeURIComponent(schoolcert)
            + '&pancard=' + encodeURIComponent(pancard)
            + '&passport=' + encodeURIComponent(passport)
            + '&drivingLicence=' + encodeURIComponent(drivingLicence)
            + '&votingId=' + encodeURIComponent(votingId)
            + '&RestLetter=' + encodeURIComponent(RestLetter)
            + '&govtbankpass=' + encodeURIComponent(govtbankpass)
            + '&licpolicy=' + encodeURIComponent(licpolicy)
            + '&renetedAgree=' + encodeURIComponent(renetedAgree)
            + '&rationcard=' + encodeURIComponent(rationcard)
            + '&Votingid=' + encodeURIComponent(Votingid)
            + '&Passportadd=' + encodeURIComponent(Passportadd)
            + '&Drivinglic=' + encodeURIComponent(Drivinglic)
            + '&PassbookBank=' + encodeURIComponent(PassbookBank)
            + '&lightbill=' + encodeURIComponent(lightbill)
            + '&bankStat=' + encodeURIComponent(bankStat)
            + '&rentAgreement=' + encodeURIComponent(rentAgreement)
            + '&actionFrom=' + encodeURIComponent('addaadharCardDetail'));

}








/* 
 * To change this license header, choose License Headers in Project Properties.
 * and open the template in the editor.
 * 
 */


function createHTTPObj() {
    var http = null;
    if (window.XMLHttpRequest)
        http = new XMLHttpRequest();
    else if (window.ActiveXObject)
        http = new ActiveXObject("Microsoft.XMLHTTP");
    return http;
}


function getPassport2Details(docType, optionsRadios1, optionsRadios2, custsrnm, custName, custpsnm, dob, optionsRadios3, optionsRadios4, pob, tal, dist, ste,
            quali, optionsRadios5, optionsRadios6, optionsRadios7, optionsRadios8, optionsRadios9, optionsRadios10,
            optionsRadios11, vblmrk, address, contactNo, email, nmofp, dors, phno, whnm, fnm, mnm, pvadd, pin, doi, fno, poi, doe, flnm1,
            add1, mob1, flnm2, add2, mob2, optionsRadios12, optionsRadios13, decidedAmt, date1, aamt, date2, balAmt, date3,amtPaid, date4,submitDate,  birthCert, schoolCert, ssc, hsc, ahem,
            gc, pc, vc, dl, ci, rc, lbo, sl, gbs, ac, vi, cl, gb, lp, iran)

{
    /*
 alert("00",birthCert);
 alert("0",schoolCert);
 alert("1",ssc);
 alert("2",hsc);
 alert("3",ahem);
 alert("4",gc);
 alert("5",pc);
 alert("6",vc);
 alert("7",dl);
alert("8",ci);
alert("9",rc);
alert("10",lbo);
alert("11",sl);
alert("12",gbs);
alert("13",ac);
alert("14",vi);
alert("15",cl);
alert("16",gb);
alert("17",lp);
alert("18",iran);
     
alert("A1",docType);     
alert("A",custsrnm);
alert("B",custfsnm);
alert("C",custpsnm);
alert("D",dob);
alert("E",pob);
alert("F",tal);
alert("G",dist);
alert("H",ste);
alert("I",quali);
alert("J",vblmrk);
alert("K",address);
alert("KA",contactNo);
alert("L",email);
alert("M",nmofp);
alert("N",dors);
alert("O",phno);
alert("P",whnm);
alert("Q",fnm);
alert("R",mnm);
alert("S",pvadd);
alert("T",pin);
alert("U",doi);
alert("V",fno);
alert("W",poi);
alert("X",doe);
alert("Y",flnm1);
alert("Z",add1);
alert("A",mob1);
alert("B",flnm2);
alert("C",add2);
alert("D",mob2);
alert("E",damt);
alert("F",date1);
alert("G",aamt);
alert("H",date2);
alert("I",bamt);
alert("J",date3);
alert("K",amountPaid);
alert("L",date4);
alert("textend"+submitDate);     */

    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&docType=' + encodeURIComponent(docType)
            +'&optionsRadios1=' + encodeURIComponent(optionsRadios1)
            + '&optionsRadios2=' + encodeURIComponent(optionsRadios2)
            + '&custsrnm=' + encodeURIComponent(custsrnm)
            + '&custName=' + encodeURIComponent(custName)
            + '&custpsnm=' + encodeURIComponent(custpsnm)
            + '&dob=' + encodeURIComponent(dob)
            + '&optionsRadios3=' + encodeURIComponent(optionsRadios3)
            + '&optionsRadios4=' + encodeURIComponent(optionsRadios4)
            + '&pob=' + encodeURIComponent(pob)
            + '&tal=' + encodeURIComponent(tal)
            + '&dist=' + encodeURIComponent(dist)
            + '&ste=' + encodeURIComponent(ste)
            + '&quali=' + encodeURIComponent(quali)
            + '&optionsRadios5=' + encodeURIComponent(optionsRadios5)
            + '&optionsRadios6=' + encodeURIComponent(optionsRadios6)
            + '&optionsRadios7=' + encodeURIComponent(optionsRadios7)
            + '&optionsRadios8=' + encodeURIComponent(optionsRadios8)
            + '&optionsRadios9=' + encodeURIComponent(optionsRadios9)
            + '&optionsRadios10=' + encodeURIComponent(optionsRadios10)
            + '&optionsRadios11=' + encodeURIComponent(optionsRadios11)
            + '&vblmrk=' + encodeURIComponent(vblmrk)
            + '&address=' + encodeURIComponent(address)
             + '&contactNo=' + encodeURIComponent(contactNo)
          
            + '&email=' + encodeURIComponent(email)
            + '&nmofp=' + encodeURIComponent(nmofp)
            + '&dors=' + encodeURIComponent(dors)
            + '&dors=' + encodeURIComponent(phno)
            + '&whnm=' + encodeURIComponent(whnm)
            + '&fnm=' + encodeURIComponent(fnm)
            + '&mnm=' + encodeURIComponent(mnm)
            + '&pvadd=' + encodeURIComponent(pvadd)
            + '&pin=' + encodeURIComponent(pin)
            + '&doi=' + encodeURIComponent(doi)
            + '&fno=' + encodeURIComponent(fno)
            + '&poi=' + encodeURIComponent(poi)
            + '&doe=' + encodeURIComponent(doe)
            + '&flnm1=' + encodeURIComponent(flnm1)
            + '&add1=' + encodeURIComponent(add1)
            + '&mob1=' + encodeURIComponent(mob1)
            + '&flnm2=' + encodeURIComponent(flnm2)
            + '&add2=' + encodeURIComponent(add2)
            + '&mob2=' + encodeURIComponent(mob2)
            + '&optionsRadios12=' + encodeURIComponent(optionsRadios12)
            + '&optionsRadios13=' + encodeURIComponent(optionsRadios13)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&date1=' + encodeURIComponent(date1)
            + '&aamt=' + encodeURIComponent(aamt)
            + '&date2=' + encodeURIComponent(date2)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&date3=' + encodeURIComponent(date3)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&date4=' + encodeURIComponent(date4)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&birthCert=' + encodeURIComponent(birthCert)
            + '&schoolCert=' + encodeURIComponent(schoolCert)
            + '&ssc=' + encodeURIComponent(ssc)
            + '&hsc=' + encodeURIComponent(hsc)
            + '&ahem=' + encodeURIComponent(ahem)
            + '&gc=' + encodeURIComponent(gc)
            + '&pc=' + encodeURIComponent(pc)
            + '&vc=' + encodeURIComponent(vc)
            + '&dl=' + encodeURIComponent(dl)
            + '&ci=' + encodeURIComponent(ci)
            + '&rc=' + encodeURIComponent(rc)
            + '&lbo=' + encodeURIComponent(lbo)
            + '&sl=' + encodeURIComponent(sl)
            + '&gbs=' + encodeURIComponent(gbs)
            + '&ac=' + encodeURIComponent(ac)
            + '&vi=' + encodeURIComponent(vi)
            + '&cl=' + encodeURIComponent(cl)
            + '&gb=' + encodeURIComponent(gb)
            + '&lp=' + encodeURIComponent(lp)
            + '&iran' + encodeURIComponent(iran)
            + '&actionFrom=' + encodeURIComponent('addPassport2'));






}




function loginvalidation(){
    
    
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           alert(response);
            document.getElementById("searchDiv").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openIndex'));
    
    
    
    
    
}
function openRationCard()
{
   
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openRationCard'));
    
    
    
    
}


function openOtherWork()
{
   
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openOtherWork'));
    
    
    
    
}

function openReport(){
    
    
       
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openReport'));

}


function ViewReport(custName,contactNo,subDate,formType)
{

   
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            
             document.getElementById("StudentDiv").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('custName=' + encodeURIComponent(custName)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&subDate=' + encodeURIComponent(subDate)
            + '&formType=' + encodeURIComponent(formType)
            + '&actionFrom=' + encodeURIComponent('viewreportdetails'));
}





function openPancard()
{
   
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openPancard'));
}
   function openPassport()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openPassport'));
    
    
    
    
}
   function openTwbikeInsurance()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openTwbikeInsurance'));
    
    
    
    
}
   function openGumasta()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openGumasta'));
    
    
    
    
}
   function openLearningDriving()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openLearningDriving'));
    
    
    
    
}
  function openGumasta()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openGumasta'));
    
    
    
    
}
   function openGrantRenewal()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openGrantRenewal'));
    
    
    
    
}
  function openAadharCard()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openAadharCard'));
    
    
    
    
}
  function openLic()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openLic'));
    
    
    
    
}
  function openLoanFile()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openLoanFile'));
    
    
    
    
}
 function openMediclaim()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openMediclaim'));
    
    }
 function openSalaryIt()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openSalaryIt'));
    
    
    
    
}
function openFoodLicence()
{
    
     var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           
            document.getElementById("containerfluid").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&actionFrom=' + encodeURIComponent('openFoodLicence'));
    
    
    
    
}



function addPancard(docType,CorrectionForm, OldpanNo, custName, FatherName, SurName, HusbandName, Dob, address, contactNo, BirthCert, sscCert, hscCert, marriageCert, magisrateCharge, adharCard, passprtValid, drivngLicn, votingId, domicileCert, adharCard1, voteId, passportValid, drivingLicvalid, bankPaPhoto, corpeterLetter, notory, addProof, domCert, decidedAmt,amtPaid,balAmt,Remarknote,submitDate)
{



    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
             
            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }

            document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&CorrectionForm=' + encodeURIComponent(CorrectionForm)
             + '&docType=' + encodeURIComponent(docType)
            + '&OldpanNo=' + encodeURIComponent(OldpanNo)
            + '&custName=' + encodeURIComponent(custName)
            + '&FatherName=' + encodeURIComponent(FatherName)
            + '&SurName=' + encodeURIComponent(SurName)
            + '&HusbandName=' + encodeURIComponent(HusbandName)
            + '&Dob=' + encodeURIComponent(Dob)
            + '&address=' + encodeURIComponent(address)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&BirthCert=' + encodeURIComponent(BirthCert)
            + '&sscCert=' + encodeURIComponent(sscCert)
            + '&hscCert=' + encodeURIComponent(hscCert)
            + '&marriageCert=' + encodeURIComponent(marriageCert)
            + '&magisrateCharge=' + encodeURIComponent(magisrateCharge)
            + '&adharCard=' + encodeURIComponent(adharCard)
            + '&passprtValid=' + encodeURIComponent(passprtValid)
            + '&drivngLicn=' + encodeURIComponent(drivngLicn)
            + '&votingId=' + encodeURIComponent(votingId)
            + '&domicileCerte=' + encodeURIComponent(domicileCert)
            + '&adharCard1=' + encodeURIComponent(adharCard1)
            + '&voteId=' + encodeURIComponent(voteId)
            + '&passportValid=' + encodeURIComponent(passportValid)
            + ' bankPaPhoto=' + encodeURIComponent(bankPaPhoto)
            + '&corpeterLetter=' + encodeURIComponent(corpeterLetter)
            + '&notory=' + encodeURIComponent(notory)
            + '&addProof=' + encodeURIComponent(addProof)
            + '&domCert=' + encodeURIComponent(domCert)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&Remarknote=' + encodeURIComponent(Remarknote)
            + '&submitDate=' + encodeURIComponent(submitDate)
        
            + '&actionFrom=' + encodeURIComponent('addPancard'));





}



function getRationcard(docType,UpadationChange, custName, Dob,address, contactNo, natureBusiness, ylyAmt, 
    gasName, gasGiverName, memFirstName1, memFirstName2, secMemName1, secMemName2, ThirdMemName1,
    ThirdMemName1, ThirdMemName2, fourthMemName1, fourthMemName2, fifthMemName1, fifthMemName2, Pancard,
    votingId, passportValid, DrivingLicn, adharCard, lightBill, adharCard1, voteId, socResiLet, govtBankPass,
    rentedNotary, ownrLightBillNoc, form16lstThreeyrs, ItFile, gasBook, talathiCert,decidedAmt,
    amtPaid,balAmt,Remarknote,submitDate)
{


    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

        var response = http.responseText;
        
         
            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
        
        
                document.getElementById("formgroup").innerHTML = response;
        }
       
    };
    http.open('POST','aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('UpadationChange=' + encodeURIComponent(UpadationChange)
            + '&docType=' + encodeURIComponent(docType)
            + '&custName=' + encodeURIComponent(custName)
            + '&Dob=' + encodeURIComponent(Dob)
            + '&address=' + encodeURIComponent(address)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&natureBusiness=' + encodeURIComponent(natureBusiness)
            + '&ylyAmt=' + encodeURIComponent(ylyAmt)
            
            + '&gasName=' + encodeURIComponent(gasName)
            + '&gasGiverName=' + encodeURIComponent(gasGiverName)
            + '&memFirstName1=' + encodeURIComponent(memFirstName1)
            + '&memFirstName2=' + encodeURIComponent(memFirstName2)
            + '&secMemName1=' + encodeURIComponent(secMemName1)
            + '&adharCard=' + encodeURIComponent(adharCard)
            + '&secMemName2=' + encodeURIComponent(secMemName2)
            + '&ThirdMemName1=' + encodeURIComponent(ThirdMemName1)
            + '&ThirdMemName2=' + encodeURIComponent(ThirdMemName2)
            + '&fourthMemName1=' + encodeURIComponent(fourthMemName1)
            + '&fourthMemName2=' + encodeURIComponent(fourthMemName2)
            + '&fifthMemName1=' + encodeURIComponent(fifthMemName1)
            + '&fifthMemName2=' + encodeURIComponent(fifthMemName2)
            + ' Pancard=' + encodeURIComponent(Pancard)
            + '&votingId=' + encodeURIComponent(votingId)
            + '&passportValid=' + encodeURIComponent(passportValid)
            + '&DrivingLicn=' + encodeURIComponent(DrivingLicn)
            + '&adharCard1=' + encodeURIComponent(adharCard1)
            + '&lightBill=' + encodeURIComponent(lightBill)
            + '&adharCard1=' + encodeURIComponent(adharCard1)
            + '&voteId=' + encodeURIComponent(voteId)
            + '&adharCard1=' + encodeURIComponent(adharCard1)
            + '&socResiLet=' + encodeURIComponent(socResiLet)
            + '&govtBankPass=' + encodeURIComponent(govtBankPass)
            + '&rentedNotary=' + encodeURIComponent(rentedNotary)
            + '&ownrLightBillNoc=' + encodeURIComponent(ownrLightBillNoc)
            + '&form16lstThreeyrs=' + encodeURIComponent(form16lstThreeyrs)
            + '&ItFile=' + encodeURIComponent(ItFile)
            + '&gasBook=' + encodeURIComponent(gasBook)
            + '&talathiCert=' + encodeURIComponent(talathiCert)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&Remarknote=' + encodeURIComponent(Remarknote)
            + '&submitDate=' + encodeURIComponent(submitDate)

            + '&actionFrom=' + encodeURIComponent('addRationcard'));

}



function add2w(docType,custName, middleName, lastName, address,contactNo,landmarkaddnear, vehicleno, whichbikedetail, modelyear,
            lstyrpolicydetail, bikecolour, loanhyponame, decidedAmt, amtPaid,balAmt,Remarknote,submitDate,photobike,oldrcbookxrx,oldinsrncecpyxrx,letterncb)
      {
    
    
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {
        if (http.readyState == 4) {

            var response = http.responseText;

          var response = http.responseText;
             
            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
            document.getElementById("formgroup").innerHTML = response;
        }
    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('&custName=' + encodeURIComponent(custName)
              + '&docType=' + encodeURIComponent(docType)
            + '&middleName=' + encodeURIComponent(middleName)
            + '&lastName=' + encodeURIComponent(lastName)
            + '&address=' + encodeURIComponent(address)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&landmarkaddnear=' + encodeURIComponent(landmarkaddnear)
            + '&vehicleno=' + encodeURIComponent(vehicleno)
            + '&whichbikedetail=' + encodeURIComponent(whichbikedetail)
            + '&lstyrpolicydetail=' + encodeURIComponent(lstyrpolicydetail)
            + '&bikecolour=' + encodeURIComponent(bikecolour)
            + '&loanhyponame=' + encodeURIComponent(loanhyponame)
            + '&modelyear=' + encodeURIComponent(modelyear)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&Remarknote=' + encodeURIComponent(Remarknote)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&photobike=' + encodeURIComponent(photobike)
            + '&oldrcbookxrx=' + encodeURIComponent(oldrcbookxrx)
            + '&oldinsrncecpyxrx=' + encodeURIComponent(oldinsrncecpyxrx)
            + '&letterncb=' + encodeURIComponent(letterncb)
            + '&Remarknote=' + encodeURIComponent(Remarknote)
         
            + '&actionFrom=' + encodeURIComponent('add2w1'));
}


function addAdharCardDetails(docType,oldAadharNo, custName, contactNo, fatherName, husbandName, dob, address, changesNote, changesNote1, decidedAmt, amtPaid,balAmt,Remarknote,submitDate,
birthCert, boardcert10, boardcert12, graduateCopy, higheredu, schoolcert, pancard, passport, drivingLicence, voteId, RestLetter, govtbankpass, licpolicy, renetedAgree,
            rationcard, Votingid, Passportadd, Drivinglic, PassbookBank, lightbill, bankStat, rentAgreement)
{
    
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
            
            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }

          document.getElementById("formgroup").innerHTML = response;
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('oldAadharNo=' + encodeURIComponent(oldAadharNo)
            + '&docType=' + encodeURIComponent(docType)
            + '&custName=' + encodeURIComponent(custName)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&fatherName=' + encodeURIComponent(fatherName)
            + '&husbandName=' + encodeURIComponent(husbandName)
            + '&dob=' + encodeURIComponent(dob)
            + '&address=' + encodeURIComponent(address)
            + '&changesNote=' + encodeURIComponent(changesNote)
            + '&changesNote1=' + encodeURIComponent(changesNote1)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&Remarknote=' + encodeURIComponent(Remarknote)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&birthCert=' + encodeURIComponent(birthCert)
            + '&boardcert10=' + encodeURIComponent(boardcert10)
            + '&boardcert12=' + encodeURIComponent(boardcert12)
            + '&graduateCopy=' + encodeURIComponent(graduateCopy)
            + '&higheredu=' + encodeURIComponent(higheredu)
            + '&schoolcert=' + encodeURIComponent(schoolcert)
            + '&pancard=' + encodeURIComponent(pancard)
            + '&passport=' + encodeURIComponent(passport)
            + '&drivingLicence=' + encodeURIComponent(drivingLicence)
            + '&voteId=' + encodeURIComponent(voteId)
            + '&RestLetter=' + encodeURIComponent(RestLetter)
            + '&govtbankpass=' + encodeURIComponent(govtbankpass)
            + '&licpolicy=' + encodeURIComponent(licpolicy)
            + '&renetedAgree=' + encodeURIComponent(renetedAgree)
            + '&rationcard=' + encodeURIComponent(rationcard)
            + '&Votingid=' + encodeURIComponent(Votingid)
            + '&Passportadd=' + encodeURIComponent(Passportadd)
            + '&Drivinglic=' + encodeURIComponent(Drivinglic)
            + '&PassbookBank=' + encodeURIComponent(PassbookBank)
            + '&lightbill=' + encodeURIComponent(lightbill)
            + '&bankStat=' + encodeURIComponent(bankStat)
            + '&rentAgreement=' + encodeURIComponent(rentAgreement)
            + '&actionFrom=' + encodeURIComponent('addaadharCardDetail'));

}




function addgetGrantRenewal(subDate,TheLicensingAuthority, MotorCyclewithoutgear, MotorCyclewithgear, InvalidCarriages, LightMotorVehicle,
        MediumMotorCycle, HeavygoodsVehicle, HeavyPassengerMotorVehicle, RoadRollers, MotorVehicleoffollowingdescription,
        custName, Son, address, TemporaryAddress,contactNo, datepicker, EducationalQualification, IdentificationMark, BloodGroupwithRHfactor,
        decidedAmt, advAmt , balAmt, refrencename, Iholdaneffectivedrivinglicencetodrive, Particulars, Particularsof, Haveyoubeen, IencloseMedical, issuedbythe, IencloseDriving, issuedby)

{

    //alert(subDate);
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;
           // alert("response"+response)
            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send(
            + 'subDate=' + encodeURIComponent(subDate)
            + '&TheLicensingAuthority=' + encodeURIComponent(TheLicensingAuthority)
            + '&MotorCyclewithoutgear=' + encodeURIComponent(MotorCyclewithoutgear)
            + '&MotorCyclewithgear=' + encodeURIComponent(MotorCyclewithgear)
            + '&InvalidCarriages=' + encodeURIComponent(InvalidCarriages)
            + '&LightMotorVehicle=' + encodeURIComponent(LightMotorVehicle)
            + '&MediumMotorCycle=' + encodeURIComponent(MediumMotorCycle)
            + '&HeavygoodsVehicle=' + encodeURIComponent(HeavygoodsVehicle)
            + '&HeavyPassengerMotorVehicle=' + encodeURIComponent(HeavyPassengerMotorVehicle)

            + '&RoadRollers=' + encodeURIComponent(RoadRollers)
            + '&MotorVehicleoffollowingdescription=' + encodeURIComponent(MotorVehicleoffollowingdescription)
            + '&custName=' + encodeURIComponent(custName)
            + '&Son=' + encodeURIComponent(Son)
            + '&address=' + encodeURIComponent(address)
            + '&TemporaryAddress=' + encodeURIComponent(TemporaryAddress)
             + '&contactNo=' + encodeURIComponent(contactNo)
            + '&datepicker=' + encodeURIComponent(datepicker)
            + '&EducationalQualification=' + encodeURIComponent(EducationalQualification)
            + '&IdentificationMark=' + encodeURIComponent(IdentificationMark)
            + '&BloodGroupwithRHfactor=' + encodeURIComponent(BloodGroupwithRHfactor)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&advAmt=' + encodeURIComponent(advAmt)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&refrencename=' + encodeURIComponent(refrencename)
            + '&Iholdaneffectivedrivinglicencetodrive=' + encodeURIComponent(Iholdaneffectivedrivinglicencetodrive)
            + '&Particulars=' + encodeURIComponent(Particulars)
            + '&Particularsof=' + encodeURIComponent(Particularsof)

            + '&Haveyoubeen=' + encodeURIComponent(Haveyoubeen)
            + '&IencloseMedical=' + encodeURIComponent(IencloseMedical)
            + '&issuedbythe=' + encodeURIComponent(issuedbythe)
            + '&IencloseDriving=' + encodeURIComponent(IencloseDriving)
            + '&issuedby=' + encodeURIComponent(issuedby)
            + '&actionFrom=' + encodeURIComponent('addgetGrantRenewal1'));

}


function addlic(custName,docType,submitDate,contactNo, fn, imhn, dob, address, st, pt, vm, none,ht, wt, idm,
            jod, ban, bran, ifsc,bankacc, opno, opno2, ocmpnm, qyfmm, frae,thbd,
          mrae, brae, srae, hwae, cdae, decidedAmt, amtPaid, balAmt, rene,brcr,
            sclvc, thbc, gc, ahecy, frif, sysp, adcd, pacr, drliva, vgid, pssprt,
            cdid, rncd, ltbl, arca, voigid, passp, bpass, irano){
               
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {
        if (http.readyState == 4) {
            var response = http.responseText;
             //   List grantrenewallist = grServices.viewgrantrenewalDetailsCustomerName(custName);
        if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
            document.getElementById("formgroup").innerHTML = response;
        }
    };

    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('custName=' + encodeURIComponent(custName)
            + '&docType=' + encodeURIComponent(docType)
            + '&submitDate=' + encodeURIComponent(submitDate)
            + '&contactNo=' + encodeURIComponent(contactNo)
            + '&fn=' + encodeURIComponent(fn)
            + '&imhn=' + encodeURIComponent(imhn)
            + '&dob=' + encodeURIComponent(dob)
            + '&address=' + encodeURIComponent(address)
            + '&st=' + encodeURIComponent(st)
            + '&pt=' + encodeURIComponent(pt)
            + '&vm=' + encodeURIComponent(vm)
            + '&none=' + encodeURIComponent(none)
            + '&ht=' + encodeURIComponent(ht)
            + '&wt=' + encodeURIComponent(wt)
            + '&idm=' + encodeURIComponent(idm)
            + '&jod=' + encodeURIComponent(jod)
            + '&ban=' + encodeURIComponent(ban)
     + '&thbd=' + encodeURIComponent(thbd)
            + '&bran=' + encodeURIComponent(bran)
            + '&ifsc=' + encodeURIComponent(ifsc)
            + '&bankacc=' + encodeURIComponent(bankacc)
            + '&opno=' + encodeURIComponent(opno)

            + '&opno2=' + encodeURIComponent(opno2)
            + '&ocmpnm=' + encodeURIComponent(ocmpnm)
            + '&qyfmm=' + encodeURIComponent(qyfmm)
            + '&frae=' + encodeURIComponent(frae)
            + '&mrae=' + encodeURIComponent(mrae)
            + '&brae=' + encodeURIComponent(brae)
            + '&srae=' + encodeURIComponent(srae)
            + '&hwae=' + encodeURIComponent(hwae)
            + '&cdae=' + encodeURIComponent(cdae)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&amtPaid=' + encodeURIComponent(amtPaid)
            + '&balAmt=' + encodeURIComponent(balAmt)

            + '&pacr=' + encodeURIComponent(pacr)
            + '&rene=' + encodeURIComponent(rene)
            + '&brcr=' + encodeURIComponent(brcr)
            + '&sclvc=' + encodeURIComponent(sclvc)
            + '&thbc=' + encodeURIComponent(thbc)
            + '&gc=' + encodeURIComponent(gc)
            + '&ahecy=' + encodeURIComponent(ahecy)
            + '&frif=' + encodeURIComponent(frif)
            + '&sysp=' + encodeURIComponent(sysp)
            + '&adcd=' + encodeURIComponent(adcd)
            + '&pacr=' + encodeURIComponent(pacr)
            + '&drliva=' + encodeURIComponent(drliva)
            + '&vgid=' + encodeURIComponent(vgid)
            + '&pssprt=' + encodeURIComponent(pssprt)
            + '&cdid=' + encodeURIComponent(cdid)
            + '&rncd=' + encodeURIComponent(rncd)
            + '&ltbl=' + encodeURIComponent(ltbl)
            + '&arca=' + encodeURIComponent(arca)
            + '&voigid=' + encodeURIComponent(voigid)
            + '&passp=' + encodeURIComponent(passp)
            + '&bpass=' + encodeURIComponent(bpass)
            + '&irano=' + encodeURIComponent(irano)
            + '&actionFrom=' + encodeURIComponent('addlic1'));
}



function Viewotherwork(subDate,FormType,WorkName,custName,contactNo,dob,ADDFULL,NOTESOFREMARK,decidedAmt,advAmt,balAmt,REFRENCENAME,isPANCARD,
        isPASSPORTVALID,isDRIVLICNVALID,isVOTINGID,isAADHARCARD,isRATIONCARD,isLIGHTBILL,isAADHARCARD1,isSOCIETYRESILETTER,isGOVTBANKPASSBOOK,isLICPOLICY,isRENETDAGREEMENT,OTHERWORK)
{
    
    var http = createHTTPObj();
    http.onreadystatechange = function ()
    {

        if (http.readyState == 4) {

            var response = http.responseText;

            if((response).indexOf("Save Successfully") >=0){
                alert("Record Save Successfully"); 
            }
            else{
                  alert("Failed To Save Record");
            }
          
        }

    };
    http.open('POST', 'aadharCard.htm', true);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    http.send('FormType=' + encodeURIComponent(FormType)
            + '&subDate=' + encodeURIComponent(subDate)
            + '&WorkName=' + encodeURIComponent(WorkName)
            + '&custName=' + encodeURIComponent(custName)
    + '&contactNo=' + encodeURIComponent(contactNo)
            + '&dob=' + encodeURIComponent(dob)
            + '&ADDFULL=' + encodeURIComponent(ADDFULL)
            + '&NOTESOFREMARK=' + encodeURIComponent(NOTESOFREMARK)
            + '&decidedAmt=' + encodeURIComponent(decidedAmt)
            + '&advAmt=' + encodeURIComponent(advAmt)
            + '&balAmt=' + encodeURIComponent(balAmt)
            + '&REFRENCENAME=' + encodeURIComponent(REFRENCENAME)
            + '&isPANCARD=' + encodeURIComponent(isPANCARD)
            + '&isPASSPORTVALID=' + encodeURIComponent(isPASSPORTVALID)
            + '&isDRIVLICNVALID=' + encodeURIComponent(isDRIVLICNVALID)
            + '&isVOTINGID=' + encodeURIComponent(isVOTINGID)
            + '&isAADHARCARD=' + encodeURIComponent(isAADHARCARD)
            + '&isRATIONCARD=' + encodeURIComponent(isRATIONCARD)
            + '&isLIGHTBILL=' + encodeURIComponent(isLIGHTBILL)
            + '&isAADHARCARD1=' + encodeURIComponent(isAADHARCARD1)
            + '&isSOCIETYRESILETTER=' + encodeURIComponent(isSOCIETYRESILETTER)
            + '&isGOVTBANKPASSBOOK=' + encodeURIComponent(isGOVTBANKPASSBOOK)
            + '&isLICPOLICY=' + encodeURIComponent(isLICPOLICY)
            + '&isRENETDAGREEMENT=' + encodeURIComponent(isRENETDAGREEMENT)
            + '&OTHERWORK=' + encodeURIComponent(OTHERWORK)

            + '&actionFrom=' + encodeURIComponent('addotherwork1'));
}

