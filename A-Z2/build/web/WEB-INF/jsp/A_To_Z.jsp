<%-- 
    Document   : A_To_Z
    Created on : Jan 13, 2017, 11:44:36 AM
    Author     : Mservices2
--%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
        <script language="javascript" src="js/client.js"></script>
        <script language="javascript" src="js/server.js"></script>
    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Mservices</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                             
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i>Vinod <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                  <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Services <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                         
                            <li>
                                <a onclick="openOtherWork()">OTHER WORK</a>
                            </li>
                           <li>
                                <a onclick="openPassport()">PASSPORT</a>
                            </li>
                            <li>
                                <a onclick="openTwbikeInsurance()">2/W + 4/W INSURANCE</a>
                            </li>
							 <li>
                                <a onclick="openPancard()"> PAN CARD</a>
                            </li>
							 <li>
                                <a onclick="openGumasta()">GUMASTA LICENCE</a>
                            </li>
							 <li>
                                <a onclick="openLearningDriving()">LEARNER/DRIVING LICENCE</a>
                            </li>
							<li>
                                <a onclick="openGrantRenewal()">GRANT RENEWAL OF LEARNER LICENCE</a>
                            </li>
                            <li>
                                <a onclick="openAadharCard()">AADHAR CARD</a>
                            </li>
                            <li>
                                <a onclick="openLic()">LIC</a>
                            </li>
							 <li>
                                <a onclick="openLoanFile()">LOAN FILE</a>
                            </li>
							 <li>
                                <a onclick="openMediclaim()">MEDICLAIM</a>
                            </li>
							 <li>
                                <a onclick="openSalaryIt()">SALARY-IT</a>
                            </li>
							<li>
                                <a onclick="openFoodLicence()">FOOD LICENCE</a>
                            </li>
                             
							<li>
                                <a onclick="openRationCard()">RATION CARD</a>
                            </li>
							<li>
                                <a onclick="openReport()">REPORT</a>
                            </li>
                        </ul>
                    </li>
                 
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid" id="containerfluid">

                <!-- Page Heading -->
				<br>
                 <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i> WELCOME A TO Z INDEX PAGE........ 
                            </li>
                        </ol>
               

            </div>
            <!-- /.container-fluid -->

        </div>
        <div class="form-group" id="formgroup" ></div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>

				
