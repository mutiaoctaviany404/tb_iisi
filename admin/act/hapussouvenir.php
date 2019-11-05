<?php
  include ('../inc/connect.php');

      $id=$_GET['id'];
      $gallery =pg_query("DELETE from souvenir_gallery where id_souvenir = '$id'");
      
      $sql="DELETE from souvenir where id= '$id' ";
      if(pg_query($sql))
      {
        echo"<script>
        alert ('Data Deleted!');
        eval(\"parent.location='../?page=souvenir'\");
        </script>"; 
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    
  
?>