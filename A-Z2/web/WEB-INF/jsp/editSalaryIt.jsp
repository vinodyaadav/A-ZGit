<%-- 
    Document   : editSalaryIt
    Created on : Jan 24, 2017, 10:43:26 AM
    Author     : Vivek
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="page-wrapper" class="panel panel-default">

    <div class="container-fluid" id="containerfluid">

        <!-- Page Heading -->
        <br>
        <ol class="breadcrumb">
            <li class="active">
                <i class="fa fa-dashboard"></i> View/Edit Datasheet For IT File - Salary I.T Or Business I.T File
            </li>
        </ol>
        <!-- /.row -->
        <br>
        <br>

        <div class="row">


            <form role="form">
<input type="hidden" name="id" id="id" value="${id}"/>
                <div class="form-group" id="formgroup" >
                    <table border="0" style="width:80%;">
                        <tr>
                            <td >I.T Type :</td>
                            <td ><input class="form-control" id="itType"  value="${sal.itType}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >PAN NO :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="panNo" value="${sal.panNo}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td >Document Type :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="docType" value="${sal.docType}"></td>


                        </tr>
                    </table>
                    <br>
                    <table border="0" width="85%" >
                        <tr>
                            <td >Customer Name:</td>
                            <td>  &nbsp </td>
                            <td style="padding-left:30px;"><input class="form-control" id="custName" value="${sal.custName}" style="width:500px;"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >Surname :</td>
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td><input class="form-control" id="surName" value="${sal.surName}"></td>
                            <td>  &nbsp&nbsp </td>
                        </tr><br><td>  &nbsp&nbsp </td>
                        <tr> <td >Date Of Birth :</td>
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td><input class="form-control" id="dateOfBirth" value="${sal.dateOfBirth}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td >Contact No :</td>
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td><input class="form-control" id="contactNo" value="${sal.contactNo}"></td>
                        </tr>
                    </table>
                    <br>

                    <table style="width:70%;">
                        <tr>
                            <td> Present Full Address :</td>

                            <td style="padding-left:5px;width:35%;">
                                <div class="form-group">
                                    <textarea class="form-control" rows="2" id="address"  value="">${sal.address}</textarea>
                                </div></td>					 
                            <td >  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >I.T Make Value:</td>
                            <td>  &nbsp  </td>
                            <td ><input class="form-control" id="itMakeValue" value="${sal.itMakeValue}"></td>
                        </tr>
                    </table>
                    <br>
                    <table border="0" style="width:70%;">
                        <tr>
                            <td >Text Paid Aprox :</td>
                            <td ><input class="form-control" id="textPaidArea" value="${sal.textPaidArea}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >LIC Prem Paid In Yly :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="licPremPaid" value="${sal.licPremPaid}"></td>
                            <td>  &nbsp&nbsp </td>
                        </tr>
                    </table>
                    <br>
                    <table border="0" style="width:70%;">
                        <tr>
                            <td >Medical Prem :</td>
                            <td style="padding-left:30px;" ><input class="form-control" id="medicalPrem" value="${sal.medicalPrem}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >HRA Interest + EMI :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="hraInterest" value="${sal.hraInterest}"></td>
                            <td>  &nbsp&nbsp </td>
                        </tr>
                    </table>
                    <br>
                    <table border="0" style="width:90%;">
                        <tr>
                            <td >Nature of Business :</td>
                            <td style="padding-left:20px;" ><input class="form-control" id="natureOfBuisness" style="width:300px;" value="${sal.natureOfBuisness}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td style="width:150px;">Salary Rs.Mly :</td>
                            <td>  &nbsp&nbsp&nbsp </td>
                            <td><input class="form-control" id="salaryRsMly" style="width:300px;" value="${sal.salaryRsMly}"></td>
                            <td>  &nbsp&nbsp </td>
                        </tr>
                    </table>
                    <br>
                    <table style="width:60%;" border="0">
                        <tr>
                            <td style="width:300px;">Company Name :</td>
                            <td>  &nbsp </td>
                            <td align="left" ><input class="form-control" id="companyName" style="width:500px;" value="${sal.companyName}"></td>					 
                        </tr>	
                    </table>
                    <br>
                    <table border="0" style="width:80%;">
                        <tr>
                            <td >Post :</td>
                            <td ><input class="form-control" id="post" value="${sal.post}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >Bank Acct No. :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="bnkAccNo" value="${sal.bnkAccNo}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td >Branch Name :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="branch" value="${sal.branch}"></td>
                        </tr>
                    </table>
                    <br>
                    <table border="0" style="width:70%;">
                        <tr>
                            <td >IFSC Code :</td>
                            <td style="padding-left:30px;" ><input class="form-control" id="ifscCode" value="${sal.ifscCode}"></td>					 
                            <td>  &nbsp&nbsp&nbsp&nbsp </td>
                            <td >MICR Code :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="micrCode" value="${sal.micrCode}" ></td>
                            <td>  &nbsp&nbsp </td>
                        </tr><td>  &nbsp&nbsp&nbsp&nbsp </td>

                    </table><br>
                    <table border="0" style="width:80%;">
                        <tr>
                            <td align="left">Additional Info :</td>
                            <td >(1)<input class="form-control" id="additionalInfo1" style="width:500px;" value="${sal.additionalInfo1}"></td>	
                        </tr>
                        <td>  &nbsp&nbsp </td>
                        <br>
                        <tr>
                            <td>&nbsp&nbsp</td>
                            <td>(2)<input class="form-control" id="additionalInfo2" style="width:500px;" value="${sal.additionalInfo2}"></td>	
                        </tr>
                    </table>

                    <br><br>

 <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${sal.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${sal.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${sal.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${sal.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${sal.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${sal.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${sal.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${sal.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${sal.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${two.submitDate}"/></td></tr>
                            </table><br>	 
                    
                    <div class="form-group">
                        <label>Photo-Id Proof:&nbsp</label>
                        <c:set var='chkSelected' value="${sal.panCard}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="panCard" checked value="${sal.panCard}">Pan Card
                            </label>
                        </c:if> 
                        <c:if test="${chkSelected =='No'}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="panCard"   value="${sal.panCard}">Pan Card
                            </label>
                        </c:if>
                        <c:if test="${chkSelected == null || chkSelected == ''}">

                            <label class="checkbox-inline" >
                                <input type="checkbox" id="panCard"  value="${sal.panCard}">Pan Card
                            </label>
                        </c:if>  

                    </div>
                    <br> 
                    <div class="form-group">

                        <label>Add Proof :&nbsp </label>



                        <c:set var='chkSelected' value="${sal.aadharCard}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="aadharCard" checked value="${sal.aadharCard}">Aadhar Card
                            </label>
                        </c:if> 
                        <c:if test="${chkSelected =='No'}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="aadharCard"  value="${sal.aadharCard}">Aadhar Card
                            </label>
                        </c:if>
                        <c:if test="${chkSelected == null || chkSelected == ''}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="aadharCard" value="${sal.aadharCard}" >Aadhar Card
                            </label></c:if>






                            &nbsp<c:set var='chkSelected' value="${sal.votingCard}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="votingCard" checked value="${sal.votingCard}">Voting-Id
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="votingCard"  value="${sal.votingCard}">Voting-Id
                            </label></c:if>
                        <c:if test="${chkSelected == null || chkSelected == ''}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="votingCard"  value="${sal.votingCard}">Voting-Id
                            </label></c:if>

                            &nbsp





                        <c:set var='chkSelected' value="${sal.passportValid}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="passportValid" checked value="${sal.passportValid}">Passport-Valid
                            </label>
                        </c:if> 
                        <c:if test="${chkSelected =='No'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="passportValid"  value="${sal.passportValid}">Passport-Valid
                            </label></c:if>
                        <c:if test="${chkSelected == null ||chkSelected == ''}">
                            <label class="checkbox-inline" >
                                <input type="checkbox" id="passportValid"  value="${sal.passportValid}">Passport-Valid
                            </label>
                        </c:if>



                        &nbsp <c:set var='chkSelected' value="${sal.drivingLicn}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="drivingLicn" checked value="${sal.drivingLicn}">Driving Licence-Valid
                            </label></c:if>
                        <c:if test="${chkSelected=='null' || chkSelected == ''}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="drivingLicn"  value="${sal.drivingLicn}">Driving Licence-Valid
                            </label></c:if>
                        <c:if test="${chkSelected=='No'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="drivingLicn"  value="${sal.drivingLicn}">Driving Licence-Valid
                            </label></c:if>



                        <c:set var='chkSelected' value="${sal.rationCard}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="rationCard" checked value="${sal.rationCard}">Ration Card
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="rationCard" value="${sal.rationCard}">Ration Card
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="rationCard" value="${sal.rationCard}">Ration Card
                            </label></c:if>




                        <c:set var='chkSelected' value="${sal.lightBill}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="lightBill" checked value="${sal.lightBill}">Light Bill - Rent Agree
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="lightBill" value="${sal.lightBill}">Light Bill - Rent Agree
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="lightBill" value="${sal.lightBill}">Light Bill - Rent Agree
                            </label></c:if>
                        </div>
                        <br>
                        <div class="form-group">
                            <label>Salary I.T Paper :&nbsp</label>
                        <c:set var='chkSelected' value="${sal.salaryItPaper}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="salaryItPaper" checked value="${sal.salaryItPaper}">Form No 16 Last Years
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="salaryItPaper" value="${sal.salaryItPaper}">Form No 16 Last Years
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="salaryItPaper" value="${sal.salaryItPaper}">Form No 16 Last Years
                            </label></c:if>






                            &nbsp   <c:set var='chkSelected' value="${sal.canclCheq}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="canclCheq" checked value="${sal.canclCheq}">Cancel Cheque
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="canclCheq" value="${sal.canclCheq}">Cancel Cheque
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="canclCheq" value="${sal.canclCheq}">Cancel Cheque
                            </label></c:if>



                            &nbsp  <c:set var='chkSelected' value="${sal.bankDetails}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="bankDetails" checked value="${sal.bankDetails}">Or Bank Details IFSC/MICR
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="bankDetails" value="${sal.bankDetails}">Or Bank Details IFSC/MICR
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="bankDetails" value="${sal.bankDetails}">Or Bank Details IFSC/MICR
                            </label></c:if>





                            &nbsp <c:set var='chkSelected' value="${sal.investmentCopy}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="investmentCopy" checked value="${sal.investmentCopy}">Investment Copy-Details
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="investmentCopy" value="${sal.investmentCopy}">Investment Copy-Details
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="investmentCopy" value="${sal.investmentCopy}">Investment Copy-Details
                            </label></c:if>




                            &nbsp <c:set var='chkSelected' value="${sal.loanEmi}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="loanEmi" checked value="${sal.loanEmi}">Loan EMI STS Last Year
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="loanEmi" value="${sal.loanEmi}">Loan EMI STS Last Year
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="loanEmi" value="${sal.loanEmi}">Loan EMI STS Last Year
                            </label></c:if>
                        </div><br><br>



                        <div class="form-group">
                            <label>Business I.T Paper :&nbsp </label>
                            &nbsp <c:set var='chkSelected' value="${sal.gumasta}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="gumasta" checked value="${sal.gumasta}">Gumasta/Shop Act Copy
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="gumasta" checked value="${sal.gumasta}">Gumasta/Shop Act Copy
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="gumasta" value="${sal.gumasta}">Gumasta/Shop Act Copy
                            </label></c:if>





                            &nbsp <c:set var='chkSelected' value="${sal.currentAcc}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="currentAcc" checked value="${sal.currentAcc}">Current Account STS- 1 Yrs
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="currentAcc" value="${sal.currentAcc}">Current Account STS- 1 Yrs
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="currentAcc" value="${sal.currentAcc}">Current Account STS- 1 Yrs
                            </label></c:if>




                            &nbsp <c:set var='chkSelected' value="${sal.investment}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="investment" checked value="${sal.investment}">Investment Copy- Details
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="investment" value="${sal.investment}">Investment Copy- Details
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="investment" value="${sal.investment}">Investment Copy- Details
                            </label></c:if>

                            
                            &nbsp <c:set var='chkSelected' value="${sal.loan}" />                                                      
                        <c:if test="${chkSelected == 'Yes'}">
                            <label class="checkbox-inline">
                                <input type="checkbox" id="Loan" checked value="${sal.loan}">Loan EMI STS Last Yrs
                            </label></c:if>
                        <c:if test="${chkSelected == 'No'}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="Loan" value="${sal.loan}">Loan EMI STS Last Yrs
                            </label></c:if>
                        <c:if test="${chkSelected == 'null' ||chkSelected == ''}">
                            &nbsp <label class="checkbox-inline">
                                <input type="checkbox" id="Loan" value="${sal.loan}">Loan EMI STS Last Yrs
                            </label></c:if>
                            

                    </div>

                    <br>
                    <br>
                    <br>
                    <table align="center">
                        <tr>
                            <td >
                                <div>
                                    <button type="button" class="btn btn-primary" onclick="addSalaryItDetails('edit')">Update</button>
                                </div>
                            </td>
                        </tr>
                    </table>





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

