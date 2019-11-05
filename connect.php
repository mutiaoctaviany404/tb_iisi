<?php
	$host = "localhost";
	$user = "postgres";
	$pass = "root";
	$port = "5432";
	$dbname = "wisatasolsel";
	$conn = pg_connect("host=".$host." user=".$user." password=".$pass." port=".$port." dbname=".$dbname) or die("Gagal");
?>