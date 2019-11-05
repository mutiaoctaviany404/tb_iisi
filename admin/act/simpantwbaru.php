<?php
include ('../inc/connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$open = $_POST['open'];
$close = $_POST['close'];
$ticket = $_POST['ticket'];
$description = $_POST['description'];
//$id_district = $_POST['district'];
$geom = $_POST['geom'];


$text = "insert into tourism (id, name, address, open, close, ticket, description, geom) values ('$id', '$name', '$address', '$open', '$close', $ticket, '$description', ST_GeomFromText('$geom'))";
// echo $text;

$sql = pg_query($text);
 if ($sql)
 {
 	echo"<script>
        alert ('Data Added!');
        eval(\"parent.location='../?page=tempatwisata'\");
        </script>";
 }
 else 
 {
 	echo 'error';
 }
  
?>