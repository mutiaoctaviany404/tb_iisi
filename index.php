<?php
include("connect.php");
?>

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
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
  <link href="assets/js/fancybox/jquery.fancybox.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-datepicker/css/datepicker.css" />
    <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-daterangepicker/daterangepicker.css" />
    <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-timepicker/compiled/timepicker.css" />
    <link rel="stylesheet" type="text/css" href="assets/js/bootstrap-datetimepicker/datertimepicker.html" />
<!--       AIzaSyDb1T2Bz_bjKsFRtx3-8zFpmXu4V_4rlpc *API KEY -->
       <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNnzxae2AewMUN0Tt_fC3gN38goeLVdVE"></script>
  <link rel="stylesheet" href="assets/css/bootstrap-slider.css" type="text/css">
    <script src="assets/js/chart-master/Chart.js"></script>
    <script src="script.js"></script>

    </script>
  </head>
  
  <body onload="init();hapusmarker()">
  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
<header class="header black-bg">
  <div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
  </div>
  <a href="index.php" class="logo"><b>South Solok Tourism Package</b></a>
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
      <p class="centered"><a href="index.php"><img src="assets/img/3.jpg" class="img-circle" width="180"></a></p>
        <h5 class="centered">WELCOME</h5>

        <li class="treeview">
            
                   <li class="sub-menu">
                      <a href="javascript:;" id="showall" onclick="tampilsemua()">
                        <i class="fa fa-list"></i>
                          <span>All Package</span>
                      </a>
                  </li> 
                   <!--  <label id="seeall">
                      <a type="button" onclick="tampilsemua()"title="All Package " class="btn btn-default btn-sm " data-toggle="tooltip"  
                      style="margin-right: 7px;"><i class="fa fa-database" style="color:black;"> </i></a>
                      </label> -->

                  <li class="sub-menu">
                      <a href="#">
                        <i class="fa fa-search"></i>
                          <span>Search by Name Package</span>
                      </a>
                      <ul class="sub">
                        <input type="text" class="form-control" placeholder="Name" id="nama_paket">
                        <span class="input-group-btn">
                          <br>
                        <button type="button" class="btn btn-default" value="caripaket" onclick="caripaket1();"><i class="fa fa-search"></i></button>
                      </ul>
                  </li> 

                  <li class="sub-menu">
                      <a href="#">
                        <i class="fa fa-car"></i>
                          <span>Search by Travel Agent</span>
                      </a>
                      <ul class="sub">
                        <input type="text" class="form-control" placeholder="Travel" id="name_travel">
                        <span class="input-group-btn">
                        
                          <br>
                        <button type="submit" class="btn btn-default" id="caritravel"  value="caritravel" onclick="caritravel();"><i class="fa fa-search"></i></button>
                         </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" onclick="reset()" >
                          <i class="fa fa-list-alt"></i>
                          <span>Search by Destination</span>
                      </a>
                      <ul class="sub">
                         <div  class="panel-body" >
                            <select class="form-control" id="district" onchange="cariobjek()">
                                <?php
                              $sql = pg_query("select * from district");
                              while($row1 = pg_fetch_array($sql)){
                                echo "<option value=\"$row1[id]\">$row1[name]</option>";}
                            ?>
                                </select>
                                <br><br>
                                <select class="form-control select2" style="width: 100%;" id="objek" onchange="cariobjek()">
                                <option value="0">-- Choose Object --</option>
                                <option value="1">Souvenir</option>
                                <option value="2">Mosque</option>
                                <option value="3">Restaurant</option>
                                <option value="4">Tourism</option>
                                <option value="5">Hotel</option>
                              </select>
                              <br>
                              <br>
                                <select class="form-control select2" style="width: 100%;" id="cariobjek" ></select>
                              <br>
                                <button type="submit" class="btn btn-default" id="carides"  value="cari" onclick="carides1()"><i class="fa fa-search"></i></button>
                          </div>
                      </ul>
                  </li>
				   <li class="sub">
                      <a onclick="" style="cursor:pointer;background:none"><i class="fa fa-thumb-tack"></i>Souvenir Around You</a>
                      <ul class="treeview-index">
                        <<li style="margin-top:10px"><input id="inputradius" type="range" name="inputradius" data-highlight="true" min="1" max="10" value="1"></li>                             
                        <li><a onclick="init();hotel_sekitar_user();" style="cursor:pointer;background:none">Search</a></li> -->
                         <div class=" form-group" style="color: white;" > <!-- <br> -->
                          < <label>Based On Radius</label><br> -->
                          <label for="inputradius" style="font-size: 10pt";>Radius : </label>
                          <label  id="nilai"  style="font-size: 10pt";>0</label> m
                          
                          <input  type="range" onchange="init();hotel_sekitar_user();cekkk();" id="inputradius" name="inputradius" data-highlight="true" min="0" max="20" value="0" >
                          <script>
						  
                            function cekkk()
                            {
								require '../connect.php';

$tipe = $_GET["tipe"];		// Cari berdasarkan apa
$nilai = $_GET["nilai"];	// Isi yang dicari

	$querysearch	="SELECT souvenir.id, souvenir.name, st_x(st_centroid(souvenir.geom)) as lon, st_y(st_centroid(souvenir.geom)) as lat from hotel left join souvenir_gallery on souvenir_gallery.id_souvenir = souvenir.id_souvenir where  LOWER(souvenir_gallery.id_souvenir) like '%' || LOWER('$nilai') || '%'";
$hasil=pg_query($querysearch);
while($baris = pg_fetch_array($hasil))
	{
		  $id=$baris['id'];
		  $name=$baris['name'];
		  $lat=$baris['lat'];
		  $lng=$baris['lon'];
		  $dataarray[]=array('id'=>$id,'name'=>$name, 'lng'=>$lng, 'lat'=>$lat);
	}
echo json_encode ($dataarray);
	}
                          </script>
                        </div>

                      </ul>                     
                  </li>
				   
    </ul>
              <!-- sidebar menu end-->
  </div>
