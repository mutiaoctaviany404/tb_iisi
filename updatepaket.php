<?php 

require 'connect.php';
$id = $_GET["id"];
?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>Solok Selatan Tourism</title>
    
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
    <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
    
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
    <script src="assets/js/chart-master/Chart.js"></script>
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript">

    var server = "http://localhost/wisatasolsel/";

  function getserial(serial){
    var input = document.getElementById('no_urut');
    var isidm = "datamodal"+serial;
    var input2 = document.getElementById(isidm).value;
    var isitime = "dataisitime"+serial;
    var input3 = document.getElementById(isitime).value;
    var id_package = "<?php echo $id; ?>";
    input.value = serial;
    console.log("data id page :::::::::::::::: "+id_package);
    console.log("getserial fired with serial : "+serial);
    console.log("hai ini data  : "+input3);
    document.getElementById('judul').innerHTML = input2;
    document.getElementById('n6').value = input3;

  }

	
	function cariobjek(){
      $('#n4').empty();
     
      var district = document.getElementById('district').value;
      var objek =document.getElementById('n3').value;
      
      if (objek!=0 && district!=0){
        $.ajax({url: "http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district, data: "", dataType:
         'json', success: function(rows){
          console.log(rows);
          console.log("http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district); 
            if (objek=="1") {
              // console.log("jalan1");
              for (var i in rows){

                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#n4').append('<option value="'+id+'">'+name+'</option>');

              }
            }
            else if (objek=="2") 
            {
              for (var i in rows)
              {
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#n4').append('<option value="'+id+'">'+name+'</option>');
              }
            }
            else if (objek=="3")
            {
              for (var i in rows)
              {
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#n4').append('<option value="'+id+'">'+name+'</option>');
              }
            }
            else if (objek=="5") 
            {
              for (var i in rows)
              {
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#n4').append('<option value="'+id+'">'+name+'</option>');
              }
            }
            else 
            {
              for (var i in rows)
              {
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#n4').append('<option value="'+id+'">'+name+'</option>');
              }
            }

          }});//end ajax
        }//end if
}
var nourut=1;
function tampilobjek(){
      var cariobjek = document.getElementById('n4').value;
      if (cariobjek == '') {
        alert("Please Choose Object");
      } else {
        nourut++;
        var no = nourut-1;
        var district = document.getElementById('district').value;
        console.log(district);
        var objek =document.getElementById('objek').value;
        console.log(objek);
       

        paket_objek.push(objek);
        paket_id.push(cariobjek);

        console.log("4578945678945678902345678903456789034567890456789");
        console.log(paket_objek.length);
        console.log("4578945678945678902345678903456789034567890456789");
        for (var i = 0; i<paket_objek.length; i++) {
          console.log(paket_objek[i]);
          console.log(paket_id[i]);
        };

        var hasil = document.getElementById('cariobjek');
        var name = hasil.options[hasil.selectedIndex].text;
        var id = document.getElementById('objek').value;
        $('#hasilcaritempat').append("<tr><td>"+no+"</td><td>"+name+"</td><td>"+id+"</td></tr>");
        
      }

}
function Up1(){
  console.log('ok');
	var z = document.getElementById('n0').value;
	var a = document.getElementById('n1').value;
	$.ajax({
    url: "simpanpaket.php?data1=33&data2="+z+"&data3="+a, 
    dataType: 'json', 
     success: function(rows){
      alert('test');
    }
  });
}
function Up2(){
	var z = document.getElementById('n0').value;
	var a = document.getElementById('n2').value;
	$.ajax({url: "simpanpaket.php?data1=4&data2="+z+"&data3="+a, data: "", dataType: 'json', success: function(rows){}});
}
function Up3(){
	var z = document.getElementById('n0').value;
	var a = document.getElementById('n3').value;
	var b = document.getElementById('n4').value;
  var g = document.getElementById('no_urut').value;
  var h = document.getElementById('n6').value;
 var j = document.getElementById('n9').value;
  console.log("serial number :"+g);
	$.ajax({url: "simpanpaket.php?dats1=5&dats2="+z+"&dats3="+a+"&dats4="+b+"&dats5="+g+"&dats6="+h+"&dats7="+j, data: "", dataType: 'json', success: function(rows){
	}});
  window.location.href = "updatepaket.php?id=<?php echo $id; ?>";
}
function Up4(){
  var z = document.getElementById('n0').value;
  var a = document.getElementById('n7').value;
  $.ajax({url: "simpanpaket.php?data1=44&data2="+z+"&data3="+a, data: "", dataType: 'json', success: function(rows){}});
  //window.location.href = "updatepaket.php?id=<?php echo $id; ?>";
  //alert('berhasil');
  console.log("serial number :"+a,z);
  console.log("simpanpaket.php?data1=44&data2="+z+"&data3="+a)
}

    </script>
  </head>
 <body> 
  <section id="container" >

<header class="header black-bg">
  <div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
  </div>
  <a href="index.html" class="logo"><b>Solok Selatan Tourism</b></a>
  <div class="nav notify-row" id="top_menu">
    <ul class="nav top-menu"></ul>   
  </div>

  <div class="btn-group pull-right">                 
                <button class="btn btn-inverse btn-default btn-sm"><a type="button" href="logout.php">Logout</a></button>               
            </div> 

  <div class="top-menu">
  </div>
</header>

<aside>
  <div id="sidebar"  class="nav-collapse ">
  <!-- sidebar menu start-->
    <ul class="sidebar-menu" id="nav-accordion">
        <p class="centered"><a href="#"><img src="assets/img/travel.jpg" class="img-circle" width="130" height="130"></a></p>
       <h5 class="centered"><?php echo $_SESSION['travel_id'];?></h5>
        <li class="sub-menu">
          <li><a href="index3.php">   <i class="fa fa-pencil"></i>CREATE PACKAGE</a></li>
        </li>
        <li class="sub-menu">
          <li><a href="paket.php"><i class="fa fa-list"></i>MY PACKAGE</a></li>
        </li>
        <li class="sub-menu">
          <li><a href="paketbooking.php"><i class="fa fa-folder"></i>PACKAGE ORDERED</a> </li>
        </li>   
    </ul>
  </div>
</aside>



<section id="main-content">
  <section class="wrapper">
      <h1>YOUR PACKAGE</h1>
      <div class="row">
        <div class="col-xs-12">
        <div class="box">
        <div class="box-header clearfix">
 <?php

$query0 = "SELECT*FROM package where package.id='$id'";
$query1 = "SELECT*FROM object_point where id_package='$id' ORDER BY object_point.no_urut ASC";

$arr0 = array();
$arr1 = array();
$arr2 = array();
$data0=pg_query($query0);
while($row = pg_fetch_array($data0)){
	$arr0 = array(
		'id' => $row['id'],
		'name' => $row['name'],
		'price' => $row['price'],
     'itinerary' => $row['itinerary']
	);
} 


$data0=pg_query($query1);
$indexArray = 0;
while($row = pg_fetch_array($data0)){
	$arr1[$indexArray] = array(
		$row['no_urut'],
		$row['id_souvenir'],
		$row['id_workship_place'],
		$row['id_restaurant'],
		$row['id_tourism'],
    $row['id_hotel'],
    $row['status'],
    $row['time'],
    $row['estimated_hour']
	); $indexArray += 1;
}
  ?>
<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header" style="background-color:orange">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title" id="judul">Update</h4>
      </div>
      <div class="modal-body">
        <!-- -->
		
		<div class="form-group row" id="data0">
                <label for="example-search-input" class="col-sm-3 col-form-label">Choose district</label>
                  <div class="col-sm-6">
                    <input type="hidden" id="no_urut" value=""/>
                    <select class="form-control select2" style="width: 100%;" id="district" onchange="cariobjek()">
                        <option value="0">-- Choose district --</option>
                          <?php
                            $sql = pg_query("select * from district");
                            while($row1 = pg_fetch_array($sql)){
                              echo "<option value=\"$row1[id]\">$row1[name]</option>";}
                          ?>
                      </select>
                  </div>
              </div> 

              <div class="form-group row" id="data1">
                <label for="example-search-input" class="col-sm-3 col-form-label">Choose Object</label>
                  <div class="col-sm-6">
                    <select class="form-control select2" style="width: 100%;" id="n3" onchange="cariobjek()">
                        <option value="0">-- Choose Object --</option>
                        <option value="1">Souvenir</option>
                        <option value="2">Mosque</option>
                        <option value="3">Restaurant</option>
                        <option value="4">Tourism</option>
                        <option value="5">Hotel</option>
                      </select>
                  </div>
              </div> 
			  
        <div class="form-group row" id="data2">
                <label for="example-search-input" class="col-sm-3 col-form-label">Choose Place</label>
                  <div class="col-sm-6">
                    <select class="form-control select2" style="width: 100%;" id="n4"></select>
                  </div>
        </div> 

        
            <div class="form-group row" id="data3">
                <label for="example-search-input" class="col-sm-3 col-form-label">Estimated Hour</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" style="width: 100%;" id="n9" />
                  </div>
        </div> 
        <div class="form-group row" id="data3">
                <label for="example-search-input" class="col-sm-3 col-form-label">Distance</label>
                  <div class="col-sm-6">
                    <input type="text" class="form-control" style="width: 100%;" id="n6" />
                  </div>
        </div>
		
		<!-- -->
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="Up3()">Save</button>
      </div>
    </div>

  </div>
</div>
  <div class="col-sm-8"> 
                  <section class="panel">
                      <header class="panel-heading">
            <h2 class="box-title" style="text-transform:capitalize;"><b> <?php echo $name ?></b></h2>
              
                      </header>
                      <div class="panel-body">
              <table class="table table-striped table-hover table-condensed">

          <tbody  style='vertical-align:top;'>
            <?php 
			echo "  <tr>
                <td>Name: </td>
                <td colspan='5'>
                  <input class='form-control' id='n0' value='".$id."' style='display:none' />
                  <input class='form-control' id='n1' value='".$arr0['name']."' /></td>
                <td><button class='form-control' id='tombolup1' onclick='Up1()'>Update</button></td>
              </tr>";
			echo "  <tr>
                <td>Price: </td>
                <td colspan='5'><input class='form-control' id='n2' value='".$arr0['price']."' /></td>
                <td><button class='form-control' id='' onclick='Up2()'>Update</button></td>
              </tr>";

   $x=$arr0['itinerary'];
      echo "  <tr>
                <td><b>Itinerary: </b></td>
                <td colspan='5'><textarea class='form-control' rows='15' id='n7' value='$x'>$x</textarea></td>
                <td><button class='form-control' id='' onclick='Up4()'>Update</button></td>
              </tr>";
              
			echo "<tr><td colspan='6'></br> <b>Destinasi : </b></br><td></tr>";
      echo "<tr><td colspan='6'></br> <b>No : &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp District 
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Destinasi &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Distance 
      &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Estimated&nbspHour </b> <b</br><td></tr>";


      $a = count($arr1);
      $arr2[5] = "hotel";
			$arr2[4] = "tourism";
			$arr2[3] = "restaurant";
			$arr2[2] = "workship_place";
			$arr2[1] = "souvenir";
      
			for($i=0;$i<$a;$i++){
				$column = 0;
				$query2="SELECT  
         a.name AS n1,
         b.name AS n2
         FROM ".$arr2[$arr1[$i][6]]." AS a, district as b 
         WHERE st_contains(b.geom1, a.geom) and a.id = '".$arr1[$i][$arr1[$i][6]]."'
          ";
 
				$data0=pg_query($query2);
				while($row = pg_fetch_array($data0)){ 
					echo "<tr>
                  <td>".$arr1[$i][0]." </td>
                  <td>".$row['n2']."</td>
                  <td> &nbsp ".$row['n1']." </td>
                  <td> &nbsp ".$arr1[$i][7]."</td>
                  <td> &nbsp ".$arr1[$i][8]."</td>
                  <td>&nbsp&nbsp&nbsp&nbsp
                      <input style='display:none' id='datamodal".$arr1[$i][0]."' value='".$arr1[$i][0].". ".$row['n2']." :: ".$row['n1']."' />
                      <input style='display:none' id='dataisitime".$arr1[$i][0]."' value='".$arr1[$i][6]."' />
						          <button class='form-control' id='".$arr1[$i][0]."' data-toggle='modal' data-target='#myModal'
                       onclick='getserial(this.id)'>Update</button>
						
                  </td>
                </tr>";
				}
			}
             ?>
          </tbody>
          
        </table>
        
                      </div>
</section>
  </div>
  
</body>
</html>
                  
              