<?php
include ('connect.php');

//
$no_urut = $_POST['no_urut'];
$user_id = $_POST['user_id'];
$date = $_POST['date'];
$total = $_POST['total'];
$totalprice = $_POST['totalprice'];
$id_booking = $_POST['id_booking'];
$id_package = $_POST['id_package'];
 

$variabel_cari = $date."".$id_booking."".$id_package;

$text = "insert into booking (user_id, id_booking, date) values ('$user_id', '$id_booking', '$date')";
// echo $text;
$text2 = "insert into detail_booking (no_urut, id_booking, id_package, total, totalprice) values ('$variabel_cari','$id_booking','$id_package', '$total', '$totalprice')";

$sql = pg_query($text);
$sql2= pg_query($text2);

 if ($sql)
 {
 

 	if ($sql2)
 	{
 	echo"<script>
        alert ('Your order has been successfully saved!');
        eval(\"parent.location='indexes.php'\");
        </script>";
    }

 }
 
 else 
 {
 	echo 'error';
 }
?>