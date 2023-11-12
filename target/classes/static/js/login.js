// Call the dataTables jQuery plugin
$(document).ready(function() {



});


async function iniciarsesion(){
    //deffinimos a datos como un array que va a contener los datos a enviar
    let datos = {};
    datos.id=document.getElementById('exampleInputEmail').value
    datos.password = document.getElementById('exampleInputPassword').value



//fecheamos desde la api para extraer el json
    let request;
    request = await fetch('api/login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const response = await request.json();

}
