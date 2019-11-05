
    var server = "http://localhost/wisatasolsel/";
    var map;
    var markersDua = [];
    var markersDkt = [];
    var centerBaru;
    var koordinat = null;
    var infoposisi= [];
    var centerLokasi;
    var markerposisi = [];
    var infoDua = [];
    var hapusMarkersDkt = [];
    var circles = [];
    var directionsDisplay = [];


function posisisekarang()
{
  hapusmarker();
  google.maps.event.clearListeners(map, 'click');
  navigator.geolocation.getCurrentPosition(function(position)
  {
    koordinat = {
    lat: position.coords.latitude,
    lng: position.coords.longitude
    };
      
    centerBaru = new google.maps.LatLng(koordinat.lat, koordinat.lng);
    map.setCenter(centerBaru)
    map.setZoom(10);
    var marker =  new google.maps.Marker({
                  position: koordinat,
                  animation: google.maps.Animation.DROP,
                  map: map
                  });

    infowindow = new google.maps.InfoWindow({
    position: koordinat,
    content: "<center><a style='color:black;'>You are here <br> lat : "+koordinat.lat+" <br> long : "+koordinat.lng+"</a></center>"  
    });
    infowindow.open(map, marker);

    markersDua.push(marker);
    infoposisi.push(infowindow);
    map.setCenter(centerBaru);
  });
}


function lokasimanual()
{
  alert('Click map');
  hapusmarker();
  map.addListener('click', function(event)
  {
    // hapusmarker();
    addMarker(event.latLng);
  });
}
     
function addMarker(location)
{
  for (var i = 0; i < markerposisi.length; i++) 
  {
  markerposisi[i].setMap(null);
  } 

  marker = new google.maps.Marker({
  //icon: "assets/img/biru1.ico",
  position : location,
  map: map,
  animation: google.maps.Animation.DROP,
  });
      
  koordinat = {
  lat: location.lat(),
  lng: location.lng()
  }

  centerLokasi = new google.maps.LatLng(koordinat.lat, koordinat.lng);
  markerposisi.push(marker);
  infowindow = new google.maps.InfoWindow();
  infowindow.setContent("<center><a style='color:black;'>You are here <br> lat : "+koordinat.lat+" <br> long : "+koordinat.lng+"</a></center>");
  infowindow.open(map, marker);
  usegeolocation=true;
  markerposisi.push(marker)
  infoposisi.push(infowindow);
    
  $.ajax({
  url: server+'tampilanobjek.php', data: "", dataType: 'json', success: function(rows)
  {
    if(rows==null)
    {
      alert('Tidak ada data');
    }
    else
    {
      for (var i in rows)
      {
        var row = rows [i];
        var nama = row.nama_tempat_wisata;
        var lat = row.latitude;
        var lon = row.longitude;
        centerBaru = new google.maps.LatLng(koordinat.lat,koordinat.lng);
        map.setCenter(centerBaru);
        map.setZoom(10);
        var marker =  new google.maps.Marker({
                      position: koordinat,
                      animation: google.maps.Animation.DROP,
                      map: map
                      });
        markersDua.push(marker);
        map.setCenter(centerBaru);
      }  
    }
  }
  });
}



