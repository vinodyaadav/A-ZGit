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
                            <i class="fa fa-dashboard"></i>  Datasheet For Food Licence
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <br>

                    <div class="row">


                        <form role="form">
                         <input type="hidden" value="${id}" id="id">
                            <div class="form-group" >
                                 <table>
                                    <tr>
                                         <td style="width:160px;">Document Type :</td>
                                        <td style="padding-left:10px;" ><input class="form-control"  id="documentType" value="${food4.docType}"></td>
                                    </tr></table><br>
                                    <table>
                                <table border="0" style="width:90%;">
                                   
                                    <tr>
                                        <td style="width:100px;">Licence Type :</td>
                                        <td> &nbsp </td>
                                        <td style="width:300px;"> <fieldset id="group1"> 

                                                <input type="radio" value="" id="optionsRadios1">&nbsp;New Food Licence
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                                <input type="radio"  value="" id="optionsRadios1">&nbsp;Renewal Food

                                            </fieldset>
                                        </td>										
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Form Type :</td>
                                        <td>  &nbsp </td>
                                        <td style="width:400px;">
                                            <fieldset id="group2"> 

                                                <input type="radio" value="" id="optionsRadios1">&nbsp;Form A Registration
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                                <input type="radio"  value="" id="optionsRadios1">&nbsp;Form B Licence

                                            </fieldset>
                                        </td>		
                                        <td>  &nbsp&nbsp </td>


                                    </tr>
                                </table>
                                
                               
                                    <table>
                                    <tr>
                                         
                                        <td style="width:160px;">If Old Food Licence No :</td>
                                        <td style="padding-left:10px;" ><input class="form-control"  id="food" value="${food4.food}"></td>&nbsp&nbsp&nbsp
                                        <td style="padding-left:20px;">Renew Date :</td>
                                        <td style="padding-left:10px;" ><input class="form-control" id="renewdate" value="${food4.renewdate}"></td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" >
                                    <tr>
                                        <td >Firm or Company Name:</td>
                                        <td>  &nbsp </td>
                                        <td style="padding-left:10px;"><input class="form-control" style="width:400px;" id="custName" value="${food4.custName}"></td>					 
                                   <td>&nbsp;&nbsp;&nbsp;</td>
                                         <td style="width:100px;">Contact No :</td>
                                        <td style="padding-left:5px;" ><input class="form-control"  id="contactNo" value="${food4.contactNo}"></td>
                                    </tr></table><br>
                                 
                                <table style="width:70%;">
                                    <tr>
                                        <td>Full Address :</td>

                                        <td style="padding-left:5px;width:35%";>
                                            <div class="form-group">
                                            <textarea class="form-control" rows="2" id="address" value="">${food4.address}</textarea>
                                            </div></td>					 
                                        <td >  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Nature of Bussiness:</td>
                                        <td>  &nbsp  </td>
                                        <td ><input class="form-control" id="nature" value="${food4.nature}"></td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Employee Qty :</td>
                                        <td ><input class="form-control" id="empquantity" value="${food4.empquantity}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Propertior Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="prop" value="${food4.prop}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Partner Name :</td>
                                        <td style="padding-left:10px;" ><input class="form-control" id="partner" value="${food4.partner}"></td>					 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td >Water Supply Name :</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="water" value="${food4.water}"></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table border="0" style="width:70%;">
                                    <tr>
                                        <td >Product Name :</td>
                                        <td style="padding-left:20px;" ><input class="form-control"id="product" value="${food4.product}" ></td>				 
                                        <td>  &nbsp&nbsp&nbsp&nbsp </td>
                                        <td style="width:150px;">TurnOver Yearly Amt :</td>
                                        <td>  &nbsp&nbsp&nbsp </td>
                                        <td><input class="form-control" style="width:300px;" id="turnover" value="${food4.turnover}" ></td>
                                        <td>  &nbsp&nbsp </td>
                                    </tr>
                                </table>
                                <br>
                                <table style="width:70%;">
                                    <tr>
                                        <td style="width:195px;">If Renew Cases Then </td>

                                        <td><input class="form-control" style="width:250px;" id="ifr" value="${food4.ifr}"></td>&nbsp&nbsp
                                        <td style="width:150px;">What Changes</td>&nbsp&nbsp
                                        <td><input class="form-control" style="width:250px;" id="changes" value="${food4.changes}"></td>
                                    </tr>	
                                </table>
                                <br>
                                 <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${food4.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${food4.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${food4.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${food4.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${food4.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${food4.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${food4.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${food4.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${food4.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${two.submitDate}"/></td></tr>
                            </table><br>	 
                                
                                
                                
                                <div class="form-group">
                                    
                                    <label>Photo-Id Proof:&nbsp</label>
                                      <c:set var='chkSelected' value="${food4.adhr}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="adhr" checked value="${food4.adhr}">&nbsp Aadhar Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="adhr"  value="${food4.adhr}">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="adhr"  value="">&nbsp Aadhar Card
                                    </label>
                                </c:if>
                                
                                      <c:set var='chkSelected' value="${food4.vot}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="vot" checked value="${food4.vot}">Voting-Id
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="vot"  value="${food4.vot}">Voting-Id
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="vot"  value="">Voting-Id
                                    </label>
                                </c:if>
                                
                                     <c:set var='chkSelected' value="${food4.pass}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="pass" checked value="${food4.pass}">Passport-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pass"  value="${food4.pass}">Passport-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="pass"  value="">Passport-Valid
                                    </label>
                                </c:if>
                                   
                                   
                                 <c:set var='chkSelected' value="${food4.dri}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="dri" checked value="${food4.dri}">Driving Licence-Valid
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="dri"  value="${food4.dri}">Driving Licence-Valid
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="dri"  value="">Driving Licence-Valid
                                    </label>
                                </c:if>
                                
                                 <c:set var='chkSelected' value="${food4.pan}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="pan" checked value="${food4.pan}">Pan Card
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="pan"  value="${food4.pan}">Pan Card
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="pan"  value="">Pan Card
                                    </label>
                                </c:if>
                                  
                                  
                                 

                                </div>
                                <br> 
                                <div class="form-group">
                                    <label>Add Proof:&nbsp</label>
                                     <c:set var='chkSelected' value="${food4.light}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="light" checked value="${food4.light}">&nbsp Light Bill Self Name
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="light"  value="${food4.light}">&nbsp Light Bill Self Name
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="light"  value="">&nbsp Light Bill Self Name
                                    </label>
                                </c:if>
                                    
                                   
                                              <c:set var='chkSelected' value="${food4.rent}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="rent" checked value="${food4.rent}">If Renetd-Agreement & Notory & Owner Light Bill
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="rent"  value="${food4.rent}">If Renetd-Agreement & Notory & Owner Light Bill
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="rent"  value="">If Renetd-Agreement & Notory & Owner Light Bill
                                    </label>
                                </c:if>
                                
                                       <c:set var='chkSelected' value="${food4.let}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="let" checked value="${food4.let}">Letter Head + Stamp
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="let"  value="${food4.let}">Letter Head + Stamp
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="let"  value="">Letter Head + Stamp
                                    </label>
                                </c:if>
                                    
                                  <br><br>
                                    <label>Additional Document:</label>
                                    
                                      <c:set var='chkSelected' value="${food4.map}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="map" checked value="${food4.map}">Map
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No' || chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="map"  value="${food4.map}">Map
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="map"  value="">Map
                                    </label>
                                </c:if>
                                                                     
                                    
                                    
                                    <c:set var='chkSelected' value="${food4.gum}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="gum" checked value="${food4.gum}">Gumasta
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'|| chkSelected=='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="gum"  value="${food4.gum}">Gumasta
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="gum"  value="">Gumasta
                                    </label>
                                </c:if>
                            
                                
                                
                                
                                
                                
                                
                                <c:set var='chkSelected' value="${food4.noc}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="noc" checked value="${food4.noc}">Society NOC
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'||chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="noc"  value="${food4.noc}">Society NOC
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="noc"  value="">Society NOC
                                    </label>
                                </c:if>
                                
                                
                                   <c:set var='chkSelected' value="${food4.shop}" />                                                      
                                <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="shop" checked value="${food4.shop}">Photo of shop All
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'||chkSelected =='no'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="shop"  value="${food4.shop}">Photo of shop All
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="shop"  value="">Photo of shop All
                                    </label>
                                </c:if>
                                
                                
                                
                                
                                
                                
                                   
                                </div>
                                <table style="padding-bottom:100px;">
                                    <tr>
                                        <td>Charges-Both A and B Form:&nbsp </td>
                                        <td><input class="form-control" id="AB" value="${food4.AB}"></td>
                                    </tr> 
                                </table>
                                <br>
                                <table>
                                    <tr>
                                        <td>Charges Rs&nbsp&nbsp </td>
                                        <td><input class="form-control"  id="chargesa" value="${food4.chargesa}"><td>
                                        <td>&nbsp&nbsp For 5 yrs Form A Food Registration Fee 21 Working Days By Hand </td>

                                    </tr> 			  
                                </table>
                                <br>
                                <table>
                                    <tr>
                                        <td>Charges Rs&nbsp&nbsp </td>
                                        <td><input class="form-control"  id="chargesb" value="${food4.chargesb}"><td>
                                        <td>&nbsp&nbsp For 3 yrs Form B Food Licence Fee 21 Working Days By Hand </td>

                                    </tr> 			  
                                </table>
                                <br>
                                <table>
                                    <tr>
                                        <td>Charges Rs&nbsp&nbsp </td>
                                        <td><input class="form-control" id="chargesc" value="${food4.chargesc}"><td>
                                        <td>&nbsp&nbsp For 3 yrs Form B Food Manufacturer Fee 21 Working Days By Hand </td>

                                    </tr> 			  
                                </table>


                                <br>
                                <br>
                                <br>
                                <table align="center">
                                    <tr>
                                        <td >
                                            <div>
                                                <button type="button" class="btn btn-primary" onclick="getFoodLicenceDetails('edit')">Submit</button>
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


