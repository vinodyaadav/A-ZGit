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
                            <i class="fa fa-dashboard"></i> View/Edit  Application For Passport
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <div class="row">


                        <form role="form">
       <input type="hidden" name="id" id="id" value="${id}"/>                     

                            <div class="form-group" >
                                <table border="0" style="width:95%">
                                    <tr>
                                        <td >Document Type:</td>					 
                                        <td ><input class="form-control" id="docType" value="${pass2.docType}"></td>					 
                                        <td>  &nbsp&nbsp </td></tr>
                                    <td>  &nbsp&nbsp </td>
                                    <tr>
                                        <td >Passport Type :</td>
                                        <td style="padding-left:25px">
                                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="${pass2.optionsRadios1}" checked>New
                                            &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="${pass2.optionsRadios2}" >Reissue</tr>
                                    <td>&nbsp&nbsp</td>

                                    <tr>
                                        <td >Surname Name:</td>					 
                                        <td ><input class="form-control" id="custsrnm" value="${pass2.custsrnm}"></td>					 
                                        <td>  &nbsp&nbsp </td>
                                        <td >First Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="custName" value="${pass2.custName}"></td>
                                        <td>  &nbsp&nbsp </td>
                                        <td >Previous Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="custpsnm" value="${pass2.custpsnm}"></td>
                                    </tr>
                                </table>
                                <br>
                                <table  style="width:60%;">
                                    <tr>
                                        <td>Date of Birth :</td>
                                        <td style="padding-left:20px;" ><input class="form-control" style="width:105%;" id="dob" value="${pass2.dob}"></td>

                                        <td style="padding-left:40px">Gender :</td>
                                        <td style="padding-left:25px">
                                            <input type="radio" name="optionsRadios" id="optionsRadios3" value="${pass2.optionsRadios3}" checked>Male
                                            &nbsp&nbsp
                                            <input type="radio" name="optionsRadios" id="optionsRadios4"value="${pass2.optionsRadios4}" >Female
                                            &nbsp&nbsp
                                            <!--  <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Others -->

                                        </td>

                                    </tr>
                                </table>
                                <br>
                                <table style="width:60%;">
                                    <tr>
                                        <td >Place of Birth :</td>
                                        <td ><input class="form-control" style="width:80%;" id="pob" value="${pass2.tal}"></td>
                                        <td style="padding-left:10px;" >TAL:</td>
                                        <td style="padding-left:10px;" ><input class="form-control" style="width:80%;" id="tal" value="${pass2.tal}"></td>

                                    </tr>
                                </table>
                                <br>
                                <table style="width:70%;">

                                    <tr>
                                        <td >District  :</td>
                                        <td ><input class="form-control" style="width:80%;" id="dist" value="${pass2.dist}"></td>
                                        <td style="padding-left:5px;" >State:</td>
                                        <td style="padding-left:5px;" ><input class="form-control" style="width:80%;" id="ste" value="${pass2.ste}"></td>
                                    </tr>
                                </table>
                                <br>
                                <table >
                                    <tr>
                                        <td >Qualification  :</td>
                                        <td ><input class="form-control" style="width:80%;" id="quali" value="${pass2.quali}"></td>
                                        <td style="padding-left:5px;" >Marital Status:</td>
                                        <td style="padding-left:5px;" >
                                            <input type="radio" name="optionsRadios" id="optionsRadios5" value="${pass2.optionsRadios5}" checked>Married
                                            &nbsp&nbsp
                                            <input type="radio" name="optionsRadios" id="optionsRadios6" value="${pass2.optionsRadios6}" >Unmarried</td>

                                    </tr>
                                </table>
                            </div>
                            </table>
                            <table style="width:60%;" >
                                <tr>


                                    <td >Profession:</td>
                                    <td >
                                        <input type="radio" name="optionsRadios" id="optionsRadios7" value="${pass2.optionsRadios7}" checked>PVT
                                        &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios8" value="${pass2.optionsRadios8}">GOVT
                                        &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios9" value="${pass2.optionsRadios9}">BUSINESS
                                        &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios10" value="${pass2.optionsRadios10}">STYDEBT
                                        &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios11" value="${pass2.optionsRadios11}">HOUSEWIFE
                                        &nbsp&nbsp
                                        <!--  <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Others -->

                                    </td>

                                </tr>
                            </table>
                            <br>
                            <table border="0" style="width:30%;" class="col-lg-4" >
                                <tr>
                                    <td >Visible mark :</td>
                                    <td ><input class="form-control" style="width:100%;" id="vblmrk" value="${pass2.vblmrk}"></td>

                                </tr>
                            </table>
                            <br><br>
                            </table>
                            <br>
                            <table style="width:95%">
                                <tr>
                                    <td>Present Address :</td>

                                    <td style="padding-left:15px;width:25%;">
                                        <div class="form-group">
                                            <textarea class="form-control" rows="2" id="address" value="" >${pass2.address}</textarea>
                                        </div></td>					 
                                    <td >  &nbsp&nbsp </td>
                                    <td >Mobile no:</td>
                                    <td>  &nbsp  &nbsp </td>

                                    <td ><input class="form-control" id="contactNo" value="${pass2.contactNo}" ></td>
                                    <td>  &nbsp&nbsp </td>
                                    <td >Email Id :</td>
                                    <td style="padding-left:25px;" ><input class="form-control" id="email" value="${pass2.email}" ></td>
                                    <td>  &nbsp&nbsp </td>

                                </tr>
                            </table>

                            <br>
                            <table border="0" style="width:105%;" >
                                <tr>
                                    <td>Name of Police station :</td>
                                    <td>  &nbsp </td>
                                    <td ><input class="form-control" id="nmofp" value="${pass2.nmofp}"></td>					 
                                    <td>  &nbsp&nbsp </td>
                                    <td >Date of residing since (Complete date) :</td>
                                    <td>  &nbsp </td>
                                    <td><input class="form-control" id="dors" value="${pass2.dors}"></td>
                                    <td>  &nbsp&nbsp </td>
                                    <td >Phone no. :</td>
                                    <td>  &nbsp </td>
                                    <td><input class="form-control" id="phno" value="${pass2.phno}"></td>
                                </tr>
                            </table>
                            <br>
                            <table border="0" style="width:90%;">
                                <tr>
                                    <td>Wife/Husband Name:</td>
                                    <td>  &nbsp </td>
                                    <td ><input class="form-control" id="whnm" value="${pass2.whnm}"></td>					 
                                    <td>  &nbsp&nbsp </td>
                                    <td>Father Name:</td>
                                    <td>  &nbsp </td>
                                    <td><input class="form-control" id="fnm" value="${pass2.fnm}"></td>
                                    <td>  &nbsp&nbsp </td>
                                    <td>Mother Name:</td>
                                    <td>  &nbsp </td>
                                    <td><input class="form-control" id="mnm" value="${pass2.mnm}"></td>
                                </tr>
                            </table>
                            <br>
                            <table border="0" style="width:100%;" >
                                <tr>
                                    <td >Previous add if not resided at the previous add less than 1 yr :</td>


                                    <td width="40%">
                                        <textarea class="form-control" rows="2" id="pvadd" value="" >${pass2.pvadd}</textarea>
                                    </td><td>&nbsp&nbsp&nbsp&nbsp </td>	


                                    <td align="right">Pin :</td>
                                    <td><input class="form-control" id="pin" value="${pass2.pin}" ></td></tr>
                            </table>
                            <br>  
                            <br>
                            <br>
                            <table border="0" width="80%">
                                <tr><td> <b>PREVIOUS PASSPORT No. :-</b></td><td>&nbsp&nbsp</td></tr>
                                <tr><td align="center"> Date Of Issue :</td><td ><input class="form-control" id="doi" value="${pass2.doi}"></td><td>&nbsp&nbsp</td>
                                    <td colspan="3"> File No. :</td><td><input class="form-control" id="fno" value="${pass2.fno}"></td></tr><td>&nbsp&nbsp</td>
                                <tr><td align="center"> Place Of Issue :</td><td ><input class="form-control" id="poi" value="${pass2.poi}"></tr><td>&nbsp&nbsp</td>
                                <tr><td align="center"> Date Of Expiry :</td><td ><input class="form-control" id="doe" value="${pass2.doe}"></tr>
                            </table><br>

                            <label>TWO RESPONSIBLE PERSON NAME AND ADDRESS :-</label>
                            <table border="0" width="90%">

                                <tr>

                                    <td align="center"><b>(1)</b> Full Name :</td><td><input class="form-control" id="flnm1" value="${pass2.flnm1}"/></td>
                                </tr><td>&nbsp&nbsp</td>
                                <tr>
                                    <td align="center">Address :</td><td><input class="form-control" id="add1" value="${pass2.add1}"/></td></tr></table>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div align="center" >Mobile No. :<input class="form-group" id="mob1" value="${pass2.mob1}"/></div>

                            <table border="0" width="90%">
                                <tr> 
                                    <td align="center"><b>(2)</b> Full Name :</td>
                                    <td><input class="form-control" id="flnm2" value="${pass2.flnm2}"/></td>
                                </tr><td>&nbsp&nbsp</td>
                                <tr>
                                    <td align="center">Address :</td><td><input class="form-control" id="add2" value="${pass2.add2}"/></td></tr>
                            </table>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div align="center" >Mobile No. :<input class="form-group" id="mob2" value="${pass2.mob2}"/></div><BR>
                            <table border="0" style="width:50%;">
                                <tr>
                                    <td ><B>ANY POLICE CASE PENDING IN COURT :</B> </td>
                                    <td >
                                        <input type="radio" name="optionsRadios" id="optionsRadios12" value="${pass2.optionsRadios12}" checked>YES
                                        &nbsp&nbsp
                                        <input type="radio" name="optionsRadios" id="optionsRadios13" value="${pass2.optionsRadios13}">NO

                                    </td></tr></table>			



                            <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt" value="${pass2.decidedAmt}"/></td><td>Date :</td><td><input class="form-group" id="date1" value="${pass2.date1}"/></td></tr>
                                <tr><td>Advance Amount :</td><td><input class="form-group" id="aamt" value="${pass2.aamt}"/></td><td>Date :</td><td><input class="form-group" id="date2" value="${pass2.date2}"/></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt" value="${pass2.balAmt}"   onfocus="editcalculate()"/></td><td>Date :</td><td><input class="form-group" id="date3" value="${pass2.date3}"/></td></tr>
                                <tr><td>Amount Paid :</td><td><input class="form-group" id="amtPaid" value="${pass2.amtPaid}"/></td><td>Date :</td><td><input class="form-group" id="date4" value="${pass2.date4}"/></td></tr>
                                
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${pass2.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${pass2.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${pass2.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${pass2.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${pass2.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${pass2.amtPaidDate3}"/></td></tr>
                                
                                <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate" value=""/></td></tr>
                            </table><br>

                            <table >
                                <tr>
                                    <td>
                                        <b>DOCUMENTS :</b><br><br></tr>
                                <tr><td>
                                        <label>DATE OF BIRTH/PLACE OF BIRTH-PROOF:&nbsp</label>
                                        
                                         <c:set var='chkSelected' value="${pass2.birthCert}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="birthCert" checked value="${pass2.birthCert}">BIRTH CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="birthCert"  value="${pass2.birthCert}">BIRTH CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="birthCert" > BIRTH CERTIFICATE</td>
                                        </label></c:if>
                                    
                                        <c:set var='chkSelected' value="${pass2.schoolCert}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="schoolCert" checked value="${pass2.schoolCert}">SCHOOL LEAVING CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="schoolCert"  value="${pass2.schoolCert}">SCHOOL LEAVING CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="schoolCert"> SCHOOL LEAVING CERTIFICATE
                                        </label></c:if></td></tr></table></div><br>

                    <div class="form-group">
                        <label>EDUCATIONAL PROOF:&nbsp</label>
                        
                        <c:set var='chkSelected' value="${pass2.ssc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ssc" checked value="${pass2.ssc}">SSC CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ssc"  value="${pass2.ssc}">SSC CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="ssc" > SSC CERTIFICATE
                                        </label>
                                </c:if>
                        

                       <c:set var='chkSelected' value="${pass2.hsc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="hsc" checked value="${pass2.hsc}">HSC CERTIFICATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="hsc"  value="${pass2.hsc}">HSC CERTIFICATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="hsc" > HSC CERTIFICATE
                                        </label>
                                </c:if>
                            
                        <c:set var='chkSelected' value="${pass2.ahem}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ahem" checked value="${pass2.ahem}">ANY HIGHER EDUCATIONAL MARKSHEET
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ahem"  value="${pass2.ahem}">ANY HIGHER EDUCATIONAL MARKSHEET
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="ahem" > ANY HIGHER EDUCATIONAL MARKSHEET
                                        </label>
                                </c:if>
                            
                            
                        <c:set var='chkSelected' value="${pass2.gc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="gc" checked value="${pass2.gc}">GRADUATE COPY
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="gc"  value="${pass2.gc}">GRADUATE COPY
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="gc" > GRADUATE COPY
                                        </label></c:if>
                            
                        </tr>
                    </div>
                    <div class="form-group">
                        <label>AUTHORISED ID PROOF :&nbsp</label>
                        
                         <c:set var='chkSelected' value="${pass2.pc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="pc" checked value="${pass2.pc}">PAN CARD
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pc"  value="${pass2.pc}">PAN CARD
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="pc" > PAN CARD
                                        </label></c:if>
                        
                        
                         <c:set var='chkSelected' value="${pass2.vc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="vc" checked value="${pass2.vc}">VOTING CARD
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="vc"  value="${pass2.vc}">VOTING CARD
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="vc" > VOTING CARD
                                        </label></c:if> 
                                
                        
                       
                         <c:set var='chkSelected' value="${pass2.dl}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="dl" checked value="${pass2.dl}">DRIVING LICENCE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="dl"  value="${pass2.dl}">DRIVING LICENCE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="dl" > DRIVING LICENCE
                                        </label></c:if> 
                            
                                
                        
                         <c:set var='chkSelected' value="${pass2.ci}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ci" checked value="${pass2.ci}">COMPANY ID + LETTER WITH MENTION ADDRESS
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ci"  value="${pass2.ci}">COMPANY ID + LETTER WITH MENTION ADDRESS
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="ci" >COMPANY ID + LETTER WITH MENTION ADDRESS
                                        </label></c:if> 
                            

                    </div>

                    <div class="form-group">


                        <label>ADDRESS PROOF(ANY 4-XEROX ):&nbsp</label>
                        
                        
                         <c:set var='chkSelected' value="${pass2.rc}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="rc" checked value="${pass2.rc}">RATION CARD
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="rc"  value="${pass2.rc}">RATION CARD
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="rc" >RATION CARD
                                        </label></c:if> 
                            
                        
                        
                         <c:set var='chkSelected' value="${pass2.lbo}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="lbo" checked value="${pass2.lbo}">LIGHT BILL OLD 1 YR/NEW CURRENT MONTH
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="lbo"  value="${pass2.lbo}">LIGHT BILL OLD 1 YR/NEW CURRENT MONTH
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="lbo" >LIGHT BILL OLD 1 YR/NEW CURRENT MONTH
                                        </label></c:if> 
                            
                                
                        
                         <c:set var='chkSelected' value="${pass2.sl}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="sl" checked value="${pass2.sl}">SOCIETY LETTER -WITH RESIDENT DATE
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="sl"  value="${pass2.sl}">SOCIETY LETTER -WITH RESIDENT DATE
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="sl" >SOCIETY LETTER -WITH RESIDENT DATE
                                        </label></c:if>
                                
                            
                            
                        <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        
                         <c:set var='chkSelected' value="${pass2.gbs}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="gbs" checked value="${pass2.gbs}">GOVT BANK STATEMENT OR PASSBOOK-1 YR OLD
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="gbs"  value="${pass2.gbs}">GOVT BANK STATEMENT OR PASSBOOK-1 YR OLD
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="gbs" >GOVT BANK STATEMENT OR PASSBOOK-1 YR OLD
                                        </label></c:if> 
                           
                        <c:set var='chkSelected' value="${pass2.ac}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="ac" checked value="${pass2.ac}">AADHAR CARD
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="ac"  value="${pass2.ac}">AADHAR CARD
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="ac" >AADHAR CARD
                                        </label></c:if>
                           
                        
                        <c:set var='chkSelected' value="${pass2.vi}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="vi" checked value="${pass2.vi}">VOTING ID
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="vi"  value="${pass2.vi}">VOTING ID
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="vi" >VOTING ID
                                        </label></c:if>
                            
                        <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                       
                        <c:set var='chkSelected' value="${pass2.cl}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="cl" checked value="${pass2.cl}">CORPORATER LETTER WITH RESIDENT DATE/YEAR
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="cl"  value="${pass2.cl}">CORPORATER LETTER WITH RESIDENT DATE/YEAR
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="cl" >CORPORATER LETTER WITH RESIDENT DATE/YEAR
                                        </label></c:if>
                            
                                
                         <c:set var='chkSelected' value="${pass2.gb}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="gb" checked value="${pass2.gb}">GAS BOOK
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="gb"  value="${pass2.gb}">GAS BOOK
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="gb" >GAS BOOK
                                        </label></c:if>
                            
                        <c:set var='chkSelected' value="${pass2.lp}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="lp" checked value="${pass2.lp}">LIC POLICY
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="lp"  value="${pass2.lp}">LIC POLICY
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="lp" >LIC POLICY
                                        </label></c:if>
                           
                                
                        <label class="checkbox-inline" style="padding-left:55px">
                             <c:set var='chkSelected' value="${pass2.iran}" />                                                      
                                <c:if test="${chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="iran" checked value="${pass2.iran}">IF RENTED-AGREEMENT NOTORY & OWNER LIGHT BILL + NOC OWNER
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="iran"  value="${pass2.iran}">IF RENTED-AGREEMENT NOTORY & OWNER LIGHT BILL + NOC OWNER
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                        <label class="checkbox-inline">
                                            <input type="checkbox" id="iran" >IF RENTED-AGREEMENT NOTORY & OWNER LIGHT BILL + NOC OWNER
                                        </label></c:if>
                            


                    </div>
                    <br>
                    <br>
                    <table align="center">
                        <tr>
                            <td >
                                <div>
                                    <button type="button" class="btn btn-primary" onclick="addPassport2Details('edit')">Update</button>
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