function init()
{
  basemap();
  tampilanobjek();
  tampildigit();
  tampildigitrm();
  tampildigit();
  tampildigitsov();
  tampildigitmas();
  tampildigitrav();
   tampildigithotel();
   tampildigitrav();
   //carides();

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

function hapusmarker()
{
  for (var i = 0; i < markersDua.length; i++) 
  {
    markersDua[i].setMap(null);
  }
}


function basemap()
{
  map = new google.maps.Map(document.getElementById('map'), 
  {
    zoom: 10,
    center: new google.maps.LatLng(-1.4063276,101.1622912),
    mapTypeId: google.maps.MapTypeId.ROADMAP
  });
}

function tampilanobjek(gid)
{

  $.ajax({url: server+'tampilanobjek.php?gid='+gid, data: "", dataType: 'json', success: function(rows)
  {
    console.log('uyicj');
  
    if(rows==null)
    {
      alert('Tidak ada data');
    }
    else
    {
      console.log(rows);
    for (var i in rows)
    {
      var row = rows [i];
      for (var x in row)
      {
      var row1 = row [x];
      var id = row1.id;
      var name = row1.name;
      var status = row1.status;
      var lat = row1.latitude;
      var lon = row1.longitude;
      centerBaru = new google.maps.LatLng(lat,lon);
      map.setCenter(centerBaru);
      console.log(id);
      console.log(status);
      map.setZoom(10);
      var marker =  new google.maps.Marker({
                    position: centerBaru,
                    animation: google.maps.Animation.DROP,
                    map: map
                    });
      if (status ==4) {
        klikInfoWindow_tw(id,marker);        
      } else if (status ==2) {
        klikInfoWindow_masjid(id,marker);        
      } else if (status ==3) {
        klikInfoWindow_rm(id,marker);        
      } else if (status ==1) {
        klikInfoWindow_souvenir(id,marker);        
      }
       else if (status ==5) {
        klikInfoWindow_hotel(id,marker);        
      }
      else if (status ==6) {
        klikInfoWindow_travel(id,marker);        
      }

      markersDua.push(marker);
      map.setCenter(centerBaru);
    }
    }
    }
  },
  error: function(xmlHTTPrequest)
  {
    console.log(xmlHTTPrequest)
  }
  });
}

function tampilkantravel(id)
{

  $.ajax({url: server+'tampilkantravel.php?id='+id, data: "", dataType: 'json', success: function(rows)
  {
    console.log('uyicj');
  
    if(rows==null)
    {
      alert('Tidak ada data');
    }
    else
    {
      console.log(rows);
    for (var i in rows)
    {
      var row = rows [i];
      var id = row.id;
      var name = row.name;
      var lat = row.latitude;
      var lon = row.longitude;
      centerBaru = new google.maps.LatLng(lat,lon);
      map.setCenter(centerBaru);
      console.log(id);
     
      map.setZoom(10);
      var marker =  new google.maps.Marker({
                    position: centerBaru,
                    animation: google.maps.Animation.DROP,
                    map: map
                    });
      markersDua.push(marker);
      map.setCenter(centerBaru);
    }
    }
  },
  error: function(xmlHTTPrequest)
  {
    console.log(xmlHTTPrequest)
  }
  });
}

function hapusInfo() 
{
  for (var i = 0; i < infoDua.length; i++) 
  {
    infoDua[i].setMap(null);
  }
}

function tampildigit()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasi.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#00ff7f',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}

function tampildigitrm()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasirm.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#800000',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}

function tampildigitsov()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasiindustri.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#20b2aa',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}

function tampildigitmas()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasimasjid.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#ffff66',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}


function tampildigithotel()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasihotel.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#ff0000',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}
function tampildigitrav()
{
  digit = new google.maps.Data();
  digit.loadGeoJson(server+'digitasitravel.php');
  digit.setStyle(function(feature)
  {
    return ({
      fillColor:'#ff0000',
      strokeweight:2,
      strokecolor:'green',
      fillOpadistrict:0.5,
      clickable: false
    });
  }
  );
  digit.setMap(map);
}

function caritempatwisata()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();
  
  var car = document.getElementById('name').value;
  if(car.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
    $.ajax({ 
        url: server+'caritempatwisata.php?name='+car, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is no tourism');
            }
            else
          {
           
          for (var i in rows) 
          {   
            var row         = rows[i];
            var id  = row.id;
            var name  = row.name;
            var latitude      = row.latitude ;
            var longitude     = row.longitude ;
            centerBaru        = new google.maps.LatLng(latitude, longitude);
            marker = new google.maps.Marker
            ({
            icon: "assets/img/transport.png",
            position : centerBaru,  
            map: map,
            animation: google.maps.Animation.DROP,
            });

            markersDua.push(marker);
            map.setCenter(centerBaru);
            map.setZoom(14);
            console.log(name);

             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td><a role='button' class='btn btn-success' onclick='detailtempatwisata(\""+id+"\")'>Detail</a></td><td><a role='button' class='btn btn-success' onclick='detailtempatwisata(\""+id+"\")'>Gallery</a></td></tr>");
          }
          }
        }
        }); 
    }
}



function caripaket()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();
  
  var car = document.getElementById('nama_paket').value;
  if(nama_paket.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
    $.ajax({ 
        url: server+'caripaket.php?name='+car, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Package');
            }
            else
          {
            
          for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);

              $('#hasilcaritempat').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booking(\""+id+"\",\""+price+"\")'></a></td><td><a role='button' title='Package Info' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='List Package' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          
          }
          }
        }
        }); 
    }
}

function caripaket1()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();
  
  var car = document.getElementById('nama_paket').value;
  if(nama_paket.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
    $.ajax({ 
        url: server+'caripaket.php?name='+car, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Package');
            }
            else
          {
            
          for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);

             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booked(\""+id+"\")'></a></td><td><a role='button' title='Package Info' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='List Package' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          
          }
          }
        }
        }); 
    }
}


