

                <div class="container-fluid" id="containerfluid">

                    <!-- Page Heading -->
                    <br>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i>  Application For Learner/Driving Licence 
                        </li>
                    </ol>
                    <!-- /.row -->
                    <br>
                    <br>

                    <div class="row">


                        <form role="form" >
                            <input type="hidden" value="${id}" id="id">

                            <div class="form-group" >
                                <table border="0" style="width:60%;">
                                     <tr>
                                        <td > Document Type:</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="documentType" value="${driv4.docType}"></td>
                                    </tr>				 
                                    <td>  &nbsp&nbsp </td>
                                    <tr>
                                        <td > Name of the Applicant:</td>
                                        <td>  &nbsp </td>
                                        <td style="width:75%" ><input class="form-control" id="custName" value="${driv4.custName}"></td>
                                    </tr>				 
                                    <td>  &nbsp&nbsp </td>
                                    <tr>
                                        <td > Contact No:</td>
                                        <td>  &nbsp </td>
                                        <td style="width:75%" ><input class="form-control" id="contactNo" value="${driv4.contactNo}"></td>
                                    </tr>				 
                                    <td>  &nbsp&nbsp </td>
                                    <tr><td >Son/Wife/Daughter of: </td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="son" value="${driv4.son}"></td></tr><br>
                                    <td>  &nbsp&nbsp </td>
                                    <tr><td >Present Address:</td>
                                        <td>  &nbsp </td>

                                        <td><div class="form-group">
                          <textarea class="form-control" rows="2" id="address" value="">${driv4.address}</textarea>
                            </div></td>
                                    </tr>
                                    <td>  &nbsp&nbsp </td>
                                    <tr><td >Permanent Address:</td>
                                        <td>  &nbsp </td>

                                        <td><div class="form-group">
                          <textarea class="form-control" rows="2" id="permanentaddress" value="">${driv4.permanentaddress}</textarea>
                            </div></td>
                                    </tr>
                                    <td>  &nbsp&nbsp </td>
                                    <tr><td >Date of Birth:</td>
                                        <td>  &nbsp </td>

                                        <td><input class="form-control" id="dateofbirth" value="${driv4.dateofbirth}"></td>
                                    </tr>
                                    <td>  &nbsp&nbsp </td>
                                   
                                    <tr><td >Education:</td>
                                        <td>  &nbsp </td>

                                        <td><input class="form-control" id="education" value="${driv4.education}"></td>
                                    </tr>
                                    <td>  &nbsp </td>
                                    <tr>

                                        <td>Blood Group</td>
                                        <td>  &nbsp </td>
                                        <td><input class="form-control" id="bloodgroup" value="${driv4.bloodgroup}"></td>
                                    </tr>
                                    <td>  &nbsp&nbsp </td>
                                    <tr><td >Identification Marks:</td>
                                        <td>  &nbsp </td>
                                        <td > 
                                            <input class="form-control"  id="identificationmark" value="${driv4.identificationmark}">
                                            &nbsp&nbsp 
                                            <input class="form-control" id="identificationmarks" value="${driv4.identificationmarks}">
                                        </td>
                                    </tr>


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
                                        <td><input class="form-control" id="decidedAmt" value="${driv4.decidedAmt}"></td>
                                        <td><input class="form-control" id="amtPaid" value="${driv4.amtPaid}"></td>
                                        <td><input class="form-control" id="balAmt" value="${driv4.balAmt}" onfocus="editcalculate()"></td>
                                        <td><input class="form-control" id="refName" value="${driv4.refName}"></td>
                                        <td><input class="form-control" id="submitDate" value="${driv4.submitDate}"></td>
                                    <tr>
                                </table>
                                    <br>
                                    <table width="90%" >
                                 <tr><td>Amount Paid 1:</td><td><input class="form-group" id="amtPaid1" value="${driv4.amtPaid1} "/></td><td>Date 1 :</td><td><input class="form-group" id="amtPaidDate1" value="${driv4.amtPaidDate1}"/></td></tr>
                                 <tr><td>Amount Paid 2:</td><td><input class="form-group" id="amtPaid2" value="${driv4.amtPaid2}"/></td><td>Date 2 :</td><td><input class="form-group" id="amtPaidDate2" value="${driv4.amtPaidDate2}"/></td></tr>
                                 <tr><td>Amount Paid 3:</td><td><input class="form-group" id="amtPaid3" value="${driv4.amtPaid3}"/></td><td>Date 3 :</td><td><input class="form-group" id="amtPaidDate3" value="${driv4.amtPaidDate3}"/></td></tr>
                                                </table>
                                <br>
                                <label>Declaration as to physical fitness to be give by the applicant :-</label>
                                <table width="65%" ><tr><td>
                                            
                                            (a) Do you suffer from epilepsy,or from saden attack of loss of <br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;consciousness from any cause?</td>
                                        &nbsp;&nbsp;&nbsp;
                                        <td> <fieldset id="group1"> 

                                                <input type="radio" value="" id="radioa">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                                <input type="radio"  value="" id="radioa">&nbsp;No

                                            </fieldset>
                                        </td></tr> 

                                    <tr>
                                        <td>
                                            (b) Are you able to distinguish with each eye at a distance of?</td>
                                        &nbsp;&nbsp;&nbsp;&nbsp;
                                        <td> <fieldset id="group2">  
                                                <input type="radio"  value="" id="radiob" >&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio"  value="" id="radiob">&nbsp;No
                                            </fieldset>
                                        </td></tr>  
                                    <tr>
                                        <td>
                                            (c) Have you lost either hand or foot are you suffering<br> 
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;from any defect in movement control or muscular power<br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;of either arm or leg ?</td>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;
                                        <td> <fieldset id="group3">  
                                                <input type="radio"  value="" id="radioc">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio" value="" id="radioc">&nbsp;No
                                            </fieldset>
                                        </td></tr>

                                    <tr>
                                        <td>(d) Can you readily distinguish the plugmentary colours<br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; red and green?</td>
                                        <!--&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->
                                        <td> 
                                            <fieldset id="group4"> 
                                                <input type="radio"  value=""  id="radiod">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio"  value="" id=radiod">&nbsp;No
                                            </fieldset>
                                        </td></tr>
                                    <tr>
                                        <td>(e) Do you suffer from night blindness?</td>
                                        <td> 
                                            <fieldset id="group5"> 
                                                <input type="radio"  value="" id="radioe">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio"  value="" id="radioe">&nbsp;No
                                            </fieldset> </td>
                                        <td></tr>
                                    <tr><td>
                                            (f) Are you so deaf from as to be unable to hear(and if the <br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;application is for driving a Light Motor vehicle with or with-<br>
                                            &nbsp;&nbsp;&nbsp;&nbsp;out hearing aid)the ordinary sound signal?</td>
                                        <td> 
                                            <fieldset id="group6"> 
                                                <input type="radio"  value="" id="radiou">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio"  value="" id="radiou">&nbsp;No
                                            </fieldset>
                                        </td></tr>
                                    <tr>
                                        <td>
                                            (g) Do you suffer from any other disease of disability likely 
                                            <br>&nbsp;&nbsp;&nbsp;&nbsp;to cause you driving of motor vehicle to be  sound  of 
                                            <br>&nbsp;&nbsp;&nbsp;&nbsp;danger  to the public,if so give details?</td>
                                        <td> 
                                            <fieldset id="group7"> 
                                                <input type="radio"  value="" id="radiop">&nbsp;Yes
                                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                                <input type="radio"  value="" id="radiop">&nbsp;No
                                            </fieldset></td></tr>

                                    <br>

                                    <table align="center">
                                        <tr>
                                            <td >
                                                <div>
                                                    <button type="button" class="btn btn-primary" onclick="getDrivingLicenceDetails('edit')">Submit</button>
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


