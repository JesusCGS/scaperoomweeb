<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Pagar</title>
	<link href="https://fonts.googleapis.com/css?family=Lato|Liu+Jian+Mao+Cao&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="css/cssTarjeta/estilos.css">
</head>
<body style=" background: url(../images/fondo.jpg);">
	<div class="contenedor">

		

		<!-- Contenedor Boton Abrir Formulario -->
		<div class="contenedor-btn" >
			<button class="btn-abrir-formulario" id="btn-abrir-formulario">
				<i class="fas fa-plus"></i>
			</button>
		</div>

		<!-- Formulario -->
		<div class="row" style="margin-top: 50px;">
			<form action="" id="formulario-tarjeta" class="formulario-tarjeta">
				<div class="grupo">
					<label for="inputNumero">Número Tarjeta</label>
					<input type="text" id="inputNumero" maxlength="19" autocomplete="off">
				</div>
				<div class="grupo">
					<label for="inputNombre">Nombre</label>
					<input type="text" id="inputNombre" maxlength="19" autocomplete="off">
				</div>
				<div class="flexbox">
					<div class="grupo expira">
						<label for="selectMes">Expiracion</label>
						<div class="flexbox">
							<div class="grupo-select">
								<select name="mes" id="selectMes">
									<option disabled selected>Mes</option>
								</select>
								<i class="fas fa-angle-down"></i>
							</div>
							<div class="grupo-select">
								<select name="year" id="selectYear">
									<option disabled selected>Año</option>
								</select>
								<i class="fas fa-angle-down"></i>
							</div>
						</div>
					</div>

					<div class="grupo ccv">
						<label for="inputCCV">CCV</label>
						<input type="text" id="inputCCV" maxlength="3">
					</div>
				</div>
				<button type="submit" class="btn-enviar">Enviar</button>
			</form>
		</div>
	</div>

	<script src="https://kit.fontawesome.com/2c36e9b7b1.js" crossorigin="anonymous"></script>
	<script src="js/jsTarjeta/main.js"></script>
</body>
</html>