<?php
include '/connect.php';
function Orderan($user_id){
	$querysearch = "select  detail_booking.total, detail_booking.totalprice, detail_booking.no_urut, booking.user_id, booking.id_booking, users.username, detail_booking.id_package from booking
right join users on users.user_id= booking.user_id 
right join detail_booking on detail_booking.id_booking=booking.id_booking where users.user_id='$user_id'";
                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                  	//paket 
                  	$paket = pg_query("Select * from package where  id='$baris[id_package]'");
                  	$dpaket = pg_fetch_array($paket);
                  	$dd[] = array(
                  		'user_id'=>$baris['user_id'],
                  		'id_booking'=>$baris['id_booking'],
                  		'username'=>$baris['username'],
                  		'no_urut'=>$baris['no_urut'],
                  		'package_name'=>$dpaket['name'],
                  		'total'=>$baris['total'],
                  		'totalprice'=>$baris['totalprice'],
                  		);
                  }
                  return json_encode($dd);
}