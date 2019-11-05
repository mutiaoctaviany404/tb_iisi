<div class="col-sm-12">  <!-- menampilkan list mosque-->
    <section class="panel">
                    <div class="panel-body">
                        <a href="?page=formtravel" title="Add Travel" class="btn btn-compose"><i class="fa fa-plus"></i>Add Travel</a>
                        <div class="box-body">

                        <div class="form-group">
                       <table id="example" class="table table-hover table-bordered table-striped">
                         <a href="act/cetaktrav.php" class="fa fa-download"> Download <a  href>
             
                      <div class="form-group">
                       <table id="example2" class="table table-hover table-bordered table-striped">
            <thead>
              <tr>
                <th> ID </th>
                <th> NAME </th>
                <th> CONTACT PERSON </th>
                <th> ACTION </th>
                </tr>
              </thead>

              <tbody>
                <?php
                  include '../connect.php';
                  $id = $_GET['id'];
                  $querysearch = "SELECT travel.id, travel.name, travel.cp FROM travel order by id ASC";

                  $hasil = pg_query($querysearch);
                  while($baris = pg_fetch_array($hasil))
                  {
                    $id = $baris['id'];
                    $name = $baris['name'];
                    $cp = $baris['cp'];
                    $dataarray[]=array('id'=>$id,'name'=>$name,'cp'=>$cp);
                ?>

              <tr>
                <td><?php echo "$id" ?></td>
                <td><?php echo "$name" ?></td>
                <td><?php echo "$cp" ?></td>
                <td><?php echo "$aksi" ?>
                <a href="?page=detailtravel&id=<?php echo $id?>" class="btn btn-sm btn-default" title='Detail'><i class="fa fa-list"></i> Detail</a>
                <a href="act/hapustravel.php?id=<?php echo $id?>" class="btn btn-sm btn-default" title='Delete'><i class="fa fa-trash-o"></i></a>
              </tr>

            <?php
            }
            ?>

            </tbody>
          </table>
        </div>
        </div>
      </div>

 