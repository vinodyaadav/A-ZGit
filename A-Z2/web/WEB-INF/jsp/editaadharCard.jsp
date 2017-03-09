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
                                <i class="fa fa-dashboard"></i>  Datasheet for Aadhar Card 
                            </li>
                        </ol>
                <!-- /.row -->
				<br>
				<br>
				
				 <div class="row">
                    

                        <form role="form">
  <input type="hidden" value="${id}" id="id">
                            <div class="form-group" id="formgroup" >
						<table border="0" style="width:70%;">
					  <tr>
					  <td > Form or Card Type - </td>
					 <td>  &nbsp </td>
                                         <td style="width:75%" ><select name="Form or Card Type">
                                                 <option>New in Aadhar</option>
                                                 <option>Updation in Aadhar</option>
                                             </select>
					  </tr>	
                                          <td>  &nbsp&nbsp </td>
					  <tr><td >Document Type :</td>
					  <td>  &nbsp </td>
                                          <td><input class="form-control" id="docType"  value="${aadhar.docType}"></td></tr><br>
					  <td>  &nbsp&nbsp </td>
					    <td>  &nbsp&nbsp </td>
					  <tr><td >If Old,Aadhar No :</td>
					  <td>  &nbsp </td>
					  <td><input class="form-control" id="oldAadharNo"   value="${aadhar.oldAadharNo}"></td></tr><br>
					  <td>  &nbsp&nbsp </td>
					  <tr><td >Self Name :</td>
					  <td>  &nbsp </td>
					  <td><input class="form-control" id="custName"     value="${aadhar.custName}"></td></tr><br>
					  <td>  &nbsp&nbsp </td>
					  <tr><td >Mob No:</td>
					  <td>  &nbsp </td>
					 <td><input class="form-control" id="contactNo"      value="${aadhar.contactNo}"></td>
					  </tr>
					   <td>  &nbsp&nbsp </td>
					   <tr><td >Father Name</td>
					  <td>  &nbsp </td>
					 
					  <td><input class="form-control" id="fatherName"   value="${aadhar.fatherName}"></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					   <tr><td >Surname</td>
					  <td>  &nbsp </td>
					 
                                          <td><input class="form-control" id="surName"   value=""  ></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					   <tr><td >If Mrs. Husband Name</td>
					  <td>  &nbsp </td>
					  <td><input class="form-control" id="husbandName"    value="${aadhar.husbandName}"></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					   <tr><td >Date Of Birth</td>
					  <td>  &nbsp </td>
					 
					  <td><input class="form-control" id="dob"    value="${aadhar.dob}"></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					<tr><td >ADD FULL:</td>
					  <td>  &nbsp </td>
					 
					  <td><input class="form-control" id="address"value="${aadhar.address} "></td>
					  </tr>
					  						
                                        <tr><td >What Changes Note<br>Update Info:-</td>
					  <td>  &nbsp </td>
					 <td > 
					  <input class="form-control" id="changesNote"     value="${aadhar.changesNote}">
					    &nbsp&nbsp 
					 <input class="form-control" id="changesNote1"      value="${aadhar.changesNote1}">
					 &nbsp&nbsp 
					 
					 <br>
					  </td>
					  </tr>
					   <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${aadhar.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${aadhar.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${aadhar.balAmt}"     onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${aadhar.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${aadhar.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${aadhar.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${aadhar.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${aadhar.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${aadhar.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${aadhar.submitDate}"/></td></tr>
                            </table><br>	 
					   <br>
					   <label>DOCUMENT FOR AADHAR CARD OR UPDATE AADHAR CARD :-</label>
					   <table width="65%" ><tr><br></br>
					   <label>(A)DATE OF BIRTH PROOF<br>(Any 1 Zerox) :-</label>
						<br></br>
						<form action="">
							
                                                    
                    <c:set var='chkSelected' value="${aadhar.birthCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="birthCert" checked value="${aadhar.birthCert}">BIRTH CERTIFICATE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="birthCert"  value="${aadhar.birthCert}">BIRTH CERTIFICATE
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="birthCert"  value="${aadhar.birthCert}">BIRTH CERTIFICATE
                        </label>
                    </c:if>

                                                    
                           
                    
                                                    
                    <c:set var='chkSelected' value="${aadhar.boardcert10}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert10" checked value="${aadhar.boardcert10}">B10th BOARD CERTIFICATE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert10"  value="${aadhar.boardcert10}">10th BOARD CERTIFICATE
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert10"  value="${aadhar.boardcert10}">10th BOARD CERTIFICATE
                        </label>
                    </c:if>

                    
                    
                     <c:set var='chkSelected' value="${aadhar.boardcert12}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert12" checked value="${aadhar.boardcert12}">12th BOARD CERTIFICATE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert12"  value="${aadhar.boardcert12}">12th BOARD CERTIFICATE
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="boardcert12"  value="${aadhar.boardcert12}">12th BOARD CERTIFICATE
                        </label>
                    </c:if>
				
                    
                    
                     
                     <c:set var='chkSelected' value="${aadhar.graduateCopy}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="graduateCopy" checked value="${aadhar.graduateCopy}">GRADUATE COPY
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="graduateCopy"  value="${aadhar.graduateCopy}">GRADUATE COPY
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="graduateCopy"  value="${aadhar.graduateCopy}">1GRADUATE COPY
                        </label>
                    </c:if>
			
                    
                    
                    
                       
                     <c:set var='chkSelected' value="${aadhar.higheredu}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="higheredu" checked value="${aadhar.higheredu}">ANY HIGHER EDU COPY
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="higheredu"  value="${aadhar.higheredu}">ANY HIGHER EDU COPY
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="higheredu"  value="${aadhar.higheredu}">ANY HIGHER EDU COPY
                        </label>
                    </c:if>
			
                    
                    
						</form>
						</td></tr><br></br>
						<tr><label>SCHOOL CHILD PAPER</label><br></br>
						<form action="">
                                                    
                                                    
                                                       
                     <c:set var='chkSelected' value="${aadhar.schoolcert}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="schoolcert" checked value="${aadhar.schoolcert}">SCHOOL BONIFIED CERTIFICATE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="schoolcert"  value="${aadhar.schoolcert}">SCHOOL BONIFIED CERTIFICATE
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="schoolcert"  value="${aadhar.schoolcert}">SCHOOL BONIFIED CERTIFICATE
                        </label>
                    </c:if>
			
                    
                    
                                                    
                                                    
						
						</form>
						</td></tr><br></br>
					<tr><label>(B)PHOTO ID PROOF<br>ONLY ONE :-</label><br></br>
                                       
					  <form action="">
                                              
                                                                                 
                     <c:set var='chkSelected' value="${aadhar.pancard}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard" checked value="${aadhar.pancard}">PAN CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard"  value="${aadhar.pancard}">PAN CARD
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="pancard"  value="${aadhar.pancard}">PAN CARD
                        </label>
                    </c:if>
                                              
                                  <c:set var='chkSelected' value="${aadhar.passport}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport" checked value="${aadhar.passport}">PASSPORT-VALID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport"  value="${aadhar.passport}">PASSPORT-VALID
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passport"  value="${aadhar.passport}">PASSPORT-VALID
                        </label>
                    </c:if>
                    
                                   <c:set var='chkSelected' value="${aadhar.drivingLicence}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence" checked value="${aadhar.drivingLicence}">DRIV LICN-VALID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence"  value="${aadhar.drivingLicence}">DRIV LICN-VALID
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicence"  value="${aadhar.drivingLicence}">DRIV LICN-VALID
                        </label>
                    </c:if>
                    
                    
                    
                    
                     <c:set var='chkSelected' value="${aadhar.voteId}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId" checked value="${aadhar.voteId}">VOTING ID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId"  value="${aadhar.voteId}">VOTING ID
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId"  value="${aadhar.voteId}">VOTING ID
                        </label>
                    </c:if>
                    
                    
        	
						<label class="radio-inline">
						  <input type="checkbox" id="RestLetter">SOCIETY RESI LETTER
						</label><br></br>
                                                
                                                 <c:set var='chkSelected' value="${aadhar.govtbankpass}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="govtbankpass" checked value="${aadhar.govtbankpass}">GOVT BANK PASSBOOK PR STSMENT
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="govtbankpass"  value="${aadhar.govtbankpass}">GOVT BANK PASSBOOK PR STSMENT
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="govtbankpass"  value="${aadhar.govtbankpass}">GOVT BANK PASSBOOK PR STSMENT
                        </label>
                    </c:if>
						
                    
                    
                    
                                                 <c:set var='chkSelected' value="${aadhar.licpolicy}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="licpolicy" checked value="${aadhar.licpolicy}">LIC POLICY & GAS BOOK ADDITIONAL
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="licpolicy"  value="${aadhar.licpolicy}">LIC POLICY & GAS BOOK ADDITIONAL
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="licpolicy"  value="${aadhar.licpolicy}">LIC POLICY & GAS BOOK ADDITIONAL
                        </label>
                    </c:if>
                    
                    
                     <c:set var='chkSelected' value="${aadhar.renetedAgree}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="renetedAgree" checked value="${aadhar.renetedAgree}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="renetedAgree"  value="${aadhar.renetedAgree}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="renetedAgree"  value="${aadhar.renetedAgree}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if>
                    
                    
                    
                    
                   
						</form>
						</td></tr><br></br>
						
					<tr><label>(C)ADD PROOF :-<br>(ANY 1 ZEROX)</label><br></br>
					<form action="">
                                            
                                <c:set var='chkSelected' value="${aadhar.rationcard}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rationcard" checked value="${aadhar.rationcard}">RATION CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rationcard"  value="${aadhar.rationcard}">RATION CARD
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rationcard"  value="${aadhar.rationcard}">RATION CARD
                        </label>
                    </c:if>             
                                            
                                            
                         
                    
                    
                    
                    
                    
						<label class="radio-inline">
						  <input type="checkbox" id="Votingid">VOTING ID
						</label>
                    
                              
                    
                    
                    
						<label class="radio-inline">
						<input type="checkbox" id="Passportadd">PASSPORT-VALID
						</label>
                    
                    
                               
                    
                    
                                                <label class="radio-inline">
						  <input type="checkbox" id="Drivinglic">DRIV LICN-VOTING
						</label>
                    
                    
                    
                    
						<label class="radio-inline">
						  <input type="checkbox" id="PassbookBank">BANK PASSBOOK
						</label>
                    
                    
                      <c:set var='chkSelected' value="${aadhar.lightbill}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="lightbill" checked value="${aadhar.lightbill}">LIGHT BILL SELF NAME
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="lightbill"  value="${aadhar.lightbill}">LIGHT BILL SELF NAME
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="lightbill"  value="${aadhar.lightbill}">LIGHT BILL SELF NAME
                        </label>
                    </c:if>             
                                
                    
                    
                    
                    
                    
                    
                    
                    
                    <br></br>
                    
                    
						
                    
                        <c:set var='chkSelected' value="${aadhar.bankStat}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankStat" checked value="${aadhar.bankStat}">BANK STATEMENT -CURRENT DATE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankStat"  value="${aadhar.bankStat}">BANK STATEMENT -CURRENT DATE
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankStat"  value="${aadhar.bankStat}">BANK STATEMENT -CURRENT DATE
                        </label>
                    </c:if>             
                               
                    
                   
                        <c:set var='chkSelected' value="${aadhar.rentAgreement}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement" checked value="${aadhar.rentAgreement}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement"  value="${aadhar.rentAgreement}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="rentAgreement"  value="${aadhar.rentAgreement}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if>   
                    
                    
						
					 </form></td></tr><tr><td>
					 <br><br> <br></br>
		<tr><label>(E)CHARGES Rs.250 BY HAND DELIVERY RECEIPT <br>2 WORKING DAYS </label><br></br>
                         </td></tr><tr><br>
					  <br></br>
							<table align="center">
							<tr>
							<td >
							<div>
							<button type="button" class="btn btn-primary" onclick="addAdharCard('edit')">Update</button>
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