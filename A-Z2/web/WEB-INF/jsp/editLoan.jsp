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
                            <i class="fa fa-dashboard"></i>  Datasheet For Any Loan File
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <br>

                    <div class="row">


                        <form role="form">
                         <input type="hidden" value="${id}" id="id">
                            <div class="form-group" id="formgroup">
                                <table>
                                    <tr>
                                 <td >Document Type :</td>
                                 <td ><input class="form-control" id="docType" value="${loan4.docType}"></td>	</tr>
                                </table><br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Form or Loan Type :</td>
                                        <td ><input class="form-control" id="oro" value="${loan4.loan}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Loan Amount Require :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="amt" value="${loan4.amt}"></td>
                                        <td>  &nbsp&nbsp </td>


                                    </tr>
                                </table>
                                <br>
                                <table>
                                    <tr>
                                        <td style="width:80px;">PAN No :</td>
                                        <td style="padding-left:30px;" ><input class="form-control" id="pann" value="${loan4.pann}" ></td>
                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                         <td style="width:80px;">Contact No :</td>
                                        <td style="padding-left:30px;" ><input class="form-control" id="contactNo" value="${loan4.contactNo}" ></td>

                                    </tr>
                                </table>
                                <br>
                                <table border="0" >
                                    <tr>
                                        <td >Full Name:</td>
                                        <td>  &nbsp </td>
                                        <td style="padding-left:30px;"><input class="form-control" style="width:500px;" id="custName" value="${loan4.custName}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Date Of Birth :</td>
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td><input class="form-control" id="Dob1" value="${loan4.dob1}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>

                                <table style="width:70%;">
                                    <tr>
                                        <td>Full Address :</td>

                                        <td style="padding-left:5px;width:35%";>
                                            <div class="form-group">
                                            <textarea class="form-control" rows="2" id="add3" value="">${loan4.address}</textarea>
                                            </div></td>					 
                                        <td >  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Nature of Bussiness:</td>
                                        <td>  &nbsp  </td>
                                        <td ><input class="form-control" id="buss" value="${loan4.buss}"></td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Salary Rs. Mly :</td>
                                        <td ><input class="form-control" id="sal2" value="${loan4.sal2}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Company Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="com" value="${loan4.com}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Post :</td>
                                        <td style="padding-left:30px;" ><input class="form-control" id="post1" value="${loan4.post1}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Experience Years :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="exp" value="${loan4.exp}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Qualification :</td>
                                        <td style="padding-left:20px;" ><input class="form-control" style="width:400px;" id="qual" value="${loan4.qual}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td style="width:150px;">Notes or Remark :</td>
                                        <td>  &nbsp&nbsp&nbsp </td>
                                        <td><input class="form-control" style="width:300px;" id="rem" value="${loan4.rem}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table style="width:38%;">
                                    <tr>
                                        <td style="width:100px;">Additional Info :</td>
                                        <td>&nbsp&nbsp</td>
                                        <td style="padding-left:5px;width:35%";>
                                            <div class="form-group">
                                            <textarea class="form-control" rows="2" style="width:300px;" id="info" value="">${loan4.info}</textarea>
                                            </div></td>	</tr>	
                                </table>
                                <br>
                                <table border="1" style="width:70%;">
                                    <tr >
                                        <th ><center>Decided Amt</center></th>
                                    <th ><center>Amount Paid</center></th>
                                    <th ><center>Balance Amt</center></th>
                                    <th ><center>Reference Name</center></th>
                                     <th ><center>Submit Date</center></th>
                                    </tr>
                                    <tr>
                                        <td><input class="form-control" id="decidedAmt" value="${loan4.decidedAmt}"></td>
                                        <td><input class="form-control" id="amtPaid" value="${loan4.amtPaid}"></td>
                                        <td><input class="form-control" id="balAmt" value="${loan4.balAmt}" onfocus="editcalculate()"></td>
                                        <td><input class="form-control" id="refName" value="${loan4.refName}"></td>
                                        <td><input class="form-control" id="submitDate" value="${loan4.submitDate}"></td>
                                    <tr>
                                </table>
                                <br>
                                <table width="90%" >
                                 <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${loan4.amtPaid1} "/></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${loan4.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${loan4.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${loan4.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${loan4.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${loan4.amtPaidDate3}"/></td></tr>
                                                </table>
                                                <br>
                                <div class="form-group">
                                    <label>Photo-Id Proof:&nbsp</label>
                                     <c:set var='chkSelected' value="${loan4.card}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="card" checked value="${loan4.card}">&nbsp Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="card"  value="${loan4.card}">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="card"  value="">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${loan4.voti}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="voti" checked value="${loan4.voti}">Voting-Id
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="voti"  value="${loan4.voti}">Voting-Id
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="voti"  value="">Voting-Id
                                    </label>
                                </c:if>
                                  
                                  <c:set var='chkSelected' value="${loan4.valid}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="valid" checked value="${loan4.valid}">Passport-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="valid"  value="${loan4.valid}">Passport-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="valid"  value="">Passport-Valid
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${loan4.lice}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="lice" checked value="${loan4.lice}">Driving Licence-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="lice"  value="${loan4.lice}">Driving Licence-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="lice"  value="">Driving Licence-Valid
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${loan4.card2}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="card2" checked value="${loan4.card2}">Pan Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="card2"  value="${loan4.card2}">Pan Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="card2"  value="">Pan Card
                                    </label>
                                </c:if>
                                    
                                    
                                    
                                    

                                </div>
                                <br> 
                                <div class="form-group">
                                    <label>Add Proof:&nbsp</label>
                                     <c:set var='chkSelected' value="${loan4.card1}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="card1" checked value="${loan4.card1}">&nbsp Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="card1"  value="${loan4.card1}">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="card1"  value="">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                
                                  <c:set var='chkSelected' value="${loan4.votin}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="votin" checked value="${loan4.votin}">Voting-Id
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="votin"  value="${loan4.votin}">Voting-Id
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="votin"  value="">Voting-Id
                                    </label>
                                </c:if>
                                   
                                 <c:set var='chkSelected' value="${loan4.rat}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="rat" checked value="${loan4.rat}">Ration Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="rat"  value="${loan4.rat}">Ration Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="rat"  value="">Ration Card
                                    </label>
                                </c:if>
                                   
                                  
                                     <c:set var='chkSelected' value="${loan4.bill}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="bill" checked value="${loan4.bill}">Light Bill
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="bill"  value="${loan4.bill}">Light Bill
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="bill"  value="">Light Bill
                                    </label>
                                </c:if>
                                   
                                  
                                      <c:set var='chkSelected' value="${loan4.resi}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="resi" checked value="${loan4.resi}">Society Resi Letter
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="resi"  value="${loan4.resi}">Society Resi Letter
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="resi"  value="">Society Resi Letter
                                    </label>
                                </c:if>
                                                               
                                
                                  <br>
                                  
                                  <c:set var='chkSelected' value="${loan4.govt}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="govt" checked value="${loan4.govt}">Govt Bank Passbook or Statement
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="govt"  value="${loan4.govt}">Govt Bank Passbook or Statement
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="govt"  value="">Govt Bank Passbook or Statement
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${loan4.lic}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="lic" checked value="${loan4.lic}">LIC Policy & Gas Book Additional
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="lic"  value="${loan4.lic}">LIC Policy & Gas Book Additional
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="lic"  value="">LIC Policy & Gas Book Additional
                                    </label>
                                </c:if>
                                  
                                    <c:set var='chkSelected' value="${loan4.notes}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="not" checked value="${loan4.notes}">If Renetd-Agreement Notory & Owner Light Bill + NOC Owner
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="not"  value="${loan4.notes}">If Renetd-Agreement Notory & Owner Light Bill + NOC Owner
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="not"  value="">If Renetd-Agreement Notory & Owner Light Bill + NOC Owner
                                    </label>
                                    </label>
                                </c:if>
                                   
                                </div>
                                <br>
                                <div class="form-group">
                                    <label>Income Proof:&nbsp</label>
                                    
                                     <c:set var='chkSelected' value="${loan4.form1}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="form1" checked value="${loan4.form1}">Form No 16 Last 3 yrs If Job
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="form1"  value="${loan4.form1}">Form No 16 Last 3 yrs If Job
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="form1"  value="">Form No 16 Last 3 yrs If Job
                                    </label>
                                    </label>
                                </c:if>
                                   
                                     <c:set var='chkSelected' value="${loan4.file}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="file" checked value="${loan4.file}">IT File last 3 yrs
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="file"  value="${loan4.file}">IT File last 3 yrs
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="file"  value="">IT File last 3 yrs
                                    </label>
                                       </c:if>
                                    
                                    <c:set var='chkSelected' value="${loan4.bank}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="bank" checked value="${loan4.bank}">Banking Statement 1yrs
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="bank"  value="${loan4.bank}">Banking Statement 1yrs
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="bank"  value="">Banking Statement 1yrs
                                    </label>
                                    </label>
                                </c:if>
                                    
                                     <c:set var='chkSelected' value="${loan4.invest}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="invest" checked value="${loan4.invest}">Investment Copy
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="invest"  value="${loan4.invest}">Investment Copy
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="invest"  value="">Investment Copy
                                    </label>
                                    </label>
                                </c:if>
                                  
                                     <c:set var='chkSelected' value="${loan4.pay}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        
                                        <input type="checkbox" id="pay" checked value="${loan4.pay}">Pay Slip-6 Month
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pay"  value="${loan4.pay}">Pay Slip-6 Month
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="pay"  value="">Pay Slip-6 Month
                                    </label>
                                    </label>
                                </c:if>
                                 
                                  <br>
                                   <c:set var='chkSelected' value="${loan4.exist}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" style="padding-left:11%;">
                                        
                                        <input type="checkbox" id="exist" checked value="${loan4.exist}">Existing  Loan Details
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="exist"  value="${loan4.exist}">Existing  Loan Details
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="exist"  value="">Existing  Loan Details
                                    </label>
                                    </label>
                                </c:if>
                                    
                                     <c:set var='chkSelected' value="${loan4.bussi}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" style="padding-left:11%;">
                                        
                                        <input type="checkbox" id="bussi" checked value="${loan4.bussi}">If Bussiness-Gumasta Copy
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="bussi"  value="${loan4.bussi}">If Bussiness-Gumasta Copy
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="bussi"  value="">If Bussiness-Gumasta Copy
                                    </label>
                                    </label>
                                </c:if>
                                    
                                   <c:set var='chkSelected' value="${loan4.curr}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" style="padding-left:11%;">
                                        
                                        <input type="checkbox" id="curr" checked value="${loan4.curr}">Current Account Statment-Last 1 yrs
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="curr"  value="${loan4.curr}">Current Account Statment-Last 1 yrs
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="curr"  value="">Current Account Statment-Last 1 yrs
                                    </label>
                                    </label>
                                </c:if>
                                    
                                     <c:set var='chkSelected' value="${loan4.proper}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" style="padding-left:11%;">
                                        
                                        <input type="checkbox" id="proper" checked value="${loan4.proper}">If Property Loan Then all Property Kit
                                    </label>
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="proper"  value="${loan4.proper}">If Property Loan Then all Property Kit
                                    </label>
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="proper"  value="">If Property Loan Then all Property Kit
                                    </label>
                                    </label>
                                </c:if>
                                  
                                   
                                </div>


                                <br>
                                <br>
                                <br>
                                <table align="center">
                                    <tr>
                                        <td >
                                            <div>
                                                <button type="button" class="btn btn-primary" onclick="addLoanFileDetails('edit')">Submit</button>
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

