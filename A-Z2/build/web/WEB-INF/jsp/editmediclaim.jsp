<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container-fluid" id="containerfluid">

    <!-- Page Heading -->
    <br>
    <ol class="breadcrumb">
        <li class="active">
            <i class="fa fa-dashboard"></i>  Application For Mediclaim
        </li>
    </ol>
    <!-- /.row -->
    <br>
    <br>

    <div class="row">


        <form role="form">
   <input type="hidden" value="${id}" id="id">
            <div class="form-group" id="formgroup" >
                <table>
                    <tr>
                        <td>Document type :</td>
                        <td style="padding-left:10px;" ><input class="form-control"  id="documentType" style="width:105%;" value="${medi.docType}"></td>



                    </tr>
                </table><br>
                <table border="0" style="width:70%;">
                    <tr>
                        <td >Form Type :</td>
                        <td >
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>New Mediclaim
                            &nbsp&nbsp
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Renew Mediclaim

                        </td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Old Policy No :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="oldPolicyNo" value="${medi.oldPolicyNo}"></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table>
                <br>
                <table>
                    <tr>
                        <td>Old Company Name :</td>
                        <td style="padding-left:10px;" ><input class="form-control" id="customerName" value="${medi.customerName}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td>Renewal Stop Date :</td>
                        <td style="padding-left:10px;" ><input class="form-control" style="width:105%;" id="renewDate" value="${medi.renewDate}"></td>



                    </tr>
                </table>
                <br>
                <table border="0" style="width:90%;">
                    <tr>
                        <td >First Name:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="custName" value="${medi.custName}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Father Name :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="middleName" value="${medi.middleName}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td >Surname :</td>
                        <td>  &nbsp </td>

                        <td><input class="form-control" id="lastName" value="${medi.lastName}"></td>
                    </tr>
                </table>
                <br>
                <table border="0" style="width:60%;">
                    <tr>
                        <td >Husband Name:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="husbandName" value="${medi.husbandName}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Date Of Birth :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="dob" value="${medi.dob}"></td>
                        <td>  &nbsp&nbsp </td>

                    </tr>
                </table>
                <br>
                <table style="width:70%;">
                    <tr>
                        <td>Full Address :</td>

                        <td style="padding-left:5px;width:35%;">
                            <div class="form-group">
                                <textarea class="form-control" rows="2" id="address" value="">${medi.address}</textarea>
                            </div></td>					 
                        <td >  &nbsp&nbsp </td>
                        <td >Contact no:</td>
                        <td>  &nbsp  &nbsp </td>

                        <td ><input class="form-control" id="contactNo"value="${medi.contactNo}" ></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table><br>
                <table align="left"  style="width:90%;">
                    <tr align="center">
                        <td>
                            <b>Quantity Member</b>
                        </td>

                        <td>&nbsp &nbsp </td>

                        <td>
                            <b>Name</b>
                        </td>
                        <td>&nbsp </td>
                        <td>
                            <b>Date of Birth/Age</b>
                        </td>
                    </tr>
                    <td>&nbsp &nbsp </td>
                    <tr align="center">


                        <td>
                            1)Member First Name
                        </td>

                        <td>&nbsp&nbsp</td>

                        <td>
                            <input class="form-control" id="memberFirstName" value="${medi.memberFirstName}">
                        </td>
                        <td>&nbsp </td>

                        <td>
                            <input class="form-control" id="age" value="${medi.age}">
                        </td>

                    </tr>
                    <td>&nbsp &nbsp </td>
                    <tr align="center">
                        <td>
                            2)Second Member Name
                        </td>

                        <td>&nbsp&nbsp</td>

                        <td>
                            <input class="form-control" id="secondMemberName" value="${medi.secondMemberName}">
                        </td>

                        <td>&nbsp </td>

                        <td>
                            <input class="form-control" id="secondMemberAge" value="${medi.secondMemberAge}">
                        </td>
                    </tr>
                    <td>&nbsp &nbsp </td>
                    <tr align="center">
                        <td>
                            3)Third Member Name :
                        </td>

                        <td>  &nbsp  &nbsp </td>

                        <td>
                            <input class="form-control" id="thirdMemberName" value="${medi.thirdMemberName}">
                        </td>

                        <td>&nbsp</td>
                        <td>

                            <input class="form-control" id="thirdMemberAge" value="${medi.thirdMemberAge}">
                        </td>
                    </tr> 
                    <td>&nbsp&nbsp</td>
                    <tr align="center">
                        <td>
                            4)Fourth Member Name :
                        </td>

                        <td>  &nbsp  &nbsp </td>

                        <td>
                            <input class="form-control" id="fourthMemberName" value="${medi.fourthMemberName}">
                        </td>

                        <td>&nbsp </td>

                        <td>
                            <input class="form-control" id="fourthMemberAge" value="${medi.fourthMemberAge}">
                        </td>
                    </tr>
                    <td>&nbsp &nbsp </td>
                    <tr>
                        <td align="center">
                            5)Fifth Member Name :
                        </td>

                        <td>&nbsp&nbsp</td>

                        <td>
                            <input class="form-control" id="fifthMemberName" value="${medi.fifthMemberName}">
                        </td>

                        <td>&nbsp </td>

                        <td>
                            <input class="form-control" id="fifthMemberAge" value="${medi.fifthMemberAge}">
                        </td>
                    </tr>
                </table>
                <br><br><br><br><br><br>
                <br><br><br><br><br>
                <br><br><br><br>

                <br>
                <div class="form-group">
                    <label>Photo-Id Proof:&nbsp</label>
                    <c:set var='chkSelected' value="${medi.adharCard}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard" checked value="${medi.adharCard}">&nbsp Aadhar Card
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard"  value="${medi.adharCard}">&nbsp Aadhar Card
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard"  value="">&nbsp Aadhar Card
                        </label>
                    </c:if>
                   
                        
                         <c:set var='chkSelected' value="${medi.votingCard}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCard" checked value="${medi.votingCard}">Voting-Id
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCard"  value="${medi.votingCard}">Voting-Id
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCard"  value="">Voting-Id
                        </label>
                    </c:if>
                  
                        <c:set var='chkSelected' value="${medi.passport}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport" checked value="${medi.passport}">Passport-Valid
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport"  value="${medi.passport}">Passport-Valid
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport"  value="">Passport-Valid
                        </label>
                    </c:if>
                  
                  <c:set var='chkSelected' value="${medi.drivingLicence}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence" checked value="${medi.drivingLicence}">Driving Licence-Valid
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence"  value="${medi.drivingLicence}">Driving Licence-Valid
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence"  value="">Driving Licence-Valid
                        </label>
                    </c:if>
                    <c:set var='chkSelected' value="${medi.pancard}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard" checked value="${medi.pancard}">Pan Card
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard"  value="${medi.pancard}">Pan Card
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard"  value="">Pan Card
                        </label>
                    </c:if>
                  

                </div>
                <br> 
                <div class="form-group">
                    <label>Add Proof:&nbsp</label>
                    
                      <c:set var='chkSelected' value="${medi.adharCardadd}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCardadd" checked value="${medi.adharCardadd}">Addhar Card
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCardadd"  value="${medi.adharCardadd}">Addhar Card
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCardadd"  value="">Addhar Card
                        </label>
                    </c:if>
                   
                        
                          <c:set var='chkSelected' value="${medi.votingCardadd}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCardadd" checked value="${medi.votingCardadd}">Voting-Id
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCardadd"  value="${medi.votingCardadd}">Voting-Id
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingCardadd"  value="">Voting-Id
                        </label>
                    </c:if>
                 
                        
                           <c:set var='chkSelected' value="${medi.passportadd}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportadd" checked value="${medi.passportadd}">Passport-Valid
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportadd"  value="${medi.passportadd}">Passport-Valid
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportadd"  value="">Passport-Valid
                        </label>
                    </c:if>
                   
                        
                         <c:set var='chkSelected' value="${medi.drivingLicenceadd}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicenceadd" checked value="${medi.drivingLicenceadd}">Driving Licence-Valid
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicenceadd"  value="${medi.drivingLicenceadd}">Driving Licence-Valid
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicenceadd"  value="">Driving Licence-Valid
                        </label>
                    </c:if>
                  
                        
                         <c:set var='chkSelected' value="${medi.bankpassbook}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankpassbook" checked value="${medi.bankpassbook}">Bank Passbook With Photo
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankpassbook"  value="${medi.bankpassbook}">Bank Passbook With Photo
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankpassbook"  value="">Bank Passbook With Photo
                        </label>
                    </c:if>
                  <br>
                  
                   <c:set var='chkSelected' value="${medi.corporateLetter}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corporateLetter" checked value="${medi.corporateLetter}">Corporator Letter With Id
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corporateLetter"  value="${medi.corporateLetter}">Corporator Letter With Id
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corporateLetter"  value="">Corporator Letter With Id
                        </label>
                    </c:if>
                  
                        
                         <c:set var='chkSelected' value="${medi.rentAgreement}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement" checked value="${medi.rentAgreement}">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement"  value="${medi.rentAgreement}">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement"  value="">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                    </c:if>
                   
                          <c:set var='chkSelected' value="${medi.addProofLightBill}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProofLightBill" checked value="${medi.addProofLightBill}">ADD PROOF-Light Bill Self Name
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProofLightBill"  value="${medi.addProofLightBill}">ADD PROOF-Light Bill Self Name
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProofLightBill"  value="">ADD PROOF-Light Bill Self Name
                        </label>
                    </c:if>
                   

                </div>

                <br>

                <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${medi.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${medi.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${medi.balAmt}"  onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${medi.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${medi.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${medi.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${medi.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${medi.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${medi.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${gc.submitDate}"/></td></tr>
                            </table><br>


                <br>
                <br>
                <br>
                <table align="center">
                    <tr>
                        <td >
                            <div>
                                <button type="button" class="btn btn-primary" onclick="addmediclaim('edit')">Submit</button>
                            </div>
                        </td>
                    </tr>
                </table>



                a

            </div>
    </div>
    <!-- /.row -->

</div>
<!-- /.container-fluid -->

</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

</body>

</html>

