<?php
include ('../inc/connect.php');

$id = $_POST['id'];
$name = $_POST['name'];
$address = $_POST['address'];
$cp = $_POST['cp'];
$type = $_POST['type'];

$geom = $_POST['geom'];

$text = "insert into hotel (id, name, address,cp, type, geom ) values 
('$id', '$name', '$address',$cp, '$type', ST_GeomFromText('$geom'))";

$sql = pg_query($text);
 if ($sql)
 {
 	echo"<script>
        alert ('Data Added!');
        eval(\"parent.location='../?page=hotel'\");
        </script>";
 }
 else 
 {
 	echo 'error';
 }
  
?>