/********** create_group **********/
function selectUser(cod, name) {
    var nombreElemento = 'formulario3:autor'+document.getElementById("formulario3:n_autor").value;
    document.getElementById(nombreElemento).value = name;
    var nombreElemento = 'formulario3:codAutor'+document.getElementById("formulario3:n_autor").value;
    document.getElementById(nombreElemento).value = cod;
}

function setAutor(n){
    document.getElementById("formulario3:n_autor").value = n;
}
/**********************************/

/********** project_registration_autor **********/
function selectUser1(cod, name) {
    var nombreElemento = 'formulario_projects_registration:autor'+document.getElementById("formulario_projects_registration:n_autor").value;
    document.getElementById(nombreElemento).value = name;
    var nombreElemento = 'formulario_projects_registration:codAutor'+document.getElementById("formulario_projects_registration:n_autor").value;
    document.getElementById(nombreElemento).value = cod;
}

function setAutor1(n){
    document.getElementById("formulario_projects_registration:n_autor").value = n;
}
/***********************************************/

/***********************************************/