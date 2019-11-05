<?php 
	include 'connect.php';
	$id = $_POST['id'];
	$querysearch="select no_urut from tourism_gallery where id='$id' order by no_urut desc limit 1";


	 $hasil=pg_query($querysearch);
	 $no_urut = 1;
	 while($baris = pg_fetch_array($hasil))
	 {
	 	$angka = $baris['no_urut'] + 1;
	 	$no_urut = $angka;
	 }

	$jenis_gambar=$_FILES['image']['type'];
	if(($jenis_gambar=="image/jpeg" || $jenis_gambar=="image/jpg" || $jenis_gambar=="image/gif"  || $jenis_gambar=="image/png") && ($_FILES["image"]["size"] <= 5000000)){
		$sourcename=$_FILES["image"]["name"];
		$name=$sourcename;
		$filepath="image".$name;
		move_uploaded_file($_FILES["image"]["tmp_name"],$filepath);
		$sql = pg_query("insert into tourism_gallery values('$no_urut','$id','$name')");
		if($sql){
			// header("location:../?page=formeditphotokul&id=$id");
		}
	}

	else{
		echo "The Picture Isn't Valid!<br>";
		echo "Go Back To <a href='tempatwisata.php&id=$id'>halaman detail</a>";
	}
?>