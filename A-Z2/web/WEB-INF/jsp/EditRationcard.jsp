
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
                            <i class="fa fa-dashboard"></i>  Application For Ration Card Or Updation
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <br>

                    <div class="row">


                        <form role="form">
<input type="hidden" value="${id}" id="id">
                            <div class="form-group" >
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Form Type  :</td>
                                        <td >
                                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>New Ration Card
                                            
                                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>Old Ration Card

                                        </td>	 
                                           </tr>
                                </table><br>
                                <table border="0" style="width:75%;">
                                    <tr>
                                <td >Document Type:</td>
                                       
                                        <td><input class="form-control" id="docType"  value="${rat.docType}"></td>				 
                                         <td>  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Updation Changes:</td>
                                        
                                        <td><input class="form-control" id="UpadationChange"></td>
                                        <td>  &nbsp&nbsp </td>
                                        </tr>
                                </table>
                                <br>
                                <table border="0" style="width:75%;">
                                    <tr>
                                        <td >Customer Name  :</td>
                                        <td>  &nbsp&nbsp  </td>
                                        <td ><input class="form-control" id="custName"    value="${rat.custName}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Date Of Birth :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="Dob"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>

                                <br>
                                <table style="width:75%;">
                                    <tr>
                                        <td>Full Address :</td>

                                        <td style="padding-left:5px;width:35%;">


                                            <div class="form-group">
                                            <textarea class="form-control" id="address" rows="2" >${rat.address}</textarea>
                                            </div></td>					 
                                        <td >  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Contact no:</td>
                                        <td ><input class="form-control" id="contactNo"   value="${rat.contactNo}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                    <tr>
                                    <tr>
                                    </tr>
                                </table><br>
                                <table border="0" style="width:75%;">
                                    <tr>
                                        <td >Nature of Business:</td>
                                        <td>  &nbsp </td>
                                        <td ><input class="form-control" id="natureBusiness"    value="${rat.natureBusiness}"> </td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp   </td>
                                        <td >Yearly Income Amt:</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="ylyAmt"   value="${rat.ylyAmt}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table><br>
                                <table border="0" style="width:75%;">
                                    <tr>
                                        <td >Gas Name:</td>
                                        <td>  &nbsp </td>
                                        <td ><input class="form-control" id="gasName"    value="${rat.gasName}"> </td>					 
                                        <td>  &nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Gas Giver Name:</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="gasGiverName"   value="${rat.gasGiverName}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table><br><br>
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
                                            <input class="form-control" id="memFirstName1"   value="${rat.memFirstName1}">
                                        </td>
                                        <td>&nbsp </td>

                                        <td>
                                            <input class="form-control"id="memFirstName2"   value="${rat.memFirstName2}">
                                        </td>

                                    </tr>
                                    <td>&nbsp &nbsp </td>
                                    <tr align="center">
                                        <td>
                                            2)Second Member Name
                                        </td>

                                        <td>&nbsp&nbsp</td>

                                        <td>
                                            <input class="form-control"id="secMemName1"   value="${rat.secMemName1}">
                                        </td>

                                        <td>&nbsp </td>

                                        <td>
                                            <input class="form-control"id="secMemName2"   value="${rat.secMemName2}">
                                        </td>
                                    </tr>
                                    <td>&nbsp &nbsp </td>
                                    <tr align="center">
                                        <td>
                                            3)Third Member Name :
                                        </td>

                                        <td>  &nbsp  &nbsp </td>

                                        <td>
                                            <input class="form-control"id="ThirdMemName1">
                                        </td>

                                        <td>&nbsp</td>
                                        <td>

                                            <input class="form-control"id="ThirdMemName2">
                                        </td>
                                    </tr> 
                                    <td>&nbsp&nbsp</td>
                                    <tr align="center">
                                        <td>
                                            4)Fourth Member Name :
                                        </td>

                                        <td>  &nbsp  &nbsp </td>

                                        <td>
                                            <input class="form-control"id="fourthMemName1"   value="${rat.fourthMemName1}">
                                        </td>

                                        <td>&nbsp </td>

                                        <td>
                                            <input class="form-control"id="fourthMemName2"   value="${rat.fourthMemName2}">
                                        </td>
                                    </tr>
                                    <td>&nbsp &nbsp </td>
                                    <tr>
                                        <td align="center">
                                            5)Fifth Member Name :
                                        </td>

                                        <td>&nbsp&nbsp</td>

                                        <td>
                                            <input class="form-control"id="fifthMemName1"    value="${rat.fifthMemName1}">
                                        </td>

                                        <td>&nbsp </td>

                                        <td>
                                            <input class="form-control"id="fifthMemName2"      value="${rat.fifthMemName2}">
                                        </td>
                                    </tr>
                                </table>
                                <br>
                                <br>
                                <br>
                                 <br><br><br><br>
                                <br><br><br><br>
                                 <div class="form-group">
                                    <label>Photo-Id Proof(Only 1):&nbsp</label>
                                    
                                    
                               
                                    
                                    
                                    <input type="checkbox"id="Pancard">Pan Card
                                    </label>
                                    
                                    
                                    
                                    
                                    
                                    
                                          
                                 <c:set var='chkSelected' value="${rat.votingId}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="votingId" checked value="${rat.votingId}">Voting-Id
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="votingId"  value="${rat.votingId}">Voting-Id
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="votingId"  value="${rat.votingId}">Voting-Id
                                    </label>
                                </c:if>
                                    
                                
                                
                                
                                
                                       <c:set var='chkSelected' value="${rat.passportValid}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="passportValid" checked value="${rat.passportValid}">Passport-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="passportValid"  value="${rat.passportValid}">Passport-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="passportValid"  value="${rat.passportValid}">Passport-Valid
                                    </label>
                                </c:if>
                                    
                                    
                                   
                                
                                          
                                
                                
                                
                                
                                
                                    <label class="checkbox-inline">
                                        <input type="checkbox"id="DrivingLicn">Driving Licence-Valid
                                    </label>
                                
                                
                                
                                
                                
                                 <c:set var='chkSelected' value="${rat.adharCard}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard" checked value="${rat.adharCard}">Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard"  value="${rat.adharCard}">Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard"  value="${rat.adharCard}">Aadhar Card
                                    </label>
                                </c:if>
                                
                                
                                
 
                                </div>
                                <br> 
                                <div class="form-group">
                                    <label>Add Proof(Any 1 xerox):&nbsp</label>
                                    
                                    
                                               
                                 <c:set var='chkSelected' value="${rat.lightBill}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="lightBill" checked value="${rat.lightBill}">Light Bill
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="lightBill"  value="${rat.lightBill}">Light Bill
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="lightBill"  value="${rat.lightBill}">Light Bill
                                    </label>
                                </c:if>
                                
                                
                                
                                
                                
                                      
                                           
                                 <c:set var='chkSelected' value="${rat.adharCard1}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard1" checked value="${rat.adharCard1}">Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard1"  value="${rat.adharCard1}">Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="adharCard1"  value="${rat.adharCard1}">Aadhar Card
                                    </label>
                                </c:if>
                                
                                
                                
                                
                                                 
                                 <c:set var='chkSelected' value="${rat.voteId}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="voteId" checked value="${rat.voteId}">Voting ID
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="voteId"  value="${rat.voteId}">Voting ID
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="voteId"  value="${rat.voteId}">Voting ID
                                    </label>
                                </c:if>
                                 
                                
                                
                                
                                            
                                 <c:set var='chkSelected' value="${rat.socResiLet}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="socResiLet" checked value="${rat.socResiLet}">Society Resi Letter
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="socResiLet"  value="${rat.socResiLet}">Society Resi Letter
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="socResiLet"  value="${rat.socResiLet}">Society Resi Letter
                                    </label>
                                </c:if>
                                
                                
                                
                                
                               
                                
                                
                                 
                                    <label class="checkbox-inline" >
                                        <input type="checkbox"id="govtBankPass"> GOVT Bank Passbook Or Statement
                                    </label>
        
                            <br>
                            
                            
                            
                            
                                  <c:set var='chkSelected' value="${rat.rentedNotary}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="rentedNotary" checked value="${rat.rentedNotary}">If Rented-Agreement Notory
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="rentedNotary"  value="${rat.rentedNotary}">If Rented-Agreement Notory
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="rentedNotary"  value="${rat.rentedNotary}">If Rented-Agreement Notory
                                    </label>
                                </c:if>
                            
                            
                            
                            
                                
                                  <c:set var='chkSelected' value="${rat.ownrLightBillNoc}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ownrLightBillNoc" checked value="${rat.ownrLightBillNoc}"> Owner Light Bill+Noc Owner
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ownrLightBillNoc"  value="${rat.ownrLightBillNoc}"> Owner Light Bill+Noc Owner
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="ownrLightBillNoc"  value="${rat.ownrLightBillNoc}"> Owner Light Bill+Noc Owner
                                    </label>
                                </c:if>
                                 
                                
                                
                                
                               

                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Income Proof for White or Orange Ration Card:&nbsp</label>
                                    
                                      
                                  <c:set var='chkSelected' value="${rat.form16lstThreeyrs}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="form16lstThreeyrs" checked value="${rat.form16lstThreeyrs}"> Form No 16 last 3 yrs if job
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="form16lstThreeyrs"  value="${rat.form16lstThreeyrs}"> Form No 16 last 3 yrs if job
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="form16lstThreeyrs"  value="${rat.form16lstThreeyrs}"> Form No 16 last 3 yrs if job
                                    </label>
                                </c:if>
                                    
                                
                                    
                               
                                
                                
                                    <label class="checkbox-inline">
                                        <input type="checkbox"id="ItFile">I T File last yrs 3 yrs
                                    </label>
                                
                                
                                   <label class="checkbox-inline">
                                        <input type="checkbox"id="gasBook">Gas Book
                                    </label>
                                     
                                  <c:set var='chkSelected' value="${rat.talathiCert}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="talathiCert" checked value="${rat.talathiCert}"> Talathi Certificate
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="talathiCert"  value="${rat.talathiCert}">Talathi Certificate
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="talathiCert"  value="${rat.talathiCert}"> Talathi Certificate
                                    </label>
                                </c:if>
                              

                                </div>


                                <br>
                                 
                            <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${rat.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${rat.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${rat.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${rat.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${rat.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${rat.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${rat.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${rat.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${rat.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${rat.submitDate}"/></td></tr>
                            </table><br>
                                <br><br><br>
                       
      
                                <table align="center">
                                    <tr>
                                        <td >
                                            <div>
                                                <button type="button" class="btn btn-primary" onclick="getRationcardDetail('edit')">Update</button>
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

