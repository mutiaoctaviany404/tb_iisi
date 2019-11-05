<?php
include"../inc/connect.php";


    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $open = $_POST['open'];
    $close = $_POST['close'];
    $price = $_POST['price'];
    $description = $_POST['description'];
    
    $geom = $_POST['geom'];
   
    //query UPDATE
	$query = "UPDATE restaurant
    SET 
    name='$name', 
    address='$address', 
    open='$open', 
    close='$close', 
    price=$price,  
    description='$description', 
    
    geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";
    // echo "query";
    $result = pg_query($query);
     if ($query) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailrm&id=$id'\");
        </script>";
    } else{
        echo "error";
    }
    

?>