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

var i = 0;
var paket_id = [];  //id objek
var paket_objek = []; //status
    
function tes(){
      console.log('jalan tes');  
}

function cariobjek(){
      $('#cariobjek').empty();
     
      var district = document.getElementById('district').value;
      var objek =document.getElementById('objek').value;
      
      if (objek!=0 && district!=0){
        $.ajax({url: "http://localhost/wisatasolsel/cariobjek.php?objek="+objek+"&district="+district, data: "", dataType: 'json', success: function(rows){
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
var nourut=1;
function tampilobjek(){
//      $('#tampilobjek').empty();
      //console.log('jalan');
      var cariobjek = document.getElementById('cariobjek').value;
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
        $('#hasilcaritempat').append("<tr><td>"+no+"</td><td>"+name+"</td></tr>");
        
      }

}

function simpanpaket(){

  if (paket_id.length >0){
    var name = document.getElementById('name').value
    var price = document.getElementById('price').value
    if( name == '' || price == ''){
      alert('Data belum lengkap');
    } else {
      var id = document.getElementById('id').value;
      var id_travel = document.getElementById('id_travel').value;
      $.ajax({url: "http://localhost/wisatasolsel/simpanpaket.php?id="+id+"&id_travel="+id_travel+"&name="+name+"&price="+price, data: "", dataType: 'json', success: function(rows){
          //console.log(rows);
          console.log("http://localhost/wisatasolsel/simpanpaket.php?id="+id+"&id_travel="+id_travel); 
          

      }});//end ajax
      // for(var n = 0;n<paket_id.length){

      // }
    }
  }
  else
  {
    console.log("paket belum dipilih")
  }

}
