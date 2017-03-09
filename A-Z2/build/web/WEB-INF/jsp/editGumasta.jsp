<%-- 
    Document   : editGumasta
    Created on : Jan 24, 2017, 12:15:50 PM
    Author     : RAKHI
--%>

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
            <i class="fa fa-dashboard"></i> View/Edit  Application For Gumasta
        </li>
    </ol>
    <!-- /.row -->
    <br>
    <br>

    <div class="row">


        <form role="form">
            <input type="hidden" name="id" id="id" value="${id}">
            <div class="form-group" >
                <table border="0" style="width:70%;">
                    <tr>
                        <td >Form Or Licence Type :</td>
                        <td >
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>New Gumasta
                            &nbsp&nbsp
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Renewal Gumasta

                        </td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >If Old Shop Act Licence No :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="licenceNo"></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table>
                <br>
                <table width="70%">
                    <tr>
                        <td>Renew Date :</td>
                        <td style="padding-left:10px;" ><input class="form-control" id="renewDate" value="${gums.renewDate}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td>Firm or Company Name :</td>
                        <td style="padding-left:5px;"style="width:105%;"  ><input class="form-control" id="custName" value="${gums.custName}" ></td>
                        <td>  &nbsp&nbsp </td>
                        <td>Contact No :</td>
                        <td style="padding-left:5px;"style="width:105%;"  ><input class="form-control" id="contactNo" value="${gums.contactNo}"></td>



                    </tr>
                </table>

                <br>
                <table  style="width:80%;">
                    <tr>
                        <td>Full Address :</td>

                        <td style="width:35%;">
                            <div class="form-group">
                                <textarea class="form-control" rows="2" id="address" value="">${gums.address}</textarea>
                            </div></td>					 
                        <td >  &nbsp&nbsp </td>
                        <td ALIGN="center" >Nature Of Buisness:</td>

                        <td ><input class="form-control" id="natureOfBuisness" value="${gums.natureOfBuisness}"></td>
                    </tr> <td>  &nbsp&nbsp </td>
                    <tr>
                        <td>Employee QTY :</td>
                        <td><input class="form-control" id="employeeQty" value="${gums.employeeQty}"></td>
                        <td>&nbsp&nbsp</td>
                        <td  ALIGN="center">PROPERTIOR NAME :</td>
                        <td><input class="form-control" id="propertiorName" value="${gums.propertiorName}" ></td>
                    </tr></table>
                <table width="50%" >
                    <tr>
                        <td align="left">IF RENEW THEN WHAT CHANGES :</td>
                        <td >1)<input class="form-control" id="renew1" value="${gums.renew1}"></td>
                    </tr>
                    </tr>

                    <tr>
                        <td>&nbsp&nbsp</td>
                        <td>2)<input class="form-control" id="renew2" value="${gums.renew2}"></td>
                    </tr>

                    <tr>
                        <td>&nbsp&nbsp</td>
                        <td>3)<input class="form-control" id="renew3" value="${gums.renew3}"></td>
                    </tr>
                </table><br>
<!--                <table border="1" style="width:80%;">
                    <tr >
                        <th><center>Decided Amt</center></th>
                    <th ><center>Paid Amt</center></th>
                    <th ><center>Balance Amt</center></th>
                    <th ><center>Reference Name</center></th>
                    <th ><center>Submit Date</center></th>
                    </tr>
                    <tr>
                        <td><input class="form-control" id="decidedAmt" value="${gums.decidedAmt}"></td>
                        <td><input class="form-control" id="amtPaid" value="${gums.amtPaid}"></td>
                        <td><input class="form-control" id="balAmt" value="${gums.balAmt}"></td>
                        <td><input class="form-control" id="refAmt" value="${gums.refAmt}"></td>
                        <td><input class="form-control" id="submitDate" value="${gums.submitDate}"></td>
                    <tr>
                </table><br>
                <table>	
                    <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${gums.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${gums.amtPaidDate1}"/></td></tr>
                    <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${gums.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${gums.amtPaidDate2}"/></td></tr>
                    <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${gums.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${gums.amtPaidDate3}"/></td></tr>
                </table>-->

<table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${gums.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${gums.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${gums.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${gums.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${gums.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${gums.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${gums.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${gums.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${gums.amtPaidDate3}"/></td></tr>
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${gums.submitDate}"/></td></tr>
                            </table><br>
                <br>
                <div class="form-group">
                    <label>Photo-Id Proof:&nbsp</label>
                    <c:set var='chkSelected' value="${gums.adharCard}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="adharCard" checked value="${gums.adharCard}">Addhar Card
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="adharCard"value="${gums.adharCard}">Addhar Card
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="adharCard"value="${gums.adharCard}">Addhar Card
                        </label></c:if>

                    <c:set var='chkSelected' value="${gums.votingCard}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="votingCard" checked value="${gums.votingCard}">Voting-Id
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="votingCard"value="${gums.votingCard}">Voting-Id
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="votingCard"value="${gums.votingCard}">Voting-Id
                        </label></c:if>

                    <c:set var='chkSelected' value="${gums.passport}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="passport" checked value="${gums.passport}">Passport-Valid
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="passport"value="${gums.passport}">Passport-Valid
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="passport"value="${gums.passport}">Passport-Valid
                        </label></c:if>

                    <c:set var='chkSelected' value="${gums.drivingLicence}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="drivingLicence" checked value="${gums.drivingLicence}">Passport-Valid
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="drivingLicence"value="${gums.drivingLicence}">Passport-Valid
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="drivingLicence"value="${gums.drivingLicence}">Passport-Valid
                        </label></c:if>



                    <c:set var='chkSelected' value="${gums.pancard}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="pancard" checked value="${gums.pancard}">Pan Card
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="pancard" checked value="${gums.pancard}">Pan Card
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="pancard" checked value="${gums.pancard}">Pan Card
                        </label></c:if>


                    </div>
                    <br> 
                    <div class="form-group">
                        <label>Add Proof:&nbsp </label>
                    <c:set var='chkSelected' value="${gums.lightBill}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline" style="padding-left:9%;">
                            <input type="checkbox" id="lightBill" checked value="${gums.lightBill}">Light Bill Self Name
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline" style="padding-left:9%;">
                            <input type="checkbox" id="lightBill"value="${gums.lightBill}">Light Bill Self Name
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" style="padding-left:9%;">
                            <input type="checkbox" id="lightBill"value="${gums.lightBill}">Light Bill Self Name
                        </label></c:if>


                    <c:set var='chkSelected' value="${gums.rentAgreement}" />                                                      
                    <c:if test="${chkSelected == 'Yes'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="rentAgreement" checked value="${gums.rentAgreement}">If Rented-Agreement Notory & Owner Light Bill
                        </label></c:if>
                    <c:if test="${chkSelected == 'No'}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="rentAgreement"value="${gums.rentAgreement}">If Rented-Agreement Notory & Owner Light Bill
                        </label></c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline">
                            <input type="checkbox" id="rentAgreement"value="${gums.rentAgreement}">If Rented-Agreement Notory & Owner Light Bill
                        </label></c:if>



                </div>

                <br>





                <br>
                <table align="center">
                    <tr>
                        <td >
                            <div>
                                <button type="button" class="btn btn-primary" onclick="addGumastaDetails('edit')">Update</button>
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

