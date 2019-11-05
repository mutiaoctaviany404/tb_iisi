<?php
  include ('../inc/connect.php');
    
      $id=$_GET['id'];
      $c =pg_query("Select *from package where id_travel = '$id'");
      $row = pg_fetch_array($c);
      $idpackage = $row['id'];

      $f =pg_query("Select *from booking where user_id = '$id'");
      $data = pg_fetch_array($f);
      $user_id = $data['user_id'];
      echo $id_booking;


        

      $d =pg_query("DELETE from video_package where id_package = '$idpackage'");

      $b =pg_query("DELETE from users where travel_id = '$id'");
       $g =pg_query("DELETE from booking where user_id = '$id'");
       $h =pg_query("DELETE from detail_booking where id_package = '$id_booking'");

       $a =pg_query("DELETE from package where id_travel = '$id'");
      $sql="DELETE from travel where id= '$id' ";

      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=travel'\");
        </script>";  
        // header("location:../?page=travel");  
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
   
  // echo "<script>document.location='../?pages=travel.php'</script>";
?>