function booked()
{
  alert('Please login!');
}

function caritravel()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();

  var car = document.getElementById('name_travel').value;
  if(name_travel.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
    $.ajax({ 
        url: server+'caritravel.php?name='+car, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Travel');
            }
            else
          {
            // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
          for (var i in rows) 
          {   
            var row         = rows[i];
            var id  = row.id;
            var name  = row.name;
            // var price = row.price;
            console.log(name);

             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td><a role='button' title='detail' class='btn btn-default fa fa-list' value='Detail' onclick='showpackage(\""+id+"\")'></a></td></td><td><a role='button' title='info' class='btn btn-default fa fa-info' value='Detail'onclick='showpackage(\""+id+"\")'></a></td></tr>");
          }
          }
        }
        }); 
    }
}

function caritravel1()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();

  var car = document.getElementById('name_travel').value;
  if(name_travel.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
    $.ajax({ 
        url: server+'caritravel.php?name='+car, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Travel');
            }
            else
          {
            // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
          for (var i in rows) 
          {   
            var row         = rows[i];
            var id  = row.id;
            var name  = row.name;
            // var price = row.price;
            console.log(name);

             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td><a role='button' title='info' class='btn btn-default fa fa-info' value='Detail' onclick='showpackage1(\""+id+"\")'></a></td></tr></td><td><a role='button' title='info' class='btn btn-default fa fa-info' value='Detail' onclick='showpackage1(\""+id+"\")'></a></td></tr>");
          }
          }
        }
        }); 
    }
}

function detail(id)
{
  $("#carides").show();
  // $('#hasilcarides').empty();\
  //console.log("");
  hapusInfo();
  hapusmarker();

    $.ajax({ 
        url: server+'tampiltravel.php?id='+id, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Package');
            }
            else
          {
            // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
          for (var i in rows) 
          {   
            var row         = rows[i];
            var id  = row.id;
            var name  = row.name;
            var price = row.price;
            console.log(name);

             // $('#hasilcarides').append("<tr><td>"+name+"</td><td>"+price+"<td><td><a role='button' class='btn btn-success' onclick='detailpaket(\""+id+"\")'>Detail</a></td></td><td><a role='button' class='btn btn-success' onclick='rute(\""+id+"\")'>Route</a></td></td><td><a role='button' class='btn btn-success' onclick='gallery(\""+id+"\")'>Gallery</a></td></tr>");


             $('#hasilcarides').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' title='info' class='btn btn-default fa fa-info' onclick='detailpaket(\""+id+"\")'></a></td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\")'></a></td><td><a role='button' title='gallery' class='btn btn-default fa fa-photo' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-play' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          }
          }
        }
        }); 

}

function gallery(a){    
      console.log(a);
    window.open(server+'gallery.php?id_package='+a);    
   }

function videopaket(b){    
      console.log(b);
    window.open(server+'videopaket.php?id_package='+b);    
   }


function carides()
{
  $('#hasilcaritempat').empty();
  // $('#carides').empty();
  hapusInfo();
  hapusmarker();
  
  var objek = document.getElementById('objek').value;
  var cariobjek = document.getElementById('cariobjek').value;
  if(cariobjek.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
      console.log(server+'carides.php?status='+objek+'&id='+cariobjek);
    $.ajax({ 
        url: server+'carides.php?status='+objek+'&id='+cariobjek, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Package');
            }
            else
          {
            // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
          for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);
             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booking(\""+id+"\",\""+price+"\")'></a></td><td><a role='button' title='Package Info' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='List Package' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          
          }
          }
        }
        }); 
    }
}

function carides1()
{
  $('#hasilcaritempat').empty();
  // $('#carides').empty();
  hapusInfo();
  hapusmarker();
  
  var objek = document.getElementById('objek').value;
  var cariobjek = document.getElementById('cariobjek').value;
  if(cariobjek.value=='')
  {
    alert("Fill The Input Column!");
  }
  else
  {
      console.log(server+'carides.php?status='+objek+'&id='+cariobjek);
    $.ajax({ 
        url: server+'carides.php?status='+objek+'&id='+cariobjek, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('There is No Package');
            }
            else
          {
            // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
          for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);
            $('#hasilcaritempat').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booked(\""+id+"\")'></a></td><td><a role='button' title='Package Info' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='List Package' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Galerry' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          
          }
          }
        }
        }); 
    }
}


// function caribulan()
// {
//   $('#hasilcaritempat').empty();
//   hapusInfo();
//   hapusmarker();
  
