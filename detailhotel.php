<?php
require 'connect.php';
$id=$_GET["id"];
 
$querysearch	=" 	SELECT id, name, address, cp, ST_X(ST_Centroid(geom)) AS longitude, ST_Y(ST_CENTROID(geom)) As latitude, type
					FROM hotel where id='$id'
				";

$hasil=pg_query($querysearch);
while($row = pg_fetch_array($hasil))
	{
		  $id=$row['id'];
		  $name=$row['name'];
		 
		  $address=$row['address'];
		   $cp=$row['cp'];
		  $longitude=$row['longitude'];
		  $latitude=$row['latitude'];
		  $type=$row['type'];
		  
		  $dataarray[]=array('id'=>$id,'name'=>$name, 'address'=>$address, 'cp'=>$cp, 'longitude'=>$longitude,'latitude'=>$latitude, 'type'=>$type);  
	}
echo json_encode ($dataarray);
?>