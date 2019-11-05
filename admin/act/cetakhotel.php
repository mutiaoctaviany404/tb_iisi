
<!DOCTYPE html>
<html>
<head>
  <title> CETAK DATA hotel </title>
</head>
  <div class="form-group">
            <table id="example2" class="table table-hover table-bordered table-striped">

            <thead>
            <table border="1">
              <tr>
                <th> ID </th>
                <th> NAME </th>
                <th> LOCATION </th>
                <th> CP </th>
                <th> TYPE </th>
               <!--  <th> PRICE </th> -->
               <!--  <th> KOORDINAT </th> -->
                
                </tr>
              </thead>

              <tbody>
                <?php
                  require 'connect.php';

                  $id = $_GET['id'];
                  $querysearch = "SELECT hotel.id, hotel.name, hotel.address, hotel.cp, hotel.type FROM hotel order by id ASC";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                    $id = $baris['id'];
                    $name = $baris['name'];
                    $address = $baris['address'];
                     $cp = $baris['cp'];
                      $type = $baris['type'];
                      //$price = $baris['price'];
                        // $koordinat = $baris['geom'];
                         

                    $dataarray[]=array('id'=>$id,'name'=>$name,'address'=>$address, 'cp'=>$cp,'type'=>$type);
                ?>

              <tr>
                <td><?php echo "$id" ?></td>
                <td><?php echo "$name" ?></td>
                <td><?php echo "$address" ?></td>
                <td><?php echo "$cp" ?></td>
                <td><?php echo "$type" ?></td>
               <!--  <td><?php echo "$price" ?></td> -->
                <!-- <td><?php echo "$koordinat" ?></td>  -->
                
                
              </tr>
            <?php
            }
            ?>
        <script>
    window.print();
  </script>
            </tbody>
          </table>

        </div>
      </div>
                
  

</tbody>
</html>
