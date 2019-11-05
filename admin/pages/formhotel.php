<div class="col-sm-6"> <!-- menampilkan peta-->
  <section class="panel">
      <header class="panel-heading">
          <h3>                    
          <input id="latlng" type="text" class="form-control" style="width:200px" value="" placeholder="Latitude, Longitude">
          <button class="btn btn-default my-btn" id="btnlatlng" type="button" title="Geocode"><i class="fa fa-search"></i></button>
          <button class="btn btn-default my-btn" id="delete-button" type="button" title="Remove shape"><i class="fa fa-trash-o"></i></button> </h3>
      </header>
      <div class="panel-body">
          <div id="map" style="width:100%;height:420px; z-index:50"></div>
      </div>
  </section>
</div>
                  
 <div class="col-sm-6"> <!-- menampilkan form add hotel-->
    <section class="panel">
      <div class="panel-body">
          <a class="btn btn-compose">Add Hotel's Information</a>
          <div class="box-body">

            <div class="form-group row">
              <form  name = "form_input" action="act/simpanhotelbaru.php" enctype="multipart/form-data" method="POST">
                <?php
                include '../connect.php';
                    $query = pg_query("SELECT MAX(id) AS id FROM hotel");
                    $result = pg_fetch_array($query);

                    $idmax = $result['id'];
                    if ($idmax==null) {$idmax=1;}
                    else {$idmax++;}
                ?>
            </div>

            <input type="text" class="form-control hidden" id="id" name="id" value="<?php echo $idmax;?>">
            <div class="form-group">
              <label for="geom">Coordinat</label>
              <textarea class="form-control" id="geom" name="geom" readonly required><?php echo $data['geom'] ?></textarea>
            </div> 
             <div class="form-group">
              <label for="nama">Name</label>
              <input type="text" class="form-control" name="name" value="<?php echo $data['name'] ?>">
            </div>
            <div class="form-group">
              <label for="alamat">Address</label>
              <input type="text" class="form-control" name="address" value="<?php echo $data['address'] ?>">
            </div>
            <div class="form-group">
              <label for="cp">Cp</label>
              <input type="text" class="form-control" name="cp" value="<?php echo $data['cp'] ?>">
            </div>
            <div class="form-group">
              <label for="type">Type</label>
              <select class="form-control select" style="width: 100%;" name="type" value="<?php echo $data['type'] ?>">
                                <option >-- Choose Type --</option>
                                <option >Hotel Bintang 1</option>
                                <option >Melati</option>
                                <option >Wisma</option>
                            
                              </select>

           
            </div>

              <button type="submit" class="btn btn-primary pull-center">Save <i class="fa fa-floppy-o"></i></button> 
               </div>
            </form>
          </div>
        </div>
      </div>
    </div>