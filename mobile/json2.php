<?php
header('content-type: application/json; charset=utf8'); //agar aplikasi bisa diakses dari perangkat lain
header("access-control-allow-origin: *"); 
include ('connect.php');

	$query = file_get_contents("php://input");
	$sql = pg_query($query);
	
	$num = pg_num_rows($sql);
	$dt = pg_fetch_array($sql);
	
	$data = array();
	if($dt['role'] == c){
				$data['user_id'] = $dt['user_id'];
				$data['role'] = c;
			}
	
	// if($num==1){
	// 		// login benar //

	// 		if($dt['role'] == a){
	// 			$data['username'] = $dt['username'];
	// 			 $data['administrator'] = a;
	// 		}
	// 		else if($dt['role'] == b){
	// 			$data['username'] = $dt['username'];
	// 			 $data['role'] = b;
	// 		}
	// 		else if($dt['role'] == c){
	// 			$data['username'] = $dt['username'];
	// 			$data['role'] = c;
	// 		}

	
	 else {
			// jika login salah //
			$data['user_id'] = null;
			$data['role'] = 0;
	}
	
	print json_encode($data);
	
?>
