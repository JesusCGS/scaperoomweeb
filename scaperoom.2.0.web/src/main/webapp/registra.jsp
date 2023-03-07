<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="lb/css/bootstrap.min.css">

</head>
<style>
  .fondo1{background: rgb(61,12,147);
background: linear-gradient(90deg, rgba(61,12,147,1) 0%, rgba(253,29,29,1) 68%, rgba(252,176,69,1) 100%);}

</style>

<body >
  <!---->
    <section class="vh-100 fondo1 " >
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col col-xl-10">
              <div class="card" style="border-radius: 1rem;">
                <div class="row ">
                  
                  <div class="col-md-6 col-lg-7 d-flex align-items-center" style="margin: auto;">
                    <div class="card-body p-4 p-lg-5 text-black">
      
                      <form action="insertar.php" method="post">
      
                        <div class="d-flex align-items-center mb-3 pb-1">
                            <h5  class="fw-normal mb-3 pb-3" style="letter-spacing: 1px; margin: auto; font-size: 40px;">Registrate</h5>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" id="nombre" name="nombre" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example17">Nombre</label>
                        </div>
        
                        <div class="form-outline mb-4">
                          <input type="text" id="email" name="email" class="form-control form-control-lg" />
                          <label class="form-label" for="form2Example17">Correo electrónico</label>
                        </div>
      
                        <div class="form-outline mb-4">
                          <input type="password" id="password" name="password" class="form-control form-control-lg" />
                          <label class="form-label" for="form2Example27">Contraseña</label>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="text" id="sexo" name="sexo" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example27">sexo</label>
                        </div>
                        <div class="form-outline mb-4">
                            <input type="number" id="edad" name="edad" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example27">edad</label>
                        </div>
                        
      
                        <div class="pt-1 mb-4" style="text-align: center;">
                          <button style="justify-content: center;" class="btn btn-dark btn-lg btn-block" type="submit" name="enviar">Registrarse</button>
                        </div>

                      </form>
                      <h6 style="text-align: center;">Disfruta el contenido!</h6>
      
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
</body>