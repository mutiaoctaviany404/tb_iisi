
<!DOCTYPE html>
<html lang="en">
  
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">

    <title>South Solok Tourism Package</title>

    <link href="assets/css/bootstrap.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
	<link href="assets/js/fancybox/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script type="text/javascript" src="html5gallery/html5gallery.js"></script>
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
  
  </head>

  <body>

   <section id="container" >
      <header class="header black-bg">
             <a class="logo"><b>South Solok Tourism Package</b></a> 
        </header>
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <ul class="sidebar-menu" id="nav-accordion">
				  
                  <li class="sub-menu">
                      <a href="index.php">
                          <i class="fa fa-arrow-left"></i>
                          <span>Back To Home</span>
                      </a>
                  </li> 

				</ul>
          </div>
      </aside>
       <section id="main-content">
        <section class="wrapper site-min-height">
          <div class="row">
          <div class="col-lg-12 main-chart"> 
      <div class="col-sm-12">
              <div class="col-sm-6"> <!-- information -->
                  <section class="panel">

                    <header class="panel-heading">
                      <h2 class="box-title" style="text-transform:capitalize;"><b> Package Information</b></h2>
                    </header>

                    <div class="panel-body">
                    <?php 
                    include "connect.php";
                  
                    $id_package=$_GET['id_package']; 

                    $querysearch="  SELECT package.name as nama_package , package.price, package.itinerary, package.id_travel , travel.name as nama_travel FROM package  JOIN travel ON travel.id = package.id_travel where package.id='$id_package'";

                     $hasil=pg_query($querysearch);
                     while ($baris=pg_fetch_array($hasil))
                      {
                     
                      $travel = $baris['nama_travel'];  
                      $nama = $baris['nama_package'];  
                      $price = $baris['price'];
                      $itinerary = $baris['itinerary'];
                      

                      }
                  
                     // echo "$querysearch";
                    ?>

                     <table id="detgal" class="table">
                          <tbody  style='vertical-align:top;'>
                         
                          <tr><td width="150px"><b>Package Name</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $nama ?></td></tr> 
                          <tr><td width="150px"><b>Travel Agent</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $travel ?></td></tr> 
                          
                          <tr><td width="150px"><b>Price</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $price ?></td></tr>  
                         <tr><td width="150px"><b>Itinerary</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $itinerary ?></td></tr>
                              <br>
                          </tbody>

                                 
                        </table>
                  
                  
                      <table id="detgal" class="table">
                        <tbody  style='vertical-align:top;'>
                          
                        </tbody>          
                      </table>
 <!-- <a href="printitinerary.php?id=<?php echo $id_package; ?>" target="_blank"><b>Print</b></a> -->
                      
                    </div>
                  </section>
                
      <footer class="site-footer">
          <div class="text-center">
              1411521024 - Yupi Sri Yunita
              <a href="index.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
  </section>


    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/jquery-1.8.3.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
  <script src="assets/js/fancybox/jquery.fancybox.js"></script>    
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="assets/js/jquery.sparkline.js"></script>
    <script src="script.js" type="text/javascript"></script>
    <script src="assets/js/common-scripts.js"></script>
    
    <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="assets/js/gritter-conf.js"></script>
     
	  <script type="text/javascript">
      $(function() {
        //    fancybox
          jQuery(".fancybox").fancybox();
      });

  </script>
   <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
