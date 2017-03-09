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
            <i class="fa fa-dashboard"></i>  TW BIKE INSURANCE OR RENEWAL INSURANCE
        </li>
    </ol>
    <!-- /.row -->
    <br>
    <br>
    <div class="row">


        <form role="form">
            <input type="hidden" value="${id}" id="id">
            <div class="form-group" >
                <table border="0" style="width:90%;">
                    <tr>
                        <td >FOrm Type :</td>
                        <td >
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>NEW INSURANCE
                            &nbsp&nbsp
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">RENEWAL
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">THIRD PARTY TW INSURANCE

                        </td>					 
                        <td>  &nbsp&nbsp </td>
                        <td > DOCUMENT TYPE:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control"id="docType"    value="${two.docType}"></td>	



                    </tr>
                </table>
                <br>

                <table border="0" style="width:90%;">
                    <tr>
                        <td > CUSTOMER NAME:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control"id="custName"   value="${two.custName}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >FATHER NAME:</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control"id="middleName"   value="${two.middleName}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td >SURNAME:</td>
                        <td>  &nbsp </td>

                        <td><input class="form-control"id="lastName"    value="${two.lastName}"></td>
                    </tr>
                </table>
                <br>



                <table style="width:70%;">
                    <tr>
                        <td>FULL ADDRESS :</td>

                        <td style="padding-left:5px;width:35%;">
                            <div class="form-group">
                                <textarea class="form-control" rows="2"id="address" >${two.address}</textarea>
                            </div></td>					 
                        <td >  &nbsp&nbsp </td>
                        <td >CONTACT NO:</td>
                        <td>  &nbsp  &nbsp </td>

                        <td ><input class="form-control"id="contactNo"   value="${two.contactNo}" ></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table>



                <br>
                <table border="0" style="width:90%;">
                    <tr>
                        <td >LAND MARK ADD NEAR:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control"id="landmarkaddnear"    value="${two.landmarkaddnear}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >VEHICLE NUMBER :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control"id="vehicleno"    value="${two.vehicleno}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td >WHICH BIKE DETAIL :</td>
                        <td>  &nbsp </td>

                        <td><input class="form-control"id="whichbikedetail"   value="${two.whichbikedetail}"></td>
                    </tr>
                </table>


                <table border="0" style="width:90%;">
                    <tr>
                        <td >MODEL YEAR:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="modelyear"    value="${two.modelyear}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >LAST YEAR POLICY DETAILS :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control"id="lstyrpolicydetail"     value="${two.lstyrpolicydetail}"></td>
                        <td>  &nbsp&nbsp </td>
                        <td >BIKE  COLOUR :</td>
                        <td>  &nbsp </td>
                    <br>
                    <td><input class="form-control"id="bikecolour"    value="${two.bikecolour}"></td>

                    </tr>
                </table>
                <br>
                <table border="0" style="width:40%;">

                    <td>LOAN HYPO NAME :</td>
                    <td style="padding-left:10px;" ><input class="form-control" style="width:100%;"id="loanhyponame"     value="${two.loanhyponame}"></td>

                    </tr>
                </table>
                <br>					  
               <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${two.decidedAmt}"/></td><td></td></tr>
                                <tr><td>Amount Paid:</td><td><input class="form-group" id="amtPaid" value="${two.amtPaid}"/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${two.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${two.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${two.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${two.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${two.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${two.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${two.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${two.submitDate}"/></td></tr>
                            </table><br>	 
                <br>

                <div class="form-group">


                    <c:set var='chkSelected' value="${two.photobike}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="photobike" checked value="${two.photobike}">IF BREAKING INSURANCE 5 PHOTO BIKE
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">IF BREAKING INSURANCE 5 PHOTO BIKE
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="photobike"  value="${two.photobike}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">IF BREAKING INSURANCE 5 PHOTO BIKE
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="photobike"  value="${two.photobike}">
                        </label>
                    </c:if>




                </div>
                <br> <div class="form-group">
                    <label>B)OLD RC BOOK XEROX :&nbsp</label>        
                    <c:set var='chkSelected' value="${two.oldrcbookxrx}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldrcbookxrx" checked value="${two.oldrcbookxrx}">1)OLD RC BOOK XEROX
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">1)OLD RC BOOK XEROX
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldrcbookxrx"  value="${two.oldrcbookxrx}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">1)OLD RC BOOK XEROX
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldrcbookxrx"  value="${two.oldrcbookxrx}">
                        </label>
                    </c:if>           
                </div>

                <br> <div class="form-group">

                    <label>C)OLD INSURANCE XEROX(ONLY 1 XRX):&nbsp</label>                        
                    <c:set var='chkSelected' value="${two.oldinsrncecpyxrx}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldinsrncecpyxrx" checked value="${two.oldinsrncecpyxrx}">OLD INSURANCE COPY-XEROX
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">OLD INSURANCE COPY-XEROX
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldinsrncecpyxrx"  value="${two.oldinsrncecpyxrx}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">OLD INSURANCE COPY-XEROX
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="oldinsrncecpyxrx"  value="${two.oldinsrncecpyxrx}">
                        </label>
                    </c:if>                                   



                </div>
                <br> <div class="form-group">
                    <label>D)LETTER NCB SIGN(ANY 1 XRX):&nbsp</label>                                 
                    <c:set var='chkSelected' value="${two.letterncb}" />                                                      
                    <c:if test="${chkSelected == 'yes' || chkSelected == 'Yes'}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="letterncb" checked value="${two.letterncb}">1)LETTER NCB SIGN BY CLIENT
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' || chkSelected=='no'}">1)LETTER NCB SIGN BY CLIENT
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="letterncb"  value="${two.letterncb}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">1)LETTER NCB SIGN BY CLIENT
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="letterncb"  value="${two.letterncb}">
                        </label>
                    </c:if>                                        



                </div>
                <br> <div class="form-group">
                    <label>E)CHARGES Rs 750 FOR THIRD PARTY PREM 2 WORKING DAYS:&nbsp</label>

                    </label>


                </div>
                <br> <div class="form-group">
                    <label>F)CHARGES Rs....... FOR FIRST PARTY PREM ON VEH.VALUE Rs.2 WORKING DAYS:&nbsp</label>

                    </label>


                </div>
                <br>


                <table align="center">
                    <tr>
                        <td >
                            <div>
                                <button type="button" class="btn btn-primary"onclick="get2w('edit')">Update</button>
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
