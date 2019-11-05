<?php 
	include ('connect.php');
	$id = $_POST['id'];
	// $no_urut=$_POST['no_urut']
	$query = pg_query("SELECT MAX(no_urut) AS no_urut FROM video_package");
	 $result = pg_fetch_array($query);
	$idmax = $result['no_urut'];
                    if 
                      ($idmax==null) {$idmax=1;}
                    // ($idmax1==null) {$idmax=1;}

                    else {$idmax++;}
	
	
	$jenis_gambar=$_FILES['video']['type'];
	if(($jenis_gambar=="video/mp4") || ($jenis_gambar == "video/3gp")  || ($jenis_gambar == "video/avi") && ($_FILES['video']['size'] <=5000000000000000)){
		$sourcename=$_FILES["video"]["name"];
		$name=$sourcename;
		$filepath="video/".$name;
		move_uploaded_file($_FILES["video"]["tmp_name"],$filepath);
	
		$sql = pg_query("insert into video_package (gallery_package, no_urut, id_package) values('$name','$idmax','$id')");
		if($sql){
			header("location:detailpaket.php?id=$id");
		}
	}

	else{
		echo "The Video Isn't Valid!<br>";
		echo "Go Back To <a href='detailpaket.php?id=$id'></a>";
	}
?>