//   var car = document.getElementById('bulan').value;
//   if(car.value=='')
//   {
//     alert("Fill The Input Column First!");
//   }
//   else
//   {
//     $.ajax({ 
//         url: server+'caribulan.php?bulan='+car, data: "", dataType: 'json', success: function(rows)
//           { 
//             if(rows==null)
//             {
//               alert('There is no event');
//             }
//             else
//           {
//             // $('#hasilcaritempat').append("<thead><th>Nama</th><th colspan='2'>Aksi</th></thead>");
//           for (var i in rows) 
//           {   
//             var row         = rows[i];
//             var id  = row.id;
//             var name  = row.name;
//             var latitude      = row.latitude ;
//             var longitude     = row.longitude ;
//             centerBaru        = new google.maps.LatLng(latitude, longitude);
//             marker = new google.maps.Marker
//             ({
//             icon: "assets/img/transport.png",
//             position : centerBaru,  
//             map: map,
//             animation: google.maps.Animation.DROP,
//             });

//             markersDua.push(marker);
//             map.setCenter(centerBaru);
//             map.setZoom(14);
//             console.log(name);

//              $('#hasilcaritempat').append("<tr><td>"+name+"</td><td><a role='button' class='btn btn-success' onclick='detailevent(\""+id+"\")'>Detail</a></td><td><a role='button' class='btn btn-success' onclick='detailevent(\""+id+"\")'>Gallery</a></td></tr>");
//           }
//           }
//         }
//         }); 
//     }
// }

var arraykota=[]; 
function rute(ab){  
    var total=0;
  while(arraykota.length>0)
    {
      arraykota.pop();
    }
    while(waypts.length>0)
    {
      waypts.pop();
    }
    $.ajax({ 
      url: server+'rutepaket.php?id_package='+ab, data: "", dataType: 'json', success: function(rows)
        { 
        for (var i in rows) 
          {   
            total=total+1;
            var row     = rows[i];
            var no_urut   = row.no_urut;
            var id_tourism   = row.id_tourism;
            var id_restaurant   = row.id_restaurant;
            var id_souvenir   = row.id_souvenir;            
            var id_workship_place  = row.id_workship_place;
            var longitude = row.longitude ;
            var longitude = row.longitude ;
            centerBaru      = new google.maps.LatLng(row.latitude, row.longitude);
            arraykota.push(centerBaru);       
            map.setCenter(centerBaru);
            //klikInfoWindow_paket(centerBaru, id);
            map.setZoom(15);          
             
            
          }
            calcDire();      
        }
      }); 

  }
  var waypts=[];
  function calcDire(){
    if(directionsDisplay)
      {
        // clearroute2();  
        hapusInfo();
      }
      else
      {}
    var directionsService = new google.maps.DirectionsService;
    directionsDisplay = new google.maps.DirectionsRenderer;

    for (var x = 1; x < arraykota.length-1;x++){
      waypts.push({
        location:arraykota[x],
        stopover:false
      }) 
    }

    directionsDisplay.setMap(map);
    directionsService.route(
      { origin: arraykota[0],
      destination: arraykota[arraykota.length-1],
      waypoints: waypts,
      optimizeWaypoints: true,
      travelMode: google.maps.TravelMode.DRIVING }, 
      function(response, status) {
      if (status === google.maps.DirectionsStatus.OK) {
        directionsDisplay.setDirections(response);
        var route = response.routes[0]; } 
      }
    );
     // console.log("aaaaaa");
     // klikInfoWindow_paket(directionsDisplay, id);
   }


