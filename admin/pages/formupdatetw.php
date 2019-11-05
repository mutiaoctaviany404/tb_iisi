<div class="col-sm-6"> <!-- menampilkan peta-->
  <section class="panel">
      <header class="panel-heading">
          <h3>                    
          <input id="latlng" type="text" class="form-control" style="width:200px" value="" placeholder="Latitude, Longitude">
          <button class="btn btn-default my-btn" id="btnlatlng" type="button" title="Geocode"><i class="fa fa-search"></i></button>
          <button class="btn btn-default my-btn" id="delete-button" type="button" title="Remove shape"><i class="fa fa-trash"></i></button> </h3>
      </header>
      <div class="panel-body">
          <div id="map" style="width:100%;height:420px; z-index:50"></div>
      </div>
  </section>
</div>

 <div class="col-sm-6"> <!-- menampilkan form add mosque-->
    <section class="panel">
                    <div class="panel-body">
                        <a class="btn btn-compose">Update Tourism's Information</a>
                        <div class="box-body">

            <div class="form-group row">
              <form role="form" method="post" action="act/saveupdatetw.php" enctype="multipart/form-data">
              <?php 
              include '../connect.php';
              if (isset($_GET['id']))
              {
                $id=$_GET['id'];
                $sql = pg_query("SELECT 
                  tourism.id, 
                  tourism.name as nama, 
                 tourism.address, 
                  tourism.open, 
                  tourism.close, 
                  tourism.ticket, 
                  tourism.description, 
                  district.name as name, 
                  ST_AsText(geom) as geom 
                  FROM tourism, district 
                  where tourism.id='$id'" );
                    
                $data =  pg_fetch_array($sql);
              }
              ?>
            </div>

            <input type="text" class="form-control hidden" id="id" name="id" value="<?php echo $id ?>">
            <div class="form-group">
              <label for="geom">Coordinat</label>
              <textarea class="form-control" id="geom" name="geom" readonly required><?php echo $data['geom'] ?></textarea>
            </div>    
            <div class="form-group">
              <label for="nama">Name</label>
              <input type="text" class="form-control" name="name" value="<?php echo $data['nama'] ?>">
            </div>
            <div class="form-group">
              <label for="alamat">Address</label>
              <input type="text" class="form-control" name="address" value="<?php echo $data['address'] ?>">
            </div>
            </div>
            <div class="form-group">
              <label for="open">Open Hour</label>
              <input type="time" class="form-control" name="open" value="<?php echo $data['open'] ?>">
            </div>
            <div class="form-group">
              <label for="close">Close Hour</label>
              <input type="time" class="form-control" name="close" value="<?php echo $data['close'] ?>">
            </div>
            <div class="form-group">
              <label for="ticket">Ticket</label>
              <input type="text" class="form-control" name="ticket" value="<?php echo $data['ticket'] ?>">
            </div>
            <div class="form-group">
              <label for="description">Description</label>
              <input type="text" class="form-control" name="description" value="<?php echo $data['description'] ?>">
            </div>

            <button type="submit" class="btn btn-primary pull-center">Save <i class="fa fa-floppy-o"></i></button> 

            <script src="inc/mapdraw.js" type="text/javascript"></script>
            </div>
          </div>
        </div>
      </div>
    </div>
