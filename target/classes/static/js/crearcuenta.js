// Call the dataTables jQuery plugin
$(document).ready(function() {



});


async function registrarUsuarios(){
    //deffinimos a datos como un array que va a contener los datos a enviar
    let datos = {};
    datos.nombre = document.getElementById('exampleFirstName').value
    datos.apellido = document.getElementById('exampleLastName').value
    datos.email = document.getElementById('exampleInputEmail').value
    datos.password = document.getElementById('exampleInputPassword').value
    let repetirpass = document.getElementById('exampleRepeatPassword').value

    if (repetirpass != datos.password){
        alert("la contraseña no coincide")
        return
    }


//fecheamos desde la api para extraer el json
    let request;
    request = await fetch('api/usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const usuarios = await request.json();

}
