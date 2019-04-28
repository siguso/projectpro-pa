$(document).ready(function(){      
//    $("#wrapper").toggleClass("toggled");      
});


/********** toggled al hacer click en el menu **********/
$("#menu-toggle").click(function(e){
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
});
$("#menu-toggle2").click(function(e){
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
});
/*******************************************************/

/********** hide/show password **********/
$(".toggle-password").click(function() {

    $(this).toggleClass("fa-eye fa-eye-slash");
    var input = $($(this).attr("toggle"));
    if (input.attr("type") === "password") {
        input.attr("type", "text");
    } else {
        input.attr("type", "password");
    }
});
/***************************************/

/********** toggled al cambiar de tamaño la pantalla **********/
function myFunction(x){
    
    if (x.matches) { // If media query matches
        $("#wrapper").toggleClass("toggled");
//        $('.nav3').addClass('menu-fixed2');
    } else {
        $("#wrapper").toggleClass("toggled");
    }
}

var x = window.matchMedia("(max-width: 992px)")
myFunction(x) // Call listener function at run time
x.addListener(myFunction) // Attach listener function on state changes
/**************************************************************/

$(document).ready(function(){     
    $('#up').on('click', () => {
        document.querySelector('#flip').classList.toggle('hover');
    });
    $('#in').on('click', () => {
        document.querySelector('#flip').classList.toggle('hover');
    });
});