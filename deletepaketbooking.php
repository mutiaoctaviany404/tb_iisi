<?php
  include ('connect.php');

      $id=$_GET['id'];
      $gallery =pg_query("DELETE from detail_booking where id_booking = '$id'");

      $sql="DELETE from booking where id_booking= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='paketbooking.php'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>