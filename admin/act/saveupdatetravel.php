<?php
include"../inc/connect.php";

    //Ambil data dari form
    $id = $_POST['id'];
    $name = $_POST['name'];
    $cp = $_POST['cp'];
    $geom = $_POST['geom'];
    $email = $_POST['email'];
    $travel_id = $_POST['id'];
    $password = $_POST['password'];
     // echo "post geom = ".$_POST['geomx']."</br>";
    //query UPDATE
	$query = "UPDATE 
    travel SET 
    name='$name',
    cp='$cp', 
       email='$email', 
    geom=ST_GeomFromText('$geom') 
    WHERE id='$id'";
  
    // return;
    $query2 = "UPDATE users SET username='$name', password='$password',  cp='$cp' WHERE travel_id='$id'";
          
     $result = pg_query($query);
     $result=pg_query($query2);
    if ($result) 
    {
        echo"<script>
        alert ('Data Updated!');
        eval(\"parent.location='../?page=detailtravel&id=$id'\");
        </script>";
    } else{
        echo "error";
    }
   

?>