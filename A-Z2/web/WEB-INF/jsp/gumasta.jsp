

            <div class="container-fluid" id="containerfluid">

                <!-- Page Heading -->
				<br>
                 <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i>  Application For Gumasta
                            </li>
                        </ol>
                <!-- /.row -->
				<br>
				<br>
				
				 <div class="row">
                    

                        <form role="form">

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
					  <td style="padding-left:10px;" ><input class="form-control" id="renewDate" ></td>
					   <td>  &nbsp&nbsp </td>
					   <td>Firm or Company Name :</td>
					  <td style="padding-left:5px;"style="width:105%;"  ><input class="form-control" id="custName" ></td>
                                           <td>  &nbsp&nbsp </td>
					   <td>Contact No :</td>
					  <td style="padding-left:5px;"style="width:105%;"  ><input class="form-control" id="contactNo" ></td>
								
					  
                                
								 </tr>
					  </table>
					  
					  <br>
					  <table  style="width:80%;">
					  <tr>
					  <td>Full Address :</td>
					  
					  <td style="width:35%;">
					  <div class="form-group">
                          <textarea class="form-control" rows="2" id="address"></textarea>
                            </div></td>					 
					 <td >  &nbsp&nbsp </td>
					  <td ALIGN="center" >Nature Of Buisness:</td>
					  
					  <td ><input class="form-control" id="natureOfBuisness"></td>
					  </tr> <td>  &nbsp&nbsp </td>
					  <tr>
					  <td>Employee QTY :</td>
					  <td><input class="form-control" id="employeeQty"></td>
					  <td>&nbsp&nbsp</td>
					  <td  ALIGN="center">PROPERTIOR NAME :</td>
					  <td><input class="form-control" id="propertiorName" ></td>
					  </tr></table>
					  <table width="50%" >
					  <tr>
					  <td align="left">IF RENEW THEN WHAT CHANGES :</td>
					  <td >1)<input class="form-control" id="renew1"></td>
					  </tr>
					  </tr>
					 
					  <tr>
					  <td>&nbsp&nbsp</td>
					  <td>2)<input class="form-control" id="renew2"></td>
					  </tr>
					   
					  <tr>
					  <td>&nbsp&nbsp</td>
                                          <td>3)<input class="form-control" id="renew3"></td>
					  </tr>
					  </table><br>
					  <table border="1" style="width:80%;">
                                    <tr >
                                    <th><center>Decided Amt</center></th>
                                    <th ><center>Paid Amt</center></th>
                                    <th ><center>Balance Amt</center></th>
                                    <th ><center>Reference Name</center></th>
                                    <th ><center>Submit Date</center></th>
                                    </tr>
                                    <tr>
                                        <td><input class="form-control" id="decidedAmt"></td>
                                        <td><input class="form-control" id="amtPaid"></td>
                                        <td><input class="form-control" id="balAmt"></td>
                                        <td><input class="form-control" id="refAmt"></td>
                                        <td><input class="form-control" id="submitDate"></td>
                                    <tr>
                                </table>
								   
					
							<br>
							<div class="form-group">
							     <label>Photo-Id Proof:&nbsp</label>
                                    <input type="checkbox" id="adharCard">Addhar Card
                                </label>
								<label class="checkbox-inline">
                                    <input type="checkbox" id="votingCard">Voting-Id
                                </label>
                                <label class="checkbox-inline">
                                    <input type="checkbox" id="passport">Passport-Valid
                                </label>
                                <label class="checkbox-inline">
                                    <input type="checkbox" id="drivingLicence">Driving Licence-Valid
                                </label>
                                <label class="checkbox-inline" >
                                    <input type="checkbox" id="pancard">Pan Card
                                </label>
								 
                            </div>
								<br> 
								<div class="form-group">
							     <label>Add Proof:&nbsp </label>
								<label class="checkbox-inline" style="padding-left:9%;">
                                    <input type="checkbox" id="lightBill">Light Bill Self Name
                                </label>
								<label class="checkbox-inline">
                                    <input type="checkbox" id="rentAgreement">If Rented-Agreement Notory & Owner Light Bill
                                </label>
								
								 
                            </div>
								
								<br>
								
								
														
								
								
								<br>
							<table align="center">
							<tr>
							<td >
							<div>
							<button type="button" class="btn btn-primary" onclick="addGumastaDetails()">Submit</button>
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

				