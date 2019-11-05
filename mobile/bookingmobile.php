<?php
include ('connect.php');

//
$username = $_POST['username'];
$date = $_POST['date'];
$total = $_POST['total'];
$totalprice = $_POST['totalprice'];
$id_package = $_POST['id_package'];

$text = "insert into booking (username, id_package, date, total, totalprice) values ('$username', $id_package, '$date', $total, $totalprice)";
// echo $text;

$sql = pg_query($text);
 if ($sql){
 	echo"<script>
        alert ('Booking tour packages successfully!');
        eval(\"parent.location='indexes.php'\");
        </script>";
 }
 
 else 
 {
 	echo 'error';
 }
?>