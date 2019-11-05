<!DOCTYPE html>
<html>
<head>
<meta name='viewport' content='initial-scale=1.0, user-scalable=no' /><style type='text/css'> 
html { height: 100%;width: 100% } 
body { height: 100%; width: 100%; margin: 0px; padding: 0px }
#map { height: 100%; width: 100% }
</style>

  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNnzxae2AewMUN0Tt_fC3gN38goeLVdVE"></script>
<script src='http://code.jquery.com/jquery-1.11.0.min.js' type='text/javascript'>
</script> 
<? 

$lat = -1.4063276; //KOORDINAT UNTUK MENAMPILKAN PETA SOLOK SELATAN
$lng = 101.1622912; 

$id = $_GET["id"];

// $rad = $_GET["rad"];  

?> 

</head>
<body onload='init()'> 
<div id='map'></div>
</body>




<script type='text/javascript'> 
var map;
// var ip_mobile="http://10.44.7.136/wisatasolsel/mobile/";
var server = "http://192.168.100.13/wisatasolsel/mobile/";
//var ip="http://10.44.7.31/t2-eng/";
var markersDua = [];
var waypts=[];
var arraykota=[]; 



  function init(){

    
    console.log("init jalan");
   
    var latlng = new google.maps.LatLng(<?php echo $lat; ?>, <?php echo $lng; ?>); 
    var myOptions = { 
      zoom:10, center: latlng, mapTypeId: google.maps.MapTypeId.ROADMAP }; 
      map = new google.maps.Map(document.getElementById('map'), myOptions);     
     var total=0;

     //rute(ab)
    while(arraykota.length>0){
      arraykota.pop();
    }
    while(waypts.length>0){
      waypts.pop();
    }
    $.ajax({ 
//      console.log(server+'rutepaket.php?id_package='+<?php echo $id; ?>);
    url: server+'rutepaket.php?id_package='+<?php echo $id; ?>, data: "", dataType: 'json', success: function(rows)
        { 
        for (var i in rows){   
          total=total+1;
          var row     = rows[i];
          var serial_number   = row.serial_number;
          var id_tourism   = row.id_tourism;
          var id_restaurant   = row.id_restaurant;
          var id_souvenir   = row.id_souvenir;            
          var id_workship_place  = row.id_workship_place;
          var id_hotel  = row.id_hotel;
         
          centerBaru      = new google.maps.LatLng(row.latitude, row.longitude);
          arraykota.push(centerBaru);       
          map.setZoom(9);          
        }
            //calcDire();      
            var directionsService = new google.maps.DirectionsService;
            directionsDisplay = new google.maps.DirectionsRenderer;
            for (var x = 1; x < arraykota.length-1;x++){
              // console.log("aaa");
              waypts.push({
                location:arraykota[x],
                stopover:true
              }) 
            }

            directionsDisplay.setMap(map);
            directionsService.route({
                origin: arraykota[0],
                destination: arraykota[arraykota.length-1],
                waypoints: waypts,
                optimizeWaypoints: true,
                travelMode: google.maps.TravelMode.DRIVING
              }, function(response, status) {
                if (status === google.maps.DirectionsStatus.OK) {
                  directionsDisplay.setDirections(response);
                  var route = response.routes[0];
              } 
            });

        }
      }); 
    
    districtTampil();

    }

    function districtTampil()
  {
    district = new google.maps.Data();
    district.loadGeoJson(server+'district.php');
    district.setStyle(function(feature)
    {
      var gid = feature.getProperty('id');
      if (gid == '1'){ color = '#E9967A' 
        return({
      fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });
    }
      else if(gid == '2'){ color = '#FF00FF' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });
    }
      else if(gid == '3'){ color = '#FFD700' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });

    }
      else if(gid == '4'){ color = '#4169E1' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });

    }else if(gid == '5'){ color = '#663399' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });

    }else if(gid == '6'){ color = '#A0522D' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });

    }else if(gid == '7'){ color = '#EE82EE' 
        return({
        fillColor:color,
          strokeWeight:2.0,
          strokeColor:'black',
          fillOpadistrict:0.3,
          clickable: false
        });

    }
        
    });
    district.setMap(map);
  }
  
</script>
</html>