function detailtempatwisata(id1)
{
          hapusInfo();
          //hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailtempatwisata.php?detailtempat='+id1, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                // var open    = row.open;
                // var close    = row.close;
                // var ticket = row.ticket;
                // var description = row.description;
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                  icon:"assets/img/mesjid.png";
                map.setCenter(centerBaru);
                map.setZoom(15); 
                 marker = new google.maps.Marker({
                //   position: centerBaru,              
                //   icon:"assets/img/transport.png",
                //   animation: google.maps.Animation.DROP,
                //   map: map
                  }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+address+" <br><a href='twtampil.php?id="+id1+"' target='_blank' title='gallery' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}

function detailrumahmakan(id2)
{
          hapusInfo();
          //hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailrm.php?id='+id2, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                marker = new google.maps.Marker({
                //   position: centerBaru,              
                //   icon:"assets/img/transport.png",
                //   animation: google.maps.Animation.DROP,
                //   map: map
                   }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+address+"<br><a href='rmtampil.php?id="+id2+"' target='_blank' title='info' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}

function detailmasjid(id3)
{
          hapusInfo();
          //hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailmasjid.php?detailmasjid='+id3, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                marker = new google.maps.Marker({
                //   position: centerBaru,              
                //   icon:"assets/img/transport.png",
                //   animation: google.maps.Animation.DROP,
                //   map: map
                   }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+address+"<br><a href='mesjidtampil.php?id="+id3+"' target='_blank' title='gallery' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}

function detailsouvenir(id4)
{
          hapusInfo();
          //hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailindustri.php?detailsouvenir='+id4, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                 marker = new google.maps.Marker({
                //   position: centerBaru,              
                //   icon:"assets/img/transport.png",
                //   animation: google.maps.Animation.DROP,
                //   map: map
                  }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                   content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+address+"<br><a href='svtampil.php?id="+id4+"' target='_blank' title='info' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}


function detailhotel(id5)
{
          hapusInfo();
          console.log('cccccccc')
          $.ajax({ 
          url: server+'detailhotel.php?id='+id5, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                marker = new google.maps.Marker({
                //   position: centerBaru,              
                //   icon:"assets/img/transport.png",
                //   animation: google.maps.Animation.DROP,
                //   map: map
                   }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+address+"<br><a href='hoteltampil.php?id="+id5+"' target='_blank' title='info' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}
function detailtravel(id6)
{
          hapusInfo();
          // hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailtravel.php?detailtravel='+id6, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var cp = row.cp;
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                marker = new google.maps.Marker({
                  position: centerBaru,              
                  icon:"assets/img/transport.png",
                  animation: google.maps.Animation.DROP,
                  map: map
                  }); 

                //klikInfoWindow_paket(centerBaru, id);
                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<span style=color:black><center><b>Information</b><br><i class='fa fa-home'></i> "+name+"<br><i class='fa fa-road'></i> "+cp+"<br><a href='traveltampil.php?id="+id6+"' target='_blank' title='info' class='btn btn-default fa fa-info'></a></span>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
  }); 
}


function detailtype(id2)
{
          hapusInfo();
          hapusmarker();
          // console.log('cdscf');
          console.log('cc')
          $.ajax({ 
          url: server+'detailtype.php?detailtype='+id2, data: "", dataType: 'json', success: function(rows)
            { 
            for (var i in rows) 
                {   
                var row = rows[i];
                var id = row.id;
                var name   = row.name;
                var address = row.address;
                var open    = row.open;
                var close    = row.close;
                var ticket = row.ticket;
                var description = row.description;
                var latitude  = row.latitude; ;
                var longitude = row.longitude ;

                centerBaru = new google.maps.LatLng(latitude, longitude);
                map.setCenter(centerBaru);
                map.setZoom(15); 
                marker = new google.maps.Marker({
                  position: centerBaru,              
                  icon:"assets/img/transport.png",
                  animation: google.maps.Animation.DROP,
                  map: map
                  }); 

                markersDua.push(marker);
                map.setCenter(centerBaru);

                //var gambar= name.replace(/\s/g, '');
                infowindow = new google.maps.InfoWindow({
                  position: centerBaru,
                  content: "<bold>DETAIL INFORMATION</bold><br>Name: "+name+"<br> Address: "+address+"<br> "+address+"<br>Open Hour: "+open+"<br>Close Hour: "+close+"<br>Ticket: "+ticket+" <br>Description: "+description+"/>",
                  pixelOffset: new google.maps.Size(0, -33)
                });
                
                hapusInfo()
                infoDua.push(infowindow); 
                infowindow.open(map); 
                  //hapusMarkerInfowindow()
                } 
            }
          }); 
        }

// function rmterdekat(id)
// {
//   $('#hasilcari').empty();
//   // clearroute2();
//   // hapusInfo();
//   $('#hasiljarak').empty();
//   $('#jarakj').css('display','block');
    
//   $.ajax({ 
//         url: server+'jarakterdekatrm.php?id='+id, data: "", dataType: 'json', success: function(rows)
//         { 
//           var arrayNama=[];
//           var arraycenter=[];
//           for (var i in rows) 
//           {   
//             var row       = rows[i];
//             var id    = row.id;
//             var name   = row.name;
//             var latitude    = row.latitude ;
//             var longitude = row.longitude ;
//             var rmterdekat = row.meter;
          
//           centerBaru = new google.maps.LatLng(latitude, longitude);
//           marker1 = new google.maps.Marker
//           ({
//             // icon: "http://localhost/agen/img/biru2.ico",
//             position: centerBaru,
//             map: map,
//           });
          
//           markersDkt.push(marker1);
//           map.setCenter(centerBaru);
//           map.setZoom(16);
//           //klikInfoWindow(centerBaru, id_rumah_makan);
          
//           var rm1={
//             lat: parseFloat(latitude),
//             lng: parseFloat(longitude)
//           };
//           console.log(rm1);
//           arraycenter.push(rm1);
//           arrayNama+=name+',';
//           }
//         arrayNama=arrayNama.slice(0,-1);
        
//         var restaurant= arrayNama.split(",");
//         var meter= parseFloat(rmterdekat).toFixed(2);
//         $('#hasiljarak').append("<table class='table table-bordered'><tr><td>Dari</td><td>: </td><td>"+restaurant[0]+"</td></tr><tr><td>Ke</td><td>: </td><td>"+restaurant[1]+"</td></tr><tr><td>Jarak</td><td>: </td><td>"+meter+" meter </td></tr></table>");
//         infoDua.push(infowindow); 
//         console.log(arraycenter[0]);
//         console.log(rmterdekat);
//         var rmterdekat1 = parseFloat(rmterdekat) + 17;
//         console.log(rmterdekat1);
//         var circle = new google.maps.Circle({
//               center: arraycenter[0],
//               radius: parseFloat(rmterdekat1),      
//               map: map,
//               strokeColor: "blue",
//               strokeOpadistrict: 0.8,
//               strokeWeight: 2,
//               fillColor: "blue",
//               fillOpadistrict: 0.35
//               });   
         
//          circles.push(circle); 
//          cekRadiusStatus = 'on';
//       }
                
//         });
// }

function cariobjek(){
      $('#cariobjek').empty();
     
      var district = document.getElementById('district').value;
      var objek =document.getElementById('objek').value;
      console.log(district);
      if (objek!=0 && district!=0){
        $.ajax({url: "http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district, data: "", dataType: 'json', success: function(rows){
         // console.log(rows);
         // console.log("http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district); 
            
            if (objek=="1") {
              
              for (var i in rows){
                
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
              }
            }

          }});//end ajax
        }//end if
}



function show2(){
  var data0 = document.getElementById('id').value;
  var data1 = document.getElementById('objek').value;
  var data2 = document.getElementById('cariobjek').value;


/*
1 industri
2 mesjid
3 rm
4 tw
5 HTL
*/

  //var paket_id = [];
  //var paket_objek = [];
  paket_id.push(data2);
  paket_objek.push(data1);
  for (var i = 0; i < paket_id.length; i++) {
    console.log(paket_id[i]);
    console.log(paket_objek[i]);
    console.log("ertyuityguigighjkyuiotyiofgfghfdcfhgcfhgcgfhcgfhchgfchfgc");
  };
  //nyimpan ka object point
  $.ajax({
    url: "simpanpaket.php?data1=2&data2="+data0+"&data3="+data1+"&data4="+data2, 
    data: "", 
    dataType: 'json', 
    success: function(rows){
  }});

  //
  console.log("simpanpaket.php?data1=3&data2="+data0+"&data3="+data1);
  $.ajax({url: "simpanpaket.php?data1=3&data2="+data0+"&data3="+data1, data: "", dataType: 'json', success: function(rows){
      $('#hasilcaritempat').empty();
       for (var i in rows) {
        var row = rows[i];

        $('#hasilcaritempat').append("<tr><td>"+row.d1+"</td><td>"+row.d2+"</td><td>"+row.d3+"</td></tr>");
      }
    }});
}



function showdetpackage(id){
  $('#carides2').show();
  console.log("tp");
  hapusInfo();
  hapusmarker();
  $.ajax({url: "http://localhost/wisatasolsel/detailPak.php?id="+id, data: "", dataType: 'json', success: function(rows){
  var i=1;
    for(var a in rows){
            var row = rows[a];
            var n1  = row.n1;
            var n2  = row.n2;
            var n3  = row.n3;
             var n4  = row.n4;
            console.log(n1);

      //console.log(rows[0])
             $('#hasilcarides').append("<tr><td>"+i+"</td><td>"+n1+"</td><td>"+n2+"</td><td>"+n3+"</td><td>"+n4+"</td></tr>");
             i++;
    }
  }});

}
function showpackage(id){
  $('#caritrav').show()
  console.log(id);
  $.ajax({url: "http://localhost/wisatasolsel/pak.php?id="+id, data: "", dataType: 'json', success: function(rows){
    console.log('asd');
  var z=1;
  
    for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);
      //console.log(rows[0])
             $('#hasilcaritrav').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booked(\""+id+"\")'></a></td><td><a role='button' title='gallery' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='info' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
             z++;    }
             
  }});

}



function showpackage1(id){
  $('#caritrav').show()
  console.log(id);
  $.ajax({url: "http://localhost/wisatasolsel/pak.php?id="+id, data: "", dataType: 'json', success: function(rows){
    console.log('asd');
  var z=1;
  
    for (var i in rows) 
          {   
            var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);
      //console.log(rows[0])
             $('#hasilcaritrav').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booking(\""+id+"\",\""+price+"\")'></a></td><td><a role='button' title='gallery' class='btn btn-default fa fa-photo' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='info' class='btn btn-default fa fa-info' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td></tr>");
             z++;    }
  }});

}

function cariobjek(){
      $('#cariobjek').empty();
     
      var district = document.getElementById('district').value;
      var objek =document.getElementById('objek').value;
      console.log(district);
      if (objek!=0 && district!=0){
        $.ajax({url: "http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district, data: "", dataType: 'json', success: function(rows){
         // console.log(rows);
          console.log("http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district); 
            
            if (objek=="1") {
              
              for (var i in rows){
                
                var row = rows[i];
                var id = row.id;
                var name = row.name;
                console.log(id);
                console.log(name);
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
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
                console.log(district);
                $('#cariobjek').append('<option value="'+id+'">'+name+'</option>');
              }
            }

          }});//end ajax
        }//end if
}

function klikInfoWindow_tw(id1,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailtempatwisata(id1);
      });
}

