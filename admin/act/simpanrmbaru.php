<?php
include ('../inc/connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$open = $_POST['open'];
$close = $_POST['close'];
$price = $_POST['price'];
$description = $_POST['description'];
//$id_district = $_POST['district'];
$geom = $_POST['geom'];

$text = "insert into restaurant (id, name, address, open, close, price,  description, geom) values ('$id', '$name', '$address', '$open', '$close', $price, '$description', ST_GeomFromText('$geom')  )";


$sql = pg_query($text);
 if ($sql){
 	echo"<script>
        alert ('Data Added!');
        eval(\"parent.location='../?page=rumahmakan'\");
        </script>";
 }
 
 else 
 {
 	echo 'error';
 }

?>