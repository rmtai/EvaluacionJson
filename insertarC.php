<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    require_once 'conexion.php';
    $nombres = $_POST["nombres"];
    $apeliidos = $_POST["apeliidos"];
    $fechaNac = $_POST["fechaNac"];
    $titulo = $_POST["titulo"];
    $email = $_POST["email"];
    $facultad = $_POST["facultad"];
    $my_query = "insert into coordinador(nombres, apeliidos, fechaNac, titulo, email,facultad) 
    values('" . $nombres . "', '" . $apeliidos . "','" . $fechaNac . "', '" . $titulo . "', '" . $email . "', '" . $facultad . "')";
    $result = $mysql->query($my_query);
    if ($result == true) {
        echo "Registro guardado satisfactoriamente...";
    } else {
        echo "Error al guardar registro...";
    }
} else {
    echo "Error desconocido";
}
?>