function klikInfoWindow_rm(id2,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailrumahmakan(id2);
      });
}

function klikInfoWindow_masjid(id3,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailmasjid(id3);
      });
}

function klikInfoWindow_souvenir(id4,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailsouvenir(id4);
      });
}
function klikInfoWindow_hotel(id5,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailhotel(id5);
      });
}

function klikInfoWindow_travel(id6,marker)
{
  google.maps.event.addListener(marker, "click", function(){
        detailtravel(id6);
      });
}


var booking_id = "";
var booking_price = "";



function booking(id,price)
{
  booking_id = id;
  booking_price = price;
  document.getElementById('id_package').value = booking_id;
}

function hitung()
{
  var hitung = document.getElementById('total').value;
  if (hitung==1){
    hitung = hitung * booking_price *2;
    document.getElementById('totalprice').value = hitung; 
  }
  else {
    hitung = hitung * booking_price;
    document.getElementById('totalprice').value = hitung;
  }
   
}



function tampilsemua(aab){ 
  $('#hasilcaritempat').empty();
hapusInfo();
  hapusmarker();
  $.ajax({ 
        url: server+'lihatsemua.php?id='+aab, data: "", dataType: 'json', success: function(rows)
          { 
            if(rows==null)
            {
              alert('Data Tidak Ditemukan');
            }
          for (var i in rows) 
            {   
              var row = rows[i];
            var id  = row.id;
            var id_travel  = row.id_travel;
            var name  = row.name;
            var price = row.price;
            console.log(name);
             console.log('yaaaaaaaaa tampill semua');
              
             $('#hasilcaritempat').append("<tr><td>"+name+"</td><td>"+price+"</td><td><a role='button' class='btn btn-default fa fa-road' title='route' onclick='rute(\""+id+"\");tampilanobjek(\""+id+"\");'></a></td><td><a role='button' class='btn btn-default fa fa-envelope' title='booking' href='#modalbooking' data-toggle='modal' onclick='booking(\""+id+"\",\""+price+"\")'></a></td><td><a role='button' title='Package Info' class='btn btn-default fa fa-info' value='Route' onclick='gallery(\""+id+"\")'></a></td><td><a role='button' title='List Package' class='btn btn-default fa fa-list' value='Detail' onclick='showdetpackage(\""+id+"\")'></a></td><td><a role='button' title='travel' class='btn btn-default fa fa-car' value='travel' onclick='detailtravel(\""+id_travel+"\")'></a></td><td><a role='button' title='Gallery' class='btn btn-default fa fa-photo' value='Route' onclick='videopaket(\""+id+"\")'></a></td></tr>");
          
          
            } 
           
          }
        }); 
  }  


