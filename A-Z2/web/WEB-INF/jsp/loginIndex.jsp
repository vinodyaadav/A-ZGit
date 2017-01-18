<%-- 
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>

<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache">
        <META HTTP-EQUIV="Pragma" CONTENT="no-store">
        <META HTTP-EQUIV="Expires" CONTENT="-1">
        <META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">

        <title>A-Z Login Page</title>
        
        <script type = "text/javascript" >
	      function preventBack() {
	          window.history.forward();
	      }
	      setTimeout("preventBack()", 0);
	      window.onunload = function () {
	          null
	      };        
	</script>
        <style id="antiClickjack">body{display:none !important;}</style>

    <script type="text/javascript">
        if (self === top) 
        {
            var antiClickjack = document.getElementById("antiClickjack");
            antiClickjack.parentNode.removeChild(antiClickjack);
        }
        else 
        {
            top.location = self.location;
        }
    </script>
	 <script type="text/javascript">
        try 
        {
            if (top.location.hostname != self.location.hostname) throw 1;
        }
        catch (e) 
        {
            top.location.href = self.location.href;
        }
    </script>       

        
        <link rel="stylesheet" href="../../../css/style.blue.css" type="text/css" />

        <script src="js/jquery-1.10.2.min.js"></script>
        <script src="js/jquery-migrate-1.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap-modalmanager.js"></script>
        <script src="js/bootstrap-modal.js"></script>
        <script src="js/modernizr.min.js"></script>
        <script src="js/retina.min.js"></script>
        <script src="js/custom.js"></script>
         <script language="javascript" src="js/client.js"></script>
        <script language="javascript" src="js/server.js"></script>
        <script language="javascript" src="js/trim_all.js"></script>
        <script language="javascript" src="js/functions.js"></script>
        
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/bootstrap-modal.css">
        <link rel="stylesheet" type="text/css" href="font-awesome.min.css">
        <script>
            //history.forward();
            function disableBack(){
                //history.go(1);
                //history.forward();
            }          
</script>
</head>

<body class="signin" onload="disableBack()" onpageshow="if (event.persisted) disableBack();" onunload="">
    <div id="preloader" style="display:none"></div>
<div class="col-md-4 col-md-offset-4" >
<div class="panel panel-default">
    <div class="panel-heading" id="heading"><h4>Login</h4></div>  
    
<div class="panel-body"  >
<form name="frm" class="form-horizontal" action="master.htm" method="post" class="form-horizontal" role="form" >
  <input type="hidden" name="actionFrom" id="actionFrom" value=""/>
  <table align="center" width="100%" border="0" cellspacing="0" cellpadding="2">
   <tr align="left" valign="top">
        <td valign="middle" style="height:20px;"></td>
  <table align="center" width="100%" border="0" cellspacing="0">
   
   <tr>
        <td class="col-md-2" >
            <b><label class="control-label" for="username"></label></b>
        </td>
        <td class="col-md-8">
            <input type="text" id="username" name="username"  value=""  class="form-control uname" maxlength="15" placeholder="Username" class="glyphicon glyphicon-user" onKeyPress="return checkenter(event,'0')" autofocus /><br>
        </td>
        <td class="col-md-2" >
            <b><label class="control-label" for="username"></label></b>
        </td>
   </tr> 
  
   <tr>
        <td class="col-md-2" >
            <b><label class="control-label" for="password"></label></b>
        </td>
        <td class="col-md-8">
            <input type="password" name="password" id="password" value="" autocomplete="off"  class="form-control pword" maxlength="15" placeholder="Password" onKeyPress="return checkenter(event,'0')" /><br>
        </td>
        <td class="col-md-2" >
            <b><label class="control-label" for="password"></label></b>
        </td>
   </tr>
    
   
    <tr>
        <td height="1px">
            <b><label class="control-label" for="Login" ></label></b>
        </td>
        <td class="col-md-8" align="center" id="login">
            <input type="button" name="Login" value="Login" class="btn btn-success" onclick="login_validation()">&nbsp;
            <input type="reset" name="reset" class="btn btn-primary" value="Reset" />
        </td>
        <td class="col-md-2" >
            <b><label class="control-label" for="Login"></label></b>
        </td>
   </tr>
   <tr>
   <tr>
       <td height="10px"></td>
   </tr>
   <tr>
        <td class="col-md-2" >
            <b><label class="control-label"></label></b>
        </td>
        <td class="col-md-8" align="center">
            <!-- Forget Password Link Disable
            <a href="javascript:void(0)"  onclick="callForgotPassword()">Forgot Password?</a>
                   --> 
        </td>
        <td class="col-md-2" >
            <b><label class="control-label"></label></b>
        </td>
   </tr>
     

  </table>
  
 <div class="modal fade" id="loginResponsive" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg">
    <div class="modal-content"> 
        <div class="modal-body" id="loginModalWindow"> 
        </div>  
  </div>
 </div>
</div>
  
</form>

</div>
 
</div>
</div>  
</body>
<div id="searchDiv" class="container-fluid">&nbsp;</div>
</html>
