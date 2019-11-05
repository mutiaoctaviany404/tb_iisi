 <?php
require 'inc/connect.php';
$id = $_GET["id"];
$query = "SELECT 
travel.id, 
travel.name as trav_name, 
district.name as nama,
travel.cp, 
travel.email, 
 travel.user_id,
  users.password,
  users.address,
  ST_X(ST_Centroid(geom)) As lng, 
ST_Y(ST_Centroid(geom)) As lat 
FROM district, travel JOIN users ON users.user_id = travel.user_id where   travel.id='$id'";

$hasil=pg_query($query);
while($row = pg_fetch_array($hasil)){
  $id=$row['id'];
  $name=$row['trav_name'];
   $address=$row['address'];
  $nama=$row['nama'];
  $cp=$row['cp'];
  $email=$row['email'];
  $user_id=$row['user_id'];
  $password=$row['password'];
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
						<tr><td width="150px"><b>User ID</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $user_id ?></td></tr>  
						<tr><td width="150px"><b>Contact Person</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $cp ?></td></tr>	
           				<tr><td width="150px"><b>Password</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $password ?></td></tr>
           				<tr><td width="150px"><b>email</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $email ?></td></tr>
                    <tr><td width="150px"><b>Address</b></td><td> :&nbsp; </td><td style='text-transform:capitalize;'><?php echo $address ?></td></tr>
           				 <tr><td><b>Koordinat<b> </td><td>: </td><td><b>Latitude</b> : <?php echo $lat ?> <br><b>Longitude</b> : <?php echo $lng ?></td></tr>   					

					</tbody>
					
				</table>
				<div class="btn-group">
						<a href="?page=formupdatetravel&id=<?php echo $id ?>" class="btn btn-default"><i class="fa fa-edit"></i>&nbsp Edit Information</a>
				</div>
                      </div>

</section>
	</div>
	
	
              