function aktifkanGeolocation(){ //posisi saat ini

            navigator.geolocation.getCurrentPosition(function(position) {
             hapusMarkerInfowindow();
             hapusInfo();
              pos = {
              lat: position.coords.latitude,
              lng: position.coords.longitude

              };console.log(pos.lat);
                marker = new google.maps.Marker({
              position: pos,
              map: map,
              animation: google.maps.Animation.DROP,
              });
              centerLokasi = new google.maps.LatLng(pos.lat, pos.lng);
              markers.push(marker);
              infowindow = new google.maps.InfoWindow({
              position: pos,
              content: "<a style='color:black;'>You Are Here</a> "
              });
              infowindow.open(map, marker);
              map.setCenter(pos);
            });   
          }

function manualLocation(){ //posisi manual
  hapusRadius();
  alert('Click the map');
  map.addListener('click', function(event) {
    addMarker(event.latLng);
    });
  }   

 function legenda()
{
  $('#tombol').empty();
 $('#tombol').append('<a type="button" id="hidelegenda" onclick="hideLegenda()" class="btn btn-default btn-sm " data-toggle="tooltip"  style="margin-right: 7px;" ><i class="fa fa-eye-slash" style="color:black;"></i></a> ');
 
 var layer = new google.maps.FusionTablesLayer(
  {
          query: {
            select: 'Location',
            from: '1NIVOZxrr-uoXhpWSQH2YJzY5aWhkRZW0bWhfZw'
          },
          map: map
        });
       var legend = document.createElement('div');
        legend.id = 'legend';
        var content = [];
        content.push('<h4 style="color: white;">Legend</h4>');
        content.push('<p><div class="color a" style="color: white;">&nbsp;Route</div></p>');
        content.push('<p><div class="color b" style="color: white;">&nbsp;Tourism</div></p>');
        content.push('<p><div class="color c" style="color: white;">&nbsp;Restaurant</div></p>');
        content.push('<p><div class="color d" style="color: white;">&nbsp;Souvenir</div></p>');
        content.push('<p><div class="color e" style="color: white;">&nbsp;Worship&nbsp;Place</div></p>');
        content.push('<p><div class="color f" style="color: white;">&nbsp;Travel</div></p>');
        content.push('<p><div class="color g" style="color: white;">&nbsp;Hotel</div></p>');
        content.push('<p><div class="color h" style="color: white;">&nbsp;Koto&nbsp;Parik&nbsp;Gadang&nbsp;Diateh</div></p>');
        content.push('<p><div class="color i" style="color: white;">&nbsp;Pauh&nbsp;Duo</div></p>');
        content.push('<p><div class="color j" style="color: white;">&nbsp;Sungai&nbsp;Pagu</div></p>');
        content.push('<p><div class="color k" style="color: white;">&nbsp;Sanggir</div></p>');
         content.push('<p><div class="color l" style="color: white;">&nbsp;Sanggir&nbsp;Batang&nbsp;Hari</div></p>');
          content.push('<p><div class="color m" style="color: white;">&nbsp;Sanggir&nbsp;Jujuan</div></p>');
           content.push('<p><div class="color n" style="color: white;">&nbsp;Sanggir&nbsp;Balai&nbsp;Janggo</div></p>');
        legend.innerHTML = content.join('');
        legend.index = 1;
        map.controls[google.maps.ControlPosition.LEFT_BOTTOM].push(legend);
}

