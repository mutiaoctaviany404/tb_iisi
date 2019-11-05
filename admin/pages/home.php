<?php
include 'connect.php';
require 'act/counttw.php';
?>

<div class="row">
    <div class="col-lg-5 col-xs-12">
      <div class="small-box bg-blue">
        <div class="inner"> 
          <h3><?php echo $data['tourism'] ?></h3>
          <p><span>Tourism</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-tag"></i>
        </div>
      </div>
    </div>

	<div class="col-lg-5 col-xs-12">
      <div class="small-box bg-green">
        <div class="inner">
        <h3><?php echo $data['restaurant'] ?></h3>
          <p><span>Restaurant</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-restaurant"></i>
        </div>
      </div>
    </div>

    <div class="col-lg-5 col-xs-12">
      <div class="small-box bg-green">
        <div class="inner"> 
        <h3><?php echo $data['workship_place'] ?></h3>
          <p><span>Worship Place</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-tag"></i>
        </div>
      </div>
    </div>

    <div class="col-lg-5 col-xs-12">
      <div class="small-box bg-blue">
        <div class="inner">
        <h3><?php echo $data['souvenir'] ?></h3>
          <p><span>Souvenir</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-tag"></i>
        </div>
      </div>
    </div>

     <div class="col-lg-5 col-xs-12">
      <div class="small-box bg-blue">
        <div class="inner">
        <h3><?php echo $data['hotel'] ?></h3>
          <p><span>Hotel</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-tag"></i>
        </div>
      </div>
    </div>

    <div class="col-lg-5 col-xs-12">
      <div class="small-box bg-green">
        <div class="inner"> 

          <p><span>Travel Agent</span></p>
        </div>
        <div class="icon">
          <i class="fa fa-tag"></i>
        </div>
      </div>
    </div>
  </div>