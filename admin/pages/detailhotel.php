 <?php
require 'inc/connect.php';
$id = $_GET["id"];
$query = "SELECT 
hotel.id, 
hotel.name as hotel_name,
hotel.address,
hotel.cp,
hotel.type, 
district.name as district_name,
ST_X(ST_Centroid(geom)) As lng, 
ST_Y(ST_Centroid(geom)) As lat 
FROM hotel, district 
where st_contains(district.geom1, hotel.geom) and hotel.id='$id'";


$hasil=pg_query($query);
while($row = pg_fetch_array($hasil)){
  $id=$row['id'];
  $name=$row['hotel_name'];
  $address=$row['address'];
  $cp=$row['cp'];
  $type=$row['type'];
  $district_name=$row['district_name'];
  $lat=$row['lat'];
  $lng=$row['lng'];
  if ($lat=='' || $lng==''){
    $lat='<span style="color:red">Kosong</span>';
    $lng='<span style="color:red">Kosong</span>';
  }
  
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
						<!-- <tr><td><b>Open Hour</b></td><td>:</td><td><?php echo $open ?></td></tr>
						<tr><td><b>Close Hour</b></td> <td> :</td><td><?php echo $close ?></td></tr> -->
						<tr><td><b>Type<b> </td><td>: </td><td><?php echo $type ?></td></tr>
						<tr><td><b>District<b> </td><td>: </td><td><?php echo $district_name?></td></tr>
            <tr><td><b>Contact Person<b> </td><td>: </td><td><?php echo $cp?></td></tr>
						<tr><td><b>Koordinat<b> </td><td>: </td><td><b>Latitude</b> : <?php echo $lat ?> 
            <br><b>Longitude</b> : <?php echo $lng ?></td></tr>
						
					</tbody>
					
				</table>
				<div class="btn-group">
						<a href="?page=formupdatehotel&id=<?php echo $id ?>" class="btn btn-default"><i class="fa fa-edit"></i>&nbsp Edit Information</a>
				</div>
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
  $querysearch="SELECT gallery_hotel FROM hotel_gallery where id_hotel='$id'";

  $hasil=pg_query($querysearch);
   
   while($baris = pg_fetch_array($hasil))
   {
    
    ?>
        <image src="../foto/<?php echo $baris['gallery_hotel']; ?>" style="width:90%;">
      <?php
   }
  ?>
                      
            
                
           
        
                      <header class="panel-heading">
                        <h3>Upload Picture of <?php echo $name ?></h3>
              
                      </header>
                      <div class="panel-body">
  

  <form role="form" action="act/uploadfotohotel.php" enctype="multipart/form-data" method="post">
    <div class="box-body">
    
    <input type="text" class="form-control hidden" name="id" value="<?php echo $id ?>">
    <div class="form-group">
     <input type="file" class="" style="background:none;border:none; width:1000px; " name="image" required>
    </div>
    <span style="color:red;">*Maximum image size 500kb</span>
    </div><!-- /.box-body -->

    <div class="box-footer">
    <button type="submit" class="btn btn-primary"><i class="fa fa-upload"></i> Upload</button>
    </div>
  </form>
                      </div>
            
            
                  </section>
              </div>
                  
              