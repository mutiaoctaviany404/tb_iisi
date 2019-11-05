<?php
require 'connect.php';
//$name = $_GET["name"];
$gid=$_GET['gid'];

$querysearch1="   SELECT object_point.id_tourism, object_point.id_package, tourism.name,
                 ST_X(ST_Centroid(tourism.geom)) AS lon, ST_Y(ST_CENTROID(tourism.geom)) 
                As lat FROM object_point JOIN tourism ON object_point.id_tourism=tourism.id WHERE object_point.id_package='$gid'";
$querysearch2="   SELECT object_point.id_workship_place, object_point.id_package, workship_place.name,
                 ST_X(ST_Centroid(workship_place.geom)) AS lon, ST_Y(ST_CENTROID(workship_place.geom)) 
                As lat FROM object_point JOIN workship_place ON object_point.id_workship_place=workship_place.id WHERE object_point.id_package='$gid'";
$querysearch3="   SELECT object_point.id_restaurant, object_point.id_package, restaurant.name,
                 ST_X(ST_Centroid(restaurant.geom)) AS lon, ST_Y(ST_CENTROID(restaurant.geom)) 
                As lat FROM object_point JOIN restaurant ON object_point.id_restaurant=restaurant.id WHERE object_point.id_package='$gid'";
$querysearch4="   SELECT object_point.id_souvenir, object_point.id_package, souvenir.name,
                 ST_X(ST_Centroid(souvenir.geom)) AS lon, ST_Y(ST_CENTROID(souvenir.geom)) 
                As lat FROM object_point JOIN souvenir ON object_point.id_souvenir=souvenir.id WHERE object_point.id_package='$gid'";
                
$querysearch5="   SELECT object_point.id_hotel, object_point.id_package, hotel.name,
                 ST_X(ST_Centroid(hotel.geom)) AS lon, ST_Y(ST_CENTROID(hotel.geom)) 
                As lat FROM object_point JOIN hotel ON object_point.id_hotel=hotel.id WHERE object_point.id_package='$gid'";
//$querysearch6=" SELECT id, name FROM travel as a where upper(name) like upper('%$name%') order by id ASC";

$dataarray=[];
// $x=0;
$hasil1=pg_query($querysearch1);
while($baris = pg_fetch_array($hasil1))
	{
        $id = $baris['id_tourism'];
		$name=$baris['name'];
        $longitude=$baris['lon'];
		$latitude=$baris['lat'];
        $dataarray1[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>4);
        // $x=1;
    }
// if ($x == 1 ) {
    array_push($dataarray,$dataarray1);
// }
// $x=0;

$hasil2=pg_query($querysearch2);
while($baris = pg_fetch_array($hasil2))
    {
        $id = $baris['id_workship_place'];
        $name=$baris['name'];
        $longitude=$baris['lon'];
        $latitude=$baris['lat'];
        $dataarray2[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>2);
        // $x=1;
    }
//if ($x == 1 ) {
    array_push($dataarray,$dataarray2);
// }
// $x=0;

$hasil3=pg_query($querysearch3);
while($baris = pg_fetch_array($hasil3))
    {
        $id = $baris['id_restaurant'];
        $name=$baris['name'];
        $longitude=$baris['lon'];
        $latitude=$baris['lat'];
        $dataarray3[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>3);
        // $x=1;
    }
// if ($x == 1 ) {
    array_push($dataarray,$dataarray3);
// }
// $x=0;

$hasil4=pg_query($querysearch4);
while($baris = pg_fetch_array($hasil4))
    {
        $id = $baris['id_souvenir'];
        $name=$baris['name'];
        $longitude=$baris['lon'];
        $latitude=$baris['lat'];
        $dataarray4[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>1);
        // $x=1;
    }
// if ($x == 1 ) {
    array_push($dataarray,$dataarray4);
// }
// $x=0;
$hasil5=pg_query($querysearch5);
while($baris = pg_fetch_array($hasil5))
    {
        $id = $baris['id_hotel'];
        $name=$baris['name'];
        $longitude=$baris['lon'];
        $latitude=$baris['lat'];
        $dataarray5[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>5);

        // $x=1;
    }
// if ($x == 1 ) {
    array_push($dataarray,$dataarray5);
// }
// $x=0;
// $hasil6=pg_query($querysearch6);
// while($baris = pg_fetch_array($hasil6))
//     {
//         $id = $baris['id_travel'];
//         $name=$baris['name'];
//         $longitude=$baris['lon'];
//         $latitude=$baris['lat'];
//         $dataarray4[]=array('id'=>$id, 'name'=>$name, 'longitude'=>$longitude,'latitude'=>$latitude,'status'=>6);
//         // $x=1;
//     }
// // if ($x == 1 ) {
//     array_push($dataarray,$dataarray5);
// // }
// // $x=0;

echo json_encode($dataarray);
?>
