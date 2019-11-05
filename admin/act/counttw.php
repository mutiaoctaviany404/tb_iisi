<?php 
include ('inc/connect.php');

		$sql = "select count(*) from tourism ";
		// $sql1 = "select count(*) from restaurant ";
		// $sql2 = "select count(*) from workship_place ";
		// $sql3 = "select count(*) from souvenir ";
		// $sql4 = "select count(*) from hotel ";
		// $sql5 = "select count(*) from travel ";
				
		$query = pg_query($sql);
		// $query = pg_query($sql1);
		// $query = pg_query($sql2);
		// $query = pg_query($sql3);
		// $query = pg_query($sql4);
		// $query = pg_query($sql5);
		
	if(pg_num_rows($query)>0){
			$data = pg_fetch_assoc($query);
			return $data;
		}
		
 
 ?>

