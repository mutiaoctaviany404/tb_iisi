<?php
include ('../inc/connect.php');
session_start();
if(isset($_POST['user_id'])){
	$user_id = $_POST['user_id'];
	$password = $_POST['password'];
	$name = $_POST['name'];
	$pass = $password;
	//$pass=$password;
	$sql = pg_query("SELECT * FROM users WHERE upper(user_id)=upper('$user_id') and password='$pass'");
	$num = pg_num_rows($sql);
	$dt = pg_fetch_array($sql);
	if($num==1){		
		$_SESSION['user_id'] = $user_id;
		
		if($dt['role']=='a'){

			$_SESSION['a'] = true;
			?><script language="JavaScript">document.location='../'</script><?php
			echo "<script>
		alert (' lalalala');	
		</script>";
		}
		
		if($dt['role']=='b'){
			$sql=pg_query("select max(id) from users where id_travel='$dt[id_travel]'");
			$dt2=pg_fetch_assoc($sql);
			if($dt['id']!=$dt2['max'])
			{
			echo "<script>
			alert (' Isi data dengan benar !');
			eval(\"parent.location='../login.php '\");	
			</script>";
			}
			$_SESSION['b'] = true;
			$_SESSION['user_id']=$dt['user_id'];
			$_SESSION['id_travel']=$dt['id_travel'];
			$_SESSION['name']=$dt['name'];
			
			$query=pg_query("select * from travel where id='$dt[id]'");
			$data=pg_fetch_assoc($query);
			$_SESSION['id']=$data['id'];
			?><script language="JavaScript">document.location='../../index3.php'</script><?php
		}

		if($dt['role']=='c'){
			$sql=pg_query("select max(id) from users where id_tourist='$dt[id_tourist]'");
			$dt2=pg_fetch_assoc($sql);
			if($dt['id']!=$dt2['max'])
			{
			echo "<script>
			alert (' Isi data dengan benar !');
			eval(\"parent.location='../login.php '\");	
			</script>";
			}
			$_SESSION['c'] = true;
			$_SESSION['user_id']=$dt['user_id'];
			$_SESSION['id_tourist']=$dt['id'];
			$_SESSION['name']=$dt['name'];
			$query=pg_query("select * from tourist where id='$dt[id]'");
			$data=pg_fetch_assoc($query);
			$_SESSION['id']=$data['id'];
			?><script language="JavaScript">document.location='../../index3.php'</script><?php
		}
			
	}else{
		echo "<script>
		alert (' Login Failed, Please Fill Your user_id and Password Correctly !');
		eval(\"parent.location='../login.php '\");	
		</script>";
	}
}
?>