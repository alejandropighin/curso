// Call the dataTables jQuery plugin
$(document).ready(function() {
    $('#usuarios').DataTable();
 cargarUsuarios();

});


async function cargarUsuarios(){

    //fecheamos desde la api para extraer el json
    const request = await fetch('api/usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }

    });
    const usuarios = await request.json();



    let listadoHtml = '';
    for (let usuario of usuarios) {
        let botonEliminar = `<a href="#" class="btn btn-danger btn-circle btn-sm" onclick="eliminarUsuario(${usuario.id})">
        <i class="fas fa-trash"></i>
    </a>`;
        let usuarioOuterHtml = `
    <tr>
        <td>${usuario.id}</td>
        <td>${usuario.nombre}${usuario.apellido}</td>
        <td>${usuario.email}</td>
        <td>${usuario.password}</td>
        <td>
            ${botonEliminar}
        </td>
        <td></td>
    </tr>`;
        listadoHtml += usuarioOuterHtml;
    }

    document.querySelector('#usuarios tbody').outerHTML = listadoHtml;


}
    async function eliminarUsuario(id) {

        if (!confirm("esta seguro que desea eliminar el usuario?")){
            return
        }

        //fecheamos desde la api para extraer el json
        const request = await fetch('api/usuarios/'+id, {
            method: 'DELETE',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }

        });
        location.reload();

}