<?php
require 'connect.php';
session_start();

$email = $_POST['email'];
$password = $_POST['password'];
//$op = $_GET['op'];
if(isset($_GET['op'])){
 $op = $_GET['op'];
 if($op=="in"){
  $cek = pg_query("SELECT * FROM users WHERE email='$email' and password='$password'");
  if(pg_num_rows($cek)==1){//jika berhasil akan bernilai 1
   
   $c = pg_fetch_array($cek);
   $_SESSION['email'] = $c['email'];
   $_SESSION['id_role'] = $c['id_role'];
   //$_SESSION['id_pemb']= $data['id_pemb'];
   if($c['id_role']=='1'){
    header("localhost/wisatasolsel/index2.php");
   }
   else if($c['id_role']==2){
    $a= $c['email'];
    $cek1 = pg_query("SELECT * FROM travel WHERE email='$a'");
    $c1 = pg_fetch_array($cek1);
    $_SESSION['id_travel']= $c1['id_travel'];
    echo "aaaaaaaaaaaa";
    header("localhost/wisatasolsel/index3.php");
    //
   }
  }
  else{
   echo 
     "<script>
     alert('Login Gagal');
     eval(\"parent.location='login.php '\"); 
     </script>";
   
  }
 }
 else{
  
  echo "zzl";
  header('location:login.php');
 }
}
else if($op=="out"){
  unset($_SESSION['username']);
  unset($_SESSION['id_role']);
  header("location:login.php");
}
?>