<?php
  include ('../inc/connect.php');
   
      $id=$_GET['id'];
      $gallery =pg_query("DELETE from restaurant_gallery where id_restaurant = '$id'");

      $sql="DELETE from restaurant where id= '$id'";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=rumahmakan'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
   
  
?>