</aside>
      
     
<section id="main-content">
  <section class="wrapper site-min-height">
    <div class="row mt">
    <!-- <div class="panel-body text-center" style="height:450px"> -->
      <div class="col-sm-7">
        <section class="panel">
                     <header class="panel-heading">
                  <label style="color: black">Google Map with Location List:</label>
                   <button type="button" onclick="posisisekarang()" class="btn btn-default " data-toggle="tooltip" id="posisinow" title="Posisi Saya" 
                    style="margin: 15px" style="margin-right: 7px;" ><i class="fa fa-location-arrow" > </i>
                      </button>

                       <button type="button" onclick="lokasimanual()" class="btn btn-default"  data-toggle="tooltip" id="posmanual" title="Posisi Manual" 
                              style="margin-right: 7px;"><i class="fa fa-map-marker" ></i>
                      </button>

                      <label id="tombol">
                       <a type="button" onclick="legenda()" id="showlegenda" class="btn btn-default" data-toggle="tooltip" title="Legenda" style="margin-right: 7px;"><i class="fa fa-eye"></i>
                       </a>
                       </label>
                      <!--  <label id="seeall">
                     <a type="button" id="showall" onclick="tampilsemua()" class="btn btn-default btn-sm " data-toggle="tooltip"  
                      style="margin-right: 7px;"><i class="fa fa-database" style="color:black;"> </i></a> -->
                      </label>
                     </header>
                     
                      <div class="panel-body">
                          <div id="map" style="width:100%;height:400px; z-index:60"></div>
                      </div>

                 </section>
     </div>

     <style type="text/css">
  #legend
  {
    background: grey;
    padding: 10px;
    padding-right: 120px;
    margin: 5px;
    font-size: 12px;
    font-family: Arial, sans-serif;
   
  }
  .color
  {
    border: 0.2px solid;
    border-color: white;
    height: 7px;
    width: 10px;
    margin-right: 1px;
    float-left;
  }
  .color1
  {
    height: 18px;
    width: 15px;
    margin-right: 5px;
    float-left;
  }
  .class1
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/mas.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
  .class2
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/rm.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
  .class3
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/tw.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
  .class4
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/sov.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
  .class5
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/trav.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
   .class6
  {
    background-image: url("http://localhost/wisatasolsel/assets/img/htl.png");
    background-repeat: no-repeat;
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;  
  }
  .a
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: blue;
  }
  .b
  {
    padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #00ff7f;
  }
  .c
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #800000;
  }
  .d
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #20b2aa;
  }
  .e
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #ffff66;
  }
  .f
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #ff0000;
  }
  .g
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #84AAEC;
  }
   .h
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #E9967A;
  }
   .i
  {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #FF00FF;
  }
  .j
    {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #FFD700;
  }
  .k
    {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #4169E1;
  }
  .l
    {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #663399;
  }
    .m
    {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #A0522D;
  }
    .n
    {
   padding-left: 30px;
    background-size: 40%;
    background-position-y: 20%;
    background: #EE82EE  ;
  }

</style> 
               
                  
<div class="col-sm-5"  id="caritempatwisata" >
  <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Result</a>
                        <div class="box-body" style="max-height:400px;overflow:auto;">
             
                      <div class="form-group" id="hasilcari1">
                        <table class="table table-bordered" id='hasilcaritempat'>
                        </table>  
                      </div>                   
                  </div>
                    </div>
                </section>
</div>

<div class="col-sm-5"  id="caritrav" hidden>
  <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Result of Travel</a>
                        <div class="box-body" style="max-height:400px;overflow:auto;">
             
                      <div class="form-group">
                        <table class="table table-bordered" id='hasilcaritrav'>
                        </table>  
                      </div>                   
                  </div>
                    </div>
                </section>
</div>

<div class="col-sm-5"  id="carides2" hidden>
  <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Result of Package</a>
                        <div class="box-body" style="max-height:400px;overflow:auto;">
                      <div class="form-group" id="hasilcarides1">
                        <table class="table table-bordered" id='hasilcarides'>
                        </table>  
                      </div>                   
                  </div>
                    </div>
                </section>
</div>



</div>  

 </section>
         
      </section>

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
  <script type="text/javascript" src="assets/js/bootstrap-slider.js"></script>
    
    <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
    <script type="text/javascript" src="assets/js/gritter-conf.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap-daterangepicker/date.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap-daterangepicker/daterangepicker.js"></script>
  
  <script type="text/javascript" src="assets/js/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap-daterangepicker/moment.min.js"></script>
  <script type="text/javascript" src="assets/js/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
  <script src="assets/js/advanced-form-components.js"></script>  
  </body>
</html>

