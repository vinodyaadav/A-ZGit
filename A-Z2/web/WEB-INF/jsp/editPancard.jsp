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
            <i class="fa fa-dashboard"></i>  Application For Pan Card 
        </li>
    </ol>
    <!-- /.row -->
    <br>
    <br>

    <div class="row">


        <form role="form">
            <input type="hidden" name="id" value="${id}" id="id">
            <div class="form-group" >
                <table border="0" style="width:90%;">
                    <tr>
                        <td >FOrm Type :</td>
                        <td >
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>New Form
                            &nbsp&nbsp
                            <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">Old Form

                        </td>					 
                        <td>  &nbsp </td>
                        <td >Document Type:</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="docType" value="${pan.docType}"></td>
                        <td>  &nbsp </td>
                        <td >Correction Form :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="CorrectionForm" value="${pan.docType}"></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table>
                <br>
                <table>
                    <tr>
                        <td>Old Pan No :</td>
                        <td style="padding-left:10px;" ><input class="form-control"  id="OldpanNo" style="width:105%;"></td>


                        </div>
                    </tr>
                </table>
                <br>
                <table border="0" style="width:90%;">
                    <tr>
                        <td >CustName:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control"id="custName" value="${pan.custName}"></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Father Name :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="FatherName" value=""></td>
                        <td>  &nbsp&nbsp </td>
                        <td >Surname :</td>
                        <td>  &nbsp </td>

                        <td><input class="form-control"id="SurName"  value="" ></td>
                    </tr>
                </table>
                <br>
                <table border="0" style="width:60%;">
                    <tr>
                        <td >Husband Name:</td>
                        <td>  &nbsp </td>
                        <td ><input class="form-control" id="HusbandName" value=""></td>					 
                        <td>  &nbsp&nbsp </td>
                        <td >Date Of Birth :</td>
                        <td>  &nbsp </td>
                        <td><input class="form-control" id="Dob"  value="" ></td>
                        <td>  &nbsp&nbsp </td>

                    </tr>
                </table>
                <br>
                <table style="width:70%;">
                    <tr>
                        <td>Full Address :</td>

                        <td style="padding-left:5px;width:35%;">
                            <div class="form-group">
                                <textarea class="form-control" rows="2" id="address"  >${pan.address}</textarea>
                            </div></td>					 
                        <td >  &nbsp&nbsp </td>
                        <td >Contact no:</td>
                        <td>  &nbsp  &nbsp </td>

                        <td ><input class="form-control" id="contactNo"  value="${pan.contactNo}"></td>
                        <td>  &nbsp&nbsp </td>


                    </tr>
                </table>

                <br>
                <div class="form-group">




                    <label>Date Of Birth Proof :&nbsp</label>
                    <input type="checkbox" id="BirthCert">Birth Certificate
                    </label>


                    <c:set var='chkSelected' value="${pan.sscCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="sscCert" checked value="${pan.sscCert}">Ssc Certificate
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">Ssc Certificate
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="sscCert"  value="${pan.sscCert}">
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">Ssc Certificate
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="sscCert"  value="${pan.sscCert}">
                        </label>
                    </c:if>



                    <c:set var='chkSelected' value="${pan.hscCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="hscCert" checked value="${pan.hscCert}">Hsc Certificate
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="hscCert"  value="${pan.hscCert}">Hsc Certificate
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="hscCert"  value="${pan.hscCert}">Hsc Certificate
                        </label>
                    </c:if>




                    <c:set var='chkSelected' value="${pan.marriageCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="marriageCert" checked value="${pan.marriageCert}">Marriage Certificate
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="marriageCert"  value="${pan.marriageCert}">Marriage Certificate
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="marriageCert"  value="${pan.marriageCert}">Marriage Certificate
                        </label>
                    </c:if>



                    <c:set var='chkSelected' value="${pan.magisrateCharge}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="magisrateCharge" checked value="${pan.magisrateCharge}">If not Date of birth proof then Magistrate Affdavit charge.
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="magisrateCharge"  value="${pan.magisrateCharge}">If not Date of birth proof then Magistrate Affdavit charge.
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="magisrateCharge"  value="${pan.magisrateCharge}">If not Date of birth proof then Magistrate Affdavit charge.
                        </label>
                    </c:if>


                    <br>


                </div>
                <br> <div class="form-group">



                    <c:set var='chkSelected' value="${pan.adharCard}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard" checked value="${pan.adharCard}">Addhar Card
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard"  value="${pan.adharCard}">Addhar Card
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard"  value="${pan.adharCard}">Addhar Card
                        </label>
                    </c:if>





                    <c:set var='chkSelected' value="${pan.passprtValid}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passprtValid" checked value="${pan.passprtValid}">Passport-Valid
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passprtValid"  value="${pan.passprtValid}">Passport-Valid
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passprtValid"  value="${pan.passprtValid}">Passport-Valid
                        </label>
                    </c:if>



                    <c:set var='chkSelected' value="${pan.drivngLicn}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivngLicn" checked value="${pan.drivngLicn}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivngLicn"  value="${pan.drivngLicn}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivngLicn"  value="${pan.drivngLicn}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if>     





                    <c:set var='chkSelected' value="${pan.votingId}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingId" checked value="${pan.votingId}">Voting-Id
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingId"  value="${pan.votingId}">Voting-Id
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="votingId"  value="${pan.votingId}">Voting-Id
                        </label>
                        </label>
                    </c:if>     


                    <br>





                    <c:set var='chkSelected' value="${pan.domicileCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert" checked value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert"  value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert"  value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>     




                </div>

                <br> <div class="form-group">

                    <c:set var='chkSelected' value="${pan.adharCard1}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard1" checked value="${pan.adharCard1}">Aadhar Card
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard1"  value="${pan.adharCard1}">Aadhar Card
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="adharCard1"  value="${pan.adharCard1}">Aadhar Card
                        </label>
                        </label>
                    </c:if>                                   




                    <c:set var='chkSelected' value="${pan.domicileCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert" checked value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert"  value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domicileCert"  value="${pan.domicileCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>     




                </div>

                <br> <div class="form-group">

                    <c:set var='chkSelected' value="${pan.voteId}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId" checked value="${pan.voteId}">Voting-Id
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId"  value="${pan.voteId}">Voting-Id
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="voteId"  value="${pan.voteId}">Voting-Id
                        </label>
                        
                    </c:if>                                   




                    <c:set var='chkSelected' value="${pan.passportValid}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportValid" checked value="${pan.passportValid}">Passport-Valid
                        </label>
                        
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportValid"  value="${pan.passportValid}">Passport-Valid
                        </label>
                       
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="passportValid"  value="${pan.passportValid}">Passport-Valid
                        </label>
                        
                    </c:if>                                   




                    <c:set var='chkSelected' value="${pan.drivingLicvalid}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicvalid" checked value="${pan.drivingLicvalid}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicvalid"  value="${pan.drivingLicvalid}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="drivingLicvalid"  value="${pan.drivingLicvalid}">Driving Licence-Valid
                        </label>
                        </label>
                    </c:if>                                   




                    <c:set var='chkSelected' value="${pan.bankPaPhoto}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankPaPhoto" checked value="${pan.bankPaPhoto}">Bank Passbook With Photo
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankPaPhoto"  value="${pan.bankPaPhoto}">Bank Passbook With Photo
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="bankPaPhoto"  value="${pan.bankPaPhoto}">Bank Passbook With Photo
                        </label>
                        </label>
                    </c:if> 


                    <br>



                    <c:set var='chkSelected' value="${pan.corpeterLetter}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corpeterLetter" checked value="${pan.corpeterLetter}">Corporator Letter With Id
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corpeterLetter"  value="${pan.corpeterLetter}">Corporator Letter With Id
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="corpeterLetter"  value="${pan.corpeterLetter}">Corporator Letter With Id
                        </label>
                        </label>
                    </c:if> 



                    <c:set var='chkSelected' value="${pan.notory}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="notory" checked value="${pan.notory}">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="notory"  value="${pan.notory}">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="notory"  value="${pan.notory}">If Rented-Agreement Notory & Owner Light Bill
                        </label>
                        </label>
                    </c:if>   




                    <c:set var='chkSelected' value="${pan.addProof}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProof" checked value="${pan.addProof}">ADD PROOF-Light Bill Self Name
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProof"  value="${pan.addProof}">ADD PROOF-Light Bill Self Name
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="addProof"  value="${pan.addProof}">ADD PROOF-Light Bill Self Name
                        </label>
                        </label>
                    </c:if>   



                    <br>


                    <c:set var='chkSelected' value="${pan.domCert}" />                                                      
                    <c:if test="${chkSelected == 'yes' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domCert" checked value="${pan.domCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if> 
                    <c:if test="${chkSelected =='No' }">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domCert"  value="${pan.domCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>
                    <c:if test="${chkSelected == null || chkSelected == ''}">
                        <label class="checkbox-inline" >
                            <input type="checkbox" id="domCert"  value="${pan.domCert}">Domacile Certificate
                        </label>
                        </label>
                    </c:if>                                  



                </div>

                <br>

                <table border="1" style="width:70%;">
                    <tr >
                        <th ><center>DECIDED AMT</center></th>
                    <th ><center>AMOUNT PAID</center></th>
                    <th ><center>BALANCE AMT</center></th>
                    <th ><center>REMARK NOTE</center></th>
                    <th ><center>SUBMIT DATE</center></th>
                    </tr>
                    <tr>
                        <td><input class="form-control" id="decidedAmt"  value="${pan.decidedAmt}"></td>
                        <td><input class="form-control" id="amtPaid"   value="${pan.amtPaid}"></td>
                        <td><input class="form-control" id="balAmt"  value="${pan.balAmt}" onfocus="editcalculate()"></td>
                        <td><input class="form-control" id="Remarknote"   value="${pan.remarknote}"></td>
                        <td><input class="form-control"id="submitDate"  value="${pan.submitDate}"></td>
                    <tr>
                </table><br>
                
                                                <table width="90%" >
                                 <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${pan.amtPaid1} "/></td><td>Date 1 
:</td><td><input class="form-group" id="amtPaidDate1" value="${pan.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${pan.amtPaid2}"/></td><td>Date 2 
:</td><td><input class="form-group" id="amtPaidDate2" value="${pan.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${pan.amtPaid3}"/></td><td>Date 3 
:</td><td><input class="form-group" id="amtPaidDate3" value="${pan.amtPaidDate3}"/></td></tr>
                                                </table>
                <br><br><br>
                <br><br><br><br>




                <table align="center">
                    <tr>
                        <td >
                            <div>
                                <button type="button" class="btn btn-primary" onclick="getPancardDetail('edit')">Update</button>
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

