<?php
  include ('connect.php');

      $id_booking=$_GET['id_booking'];
      $gallery =pg_query("DELETE from detail_booking where id_booking = '$id_booking'");

      $sql="DELETE from booking where id_booking= '$id_booking' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='mybooking.php'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>