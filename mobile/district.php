<?php
require 'connect.php';
// $querysearch="	SELECT row_to_json(fc) 
// 				FROM ( SELECT 'FeatureCollection' As type, array_to_json(array_agg(f)) As features 
// 				FROM (SELECT 'Feature' As type , ST_AsGeoJSON(district.geom1)::json As geometry , row_to_json((SELECT l 
// 				FROM (SELECT district.id, district.name,ST_X(ST_Centroid(district.geom1)) AS lon, ST_Y(ST_CENTROID(district.geom1)) As lat) As l )) As properties 
// 				FROM district As district  
// 				) As f ) As fc
// 			  ";
// $hasil=pg_query($querysearch);
// while($data=pg_fetch_array($hasil))
// 	{
// 		$load=$data['row_to_json'];
// 	}
// 	echo json_encode($load);

$sql = "SELECT ST_AsGeoJson(ST_Force_2D(district.geom1)) as geometry,id
	FROM public.district";
$result = pg_query($sql);
$hasil = array(
	'type'	=> 'FeatureCollection',
	'features' => array()
	);

while ($isinya = pg_fetch_assoc($result)) {
	$features = array(
		'type' => 'Feature',
		'geometry' => json_decode($isinya['geometry']),
		'properties' => array(
			'id' => $isinya['id']
			)
		);
	array_push($hasil['features'], $features);
}
echo json_encode($hasil);

?>