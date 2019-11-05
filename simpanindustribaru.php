<?php
include ('connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$open = $_POST['open'];
$close = $_POST['close'];
// $fasilitas = $_POST['fasilitas'];
$description = $_POST['description'];
$id_district = $_POST['district'];
$geom = $_POST['geom'];



$text = "insert into souvenir (id, name, address, open, close, id_district, description, geom) values ('$id', '$name', '$address', '$open', '$close', '$id_district',  '$description', ST_GeomFromText('$geom'))";
echo $text;

$sql = pg_query($text);
 if ($sql){
 	echo "<script> alert (' Data Berhasil Ditambahkan');</script>";
 }
 else 
 {
 	echo 'error';
 }
 echo "<a href='localhost/wisatasolsel/industri.php'</a>";
?>