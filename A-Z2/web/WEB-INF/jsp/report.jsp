<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- 
    Document   : showStudentsByGuideReport
    Created on : Jul 4, 2015, 11:34:28 AM
    Author     : Shekhar
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/sb-admin.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="css/plugins/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="js/client.js"></script>
        <script language="javascript" src="js/server.js"></script>

    </head>
    <body>
        <input type="hidden" name="offset" id="offset" value="0"/>
        <input type="hidden" name="maxResult" id="maxResult" value="25"/>
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading" id="heading" align="center"><h2>View Customer Report</h2></div>
                <div class="panel-body">
                    <table width="100%" border="0" align="center">
                        <tr>
                            <td colspan="6" style="height: 8px;"></td>
                        </tr>
                        <tr>
                            <td colspan="6" style="height: 8px;"></td>
                        </tr>
                        <tr align="center">

                            <td align="left">Customer Name :</td>
                            <td><div class="col-xs-12">
                                    <input type="text"  id="custName" name="custName" class="form-control input-sm" />

                                </div>
                            </td>

                            <td align="right">Contact No:</td>
                            <td><div class="col-xs-10">
                                    <input type="text"  id="contactNo" name="contactNo" class="form-control input-sm" />


                                    </select>
                                </div>
                            </td>
                            <td align="right" >Submit Date :</td>
                            <td align="left"> 
                                <div class="col-xs-10">
                                    <input type="text"  id="subDate" name="subDate" class="form-control input-sm"  />

                                </div>
                            </td>  

                          

                            <td align="right"><div class="col-xs-12">Form Type:</div></td>                                    
                            <td> <div class="col-xs-12"><select name="formType" id="formType" class="form-control input-sm" >
                                        <option value="Select">Select</option>
                                        <option value="aadharCard">aadharCard</option>
                                        <option value="DrivingModel">DrivingModel</option> 
                                        <option value="FoodModel">FoodModel</option>
                                        <option value="gumasta">gumasta</option>
                                        <option value="addGrantRenewal">addGrantRenewal</option>
                                        <option value="lic">lic</option>
                                        <option value="mediclaim">mediclaim</option>
                                        <option value="otherwork">otherwork</option>
                                        <option value="salaryIt">salaryIt</option>
                                        <option value="RationCard">RationCard</option>
                                        <option value="PanCard">PanCard</option>
                                        <option value="passport2">passport2</option>
                                        <option value="LoanModel">LoanModel</option>
                                        <option value="twowfourwh">twowfourwh</option>

                                    </select></div>
                            </td>

                        </tr>
                    </table>
                    <table width="70%" align="center">
                        <tr>
                            <td colspan="7" style="height: 8px;"></td>
                        </tr>
                        <tr>
                            <td colspan="6" align="center">
                                <input type="button" class="btn btn-primary" name="add" value="Search" id="search_btn" onclick="addViewReport()" /></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

        <div id="StudentDiv" class="container-fluid">&nbsp;</div>

    </body>
</html>
