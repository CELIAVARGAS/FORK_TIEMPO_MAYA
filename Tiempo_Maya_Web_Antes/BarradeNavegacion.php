<?php
    session_start();
?>

<header id="header">
  <div class="container">
    <nav id="nav-menu-container">
      <ul class="nav-menu">
        <li class="menu-active">  <a href="index.php" style="color: white;font-size: 23px;"><strong>TIEMPO</strong> MAYA</a></li>
        <li><a href="LineaDeTiempo.php">Linea del Tiempo</a></li>
        <li><a href="CalendarioHaab.php">Calendario Haab</a></li>
        <li><a href="CalendarioCholqij.php">Calendario Cholquij</a></li>
        <li><a href="#">Rueda Calendarica</a></li>
        <li><a href="nahuales.php">Nahuales</a></li>
        <?php 
        if (isset($_SESSION['nombre'])) {
            echo '<li><a href="cerrarSesion.php">Cerrar Sesion</a></li>';
        }else{
            echo '<li><a href="iniciarSesion.php">Iniciar Sesion</a></li>
            <li><a href="#">Registrarse</a></li>';
        }
        
        ?>
        
      </ul>
    </nav>
  </div>
</header>
