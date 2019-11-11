<?php

	
	require 'connect.php';
	$kecamatan = $_GET['kecamatan'];
	$restaurant = $_GET['restaurant'];
	
	$querysearch	=" 	
						SELECT package.id,package.name, package.price, package.id_travel
						FROM package
						join object_point on package.id = object_point.id_package
						join restaurant on object_point.id_restaurant = restaurant.id 
						where st_contains(restaurant.geom,(select geom from district where id = '$kecamatan'))
						and restaurant.name like '%$restaurant%'
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