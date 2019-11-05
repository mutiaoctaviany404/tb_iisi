<?php
include"../inc/connect.php";


    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $open = $_POST['open'];
    $close = $_POST['close'];
    $description = $_POST['description'];
   
    $geom = $_POST['geom'];
    //query UPDATE
	$query = "UPDATE souvenir SET 
    name='$name', 
    address='$address', 
    open='$open', 
    close='$close', 
    description='$description', 
    
     geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";
    $result = pg_query($query);
    if ($query) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailsouveniR&id=$id'\");
        </script>";
    } else{
        echo "error";
    }


?>