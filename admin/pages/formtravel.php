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

<div class="col-sm-6"> <!-- menampilkan form add mosque-->
    <section class="panel">
      <div class="panel-body">
          <a class="btn btn-compose">Add Travel's Information</a>
          <div class="box-body">

            <div class="form-group row">
              <form  name = "form_input" action="act/simpantravelbaru.php" enctype="multipart/form-data" method="POST">
                <?php
                  include '../connect.php';
                    $query = pg_query("SELECT MAX(id) AS id FROM travel");
                    $result = pg_fetch_array($query);
                    $idmax = $result['id'];
                    if ($idmax==null) {$idmax=1;}
                    else {$idmax++;}
                ?>
                
            </div>
            <input type="text" class="form-control hidden" id="id" name="id" value="<?php echo $idmax;?>">
            <div class="form-group row">
              <form  name = "form_input" action="act/simpantravelbaru.php" enctype="multipart/form-data" method="POST">
                <?php
                  include 'connect.php';
                    $query = pg_query("SELECT MAX(user_id) AS user_id FROM users");
                    $result = pg_fetch_array($query);
                    $a = $result['user_id'];
                    $idmax = $result['user_id'];
                    if ($idmax==null) {$idmax=1;}
                    else {$idmax++;}

                    if ($a==$result) {$a=1;}
                    else {$a++;}
                ?>

                 <input type="text" class="form-control hidden" id="user_id" name="user_id" value="<?php echo $idmax ?>">
                 <label for="geom">USER ID</label>
                   <textarea class="form-control" id="user_id" name="user_id" readonly required><?php echo $a ?></textarea>
            <div class="form-group">
              <label for="geom">Coordinat</label>
              <textarea class="form-control" id="geom" name="geom" readonly required><?php echo $data['geom'] ?></textarea>
            </div> 
            <div class="form-group">
              <label for="nama">Name</label>
              <input type="text" class="form-control" name="name" value="<?php echo $data['username'] ?>">
            </div>
            <div class="form-group">
              <label for="nama">CP</label>
              <input type="text" class="form-control" name="cp" value="<?php echo $data['cp'] ?>">
            </div>
            <div class="form-group">
              <label for="nama">E-mail</label>
              <input type="text" class="form-control" name="email" value="<?php echo $data['email'] ?>">
            </div>
            <div class="form-group">
              <label for="nama">Address</label>
              <input type="text" class="form-control" name="address" value="<?php echo $data['address'] ?>">
            </div>
       
            <div class="form-group">
              <label for="nama">Password</label>
              <input type="text" class="form-control" name="password" value="<?php echo $data['password'] ?>">
            </div>
            <button type="submit" class="btn btn-primary pull-center">Save <i class="fa fa-floppy-o"></i></button> 
            </div>

             </form>
        </div>
      </div>
    </div>
  </div>

