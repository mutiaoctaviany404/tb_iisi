<?php
include ('connect.php');
session_start();
if(isset($_POST['user_id'])){
	$user_id = $_POST['user_id'];
	$password = $_POST['password'];
	$name = $_POST['name'];
	$pass = $password;
	
	$sql = pg_query("SELECT * FROM users WHERE upper(user_id)=upper('$user_id') and password='$pass'");
	$num = pg_num_rows($sql);
	$dt = pg_fetch_array($sql);
	if($num==1){		
		$_SESSION['user_id'] = $user_id;
		
		if($dt['role']=='a'){

			$_SESSION['a'] = true;
			?><script language="JavaScript">document.location='admin/index.php'</script><?php
			echo "<script>	
		</script>";
		}
		
		if($dt['role']=='b'){
			$sql=pg_query("select max(user_id) from users where travel_id='$dt[travel_id]'");
			$dt2=pg_fetch_assoc($sql);
			if($dt['user_id']!=$dt2['max'])
			{
			echo "<script>
			alert ('Fill with correct data!');
			eval(\"parent.location='login.php '\");	
			</script>";
			}
			$_SESSION['b'] = true;
			$_SESSION['user_id']=$dt['user_id'];
			$_SESSION['travel_id']=$dt['travel_id'];
			$_SESSION['username']=$dt['username'];
			$_SESSION['name']=$dt['name'];
			$query=pg_query("select * from travel where id='$dt[travel_id]'");
			$data=pg_fetch_assoc($query);
			$_SESSION['user_id']=$data['user_id'];
			?><script language="JavaScript">document.location='index3.php'</script><?php
		}

		if($dt['role']=='c'){
			$sql=pg_query("select max(user_id) from users where user_id='$dt[user_id]'");
			$dt2=pg_fetch_assoc($sql);
			if($dt['user_id']!=$dt2['max'])
			{
			echo "<script>
			alert ('Fill with correct data!');
			eval(\"parent.location='login.php '\");	
			</script>";
			}
			$_SESSION['c'] = true;
			$_SESSION['user_id']=$dt['user_id'];
			// $_SESSION['id_travel']=$dt['id_travel'];
			$_SESSION['username']=$dt['username'];
			$query=pg_query("select * from users where user_id='$dt[user_id]'");
			$data=pg_fetch_assoc($query);
			$_SESSION['user_id']=$data['user_id'];
			?><script language="JavaScript">document.location='indexes.php'</script><?php
		}
			
	}else{
		echo "<script>
		alert (' Login Failed, Please Fill Your user_id and Password Correctly !');
		eval(\"parent.location='login.php '\");	
		</script>";
	}
}
?>