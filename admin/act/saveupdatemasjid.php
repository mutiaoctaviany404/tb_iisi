<?php
include"../inc/connect.php";


    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $geom = $_POST['geom'];

    //query UPDATE
	$query = "UPDATE 
    workship_place SET 
    name='$name', 
    address='$address',  

    geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";

    $result = pg_query($query);
     if ($query) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailmasjid&id=$id'\");
        </script>";
    } else{
        echo "error";
    }
    
?>