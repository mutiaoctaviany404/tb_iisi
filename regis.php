<?php
include ('connect.php');
$regis = $_POST['regis'];
$username = $_POST['username'];
$password = $_POST['password'];
$cp = $_POST['cp'];
$email = $_POST['email'];
$user_id = $_POST['user_id'];
$address = $_POST['address'];
$role = $_POST['role'];

    $query = "insert into users (user_id, username, password, cp, address, role, email) values ('".$user_id."','".$username."','".$password."','".$cp."','".$address."','".c."','".$email."')";

    $cek = pg_query($query);
    
    if($cek)
    {
      /*$_SESSION['admin']=true;
      header('Location:../admin');
      exit();*/
      header('Location:login.php?reg=true');
    }
    else{
      echo "gagal";
    }
?>