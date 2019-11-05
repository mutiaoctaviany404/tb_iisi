<?php 
session_start();
if(!isset($_SESSION['c'])){
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
     <script src="assets/js/jquery-1.8.3.min.js"></script>
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script src="assets/js/chart-master/Chart.js"></script>
   <script src="script.js"></script>
    <script type="text/javascript">

    var server = "http://localhost/wisatasolsel/";
    </script>
  </head>
  <section id="container" >


<header class="header black-bg">

             <a class="logo"><b>South Solok Tourism Package</b></a> 
        </header>
      <aside>
          <div id="sidebar"  class="nav-collapse ">
           <ul class="sidebar-menu" id="nav-accordion">
     <h5 class="centered">WELCOME</h5>
     <p class="centered"><a href="#"><img src="assets/img/2.jpg" class="img-circle" width="190" height="130"></a></p>
        <h5 class="centered"><?php echo $_SESSION['username'];?></h5>
         <li class="sub-menu">
                      <a href="indexes.php">
                          <i class="fa fa-arrow-left"></i>
                          <span>Back To Home</span>
                      </a>
                  </li> 
        </ul>
          </div>
      </aside>

<section id="main-content">
  <section class="wrapper">
      <h1>My Booking</h1>
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
                <th> ID BOOKING </th>
                <th> TRAVEL NAME </th>
                <th> PACKAGE NAME </th>
                <th> TRAVEL PHONE </th>
                <th> NUMBER OF PEOPLE </th>
                <th> TOTAL PRICE </th>
                 <th hidden>  PRICE </th>
                <th> ACTION </th>
                  </tr>
              </thead>

              <tbody>
                <?php    
                   include '/connect.php';          
                    $id_package = $_SESSION['travel'];
                    $user_id = $_SESSION['user_id'];
                    $querysearch = "SELECT booking.statusbooking, booking.date, travel.name as name, package.name as nama_paket, booking.id_booking, booking.user_id, detail_booking.total,detail_booking.no_urut, detail_booking.totalprice, package.price,  travel.cp FROM booking 
                    LEFT JOIN detail_booking on booking.id_booking = detail_booking.id_booking  
                    LEFT JOIN package on detail_booking.id_package = package.id 
                    LEFT JOIN travel on package.id_travel = travel.id 
                    left join users on booking.user_id = users.user_id 
                    where booking.user_id = '".$user_id."'";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {

                  

                    $no_urut = $baris['no_urut'];
                    $id_booking = $baris['id_booking'];
                    $id_package = $baris['id_package'];
                    $date = $baris['date'];
                    $user_id = $baris['user_id'];
                    $travel = $baris['name'];
                    $package = $baris['nama_paket'];
                    $cp = $baris['cp'];
                    $total = $baris['total'];
                    $price = $baris['price'];
                    $totalprice = $baris['totalprice'];
                    $dataarray[]=array(
                      'id_package'=>$id_package,
                      'date'=>$date, 
                       'name'=>$travel, 
                      'package'=>$package, 
                      'username'=>$username, 
                       'price'=>$price, 
                      
                      'cp'=>$cp, 
                      'address'=>$address, 
                      'total'=>$total,  
                      'user_id'=>$user_id,  
                      'id_booking'=>$id_booking,  
                      'totalprice'=>$totalprice );
                   ?>

              <tr>
               <td><?php echo "$no_urut" ?></td>
                <td><?php echo "$date" ?></td>
                <td><?php echo "$id_booking" ?></td>
                 <td><?php echo "$travel" ?></td>
                   <td><?php echo "$package" ?></td>
                <td><?php echo "$cp" ?></td>
                <td><?php echo "$total" ?></td>
                <td><?php echo "$totalprice" ?> </td>
                <td hidden><?php echo "$price" ?> </td>

<!--              <button a href="deletebooking.php?id=<?php echo $id_booking?>" id="btndel" class="btn btn-sm btn-default" title='Delete'><i class="fa fa-trash-o"> </i> </a></button>
               <button a href="updatebooking.php?id=<?php echo $id_booking?>"   id="btnupdate" class="btn btn-sm btn-default" title='Update'><i class="fa fa-list"></i></a> </button>       
 -->
<td>
             <button a <?php echo "onclick='hapus($id_booking)'"; if ($baris['statusbooking']=="TERKIRIM") { echo "disabled";  }  ?> id="btndel" class="btn btn-sm btn-default tbl" title='Delete' ><i class="fa fa-trash-o"></i></a></button> 

               <button a <?php echo "onclick='update($id_booking)'"; if ($baris['statusbooking']=="TERKIRIM") { echo "disabled";  }   ?> id="btnup" class="btn btn-sm btn-default tbl" title='Update' ><i class="fa fa-list"></i></a></button>            
                
            <button  a <?php echo "onclick='send($id_booking)'"; if ($baris['statusbooking']=="TERKIRIM") { echo "disabled";  }   ?> id="btnsend" class="btn btn-sm btn-default tbl" title='Send' ><i class="fa fa-send"></i></a></button>                 
            
             </td> </tr>

            <?php
            }
            ?>
            </tbody>
          </table>
</section>
</section> 

<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="modalbooking" class="modal fade">
                  <div class="modal-dialog">
                      <div class="modal-content">
                          <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                              <h4 class="modal-title">Booking Your Package</h4>
                          </div>
                          <form action="simpanbooking.php" method="POST" enctype="multipart/form-data">
                          <div class="modal-body">
                              <p>Fill The Field</p>
                              <div class="form-group">           
                                <div class="col-md-10 col-sm-10 col-lg-10">
                                  <input type="number" name="total" id = "total" onchange="hitung()" placeholder="Number of People" autocomplete="off" class="form-control placeholder-no-fix">
                              <?php
                                include 'connect.php';
                                  $query = pg_query("SELECT MAX(id_booking) AS id_booking FROM booking");
                                  $result = pg_fetch_array($query);
                                  $idmax = $result['id_booking'];
                                  if ($idmax==null) {$idmax=1;}
                                  else {$idmax++;}
                              ?>
                                  <input name="no_urut" id = "no_urut" class="form-control hidden" value="">
                                  <input name="id_booking" id = "id_booking" class="form-control hidden" value="<?php echo $idmax;?>">
                                  <input name="id_package" id = "id_package" class="form-control hidden">
                                  <input name="user_id" id = "user_id" class="form-control hidden" value="<?php echo "$_SESSION[user_id]" ?>">
                                </div>
                              </div>
                              <br>

                             <div class="form-group">  
                                <div class="col-md-10 col-sm-10 col-lg-10">
                                  <input type="date" name="date" id="date" placeholder="Date" autocomplete="off" class="form-control placeholder-no-fix">
                                </div>
                              </div>
                              <br>

                              <div class="form-group"> 
                                <div class="col-md-10 col-sm-10 col-lg-10">
                                  <input type="text" id="totalprice" name="totalprice" placeholder="Total Price"  autocomplete="off" class="form-control placeholder-no-fix" readonly>
                                </div>
                              </div>

                              <div class="modal-footer">
                                  <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                  <button class="btn btn-theme" type="submit">Submit</button>
                              </div>
                          </div>
                        </form>
      </div>
</div>
</div>