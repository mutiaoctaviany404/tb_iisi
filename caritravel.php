<?php
require 'connect.php';

$name = $_GET["name"];
 
$querysearch	=" 	SELECT id, name
					FROM travel as a where upper(name) like upper('%$name%') order by id ASC
				";

$hasil=pg_query($querysearch);
while($row = pg_fetch_array($hasil))
	{
		  $id=$row['id'];
		  $name=$row['name'];
		  $dataarray[]=array('id'=>$id,'name'=>$name,);  
	}
echo json_encode ($dataarray);
?>