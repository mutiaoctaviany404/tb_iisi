<?php
  include 'connect.php';
    if(isset($_GET['id']))
    {
      $id=$_GET["id"];
       $gallery =pg_query("DELETE from video_package where id_travel = '$id'");

      $sql="DELETE from travel where id= '$id' ";

      if(pg_query($sql))
      {
        echo"<script>alert ('Data Deleted!');</script>";  
      }
      else
      {
        echo"<script>alert ('Failed to Delete Data!');</script>";
      }
    }
  echo "<script>document.location='travel.php'</script>";
?>