<!DOCTYPE html>
<html>
<head>
    <title>gpdp</title>
</head>
<body>
<?php
 //crea un json
 $myObj->id = 10006;
 $myObj->birthDate = '1976-12-02';
 $myObj->firstName = 'Simon';
 $myObj->lastName = 'Luke';
 $myObj->gender = 'M';
 $myObj->hireDate = '1994-01-23';
 $myJSON = json_encode($myObj);

 //prende il json dal file
 $data = file_get_contents("./js/data.json");

 switch($_SERVER['REQUEST_METHOD']){

     case 'GET':
         $sql = "SELECT ";
$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) > 0) {
  // output data of each row
  while($row = mysqli_fetch_assoc($result)) {
    echo "id: " . $row["id"]. " - Name: " . $row["firstname"]. " " . $row["lastname"]. "<br>";
  }
} else {
   echo '$data';
}
     break;

     case 'POST':
        echo 'success POST';
        var_dump($myJSON); 
     break;

     case 'PUT':
         echo 'success PUT';
         var_dump($myJSON); 
     break;

     case 'DELETE':
         
     break;

     default:
         //404 status
         header("HTTP/1.1 404 Not Found");
     break;



 }
?>
</body>
</html>
