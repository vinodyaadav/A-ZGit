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
                            <i class="fa fa-dashboard"></i> VIEW/EDIT DATASHEET FOR NEW L.I.C POLICY
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <div class="row">


                        <form role="form">
                            <input type="hidden" id="id" name="id" value="${id}"

                            <div class="form-group" >
                                <table border="0" style="width:100%;">
                                    <tr><td >FORM OR POLICY TYPE:-</td>
                                        <td ><input class="form-control" value="SELFPOLICY/CHILDREN PLAN/FAMILY PLAN">
                                        <td>  &nbsp&nbsp </td>
                                        <td >Document Type:</td>
                                        <td ><input class="form-control" id="docType" value="${lc.docType}" style="width:90%;"></td>
                                        <td>  &nbsp&nbsp </td>
                                        <td >Submission Date:</td>
                                        <td ><input class="form-control" id="submitDate" value="${lc.submitDate}" style="width:90%;"></td>
                                        <td>  &nbsp </td></tr>
                                    <br>
                                    <tr>

                                        <td >Customer Name:</td>

                                        <td ><input class="form-control" id="custName" value="${lc.custName}"  style="width:90%;"></td>					 
                                        <td>  &nbsp&nbsp </td>
                                        <td >Contact No.:</td>
                                        <td><input class="form-control" id="contactNo" value="${lc.contactNo} "style="width:90%;"></td>
                                        <td>  &nbsp&nbsp </td>
                                        <td >Father Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="fn" value="${lc.fn}" ></td>
                                    </tr>
                                </table>
                            </div>
                            <br>
                            <table  style="width:100%;">
                                <tr>
                                    <td>IF Mrs.Husband Name :</td>
                                    <td><input class="form-control" id="imhn" value="${lc.imhn}" style="width:80%;"></td>
                                    <td >DATE of Birth :</td>
                                    <td ><input class="form-control" id="dob" value="${lc.dob}" style="width:80%;"></td>
                                </tr>
                            </table>
                            <br>
                            <table style="width:100%;">
                                <tr>
                                    <td > Address  :</td>
                                    <td ><input class="form-control" id="address" value="${lc.address}"  style="width:80%;"></td>
                                    <td >State:</td>
                                    <td ><input class="form-control" id="st" value="${lc.st}" style="width:80%;"></td>
                                </tr>
                            </table>
                            <br>
                            <table >
                                <tr>
                                    <td>Plan Taken  :</td>
                                    <td ><input class="form-control" id="pt" value="${lc.pt}" style="width:80%;"></td>
                                    <td >
                                        <table border="0" style="width:90%;" class="col-lg-4" >
                                            <tr>
                                                <td >Visible mark :</td>
                                                <td ><input class="form-control" id="vm" value="${lc.vm}" style="width:100%;"></td>

                                            </tr>
                                        </table>
                                        <br><br>
                            </table>
                            <br>
                            <table style="width:90%;">
                                <tr>
                                    <td>Nomini Name :</td>

                                    <td style="padding-left:15px;width:25%;">
                                        <div class="form-group">
                                            <textarea class="form-control" id="none" value="" rows="2" >${lc.none}</textarea>
                                        </div></td>					 
                                    <td >  &nbsp&nbsp </td>
                                    <td >Height:</td>
                                    <td>  &nbsp  &nbsp </td>

                                    <td ><input class="form-control" id="ht" value="${lc.ht}" ></td>
                                    <td>  &nbsp&nbsp </td>
                                    <td >Weight :</td>
                                    <td style="padding-left:25px;" ><input class="form-control" id="wt" value="${lc.wt}"></td>
                                    <td>  &nbsp&nbsp </td>

                                </tr>
                            </table>
                    </div> 
                    <br>
                    <table border="0" style="width:85%;">
                        <tr>
                            <td >Id Mark :</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control"  id="idm" value="${lc.idm}"></td>					 
                            <td>  &nbsp&nbsp </td>
                            <td >Job Details :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="jod" value="${lc.jod}" ></td>
                            <td>  &nbsp&nbsp </td>
                            <td >Bank Acc.No :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="ban" value="${lc.ban}"></td>
                        </tr>
                    </table>
                    <br>
                    <table border="0" style="width:90%;">
                        <tr>
                            <td>Branch:</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control" id="bran" value="${lc.bran}"></td>					 
                            <td>  &nbsp&nbsp </td>
                            <td>Ifsc Code:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="ifsc" value="ifsc"></td>
                            <td>  &nbsp&nbsp </td>
                            <td>Bank Acc. No:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="bankacc" value="${lc.bankacc}"></td>
                        </tr>
                    </table>
                    <br>

                    <table border="0" style="width:90%;">
                        <tr>
                            <td>Old Policy no.:</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control" id="opno" value="${lc.opno}"></td>					 
                            <td>  &nbsp&nbsp </td>
                            <td>Old Policy No 2.:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="opno2" value="${lc.opno2}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td>Old Company Name:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="ocmpnm" value="${lc.ocmpnm}"></td>
                        </tr>
                        <td>Qty Family Member:</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="qyfmm" value="${lc.qyfmm}"></td>
                        </tr>
                    </table><br>
                    <LABEL> DOCUMENTS :</LABEL><br>
                    <table border="0" style="width:100%;">
                        <tr>
                            <td >father Age :</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control" id="frae" value="${lc.frae}"></td>					 
                            <td>  &nbsp&nbsp </td>
                            <td >Mother Age :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="mrae" value="${lc.mrae}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td >Brother Age :</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="brae" value="${lc.brae}" ></td>
                            <td >Sister Age :</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control" id="srae" value="${lc.srae}"></td>					 
                            <td>  &nbsp&nbsp </td><br>
                        <td >Husband/Wife Age :</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="hwae" value="${lc.hwae}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Child Age :</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="cdae" value="${lc.cdae}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        </tr>
                    </table>
                    <br>
