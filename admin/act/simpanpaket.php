<?php
  require 'connect.php';            
  $id_objek = $_GET['id_objek'];     
  $id_status = $_GET['id_status'];
  $no_urut = $_GET['no_urut'];     
  $id_travel = $_GET['id_travel'];       
  $price = $_GET['price'];       
  $name = $_GET['name'];       

$text2 = "select * package where id_travel='$id_travel'";
$hasil=pg_query($text2);
$no=0;
while($data=pg_fetch_array($hasil))
	{
		$no++;
	}
  $text = "insert into package (id, id_travel, name, price) values ($id, '$id_travel', '$name', $price)";
?>

