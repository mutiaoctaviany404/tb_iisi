<?php
require 'connect.php';
$id = $_GET["id"];

$query1 = "SELECT no_urut,
			restaurant.name as n1, 
			district.name as n2, 
			time as n3 ,
			estimated_hour as n4 
			FROM object_point JOIN restaurant 
			ON restaurant.id = object_point.id_restaurant 
			, district  where  st_contains(district.geom1, restaurant.geom) and  id_package='$id' AND object_point.status = '3'";

$query2 = "SELECT no_urut,
			tourism.name as n1, 
			district.name as n2, 
			time as n3,
			estimated_hour as n4 
			FROM object_point JOIN tourism 
			ON tourism.id = object_point.id_tourism 
			, district  where  st_contains(district.geom1, tourism.geom) and  id_package='$id' AND object_point.status = '4'";
$query3 = "SELECT no_urut,
			souvenir.name as n1, 
			district.name as n2, 
			time as n3,
			estimated_hour as n4 
			FROM object_point JOIN souvenir 
			ON souvenir.id = object_point.id_souvenir
			, district  where  st_contains(district.geom1, souvenir.geom) and  id_package='$id' AND object_point.status = '1'";
$query4 = "SELECT no_urut,
			workship_place.name as n1, 
			district.name as n2, 
			time as n3,
			estimated_hour as n4 
			FROM object_point JOIN workship_place 
			ON workship_place.id = object_point.id_workship_place
			, district  where  st_contains(district.geom1, workship_place.geom) and  id_package='$id' AND object_point.status = '2'";
$query5 = "SELECT no_urut,
			hotel.name as n1, 
			district.name as n2, 
			time as n3,
			estimated_hour as n4 
			FROM object_point JOIN hotel 
			ON hotel.id = object_point.id_hotel
			, district  where  st_contains(district.geom1, hotel.geom) and  id_package='$id' AND object_point.status  = '5'";

// $query1 = "SELECT no_urut,restaurant.name as n1, district.name as n2, time as n3 FROM object_point JOIN restaurant ON restaurant.id = object_point.id_restaurant JOIN district ON district.id = restaurant.id_district where id_package='$id' AND object_point.status = '3'";
// $query2 = "SELECT no_urut,tourism.name as n1, district.name as n2, time as n3 FROM object_point JOIN tourism ON tourism.id = object_point.id_tourism JOIN district ON district.id = tourism.id_district where id_package='$id' AND object_point.status = '4'";
// $query3 = "SELECT no_urut,souvenir.name as n1, district.name as n2, time as n3 FROM object_point JOIN souvenir ON souvenir.id = object_point.id_souvenir JOIN district ON district.id = souvenir.id_district where id_package='$id' AND object_point.status = '1'";
// $query4 = "SELECT no_urut,workship_place.name as n1 , district.name as n2, time as n3 FROM object_point JOIN workship_place ON workship_place.id = object_point.id_workship_place JOIN district ON district.id = workship_place.id_district where id_package='$id' AND object_point.status = '2'";
// $query5 = "SELECT no_urut,hotel.name as n1 , district.name as n2, time as n3 FROM object_point JOIN hotel ON hotel.id = object_point.id_hotel JOIN district ON district.id = hotel.id_district where id_package='$id' AND object_point.status = '5'";

$query = $query1." UNION ".$query2." UNION ".$query3." UNION ".$query4." UNION ".$query5." ORDER BY no_urut";
$hasil=pg_query($query);

$res = [];
while($row = pg_fetch_array($hasil)){
	array_push($res, [
		'n1'=>$row['n1'],
		'n2'=>$row['n2'],
		'n3'=>$row['n3'],
		'n4'=>$row['n4']]);
}

echo json_encode($res);