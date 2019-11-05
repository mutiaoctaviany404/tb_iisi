<?php
  include ('/connect.php');

      $id=$_GET['id'];
      $gallery =pg_query("DELETE from video_package where id_package = '$id'");
      
      $sql="DELETE from package where id= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='paket.php'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>