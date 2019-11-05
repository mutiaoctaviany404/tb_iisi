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
      <h1>Manage Your Data</h1>
      <div class="row">
        <div class="col-xs-12">
        <div class="box">
        <div class="box-header clearfix">


<div class="box-body">
          <!-- <table id="" class="table table-hover table-bordered table-striped"> -->
            <table  id="dataTableExample2" class="table table-hover table-bordered table-striped">
            <thead>
              <tr>
                <!-- <th> No </th> -->
                <th> NAME </th>
                <th> PRICE </th>
                <th> ACTION </th>
                </tr>
              </thead>

              <tbody>
                <?php
                                    
                  $id_travel = $_SESSION['travel_id'];

                  $querysearch = "SELECT package.id, package.id_travel, package.name, package.price FROM package where id_travel = '".$id_travel."'";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                     $id = $baris['id'];
                    $name = $baris['name'];
                    $price = $baris['price'];
                    $dataarray[]=array('id'=>$id,'name'=>$name,'price'=>$price);
                ?>

              <tr>
                <!-- <td><?php echo "$id" ?></td>  -->
                <td><?php echo "$name" ?></td>
                <td><?php echo "$price" ?></td>
                <td><?php echo "$aksi" ?>
                  <!-- <a href="formuploadtw.php?id=<?php echo $id?>" class="btn btn-success"> UPLOAD </a> -->
                  <a href="detailpaket.php?id=<?php echo $id?>" class="btn btn-sm btn-default" title='Detail'><i class="fa fa-list"></i> Detail</a>
                  <a href="hapuspaket.php?id=<?php echo $id; ?>" onclick="return confirm ('delete?')"  class="btn btn-sm btn-default" title='Delete'><i class="fa fa-trash-o"></i></a>
              </tr>
            <?php
            }
            ?>
            </tbody>
          </table>
</section>
</section>