function hideLegenda() {
 $('#legend').remove();
 $('#tombol').empty();
 $('#tombol').append('<a type="button" id="showlegenda" onclick="legenda()" class="btn btn-default btn-sm " data-toggle="tooltip"  style="margin-right: 7px;" ><i class="fa fa-eye-slash" style="color:black;"> </i></a> ');
}

function send(id_booking)
                   {
                    var button1=document.getElementById('btndel');                   
                    button1.disabled=true;
                    var button2=document.getElementById('btnup');                 
                    button2.disabled=true;
                    var button3=document.getElementById('btnsend');                 
                    button3.disabled=true;
                    
          
          //  console.log(id_booking);

           $.ajax({
               type : "POST",
               url  : "KirimEmail.php",
               dataType : "JSON",
               data : {id_booking:id_booking},
               success: function(data){
                   alert('Email Sudah Dikirim ke');
               }
           });
  alert('Data Has Been Send');
  location.reload();
          }

function update(id_booking)
                   {
                    window.location.href='updatebooking.php?id_booking='+id_booking ;

                    
                    }

function hapus(id_booking)


                   {
                   window.location.href='deletebooking.php?id_booking='+id_booking ;
                    
                    }

              


function hitungupdate(id_booking)
{
  var hitung = document.getElementById('total').value;
  var booking_price=document.getElementById('price').value;
  hitung = hitung * booking_price;
  document.getElementById('totalprice').value = hitung;  
}