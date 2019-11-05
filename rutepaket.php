<?php
require 'connect.php';

$id_package = $_GET["id_package"];
 
$querysearch	=" 	SELECT no_urut, id_tourism, id_restaurant, id_souvenir, id_workship_place,id_hotel
					FROM object_point where id_package = '$id_package'";

$hasil=pg_query($querysearch);
while($row = pg_fetch_array($hasil))
	{
		  $no_urut=$row['no_urut'];
		  $id_tourism=$row['id_tourism'];
		  $id_restaurant=$row['id_restaurant'];
		  $id_souvenir=$row['id_souvenir'];
		  $id_workship_place=$row['id_workship_place'];
		  $id_hotel=$row['id_hotel'];
		  $latitude = 0;
		  $longitude = 0;
		  if($id_tourism!==null)
		  {
		  	$querysearch2 = "SELECT ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude FROM tourism where id='$id_tourism'";	
		  }
		  else if($id_restaurant!==null)
		  {
		  	$querysearch2 = "SELECT ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude FROM restaurant where id='$id_restaurant'";	
		  }
		  else if($id_souvenir!==null)
		  {
		  	$querysearch2 = "SELECT ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude FROM souvenir where id='$id_souvenir'";	
		  }
		  else if($id_hotel!==null)
		  {
		  	$querysearch2 = "SELECT ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude FROM hotel where id='$id_hotel'";	
		  }
		  else
		  {
		  	$querysearch2 = "SELECT ST_X(ST_Centroid(geom)) AS longitude, 
					ST_Y(ST_CENTROID(geom)) As latitude FROM workship_place where id='$id_workship_place'";	
		  }
			$hasil2=pg_query($querysearch2);
			while($row = pg_fetch_array($hasil2))
			{
			  $latitude=$row['latitude'];				
			  $longitude=$row['longitude']; 
			  
			}		  


		  $dataarray[]=array('no_urut'=>$no_urut,'id_tourism'=>$id_tourism, 'id_restaurant'=>$id_restaurant,'id_souvenir'=>$id_souvenir,'id_workship_place'=>$id_workship_place,'id_hotel'=>$id_hotel, 'latitude'=>$latitude, 'longitude'=>$longitude);  
	}
echo json_encode ($dataarray);
?>