<?php
  include ('../inc/connect.php');

      $id=$_GET['id'];
      $gallery =pg_query("DELETE from tourism_gallery where id_tourism = '$id'");

      $sql="DELETE from tourism where id= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=tempatwisata'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>