<?php
require 'connect.php';

$id = $_GET["id"];
 
$querysearch	="SELECT id, name, price 
					FROM package as a where id_travel = '$id'";

$hasil=pg_query($querysearch);
while($row = pg_fetch_array($hasil))
	{
		  $id=$row['id'];
		  $name=$row['name'];
		  $price=$row['price'];
		  $dataarray[]=array('id'=>$id,'name'=>$name,'price'=>$price);  
	}
echo json_encode ($dataarray);
?>