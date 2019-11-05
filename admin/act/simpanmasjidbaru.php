<?php
include ('../inc/connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$geom = $_POST['geom'];


$text = "insert into workship_place (id, name, address, geom) values ('$id', '$name', '$address', ST_GeomFromText('$geom'))";
// echo $text;

$sql = pg_query($text);
 if ($sql)
 {
 	echo"<script>
        alert ('Data Added!');
        eval(\"parent.location='../?page=masjid'\");
        </script>";
 }
 else 
 {
 	echo 'error';
 }

?>