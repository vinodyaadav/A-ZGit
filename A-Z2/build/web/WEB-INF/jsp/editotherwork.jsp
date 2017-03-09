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
                                <i class="fa fa-dashboard"></i> VIEW/EDIT Datasheet for other works 
                            </li>
                        </ol>
                <!-- /.row -->
				<br>
				<br>
				
				 <div class="row">
                    

                        <form role="form">
                             <input type="hidden" id="id" name="id" value="${id}"

                            <div class="form-group" >
                                
<table border="0" style="width:90%;">
					  <tr>
					  <td > Submision Date </td>
					 <td>  &nbsp </td>
                                         <td style="width:75%" ><input class="form-control" id="subDate" value="${ot.submitDate}"></td><br>
                                          </tr><td>  &nbsp&nbsp </td>
                                          <tr>
					  <td > Form Type </td>
					 <td>  &nbsp </td>
                                         <td style="width:75%" >
                                             <input class="form-control" id="FormType" ></td>
					  </tr>
					    <td>  &nbsp&nbsp </td>
					  <tr><td >Work Name</td>
					  <td>  &nbsp </td>
                                          <td>
                                              <input class="form-control" id="WorkName" ></td></tr><br>
					  <td>  &nbsp&nbsp </td>
					  <br></br>
					  <td>  &nbsp&nbsp </td>
					  <tr><td >Customer Name:</td>
					  <td>  &nbsp </td>
					 <td><input class="form-control" id="custName" value="${ot.custName}"></td>
					  </tr>
                                          <td>  &nbsp&nbsp </td>
					  <tr><td >Contact No.:</td>
					  <td>  &nbsp </td>
					 <td><input class="form-control" id="contactNo" value="${ot.contactNo}"></td>
					  </tr>
					   <td>  &nbsp&nbsp </td>
					   <tr><td >DATE OF BIRTH</td>
					  <td>  &nbsp </td>
					 
                                          <td><input class="form-control" id="dob" value="${ot.dob}"></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					<tr><td >ADD FULL:</td>
					  <td>  &nbsp </td>
					 
                                          <td><input class="form-control" id="address" value="${ot.address}" ></td>
					  </tr>
					  <td>  &nbsp&nbsp </td>
					  <td>  &nbsp </td>
					 
					  
						
						<tr><td >NOTES OF REMARK:-<br>ADDITIONAL INFO</td>
					  <td>  &nbsp </td>
                                          <td > 
                                             <input class="form-control" id="NOTESOFREMARK" value="">
					    &nbsp&nbsp </td></tr>
		</table>
                                          <table border="1" style="width:70%;">
                                    <tr >
                                    <th ><center>Decided Amt</center></th>
                                    <th ><center>Amount Paid</center></th>
                                    <th ><center>Balance Amt</center></th>
                                    <th ><center>Reference Name</center></th>
                                    
                                    </tr>
                                    <tr>
                                        <td><input class="form-control" id="decidedAmt" value="${ot.decidedAmt}"></td>
                                        <td><input class="form-control" id="amtPaid" value="${ot.amtPaid}"></td>
                                        <td><input class="form-control" id="balAmt" value="${ot.balAmt}" onfocus="editcalculate()"></td>
                                        <td><input class="form-control" id="REFRENCENAME" value="${ot.REFRENCENAME}"></td>
                                      
                                    <tr>
                                </table>
                                          <br>
                                            <table width="90%" >
                                 <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${ot.amtPaid1} "/></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${ot.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${ot.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${ot.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${ot.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${ot.amtPaidDate3}"/></td></tr>
                                                </table>
					   <br>
					    <label>DOCUMENT FOR GUMASTA OR RENEW :-</label>
					   <table width="65%" ><tr><br></br>
					   <label>(A)PHOTO ID :-</label>
						<br></br>
						<form action="" >
                                                    
                                                    
                                                    
                                                     <c:set var='chkSelected' value="${ot.isPANCARD}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PANCARD" checked value="${ot.isPANCARD}">PAN CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">PAN CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PANCARD"  value="${ot.isPANCARD}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">PAN CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PANCARD"  value="${ot.isPANCARD}">
                        </label>
                    </c:if>

                    
							
                    
                                                     <c:set var='chkSelected' value="${ot.isPASSPORTVALID}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PASSPORTVALID" checked value="${ot.isPASSPORTVALID}">PASSPORT-VALID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">PASSPORT-VALID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PASSPORTVALID"  value="${ot.isPASSPORTVALID}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">PASSPORT-VALID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="PASSPORTVALID"  value="${ot.isPASSPORTVALID}">
                        </label>
                    </c:if>
                    
                    
                    
                                                     <c:set var='chkSelected' value="${ot.isDRIVLICNVALID}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="DRIVLICNVALID" checked value="${ot.isDRIVLICNVALID}">DRIV LICN-VALID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">DRIV LICN-VALID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="DRIVLICNVALID"  value="${ot.isDRIVLICNVALID}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">DRIV LICN-VALID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="DRIVLICNVALID"  value="${ot.isDRIVLICNVALID}">
                        </label>
                    </c:if>
                    
                    
	
                    
                  
                                                     <c:set var='chkSelected' value="${ot.isVOTINGID}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="VOTINGID" checked value="${ot.isVOTINGID}">VOTING ID
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">VOTING ID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="VOTINGID"  value="${ot.isVOTINGID}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">VOTING ID
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="VOTINGID"  value="${ot.isVOTINGID}">
                        </label>
                    </c:if>
                    
                    
                                                  
                    
                    
                                     
                                                     <c:set var='chkSelected' value="${ot.isAADHARCARD}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD" checked value="${ot.isAADHARCARD}">AADHAR CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">AADHAR CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD"  value="${ot.isAADHARCARD}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">AADHAR CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD"  value="${ot.isAADHARCARD}">
                        </label>
                    </c:if>
                    
                    
							
						</form>
						</td></tr><br></br>
					<tr><label>(B)ADD PROOF :-</label><br></br>
                                       
					  <form action="">
                                              
                                              
                                              
                                              
                                                     
						
                                            
                    
                                                                     
                                                     <c:set var='chkSelected' value="${ot.isRATIONCARD}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RATIONCARD" checked value="${ot.isRATIONCARD}">RATION CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">RATION CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RATIONCARD"  value="${ot.isRATIONCARD}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">RATION CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RATIONCARD"  value="${ot.isRATIONCARD}">
                        </label>
                    </c:if>
						
                                              
                                              
                                                     <c:set var='chkSelected' value="${ot.isLIGHTBILL}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="LIGHTBILL" checked value="${ot.isLIGHTBILL}">LIGHTBILL
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">LIGHTBILL
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="LIGHTBILL"  value="${ot.isLIGHTBILL}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">LIGHTBILL
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="LIGHTBILL"  value="${ot.isLIGHTBILL}">
                        </label>
                    </c:if>
                                              
                                          
                    
                    
                    
                    
                                                     <c:set var='chkSelected' value="${ot.isAADHARCARD1}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD1" checked value="${ot.isAADHARCARD1}">AADHAR CARD
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">AADHAR CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD1"  value="${ot.isAADHARCARD1}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">AADHAR CARD
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="AADHARCARD1"  value="${ot.isAADHARCARD1}">
                        </label>
                    </c:if>
                    
                    
                                              
                                              
                   <label class="radio-inline">
                                                    <input type="checkbox" name="optradio" id="VOTINGID" value="votingid">VOTING ID
						</label>
						<label class="radio-inline">
                                                    <input type="checkbox" name="optradio" id="SOCIETYRESILETTER" value="societyresiletter">SOCIETY RESI LETTER
						</label><br></br>
                                                                 
                    <c:set var='chkSelected' value="${ot.isGOVTBANKPASSBOOK}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="GOVTBANKPASSBOOK" checked value="${ot.isGOVTBANKPASSBOOK}">GOVT BANK PASSBOOK PR STSMENT
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">GOVT BANK PASSBOOK PR STSMENT
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="GOVTBANKPASSBOOK"  value="${ot.isGOVTBANKPASSBOOK}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">GOVT BANK PASSBOOK PR STSMENT
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="GOVTBANKPASSBOOK"  value="${ot.isGOVTBANKPASSBOOK}">
                        </label>
                            </c:if>                     
                                                
                                                
                    
                    <label class="radio-inline">
                    <input type="checkbox" name="optradio" id="LICPOLICY" value="licpolicy">LIC POLICY & GAS BOOK ADDITIONAL
		    </label>
                    
                                                                  
                    <c:set var='chkSelected' value="${ot.isRENETDAGREEMENT}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RENETDAGREEMENT" checked value="${ot.isRENETDAGREEMENT}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RENETDAGREEMENT"  value="${ot.isRENETDAGREEMENT}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">IF RENETD-AGREEMENT NOTORY<br>&OWNER LIGHT BILL + NOC OWNER
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="RENETDAGREEMENT"  value="${ot.isRENETDAGREEMENT}">
                        </label>
                            </c:if>         
                    
                    
                    
                    
                    
                    
					  </form></td></tr><tr><td>
					  
					<tr><label>(C)OTHER WORK PAPER REQUIREMENT :-</label><br></br>
                                       
					  <form>
                                              <textarea rows="4" cols="120" id="OTHERWORK"> ${ot.OTHERWORK}</textarea>
					  </form></td></tr><tr><br>
					  <br></br>
							<table align="center">
							<tr>
							<td >
							<div>
                                                            <button type="button" class="btn btn-primary" onclick="otherworkdetails('edit')" >Update</button>
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

				