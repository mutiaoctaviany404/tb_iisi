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

    <title>South Solok Tourism Package</title>
    
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
  <a href="index.html" class="logo"><b>South Solok Tourism Package</b></a>
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
        <p class="centered"><a href="#"><img src="assets/img/travel.jpg" class="img-circle" width="130" height="130"></a></p>
       <h5 class="centered"><?php echo $_SESSION['username'];?></h5>
        <li class="sub-menu">
          <li><a href="index3.php">   <i class="fa fa-pencil"></i>CREATE PACKAGE</a></li>
        </li>
        <li class="sub-menu">
          <li><a href="paket.php"><i class="fa fa-list"></i>MY PACKAGE</a></li>
        </li>
        <li class="sub-menu">
          <li><a href="paketbooking.php"><i class="fa fa-folder"></i>PACKAGE ORDERED</a> </li>
        </li>   
    </ul>
  </div>
</aside>

<section id="main-content">
  <section class="wrapper">
      <h1>Package Ordered</h1>
      <div class="row">
        <div class="col-xs-12">
        <div class="box">
        <div class="box-header clearfix">


<div class="box-body">
          <!-- <table id="" class="table table-hover table-bordered table-striped"> -->
            <table  id="dataTableExample2" class="table table-hover table-bordered table-striped">
            <thead>
              <tr>
              <th> NO URUT BOOKING </th>
               <th> DATE </th>
              <th> PACKAGE NAME </th>
              <th> USER NAME </th>
               <th> CP </th>
               <th> ID BOOKING </th>
                <th> NUMBER OF PEOPLE </th>
                <th> TOTAL PRICE </th>
                 <th> STATUS BOOKING </th>
                  </tr>
              </thead>

              <tbody>
                <?php    
                   include '/connect.php';

                    $id_package = $_SESSION['travel'];
                    $user_id = $_SESSION['user_id'];

                    $travel_id = $_SESSION['travel_id'];

                    $querysearch = "SELECT 
                    detail_booking.total, 
                    detail_booking.no_urut, 
                    detail_booking.totalprice,
                    detail_booking.id_package,
                    booking.user_id as itu,
                       booking.statusbooking,
                    booking.id_booking,
                    booking.date,
                    package.id,
                    package.id_travel, 
                    package.name as  nama_paket, 
                    travel.user_id,
                    users.username,
                      users.cp  
                               
                    FROM detail_booking 
                    LEFT JOIN package on detail_booking.id_package = package.id 
                    LEFT JOIN travel on package.id_travel = travel.id 
                    right join users on travel.user_id = users.user_id
                     LEFT join booking on detail_booking.id_booking=booking.id_booking
                     where users.user_id = '".$user_id."' and booking.statusbooking='TERKIRIM'";
                    
                    
                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {

                    $dataSibooking = pg_query("SELECT * FROM users where user_id='".$baris['itu']."'");
                    $sibooking = pg_fetch_array($dataSibooking);

                    $id_booking = $baris['id_booking'];
                    $id_package = $baris['id_package'];
                    $date = $baris['date'];
                     $no_urut = $baris['no_urut'];
                    $user_id = $baris['user_id'];  
                    $statusbooking = $baris['statusbooking'];                   
                    $package = $baris['nama_paket'];
                    $cp = $baris['cp'];
                    $total = $baris['total'];                  
                    $username = $baris['username'];
                    $totalprice = $baris['totalprice'];
                    $dataarray[]=array(
                      'id_package'=>$id_package,
                      'date'=>$date, 
                       'name'=>$travel,
                      
                      'statusbooking'=>$statusbooking,  
                      'package'=>$package, 
                      'username'=>$username, 
                      'cp'=>$cp, 
                      'no_urut'=>$no_urut,
                      'address'=>$address, 
                      'total'=>$total,  
                      'user_id'=>$user_id,  
                      'id_booking'=>$id_booking,  
                      'totalprice'=>$totalprice );
                   ?>

              <tr>
              <td><?php echo "$no_urut" ?></td>
               <td><?php echo "$date" ?></td>
              <td><?php echo "$package" ?></td>
              <td><?php echo $sibooking['username'] ?></td>
              <td><?php echo $sibooking['cp'] ?></td>
               <td><?php echo "$id_booking" ?></td>
              <td><?php echo "$total" ?></td>
              <td><?php echo "$totalprice" ?> </td>
                <td><?php echo "$statusbooking" ?> </td>
          

            <?php
            }
            ?>
            </tbody>
          </table>
</section>
</section>