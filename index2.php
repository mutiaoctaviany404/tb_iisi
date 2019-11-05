<?php 
session_start();
if(!isset($_SESSION['a'])){
  echo"<script language='JavaScript'>document.location='login.php'</script>";
    exit();
}
include("connect.php");?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>Solok Selatan Tourism</title>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNnzxae2AewMUN0Tt_fC3gN38goeLVdVE&libraries=drawing"></script>
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script src="assets/js/chart-master/Chart.js"></script>
    <script type="text/javascript" src="mapdraw.js"></script>
    <script type="text/javascript">

    var server = "http://localhost/wisatasolsel/";
    </script>
    <style>


  #map{
    height: 580px;
  }
  #map-canvas {
    position:relative;
  }
  #floating-panel {
    position: absolute;
    top: 5px;
    right: 5px;
    z-index: 5;
    background-color: #fff;
    padding: 1px;
    border: 1px solid #999;
    border-radius: 3px;
  }
  #latlng{
    width: 200px;
  }
  .my-btn{
    padding:0px 6px;
    vertical-align: baseline;
  }
  </style>
  </head>
  <body >
  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
<header class="header black-bg">
  <div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
  </div>
  <a href="index.html" class="logo"><b>Solok Selatan Tourism</b></a>
  <div class="nav notify-row" id="top_menu">
    <ul class="nav top-menu"></ul>   
  </div>

  <div class="btn-group pull-right">                 
                <button class="btn btn-inverse btn-default btn-sm"><a type="button" href="logout.php">Logout</a></button>               
            </div> 
  <div class="top-menu">
  
  </ul>
  </div>
</header>
      <!--header end-->
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
<aside>
  <div id="sidebar"  class="nav-collapse ">
  <!-- sidebar menu start-->
    <ul class="sidebar-menu" id="nav-accordion">
       <p class="centered"><a href="profile.html"><img src="assets/img/travel.jpg" class="img-circle" width="120"></a></p>
        <h5 class="centered">HI, ADMIN!</h5>
        <li class="sub-menu">
          <li><a href="travel.php">MANAGE TRAVEL AGENT</a></li>
        </li>
          
        <li class="sub-menu">
          <a href="javascript:;">
            <span>MANAGE DATA</span></a>
          <ul class="sub">
            <li class="sub-menu">
              <li><a href="tempatwisata.php">TOURISM</a></li>
            </li>
          </ul>
          <ul class="sub">
            <li class="sub-menu">
              <li><a href="rumahmakan.php">RESTAURANT</a></li>
                </li>
          </ul>
          <ul class="sub">
            <li class="sub-menu">
              <li><a href="masjid.php">MOSQUE</a></li>
                </li>
              </ul>
              <ul class="sub">
                <li class="sub-menu">
                    <li><a href="industri.php">SOUVENIR</a></li>
                  </a>
                </li>
              </ul>
          </li>

         <!--  <li class="sub-menu">
            <li><a href="event.php">MANAGE EVENT</a></li>
          </li> -->
    </ul>
              <!-- sidebar menu end-->
  </div>
</aside>
<body>
  
</body>>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
     
                  
      <!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->                  

                       <!-- USERS ONLINE SECTION -->
            
      <!--main content end-->
      <!--footer start-->
      
    <!-- js placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.js"></script>
<script src="assets/js/jquery-1.8.3.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="assets/js/jquery.scrollTo.min.js"></script>
<script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
<script src="assets/js/jquery.sparkline.js"></script>

    <!--common script for all pages-->
<script src="assets/js/common-scripts.js"></script> 
<script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
<script type="text/javascript" src="assets/js/gritter-conf.js"></script>

    <!--script for this page-->
<script src="assets/js/sparkline-chart.js"></script>    
<script src="assets/js/zabuto_calendar.js"></script>  
<script type="application/javascript"></script>
<script src="plugins/datatables/dataTables.min.css" type="text/javascript"></script>
    <script src="plugins/datatables/dataTables.min.js" type="text/javascript"></script>
<script>
            $(document).ready(function () {

                "use strict"; // Start of use strict

                $('#dataTableExample1').DataTable({
                    "dom": "<'row'<'col-sm-6'l><'col-sm-6'f>>t<'row'<'col-sm-6'i><'col-sm-6'p>>",
                    "lengthMenu": [[6, 25, 50, -1], [6, 25, 50, "All"]],
                    "iDisplayLength": 6
                });

                $("#dataTableExample2").DataTable({
                    dom: "<'row'<'col-sm-4'l><'col-sm-4 text-center'B><'col-sm-4'f>>tp",
                    "lengthMenu": [[10, 25, 50, -1], [10, 25, 50, "All"]],
                    buttons: [
                        {extend: 'copy', className: 'btn-sm'},
                        // {extend: 'csv', title: 'ExampleFile', className: 'btn-sm'},
                        {extend: 'excel', title: 'ExampleFile', className: 'btn-sm'},
                        {extend: 'pdf', title: 'ExampleFile', className: 'btn-sm'},
                        // {extend: 'print', className: 'btn-sm'}
                    ]
                });

            });
        </script>
  </body>
</html>

