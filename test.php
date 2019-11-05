<?php
session_start('c');
include ('connect.php');
// require('PHPMailer/class.phpmailer.php');
require 'PHPMailer/src/Exception.php';
require 'PHPMailer/src/PHPMailer.php';
require 'PHPMailer/src/SMTP.php';

use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;
  
$mail = new PHPMailer(true); 
try {
    $id_booking = $_POST['id_booking'];
 /* Ini g guna   $cp = $_POST['cp'];
    $address = $_POST['address'];
    $username = $_POST['username'];
    $email = $_POST['email'];
    $id_package = $_POST['id_package'];
    $date = $_POST['date'];
    $total = $_POST['total'];
    $totalprice = $_POST['totalprice'];
    $name = $_POST['name']; */
    $variabel_cari = $date."".$id_booking."".$id_package;
    $id_booking=$_POST['id_booking'];
    $id_package = $_SESSION['c'];
    $user_id = $_SESSION['user_id'];
                        
    $query = "SELECT booking.date, package.name as nama_paket, booking.id_booking, booking.user_id, detail_booking.total,detail_booking.no_urut, detail_booking.totalprice, package.price, users.email, users.username,  users.cp FROM booking 
                        LEFT JOIN detail_booking on booking.id_booking = detail_booking.id_booking  
                        LEFT JOIN package on detail_booking.id_package = package.id 
                        left join users on booking.user_id = users.user_id
                        join travel on travel.id = package.id_travel 
                         where booking.id_booking = '".$id_booking."'";
    $cek = pg_query($query);
    $data = pg_fetch_array($cek);
                //Hilangkan kurung ini  {
                    $no_urut = $data['no_urut'];
                    $id_booking = $data['id_booking'];
                    $id_package = $data['id_package'];
                    $date = $data['date'];
                    $user_id = $data['user_id'];
                    $username = $data['username'];
                     $email = $data['email'];
                    $package = $data['nama_paket'];
                    $cp = $data['cp'];
                    $total = $data['total'];
                    $price = $data['price'];
                    $totalprice = $data['totalprice'];
     echo "$cek";
    $token = date("Ymdhi").$id_booking;
    $_SESSION['token']=$token;
    $_SESSION['id_booking']=$id_booking;
    $_SESSION['id_package']=$id_package;
    // $homepage = file_get_contents("http://localhost/wisatasolsel/mailtemplate.php?token=$token&id_booking=$id_booking");
     // create a new object
        $mail->isSMTP();
        $mail->SMTPDebug = 2;
        $mail->Host = 'smtp.gmail.com';
        $mail->Port = 587;
        $mail->SMTPSecure='tls';
        $mail->SMTPAuth = true;
        $mail->Username = "yupisriyunita06@gmail.com";
        $mail->Password = "yudasniati0606";

        $mail->setFrom("yupisriyunita06@gmail.com", "SOUTH SOLOK TOURISM");
        $mail->isHTML(true);
        $mail->SMTPOptions = array(
        'ssl' => array(
            'verify_peer' => false,
            'verify_peer_name' => false,
            'allow_self_signed' => true
        )
    );
        // Setel format email ke HTML 
        $mail->addAddress('neprisal91@gmail.com', 'Neprisal');
        //    $mail->addAddress("$email", "$Username");
        $mail->Subject = 'SIG TOURISM PACKAGE SOUTH SOLOK' ; 
        $mail->Body = "Anda mendapatkan pesanan paket wisata dari : 
                        <table>
                          <tbody>
                            <tr>
                                <td>No Urut Pesanan </td> <td>:  &nbsp;</td> <td>".$no_urut."</td>, 
                            </tr>
                            <tr>
                                <td>Nama Paket </td> <td>:  &nbsp;</td> <td> ".$package.",
                            </tr>
                            <tr>
                                <td>Tanggal Pemesanan </td> <td>:  &nbsp;</td> <td> ".$date.",
                            </tr>
                            <tr>
                                <td>Nama Pemesan</td> <td>:  &nbsp;</td> <td> ".$username.",
                            </tr>
                            <tr>
                                <td>No Telepon </td> <td>:  &nbsp;</td> <td>".$cp.",
                            </tr>
                            <tr>
                               <td>Total Harga </td> <td>:  &nbsp;</td> <td>".$totalprice.",
                            </tr>
                            <tr>
                               <td>E-mail</td> <td>:  &nbsp;</td> <td>".$email."
                            </tr>
                          </tbody>
                      </table>"; 

        $mail->AltBody = ' Ini adalah badan dalam teks biasa untuk klien email non-HTML ' ;    
        $mail -> send (); 
        $sttus = "berhasil";

      } 
      catch (Exception $e ) 
      {         $sttus = ' Pesan tidak dapat dikirim. Kesalahan Pengirim: ' , $mail ->ErrorInfo ; }
      echo json_encode($sttus);