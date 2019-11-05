<?php 
session_start();
if(!isset($_SESSION['b'])){
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
    <script type="text/javascript">

    var server = "http://localhost/wisatasolsel/";
    </script>
  </head>
  <section id="container" >

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
  </div>
</header>

<aside>
  <div id="sidebar"  class="nav-collapse ">
  <!-- sidebar menu start-->
    <ul class="sidebar-menu" id="nav-accordion">
      <p class="centered"><a href="profile.html"><img src="assets/img/travel.jpg" class="img-circle" width="120"></a></p>
        <h5 class="centered">TRAVEL AGENT</h5>

         <li class="sub-menu">
          <li><a href="index3.php">CREATE PACKAGE</a></li>
        </li>
        <li class="sub-menu">
          <li><a href="paket.php">MY PACKAGE</a></li>
        </li>

        <li class="sub-menu">
          <li><a href="booking.php">BOOKING</a></li>
        </li>   
    </ul>
              <!-- sidebar menu end-->
  </div>
</aside>

<section id="main-content">
  <section class="wrapper">
      <h1>Your Booking</h1>
      <div class="row">
        <div class="col-xs-12">
        <div class="box">
        <div class="box-header clearfix">


<div class="box-body">
          <!-- <table id="" class="table table-hover table-bordered table-striped"> -->
            <table  id="dataTableExample2" class="table table-hover table-bordered table-striped">
            <thead>
              <tr>
                <th> DATE </th>
                <th> NAME </th>
                <th> NUMBER OF PEOPLE </th>
                <th> TOTAL PRICE </th>
                </tr>
              </thead>

              <tbody>
                <?php              
                  $id_package = $_SESSION['travel_id'];
                  $querysearch = "SELECT booking.date, booking.username, booking.total, booking.totalprice FROM booking LEFT JOIN package on booking.id_package = package.id LEFT JOIN travel on package.id_travel = travel.id where package.id_travel = '".$id_package."'";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                    $id_package = $baris['id_package'];
                    $date = $baris['date'];
                    $username = $baris['username'];
                    $total = $baris['total'];
                    $totalprice = $baris['totalprice'];
                    $dataarray[]=array('id_package'=>$id_package,'date'=>$date,'username'=>$username,'total'=>$total, 'totalprice'=>$totalprice );
                ?>

              <tr>
                <td><?php echo "$date" ?></td>
                <td><?php echo "$username" ?></td>
                <td><?php echo "$total" ?></td>
                <td><?php echo "$totalprice" ?> 
              </tr>
            <?php
            }
            ?>
            </tbody>
          </table>
</section>
</section>