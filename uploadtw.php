<?php
require 'connect.php';
$id=$_GET["id"];
$sql="select tourism.id, tourism.name, tourism.address, tourism.open, tourism.close, tourism.ticket, tourism.description, tourism.id_district, tourism.geom,
				ST_X(ST_Centroid(geom)) AS lng, 
				ST_Y(ST_CENTROID(geom)) As lat,	
			from tourism where id='$id'";

$hasil=pg_query($sql);
while($row = pg_fetch_array($hasil)){
	$id=$row['id'];
	$name=$row['name'];
	$address=$row['address'];
	$open=$row['open'];
	$close=$row['close'];
	$no_izinkominfo=$row['ticket'];
	$foto=$row['description'];
	$jml_pegawai=$row['id_district'];
	$longitude=$row['longitude'];
	$latitude=$row['latitude'];

	if ($foto=='null' || $foto=='' || $foto==null){
		$foto='eror.jpg';
	}
}
?>