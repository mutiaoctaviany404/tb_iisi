<?php
require 'connect.php';
$id=$_GET["id"];
$detailtempat = $_GET["detailhotel"];
 
$querysearch	=" 	SELECT id, name, address, open, close, cp, type,
					ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude
					FROM tourism where id='$detailhotel'
				";

$hasil=pg_query($querysearch);
while($row = pg_fetch_array($hasil))
	{
		  $id=$row['id'];
		  $name=$row['name'];
		  $address=$row['address'];
		  $open=$row['open'];
		  $close=$row['close'];
		  $cp=$row['cp'];
		  $type=$row['type'];
		  $longitude=$row['longitude'];
		  $latitude=$row['latitude'];
		  $dataarray[]=array('id'=>$id,'name'=>$name, 'address'=>$address,'open'=>$open,'close'=>$close,'cp'=>$cp,'type'=>$type, 'longitude'=>$longitude,'latitude'=>$latitude);  
	}
echo json_encode ($dataarray);
?>