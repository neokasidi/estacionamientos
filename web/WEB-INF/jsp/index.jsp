<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Park</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>   
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>

    <body>        
        <div class="col-md-3">
            <br>
            <br>
            <div class="text-center">
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            </div>
            <ul>
                <li><a><h4>Inicio</h4></a></li>
                <li><a><h4>Ver Historial</h4></a></li>
                <li><a><h4>Ayuda</h4></a></li>
            </ul>
            <br>
            <br>
            <br>
            <br>
            <br>
            <div>
                <h3>Opciones de Pago</h3>
            </div>
            <div class="radio">
                <label><input type="radio" name="optradio" checked="checked">Transferencia</label>
            </div>
            <div class="radio">
                <label><input type="radio" name="optradio">Pago en Linea</label>
            </div>
            <div class="radio">
                <label><input type="radio" name="optradio">Orden de Compra</label>
            </div>
            <div>
                <h3>Envio Boleta</h3>
            </div>
            <div class="radio">
                <label><input type="radio" name="boleta" checked="checked">Correo Electronico</label>
            </div>
            <div class="radio">
                <label><input type="radio" name="boleta">Direccion Particular</label>
            </div>
        </div>
        <div class="col-md-6">
            <br>
            <br>
            <div class="col-md-1">
            </div>
            <div class="col-md-8">
                <form>
                    <div class="form-group">
                        <label for="rut">Rut:</label>
                        <input type="text" class="form-control" name="rut" id="rut">
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre:</label>
                        <input type="text" class="form-control" name="nombre" id="nombre">
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono:</label>
                        <input type="text" class="form-control" id="telefono" name="telefono">
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" id="email" name="email">
                    </div>
                    <button type="submit" class="btn btn-success">Enviar</button>
                </form>
                <div id="respuesta"></div>
            </div>
            <div class="col-md-3">
            </div>
        </div>
    </div>
    <div class="col-md-3">
        <br>
        <br>
        <a><h4>Ver Estacionamientos</h4></a>
    </div>
    <script>
        $('#respuesta').html('<h1>!hi</h1>');
    </script>    
</body>
</html>
