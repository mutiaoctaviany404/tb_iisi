
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
             
            <!-- <a class="logo"><p><img src="assets/ico/111.png"><b>W</b>EB<b style="font-size: 17px">GIS</b></p></a> -->
           <!--  <a href="admin/login.php" class="logo1" title="Login" style="margin-top: -4px"><img src="assets/ico/112.png"></a> -->
 
        
        <header class="header black-bg">
  <div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
  </div>
  <a href="index.html" class="logo"><b>South Solok Tourism Package</b></a>
  <div class="nav notify-row" id="top_menu">
    <ul class="nav top-menu"></ul>   
  </div>

  <div class="btn-group pull-right">                 
    <!-- <button class="btn btn-inverse btn-default btn-sm"><a type="button" href="logout.php">Login</a></button>     -->
    <a href="login.php" class="logo1" title="Login" style="margin-top: 10px"><img src="assets/img/signin.png"></a> 
    <!-- <td>
      <a href="register.php" class="logo1" title="Registration" style="margin-top: 10px"><img src="assets/img/register.png"></a>
    </td> -->
  </div> 
  <div class="top-menu">
  
  </ul>
  </div>
</header></header>
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <ul class="sidebar-menu" id="nav-accordion">
              
                  <!-- <p class="centered"><a href="profile.html"><img src="assets/img/masjid.png" class="img-circle" width="90"></a></p> -->
          
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
          <div class="row mt">
              <div class="col-sm-12" id="result">
    <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Detail</a>
                        <div class="content" style="text-align:justify;">
                        <!-- <div class="html5gallery" style="max-height:600px;overflow:auto;" data-skin="horizontal" data-width="500" data-height="300" data-resizemode="fit">   -->
 <?php
require 'connect.php';
$id = $_GET["id"];
$query = "SELECT 
souvenir.id, 
souvenir.name as souvenir_name, 
district.name as district_name, 
souvenir.address, 
souvenir.open, 
souvenir.close, 
souvenir.description, 
ST_X(ST_Centroid(geom)) As lng, 
ST_Y(ST_Centroid(geom)) As lat 
FROM souvenir, district
where st_contains(district.geom1, souvenir.geom) and souvenir.id='$id'";

$hasil=pg_query($query);
while($row = pg_fetch_array($hasil)){
  $id=$row['id'];
  $name=$row['souvenir_name'];
  $address=$row['address'];
  $open=$row['open'];
  $close=$row['close'];
  $description=$row['description'];
  $district_name=$row['district_name'];
  $lat=$row['lat'];
  $lng=$row['lng'];
  if ($lat=='' || $lng==''){
    $lat='<span style="color:red">Kosong</span>';
    $lng='<span style="color:red">Kosong</span>';
  }
  //   if ($image=='null' || $image=='' || $image==null){
  //   $image='foto.jpg';
  // }
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
            <tr><td width="150px"><b>Address</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $address ?></td></tr>
            <tr><td><b>Open Hour</b></td><td>:</td><td><?php echo $open ?></td></tr>
            <tr><td><b>Close Hour</b></td> <td> :</td><td><?php echo $close ?></td></tr>
            <tr><td><b>Description<b> </td><td>: </td><td><?php echo $description ?></td></tr>
            <tr><td><b>District<b> </td><td>: </td><td><?php echo $district_name?></td></tr>
            <tr><td><b>Koordinat<b> </td><td>: </td><td><b>Latitude</b> : <?php echo $lat ?> <br><b>Longitude</b> : <?php echo $lng ?></td></tr>
            
          </tbody>
          
        </table>
       
                      </div>

</section>
  </div>
  
  <div class="col-sm-5"> <!-- menampilkan peta-->
                  <section class="panel">
                      <header class="panel-heading">
                          <h3> Picture of <?php echo $name ?></h3>
              
                      </header>
                      <div class="panel-body">
                         <?php $id=$_GET['id'] ?>
  <?php
  $querysearch="SELECT gallery_souvenir FROM souvenir_gallery where id_souvenir='$id'";

  $hasil=pg_query($querysearch);
   
   while($baris = pg_fetch_array($hasil))
   {
    
    //echo $baris['gallery_culinary'];
    ?>
        <image src="foto/<?php echo $baris['gallery_souvenir']; ?>" style="width:90%;">
      <?php
   }
  ?>
                      </div>
            
            
                  </section>
              </div>
        
  </form>
                      </div>
            
            
                  </section>
              </div>
                  
              
                  
              

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
