<%-- 
    Document   : viewStudentDetails
    Created on : Apr 2, 2015, 2:55:50 PM
    Author     : Shekhar
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<c:set var='refererURL' value='${header.referer}'/>
<c:set var='currentURL' value='${pageContext.request.requestURL}'/>

<c:set var='refererServerPath' value="${fn:substring(refererURL,fn:indexOf(refererURL,'//')+2,fn:length(refererURL))}"/>
<c:set var='currentServerPath' value="${fn:substring(currentURL,fn:indexOf(currentURL,'//')+2,fn:length(fn:substringAfter(currentURL,'//'))+7)}"/>
<c:set var='refererServerName' value="${fn:substring(refererServerPath,0,fn:indexOf(refererServerPath,'/'))}"/>
<c:set var='currentServerName' value="${fn:substring(currentServerPath,0,fn:indexOf(currentServerPath,'/'))}"/>
<c:choose>
<c:when test="${pageContext.request.method == 'GET' || refererServerName!=currentServerName }">
<c:out value="Access to this page has been restricted ..." />
</c:when>
<c:otherwise> 
     
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
        <script>
        $('#responsive').modal('hide');
        loadPage("showStudentsBy");
    </script>
 
    </head>
    <body>
        <form name="frm" action="master.htm" method="post">
       <input type="hidden" name="custName" id="custName" value="${custName}"/>
        <input type="hidden" name="contactNo" id="contactNo" value="${contactNo}"/>
         <input type="hidden" name="subDate" id="subDate" value="${subDate}"/>
          <input type="hidden" name="formType" id="formType" value="${formType}"/>
       
       
     <table width="100%">
           <tr>
               <td style="height:35px;" align="left" valign="middle">&nbsp;&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <table width="100%" align="center" border="1" class="table table-condensed table-bordered table-striped">
                            <tr>
                                <th  align="center" width="4%"><b>Sr.No</b></th>
                               <th align="left" width="16%"><b>Company Name</b></th>
                                <th align="left" width="17%"><b>Contact No</b></th>
                                <th align="left" width="16%"><b>Address</b></th>
                                <th align="left" width="17%"><b>Decided Amount</b></th>
                                <th align="left" width="16%"><b>Credit Amount</b></th>
                                <th align="left" width="17%"><b>Balance Amount</b></th>
                                 <th align="left" width="17%"><b>View/Edit</b></th>
                                 <th align="left" width="17%"><b>Receipt</b></td>
                                
                              
                            </tr>
                            <c:choose>
                                <c:when test="${fn:length(custDetails) gt 0}">
                                    <c:set var='j' value='1'/>
                                    <c:forEach var="custDetails" items="${custDetails}">
                                        <tr>
                                            <td align="center">${j}</td>    
                                            <td>${custDetails.custName}</td>
                                             <td>${custDetails.contactNo}</td>
                                            <td>${custDetails.address}</td>
                                            <td>${custDetails.decidedAmt}</td>
                                            <td>${custDetails.amtPaid}</td>
                                            <td>${custDetails.balAmt}</td>
                                             <td width="4%" align="center"><a href="javascript:void(0)" data-toggle="tooltip" title="View/Edit" data-placement="right" onclick="openEdit('${formType}',${custDetails.id})"><span class="glyphicon glyphicon-user"></span></a></td>
                                              <td><a target="_blank" href="aadharCard.htm?actionFrom=printReceipt&id=${custDetails.id}&formType=${formType}">Print</a></td>   
                                        </tr>
                                        <c:set var="j" value="${j+1}"/>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>
                                    <tr>
                                        <td colspan="13" align="center">No details found</td>
                                    </tr>
                                </c:otherwise>
                            </c:choose>
             
                                    
                        </table>
                                    
                    </td>
                </tr>
             </table>
                
           
        </form>
    </body>
</html>
</c:otherwise>
</c:choose>
