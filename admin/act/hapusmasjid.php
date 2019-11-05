<?php
  include ('../inc/connect.php');
   
      $id=$_GET['id'];
      $gallery =pg_query("DELETE from workship_place_gallery where id_workship_place = '$id'");

      $sql="DELETE from workship_place where id= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=masjid'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
?>