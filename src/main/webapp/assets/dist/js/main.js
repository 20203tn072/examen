const fill = (list) => {
    let table = "";

    if(list.length > 0){
        for(let i = 0; i < list.length; i++) {
            table += `
			<tr>
				<td>${list[i].nameUser}</td>
				<td>${list[i].primerApellido}</td>
				<td>${list[i].segundoApellido}</td>
				<td>${list[i].pokemon}</td>
				<td>
					<button type="button" class="btn btn-primary">Modificar</button>
					<button type="button" class="btn btn-danger">Eliminar</button>
				</td>
			</tr>
			`;
        }
    }else{
        table = `
		<tr class="text-center">
			<td colspan="5">No hay registros para mostrar</td>
		</tr>
		`;
    }
    $(`#container > tbody`).html(table);
};
const findAll = () => {
    $.ajax({
        type: 'GET',
        url: 'https://pokeapi.co/api/v2/pokemon?limit=50&offset=100',
        data: { }
    }).done(function(res){
        fill(res.listUser);
    });
};

findAll();