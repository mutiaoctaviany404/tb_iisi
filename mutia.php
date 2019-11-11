<?php

	
	require 'connect.php';
	$kecamatan = $_GET['kecamatan'];
	$souvenir = $_GET['souvenir'];
	
	$querysearch	=" 	
						SELECT package.id,package.name, price, id_travel
						FROM package
						join object_point on package.id = object_point.id_package
						join souvenir on object_point.id_souvenir = souvenir.id 
						where st_contains(souvenir.geom,(select geom from district where id = '$kecamatan'))
						and souvenir.name like '%$souvenir%'
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