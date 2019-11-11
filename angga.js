function caripaketangga()
{
  $('#hasilcaritempat').empty();
  hapusInfo();
  hapusmarker();
  
  var txt = document.getElementById('workshipangga').value;
  var sel = document.getElementById('kecamatanangga').value;
  if(txt=='' || sel == '')
  {
    alert("Fill The Input Column!");
  }
  else
  {
	console.log(server+'angga.php?kecamatan='+sel+'&workship_place='+txt);
    $.ajax({ 
        url: server+'angga.php?kecamatan='+sel+'&workship_place='+txt, data: "", dataType: 'json', success: function(rows)
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