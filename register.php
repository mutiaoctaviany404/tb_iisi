
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>South Solok Tourism Pacjage</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">
  </head>

  <body>

      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" action="regis.php" method="POST">
		        <h2 class="form-login-heading">REGISTRATION</h2>
		        <div class="login-wrap">
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
                    <input type="text" class="form-control" placeholder="Phone" name="cp" autofocus>
                    <br>
                    <input type="address" class="form-control" placeholder="Address" name="address">
                    <br>
                    <input type="text" class="form-control" placeholder="Name" name="username" autofocus>
                    <br>
    		            <input type="password" class="form-control" placeholder="Password" name="password">
    		            <br>
                     <input type="email" class="form-control" placeholder="E-mail" name="email">
                    <br>
		            <button class="btn btn-theme btn-block" name="regis" type="submit"><i class="fa fa-lock"></i> SIGN UP</button>	        
		        </div>
		      </form>	  	
	  	</div>
	  </div>
	 
    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("assets/img/3.jpg", {speed: 500});
    </script>


  </body>
</html>
