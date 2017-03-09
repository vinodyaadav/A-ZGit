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
                            <i class="fa fa-dashboard"></i> VIEW/EDIT Form of Application for the Grant Renewal of Learner's Licence 
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
                                    Submision Date<br> 
                                   <input  class="form-control"  id="submitDate" style="width:500px ;" value="${gc.submitDate}" ><br>

                                    </tr>
                                    <tr>
                                        To,<br>
                                    The Licensing Authority,<br> 
                                    <textarea class="form-control" rows="2" id="TheLicensingAuthority" value="" style="width:500px ;">${gc.theLicensingAuthority}</textarea><br>

                                    </tr>
                                    <tr>
                                        I hereby apply for licence authorising me to drive as a learner the following Motor Vehicle(s):-
                                        <td style="width:300px;">
                                            
                                            <c:set var='chkSelected' value="${gc.motorCyclewithoutgear}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithoutgear" checked value="${gc.motorCyclewithoutgear}">Motor Cycle without gear
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithoutgear"  value="${gc.motorCyclewithoutgear}">Motor Cycle without gear
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithoutgear"  value="">Motor Cycle without gear
                                    </label>
                                </c:if>
                                            
                                               <label class="checkbox-inline">
                                                <input type="checkbox" id="MotorCyclewithoutgear">&nbsp Motor Cycle without gear
                                            </label><br>
                                            
                                
                                <c:set var='chkSelected' value="${gc.motorCyclewithgear}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithgear" checked value="${gc.motorCyclewithgear}">Motor Cycle with gear
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithgear"  value="${gc.motorCyclewithgear}">Motor Cycle with gear
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorCyclewithgear"  value="">Motor Cycle with gear
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${gc.invalidCarriages}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="InvalidCarriages" checked value="${gc.invalidCarriages}">Invalid Carriages
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="InvalidCarriages"  value="${gc.invalidCarriages}">Invalid Carriages
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="InvalidCarriages"  value="">Invalid Carriages
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${gc.lightMotorVehicle}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="LightMotorVehicle" checked value="${gc.lightMotorVehicle}">Light Motor Vehicle
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="LightMotorVehicle"  value="${gc.lightMotorVehicle}">Light Motor Vehicle
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="LightMotorVehicle"  value="">Light Motor Vehicle
                                    </label>
                                </c:if>     
                                           
                                
                                <c:set var='chkSelected' value="${gc.mediumMotorCycle}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="MediumMotorCycle" checked value="${gc.mediumMotorCycle}">Medium Motor Cycle
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="MediumMotorCycle"  value="${gc.mediumMotorCycle}">Medium Motor Cycle
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="MediumMotorCycle"  value="">Medium Motor Cycle
                                    </label>
                                </c:if>     
                                
                                
                                <label class="checkbox-inline" >
                                                <input type="checkbox" id="MediumMotorCycle">&nbsp Medium Motor Cycle 
                                            </label
                                
                                
                                
                                <c:set var='chkSelected' value="${gc.heavygoodsVehicle}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavygoodsVehicle" checked value="${gc.heavygoodsVehicle}">Heavy goods Vehicle
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavygoodsVehicle"  value="${gc.heavygoodsVehicle}">Heavy goods Vehicle
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavygoodsVehicle"  value="">Heavy goods Vehicle
                                    </label>
                                </c:if> 
                                
                                <c:set var='chkSelected' value="${gc.heavyPassengerMotorVehicle}" />                                                      
                                <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavyPassengerMotorVehicle" checked value="${gc.heavyPassengerMotorVehicle}">Heavy Passenger Motor Vehicle
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavyPassengerMotorVehicle"  value="${gc.heavyPassengerMotorVehicle}">Heavy Passenger Motor Vehicle
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="HeavyPassengerMotorVehicle"  value="">Heavy Passenger Motor Vehicle
                                    </label>
                                </c:if>
                                
                                <c:set var='chkSelected' value="${gc.roadRollers}" />
                                 <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="RoadRollers" checked value="${gc.roadRollers}">Road Rollers
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="RoadRollers"  value="${gc.roadRollers}">Road Rollers
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="RoadRollers"  value="">Road Rollers
                                    </label>
                                </c:if>
                                 
                                 
                                 
                                 
                                 
                                        <c:set var='chkSelected' value="${gc.motorVehicleoffollowingdescription}" />
                                 <c:if test="${chkSelected == 'Yes' }">
                                    <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorVehicleoffollowingdescription" checked value="${gc.motorVehicleoffollowingdescription}">Motor Vehicle of following description:
                                    </label>
                                </c:if> 
                                <c:if test="${chkSelected =='No'}">
                                     <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorVehicleoffollowingdescription"  value="${gc.motorVehicleoffollowingdescription}">Motor Vehicle of following description:
                                    </label>
                                </c:if>
                                <c:if test="${chkSelected == null || chkSelected == ''}">
                                      <label class="checkbox-inline" >
                                        <input type="checkbox" id="MotorVehicleoffollowingdescription"  value="">Motor Vehicle of following description:
                                    </label>
                                </c:if>    
                                            
                                           
                                            

                                        </td>

                                        <td style="padding-top:97px;" style="padding-left:20px;">
                                            <input class="form-control"  style="width:300px;">
                                        </td>
                                    </tr>
                                </table><br>

                                <table border="0" style="width:80%;">		
                                    <tr>
                                        <td style="width:100px;">
                                            Customer Name :&nbsp&nbsp<input class="form-control" id="custName" value="${gc.custName}" style="width:700px;" ><br>
                                            Son/Wife/Daughter :&nbsp&nbsp<input class="form-control" id="Son" value="${gc.son}" style="width:700px;" ><br>
                                            Permanent Address :&nbsp&nbsp<textarea class="form-control" rows="2" id="address"  value="" style="width:700px;">${gc.address}</textarea><br>
                                            Temporary Address/Official Address :&nbsp&nbsp<textarea class="form-control" rows="2" id="TemporaryAddress" value="" style="width:700px;">${gc.temporaryAddress}</textarea><br>
                                             Contact No :&nbsp&nbsp <input class="form-control"  style="width:300px;" id="contactNo" value="${gc.contactNo}" ><br>
                                            <td >Date:</td>
                                        <td ><input class="form-control" id="datepicker" style="width:90%;"></td>
                                        <td>  &nbsp </td></tr>
                                    <br>
					 
                                            Educational Qualification :&nbsp&nbsp<input class="form-control" id="EducationalQualification" value="${gc.educationalQualification}" style="width:700px;" ><br>
                                            Identification Mark[s] :&nbsp&nbsp<input class="form-control" id="IdentificationMark" value="${gc.identificationMark}" style="width:700px;" ><br>
                                            Blood Group with RH factor :&nbsp&nbsp<input class="form-control" id="BloodGroupwithRHfactor" value="${gc.bloodGroupwithRHfactor}" style="width:700px;" ><br>

                                            <br>
                                            
                                                 
                            <table width="90%" >
                                <tr>
                                    <td><BR>
                                        <b>ACCOUNTS :</b><br></tr>
                                <tr><td>Decided Amount :</td><td style="padding-right:20%"><input class="form-group" id="decidedAmt"   value="${gc.decidedAmt}"/></td><td></td></tr>
                                <tr><td> Amount Paid:</td><td><input class="form-group" id="amtPaid" value=""/></td><td></td></tr>
                                <tr><td>Balance Amount :</td><td><input class="form-group" id="balAmt"  value="${gc.balAmt}"   onfocus="editcalculate()"/></td><td></td></tr>
                              
                                <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${gc.amtPaid1}" /></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${gc.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${gc.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${gc.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${gc.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${gc.amtPaidDate3}"/></td></tr>
                                
                                 
                               
                                   <tr><td>Submit Date :</td><td><input class="form-group" id="submitDate"      value="${gc.submitDate}"/></td></tr>
                            </table><br>
                                      
                                            <br>

                                            I hold an effective driving licence to drive<br> [g] Motor Cycle/Light Vehicle/Medium Passenger Motor Vehicle/Medium Goods Vehicle with effect from : 
                                            &nbsp&nbsp<input class="form-control" id="Iholdaneffectivedrivinglicencetodrive" value="${gc.iholdaneffectivedrivinglicencetodrive}" style="width:700px;" ><br>
                                            Particulars of any licence previously held by applicant whether it was cancelled and if so for what reason? 
                                            &nbsp&nbsp<input class="form-control" id="Particulars" value="${gc.particulars}" style="width:700px;" ><br>
                                            Particulars of any learner's licence previously<br> held by applicant in respect of the description vehicle to which the Applicant applied
                                            &nbsp&nbsp<input class="form-control" id="Particularsof" value="${gc.particularsof}" style="width:700px;" ><br>
                                            Have you been disqualified for holding of obtaining driving licence or learner's licence if so for what reason
                                            &nbsp&nbsp<input class="form-control" id="Haveyoubeen" value="${gc.haveyoubeen}" style="width:700px;" ><br>
                                            I enclose 3 copies of my recent photograph (photograph to be of the size of 5 cms  X 6 cms)<br><br>

                                        </td></tr></table>	
                                <table><tr>
                                        <td>I enclose Medical Fitness Certicate dates&nbsp&nbsp</td> 
                                        <td><input class="form-control" id="IencloseMedical" value="${gc.iencloseMedical}" style="width:300px">&nbsp&nbsp</td>
                                        <td>&nbsp&nbsp issued by the doctor&nbsp&nbsp</td> 
                                        <td><input class="form-control" id="issuedbythe" value="${gc.issuedbythe}" style="width:300px">&nbsp&nbsp</td>
                                    </tr>
                                </table> <br>
                                I have submitted alongwith my application for Learner's licence-/I enclose , the written permission of parent / guardian<br>
                                (In the case applicant being a minor)	<br><br>
                                <table>

                                    <tr>
                                        <td>I enclose Driving Certificate dated&nbsp&nbsp</td>
                                        <td><input class="form-control" id="IencloseDriving" value="${gr.IencloseDriving}" style="width:300px">&nbsp&nbsp</td>
                                        <td>&nbsp&nbsp issued by &nbsp&nbsp</td> 
                                        <td><input class="form-control" id="issuedby" value="${gr.issuedby}"  style="width:300px">&nbsp&nbsp</td>
                                    </tr>

                                </table>

                                I have paid the fee of Rs.<input class="form-control" id="IhavepaidthefeeofRs" value="${gr.ihavepaidthefeeofRs}" style="width:300px">&nbsp&nbsp<br>
                                I am exempted from the Medical Test under Rule 6 of Central Motor Rules 1989.<br><br>
                                I am exempted from the preliminary test under Rules 11(2) Central Motor Vehicle Rules 1989.




                                <br>

                                <br>
                                <table align="center">
                                    <tr>
                                        <td >
                                            <div>
                                                <button type="button" onclick="addGrantRenewal('edit')" class="btn btn-primary">Update</button>
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

