<?php
include ('connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$id_district = $_POST['district'];
$geom = $_POST['geom'];


$text = "insert into workship_place (id, name, address, id_district, geom) values ('$id', '$name', '$address', '$id_district', ST_GeomFromText('$geom')  )";
echo $text;

$sql = pg_query($text);
 if ($sql)
 {
 	echo "<script> alert (' Data Berhasil Ditambahkan');</script>";
 }
 else 
 {
 	echo 'error';
 }
  echo "<a href='localhost/wisatasolsel/masjid.php'</a>";
?>