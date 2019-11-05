
<!DOCTYPE html>
<html>
<head>
  <title> CETAK DATA TRAVEL </title>
</head>
  <div class="form-group">
            <table id="example2" class="table table-hover table-bordered table-striped">

            <thead>
            <table border="1">
              <tr>
                <th> ID </th>
                <th> NAME </th>
                <th> CP </th>
                <!-- <th> OPEN </th>
                <th> CLOSE </th>
                <th> PRICE </th>
                <th> KOORDINAT </th>
                <th> DESCRIPTION </th> -->
                </tr>
              </thead>

              <tbody>
                <?php
                  require 'connect.php';

                  $id = $_GET['id'];
                  $querysearch = "SELECT travel.id, travel.name, travel.cp FROM travel order by id ASC";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                    $id = $baris['id'];
                    $name = $baris['name'];
                    $cp = $baris['cp'];
                     // $open = $baris['open'];
                     //  $close = $baris['close'];
                     //   $price = $baris['price'];
                     //    $koordinat = $baris['geom'];
                     //     $description = $baris['description'];

                    $dataarray[]=array('id'=>$id,'name'=>$name,'cp'=>$cp);
                ?>

              <tr>
                <td><?php echo "$id" ?></td>
                <td><?php echo "$name" ?></td>
                <td><?php echo "$cp" ?></td>
                <!-- <td><?php echo "$open" ?></td>
                <td><?php echo "$close" ?></td>
                <td><?php echo "$price" ?></td> -->
                <!-- <td><?php echo "$koordinat" ?></td>  -->
                 <!-- <td><?php echo "$description" ?></td> -->
                
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
