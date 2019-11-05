
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
                      <h2 class="box-title" style="text-transform:capitalize;"><b> Video Package</b></h2>
                    </header>

                    <div class="panel-body">
<?php
require 'connect.php';

$id = $_GET["id_package"];
 $querysearch="SELECT * FROM video_package where id_package='$id'";

  $hasil=pg_query($querysearch);
   
   while($baris = pg_fetch_array($hasil))
   {
    ?>
        <video width="400px" height="350px" controls src="video/<?php echo $baris['gallery_package']; ?>" style="width:60%;">
 </video>
        </video>
      <?php
   }
  ?>

                    </table>
                    <tr colspan></tr>
                      
                        
             
                </section>
                 </div>
      <div class="col-sm-6">
      <div class="row">
      <div class="col-sm-12" >
    <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Gallery</a>
                        <div class="content" style="text-align:center;">
                        <div class="content" style="text-align:center;">
                              <div class="html5gallery" style="max-height:700px; overflow:auto;" data-skin="horizontal" data-width="350" data-height="200" data-resizemode="fit">  

<?php
require 'connect.php';

$id = $_GET["id_package"];
$querysearch = "SELECT no_urut, id_tourism, id_restaurant, id_souvenir, id_workship_place, id_hotel from object_point where id_package='$id'";
$hasil=pg_query($querysearch);
while($row = pg_fetch_assoc($hasil))
{
  $id_tourism=$row['id_tourism'];
  $id_restaurant=$row['id_restaurant'];
  $id_workship_place=$row['id_workship_place'];
  $id_souvenir=$row['id_souvenir'];
  $id_hotel=$row['id_hotel'];


  if($id_tourism!=null)
  {
    $querysearch1 = "SELECT gallery_tourism FROM tourism_gallery where id_tourism='$id_tourism'";
    $hasil1=pg_query($querysearch1);
    while($baris1 = pg_fetch_assoc($hasil1))
      {
        if(($baris1['gallery_tourism']=='-')||($baris1['gallery_tourism']==''))
        {
            echo "<a href='foto/foto.jpg'><img src='foto/foto.jpg' ></a>" ;
        }
        else
        {
                echo "<a href='foto/".$baris1['gallery_tourism']."'><img src='foto/".$baris1['gallery_tourism']."'></a>";
        
        }
      }
  }

  elseif($id_restaurant!=null)
  {
    $querysearch2 = "SELECT gallery_restaurant FROM restaurant_gallery where id_restaurant='$id_restaurant'";
    $hasil2=pg_query($querysearch2);
    while($baris2 = pg_fetch_assoc($hasil2))
      {
        if(($baris2['gallery_restaurant']=='-')||($baris2['gallery_restaurant']==''))
        {
            echo "<a href='foto/foto.jpg'><img src='foto/foto.jpg' ></a>";
        }
        else
        {
                echo "<a href='foto/".$baris2['gallery_restaurant']."'><img src='foto/".$baris2['gallery_restaurant']."'></a>";
        }
      }
  }
  elseif($id_workship_place!=null)
  {
    $querysearch3 = "SELECT gallery_workship_place FROM workship_place_gallery where id_workship_place='$id_workship_place'";
    $hasil3=pg_query($querysearch3);
    while($baris3 = pg_fetch_assoc($hasil3))
      {
        if(($baris3['gallery_workship_place']=='-')||($baris3['gallery_workship_place']==''))
        {
            echo "<a href='foto/foto.jpg'><img src='foto/foto.jpg' ></a>";
        }
        else
        {
                echo "<a href='foto/".$baris3['gallery_workship_place']."'><img src='foto/".$baris3['gallery_workship_place']."'></a>";
        }
      }
  }

   elseif($id_hotel!=null)
  {
    $querysearch5 = "SELECT gallery_hotel FROM hotel_gallery where id_hotel='$id_hotel'";
    $hasil5=pg_query($querysearch5);
    while($baris5 = pg_fetch_assoc($hasil5))
      {
        if(($baris5['gallery_hotel']=='-')||($baris5['gallery_hotel']==''))
        {
            echo "<a href='foto/foto.jpg'><img src='foto/foto.jpg' ></a>";
        }
        else
        {
                echo "<a href='foto/".$baris5['gallery_hotel']."'><img src='foto/".$baris5['gallery_hotel']."'></a>";
        }
      }
  }
  elseif($id_souvenir!=null)
  {
    $querysearch4 = "SELECT gallery_souvenir FROM souvenir_gallery where id_souvenir='$id_souvenir'";
    $hasil4=pg_query($querysearch4);
    while($baris4 = pg_fetch_assoc($hasil4))
      {
        if(($baris4['gallery_souvenir']=='-')||($baris4['gallery_souvenir']==''))
        {
            echo "<a href='foto/foto.jpg'><img src='foto/foto.jpg' ></a>";
        }
        else
        {
                echo "<a href='foto/".$baris4['gallery_souvenir']."'><img src='foto/".$baris4['gallery_souvenir']."'></a>";
        }
      }
  }
}
?>
                      
                        </div>
                        </div>
                    </div>
                </section>
                 </div>

                      
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
