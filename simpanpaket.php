<?php
  require 'connect.php';            
	$id_package = $_GET['data2'];


/*
1 industri
2 mesjid
3 rm
4 tw
5 htl
*/

if($_GET['data1']==1){      //menyimpan paket baru  
	$id_travel = $_GET['data3'];      
	$name = $_GET['data4'];         
	$price = $_GET['data5'];   
	$itinerary = $_GET['data6'];       
	$text = "insert into package (id, id_travel, name, price,itinerary) values ('$id_package', '$id_travel', '$name', $price, '$itinerary')";
	echo $text;
	$sql = pg_query($text);
}

elseif($_GET['data1']==2){     //menyimpan destinasi
	$data1 = $_GET['data2'];     // id
	$data2 = $_GET['data3'];     // objek  -- souvenir dkk
	$data3 = $_GET['data4'];     // cari objek
	$data6 = $_GET['data5'];	//time
	$data7 = $_GET['data7'];     // estimated
	
	$query = pg_query("SELECT*FROM object_point WHERE id_package='".$data1."'"); //total data object_point
	$id_number = 0;
	while($result = pg_fetch_array($query)){
			$id_number += 1;
	}
	
	$data5 = array(); // untuk pemilihan salah satu kolom pilihan untuk objek
	// data5 di array untuk memilih objek yan di panggil ke dalam string pada query
	$data5[5] = "id_hotel";
	$data5[4] = "id_tourism";
	$data5[3] = "id_restaurant";
	$data5[2] = "id_workship_place";
	$data5[1] = "id_souvenir";
	
	$id_number = $id_number + 1; //untuk menambah data baru
	
	$text = "insert into object_point (
				no_urut, 
				id_package, 
				status, 
				".$data5[$data2].",
				time, estimated_hour
				) values (
				'".$id_number."',
				'".$data1."',
				'".$data2."',
				'".$data3."',
				'".$data6."',
				'".$data7."'
				)";
	echo $text;
	$sql = pg_query($text);
}
else if($_GET['data1']==3){
	$data1 = $_GET['data2'];     // id 
	$data2 = $_GET['data3'];     // objek  -- souvenir dkk 
	$data5 = array();
	
	$data5[5] = "hotel";
	$data5[4] = "tourism";
	$data5[3] = "restaurant";
	$data5[2] = "workship_place";
	$data5[1] = "souvenir";
	
	//hasil pilih destinasi
	$query = pg_query("SELECT
							a.no_urut,
							b.name AS name1,
							c.name AS name2
						FROM object_point AS a, district AS b, 
						 WHERE st_contains(b.geom1, a.geom) AS b ON b.id = a.id".$data5[$data2]."
					 WHERE st_contains(b.geom1, a.geom) AS c ON c.id = b.id_district
						WHERE id_package='".$data1."'");

	
	while($row = pg_fetch_array($query))
    {
        $d1=$row['no_urut'];
        $d2=$row['name1'];
        $d3=$row['name2'];
        $dataarray[]=array('d1'=>$d1, 'd3'=>$d2, 'd2'=>$d3);
    }
	echo json_encode ($dataarray);
	
}
elseif($_GET['data1']==33){ // update nama paket
	$query = pg_query("
		UPDATE package
		SET name = '".$_GET['data3']."'
		WHERE id = '".$_GET['data2']."'
	");
}
elseif($_GET['data1']==4){ // update harga paket
	$query = pg_query("
		UPDATE package
		SET price = ".$_GET['data3']."
		WHERE id = '".$_GET['data2']."'
	");
} 
elseif($_GET['data1']==44){ // update itinerary paket
	// echo $_GET['itinerary'];
	$itinerary = $_GET['data3'];
	$query = pg_query("
		UPDATE package SET itinerary = '".$itinerary."' WHERE id = '".$_GET['data2']."'
	");
	if ($query) {
		echo "berhasil";
	}
} 
elseif($_GET['dats1']==5){
	
	$data5 = array();
	
	$dats5[5] = "id_hotel";
	$dats5[4] = "id_tourism";
	$dats5[3] = "id_restaurant";
	$dats5[2] = "id_workship_place";
	$dats5[1] = "id_souvenir";
	//menghapus destinasi untuk di update
	echo " tes simpan estimated
			insert into object_point (
				no_urut, 
				id_package, 
				status,
				".$dats5[$_GET['dats3']].",
				time,  estimated_hour
				) values (
				'".$_GET['dats5']."',
				'".$_GET['dats2']."',
				'".$_GET['dats3']."',
				'".$_GET['dats4']."',
				'".$_GET['dats6']."',
				'".$_GET['dats7']."'
				)
			";
	$query1001 = pg_query(" 
			DELETE FROM object_point
				WHERE id_package = '".$_GET['dats2']."' AND no_urut = '".$_GET['dats5']."'
		");
	
	$query1002 = pg_query("
			insert into object_point (
				no_urut, 
				id_package, 
				status,
				".$dats5[$_GET['dats3']].",
				time,  estimated_hour
				) values (
				'".$_GET['dats5']."',
				'".$_GET['dats2']."',
				'".$_GET['dats3']."',
				'".$_GET['dats4']."',
				'".$_GET['dats6']."',
				'".$_GET['dats7']."'
				)
			");
}  
elseif($_GET['data1']==6){
	$query = pg_query("
		UPDATE package
		SET price = ".$_GET['data3']."
		WHERE id = '".$_GET['data2']."'
	");
}  
 
 
//$sql = pg_query($text);
  // $hasil = pg_query($querysearch);
?>

