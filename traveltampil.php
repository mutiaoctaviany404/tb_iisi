
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
        
        <header class="header black-bg">
  <div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
  </div>
  <a href="index.html" class="logo"><b>Solok Selatan Tourism</b></a>
  <div class="nav notify-row" id="top_menu">
    <ul class="nav top-menu"></ul>   
  </div>

  <div class="btn-group pull-right">                 
    <a href="login.php" class="logo1" title="Login" style="margin-top: 10px"><img src="assets/img/signin.png"></a> 
  </div> 
  <div class="top-menu">
  
  </ul>
  </div>
</header></header>
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
          <div class="row mt">
              <div class="col-sm-12" id="result">
    <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Detail</a>
                        <div class="content" style="text-align:justify;">
                        

 <?php
require 'connect.php';
$id = $_GET["id"];
$query = "SELECT 
travel.id, 
travel.name, 
travel.cp, 
district.name as district_name, 
users.password ,  
ST_X(ST_Centroid(geom)) As lng, 
ST_Y(ST_Centroid(geom)) As lat  
FROM district, travel JOIN users ON users.username = travel.name  
where st_contains(district.geom1, travel.geom) and travel.id='$id'";

$hasil=pg_query($query);
while($row = pg_fetch_array($hasil)){
  $id=$row['id'];
  $name=$row['name'];
  $cp=$row['cp'];
   $lat=$row['lat'];
  $lng=$row['lng'];
   $district_name=$row['district_name'];
  if ($lat=='' || $lng=='')
  {
    $lat='<span style="color:red">Kosong</span>';
    $lng='<span style="color:red">Kosong</span>';
  }
 
}
  ?>
    
 
  <div class="col-sm-6"> 
                  <section class="panel">
                      <header class="panel-heading">
            <h2 class="centered" class="box-title" style="text-transform:capitalize;"><b> <?php echo $name ?></b></h2>
              
                      </header>
                      <div class="panel-body">
              <table>
          <tbody  style='vertical-align:top;'>
            <tr><td width="150px"><b>Contact Person</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $cp ?></td></tr>  
           <tr><td><b>Koordinat<b> </td><td>: </td><td><b>Latitude</b> : <?php echo $lat ?> <br><b>Longitude</b> : <?php echo $lng ?></td></tr> 
            <tr><td><b>District<b> </td><td>: </td><td><?php echo $district_name?></td></tr>            
           <!--  <tr><td width="150px"><b>Password</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $password ?></td></tr>             -->
          </tbody>
          
        </table>
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
       
                  
              