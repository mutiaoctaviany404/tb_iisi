<?php

	
	require 'connect.php';
	$kecamatan = $_GET['kecamatan'];
	$workship_place = $_GET['workship_place'];
	
	$querysearch	=" 	
						SELECT package.id,package.name, price, id_travel
						FROM package
						join object_point on package.id = object_point.id_package
						join workship_place on object_point.id_workship_place = workship_place.id 
						where st_contains(workship_place.geom,(select geom from district where id = '$kecamatan'))
						and workship_place.name like '%$workship_place%'
					";

	$hasil=pg_query($querysearch);
	while($row = pg_fetch_array($hasil))
		{
			  $id=$row['id'];
			  $id_travel=$row['id_travel'];
			  $name=$row['name'];
			  $price=$row['price'];
			  $dataarray[]=array('id'=>$id,'id_travel'=>$id_travel,'name'=>$name,'price'=>$price);  
		}
	echo json_encode ($dataarray);

?>