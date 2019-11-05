<?php
include ('../inc/connect.php');

$idbaru = $_POST['id'];
$user_id = $_POST['user_id'];
$namabaru = $_POST['name'];
$cpbaru = $_POST['cp'];
$geom = $_POST['geom'];
$email = $_POST['email'];
$travel_id = $_POST['travel_id'];
$password = $_POST['password'];
$role = $_POST['role'];
$address = $_POST['address'];

$text = "insert into travel (id,user_id, name, cp, geom, email) values ('$idbaru', '$user_id','$namabaru', '$cpbaru', ST_GeomFromText('$geom'), '$email'); insert into users (travel_id, user_id, username, password, cp, role,address, email) values ('$idbaru', '$user_id','$namabaru', '$password', '$cpbaru', '".b."','$address', '$email')";
// echo $text;

$sql = pg_query($text);
 
 if ($sql)
 {
 	echo"<script>
        alert ('Data Added!');
        eval(\"parent.location='../?page=travel'\");
        </script>";
 }
 else 
 {
 	echo 'error';
 }

?>


