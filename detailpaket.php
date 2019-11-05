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
      <h1>YOUR PACKAGE</h1>
      <div class="row">
        <div class="col-xs-12">
        <div class="box">
        <div class="box-header clearfix">
 <?php
require 'connect.php';
$id = $_GET["id"];

$query0 = "SELECT*FROM package where package.id='$id'";
$query1 = "SELECT*FROM object_point where id_package='$id' ORDER BY object_point.no_urut ASC";


// $query0 = "SELECT*FROM package where package.id='$id'";
// $query1 = "SELECT*FROM object_point where id_package='$id' ORDER BY object_point.no_urut ASC";



$arr0 = array();
$arr1 = array();
$arr2 = array();

$data0=pg_query($query0);
while($row = pg_fetch_array($data0)){
	$arr0 = array(
		'id' => $row['id'],
		'name' => $row['name'],
		'price' => $row['price']
	);
}
$data0=pg_query($query1); $indexArray = 0;
while($row = pg_fetch_array($data0)){
	$arr1[$indexArray] = array(
		$row['no_urut'],
		$row['id_souvenir'],
		$row['id_workship_place'],
		$row['id_restaurant'],
		$row['id_tourism'],
    $row['id_hotel'],
    $row['status'],
    $row['time'],
    $row['estimated_hour']
	); $indexArray += 1;
}
  ?>
<div class="col-sm-6"> 
                  <section class="panel">
                      <header class="panel-heading">
            <h2 class="box-title" style="text-transform:capitalize;"><b> <?php echo $name ?></b></h2>
              
                      </header>
                      <div class="panel-body">
              <table>
          <tbody  style='vertical-align:top;'>
            <?php 
			echo "<tr><td>Name: <td><br>".$arr0['name']."</td></tr>";
			echo "<tr><td>Price: <td><br>".$arr0['price']."</td></tr>";
			echo "<tr><td colspan='3'></br> <b>Destinasi : </b></br><td></tr>";
      $a = count($arr1);

      $arr2[6] = "travel";
      $arr2[5] = "hotel";
			$arr2[4] = "tourism";
			$arr2[3] = "restaurant";
			$arr2[2] = "workship_place";
			$arr2[1] = "souvenir";
			for($i=0;$i<$a;$i++)
      {
				$column = 0;
				
        $query2="SELECT  
         a.name AS n1,
         b.name AS n2
         FROM ".$arr2[$arr1[$i][6]]." AS a, district as b 
         WHERE st_contains(b.geom1, a.geom) and a.id = '".$arr1[$i][$arr1[$i][6]]."'
          ";

				$data0=pg_query($query2);
      
				while($row = pg_fetch_array($data0))
        {
					echo "<tr><td>".$arr1[$i][0]."<td>".$row['n2']."<td><td> &nbsp ".$row['n1']."<td><td> &nbsp ".$arr1[$i][7]."<td><td> &nbsp ".$arr1[$i][8]."<td></tr>";
				}
			}
             ?>
          </tbody>
          
        </table>
        <table id="tab">

        </table>
        <div class="btn-group">
            <a href="updatepaket.php?id=<?php echo $id; ?>" class="btn btn-default"><i class="fa fa-edit"></i>&nbsp Edit Information</a>
        </div>
      
        </section>
  </div>
  
  <div class="col-sm-5"> <!-- menampilkan peta-->
                  <section class="panel">
                      <header class="panel-heading">
                          <h3> Video of <?php echo $arr0['name']?></h3>
              
                      </header>
                      <div class="panel-body">
                         <?php $id=$_GET['id'] ?>
  <?php
  $querysearch="SELECT * FROM video_package where id_package='$id'";

  $hasil=pg_query($querysearch);
   
   while($baris = pg_fetch_array($hasil))
   {
    ?>
        <video  controls src="video/<?php echo $baris['gallery_package']; ?>" style="width:80%;">
 </video>
        </video>
      <?php
   }
  ?>
                    
                       <!-- menampilkan peta-->
                  
                      <header class="panel-heading">
                          <h3>Upload Video of <?php echo $arr0['name'] ?></h3>
              
                      </header>
                      
                          <!-- form start -->
  

  <form role="form" action="uploadvideopaket.php" enctype="multipart/form-data" method="post">
    <div class="box-body">
    
    <input type="text" class="form-control hidden" name="id" value="<?php echo $id ?>">
    <div class="form-group">
     <input type="file" class="" style="background:none;border:none; width:1000px; " name="video" required>
    <!-- </div>
    <span style="color:red;">*Maximum image size 500kb</span>
    </div><!-- /.box-body -->
 
    <div class="box-footer">
    <button type="submit" class="btn btn-primary"><i class="fa fa-upload"></i> Upload</button>
    </div>
  </form>
                    
            
               
        
            
            
                  </section>
                      </div>

</section>
  </div>
  

                  
              