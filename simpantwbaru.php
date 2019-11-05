<?php
include ('connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$open = $_POST['open'];
$close = $_POST['close'];
$ticket = $_POST['ticket'];
$description = $_POST['description'];
$id_district = $_POST['district'];
$geom = $_POST['geom'];


$text = "insert into tourism (id, name, address, open, close, ticket, description, geom, id_district) values ('$id', '$name', '$address', '$open', '$close', $ticket, '$description', ST_GeomFromText('$geom'), '$id_district')";
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
  echo "<a href='localhost/wisatasolsel/tempatwisata.php'</a>";
?>