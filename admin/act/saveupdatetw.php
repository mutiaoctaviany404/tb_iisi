<?php
include"../inc/connect.php";
    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $open = $_POST['open'];
    $close = $_POST['close'];
    $ticket = $_POST['ticket'];
    $description = $_POST['description'];
    $geom = $_POST['geom'];
    //$id_district = $_POST['id_district'];
   

    //query UPDATE
	$query = "UPDATE tourism SET 
    name='$name', 
    address='$address', 
    open='$open', 
    close='$close', 
    ticket=$ticket,  
    description='$description', 
  
    
    geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";
    // echo $query;
    $result = pg_query($query);
    if ($query) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailtw&id=$id'\");
        </script>";
    } else{
        echo "error";
    }
    

?>
