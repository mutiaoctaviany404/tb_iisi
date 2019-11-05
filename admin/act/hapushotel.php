<?php
  include ('../inc/connect.php');

      $id=$_GET['id'];
      $gallery =pg_query("DELETE from hotel_gallery where id_hotel = '$id'");

      $sql="DELETE from hotel where id= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=hotel'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>