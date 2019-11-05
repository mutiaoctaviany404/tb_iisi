<?php
include"../inc/connect.php";
    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    
    $cp = $_POST['cp'];
    $type = $_POST['type'];
    $geom = $_POST['geom'];
   
    //query UPDATE
	$query = "UPDATE hotel SET 
    name='$name', 
    address='$address', 
    cp=$cp,  
    type='$type',  
    geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";
    // echo $query;
    $result = pg_query($query);
    if ($query) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailhotel&id=$id'\");
        </script>";
    } else{
        echo "error";
    }


?>