<!--                    <table border="0" style="width:90%;">
                        <tr>
                            <td>Decided Prem Amt:</td>
                            <td>  &nbsp </td>
                            <td ><input class="form-control" id="decidedAmt" value="${lc.decidedAmt}"></td>					 
                            <td>  &nbsp&nbsp </td>
                            <td>Adv prem Amt:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="amtPaid"  value="${lc.amtPaid}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td>Bal Amt:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="balAmt" value="${lc.balAmt}"></td>
                            <td>  &nbsp&nbsp </td>
                            <td>Refrence Name:</td>
                            <td>  &nbsp </td>
                            <td><input class="form-control" id="rene" value="${lc.rene}"></td>

                        </tr>
                    </table>-->
 <table border="1" style="width:80%;">
                        <tr >
                            <th><center>Decided Amt</center></th>
                        <th ><center>Paid Amt</center></th>
                        <th ><center>Balance Amt</center></th>
                        <th ><center>Reference Name</center></th>
                        </tr>
                        <tr>
                            <td><input class="form-control" id="decidedAmt" value="${lc.decidedAmt}"></td>
                            <td><input class="form-control" id="amtPaid" value="${lc.amtPaid}" ></td>
                            <td><input class="form-control" id="balAmt" value="${lc.balAmt}" onfocus="editcalculate()"></td>
                            <td><input class="form-control" id="rene" value="${lc.rene}"></td>
                        <tr>
                    </table>
                        <br>
                        <table width="90%" >
                                 <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${lc.amtPaid1} "/></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${lc.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${lc.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${lc.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${lc.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${lc.amtPaidDate3}"/></td></tr>
                                                </table>
                    
                    <br>
                    <div class="form-group">
                        <LABEL> DOCUMENTS For Taking New Lic Policy :</LABEL><br>
                        <label>(A)DATE OF BIRTH PROOF & EDUCATINAL PROOF:<br>(Any 1 Zerox)&nbsp</label><br>
                        
                        <c:set var='chkSelected' value="${lc.brcr}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="brcr" checked value="${lc.brcr}">BIRTH CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="brcr"  value="${lc.brcr}">BIRTH CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="brcr"  value="">BIRTH CERTIFICATE
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${lc.sclvc}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="sclvc" checked value="${lc.sclvc}">SCHOOL LIVING CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="sclvc"  value="${lc.sclvc}">SCHOOL LIVING CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="sclvc"  value="">SCHOOL LIVING CERTIFICATE
                                    </label>
                                </c:if>
                        
                        <c:set var='chkSelected' value="${lc.thbc}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="thbc" checked value="${lc.thbc}">10th Board Certifi
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="thbc"  value="${lc.thbc}">10th Board Certifi
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="thbc"  value="">10th Board Certifi
                                    </label>
                                </c:if>
                                
                                
                                
                        
                        
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="thbd"> 12th Board Certifi
                        </label>
                                
                                <c:set var='chkSelected' value="${lc.gc}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="gc" checked value="${lc.gc}">Graduation Copy
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="gc"  value="${lc.gc}">Graduation Copy
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="gc"  value="">Graduation Copy
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${lc.ahecy}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ahecy" checked value="${lc.ahecy}">Any Higher Edu Copy
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ahecy"  value="${lc.ahecy}">Any Higher Edu Copy
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="ahecy"  value="">Any Higher Edu Copy
                                    </label>
                                </c:if>
                                
                       
                       <br></br>
                        <div class="form-group" >
                            <label>INCOME PROFF :</label><br></br>

                           <c:set var='chkSelected' value="${lc.frif}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="frif" checked value="${lc.frif}">Form 16 Or It File
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="frif"  value="${lc.frif}">Form 16 Or It File
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="frif"  value="">Form 16 Or It File
                                    </label>
                                </c:if>
                            
                            <c:set var='chkSelected' value="${lc.sysp}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="sysp" checked value="${lc.sysp}">Salary Slip 3 Month
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="sysp"  value="${lc.sysp}">Salary Slip 3 Month
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="sysp"  value="">Salary Slip 3 Month
                                    </label>
                                </c:if>
                           
                            
                        </div><br>
                        <div class="form-group" >
                            <label>Photo Id Proof:<br>(Any 1 Zerox)&nbsp</label><br>
                            
                            <c:set var='chkSelected' value="${lc.adcd}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="adcd" checked value="${lc.adcd}">Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="adcd"  value="${lc.adcd}">Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="adcd"  value="">Aadhar Card
                                    </label>
                                </c:if>
                            
                                
                                 <c:set var='chkSelected' value="${lc.pacr}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="pacr" checked value="${lc.pacr}">Pan Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pacr"  value="${lc.pacr}">Pan Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="pacr"  value="">Pan Card
                                    </label>
                                </c:if>
                            
                            <c:set var='chkSelected' value="${lc.drliva}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="drliva" checked value="${lc.drliva}">Driv Licn-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="drliva"  value="${lc.drliva}">Driv Licn-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="drliva"  value="">Driv Licn-Valid
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${lc.vgid}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="vgid" checked value="${lc.vgid}"> Voting Id
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="vgid"  value="${lc.vgid}"> Voting Id
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="vgid"  value=""> Voting Id
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${lc.pssprt}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="pssprt" checked value="${lc.pssprt}"> Passport
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pssprt"  value="${lc.pssprt}"> Passport
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="pssprt"  value=""> Passport
                                    </label>
                                </c:if>
                            
                           
                           <c:set var='chkSelected' value="${lc.cdid}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="cdid" checked value="${lc.cdid}"> Company Id + Letter
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="cdid"  value="${lc.cdid}"> Company Id + Letter
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="cdid"  value=""> Company Id + Letter
                                    </label>
                                </c:if>
                           
                            
                           
                        </div>
                        <br></br>
                        <div class="form-group"  >
                            <label>Add Proof :<br>(Any 1 Zerox)&nbsp</label><br>
                             <c:set var='chkSelected' value="${lc.rncd}" />                                                      
                                <c:if test="${chkSelected == 'Yes' || chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="rncd" checked value="${lc.rncd}">Ration Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="rncd"  value="lc.rncd}">Ration Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="rncd"  value="">Ration Card
                                    </label>
                                </c:if>

                            <c:set var='chkSelected' value="${lc.ltbl}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ltbl" checked value="${lc.ltbl}">Light Bill
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ltbl"  value="${lc.ltbl}">Light Bill
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="ltbl"  value="">Light Bill
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${lc.arca}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="arca" checked value="${lc.arca}">Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="arca"  value="${lc.arca}">Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="arca"  value="">Aadhar Card
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${lc.voigid}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="voigid" checked value="${lc.voigid}">Voting ID
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="voigid"  value="${lc.voigid}">Voting ID
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="voigid"  value="">Voting ID
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${lc.passp}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="passp" checked value="${lc.passp}">Passport
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="passp"  value="${lc.passp}">Passport
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="passp"  value="">Passport
                                    </label>
                                </c:if>
                            
                           
                            <c:set var='chkSelected' value="${lc.bpass}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="bpass" checked value="${lc.bpass}">Bank Passbook Or Stsment
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="bpass"  value="${lc.bpass}">Bank Passbook Or Stsment
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="bpass"  value="">Bank Passbook Or Stsment
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${lc.irano}" />                                                      
                                <c:if test="${chkSelected == 'yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="irano" checked value="${lc.irano}">If Reneted-Agreement Notory & Owner /Light Bill
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="irano"  value="${lc.irano}">If Reneted-Agreement Notory & Owner /Light Bill
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="irano"  value="">If Reneted-Agreement Notory & Owner /Light Bill
                                    </label>
                                </c:if>
                            
                            
                            
                            
                            

                        </div>





                        <br>
                        <br>
                        <table align="center">
                            <tr>
                                <td >
                                    <div>
                                        <button type="button" class="btn btn-primary" onclick="addlicdetails('edit')">update</button>
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
