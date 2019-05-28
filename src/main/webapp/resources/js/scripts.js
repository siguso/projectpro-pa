$(document).ready(function(){
    $('.sidenav').sidenav();

    $('.slider').slider({
        height: 300,
        indicators: false
    });
    
    $('.tooltipped').tooltip();
    
    $('.collapsible').collapsible();
    
    $(".dropdown-trigger").dropdown({
        coverTrigger: false,
        constrainWidth: true
    });
    
    $(".dropdown-trigger2").dropdown({
        coverTrigger: false,
        constrainWidth: false,
    });
    /*var dropdowns = document.querySelectorAll('.dropdown-trigger2')
        for (var i = 0; i < dropdowns.length; i++){
        M.Dropdown.init(dropdowns[i]);
    }*/
    
    $('input#input_text, textarea#textarea').characterCounter();
    
    $('select').formSelect();
    
    $('#login').webuiPopover({
        url:'#login-form'
    });
    
    $('.materialboxed').materialbox();
    
    $('.tabs').tabs();
    
    $('input#input_text, textarea#textarea2').characterCounter();

});

/*********** cerrar popover **********/
/*function cerrarse(){ 
    $("#login-form").webuiPopover('hide');
} */
/*************************************/

/********** modal **********/
$(document).ready(function(){
    $('.modal').modal({
        dismissible: false 
    });
})
/***************************/

/********** limpiar campos **********/
function limpiarForm(){
    document.getElementById("formulario").reset();
}
/************************************/

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

/********** limitar textarea **********/
$('textarea.max').keyup(function() {
    var $textarea = $(this);
    var max = 255;
    if ($textarea.val().length > max) {
        $textarea.val($textarea.val().substr(0, max));
    }
});
/**************************************/

/********** toggled al hacer click en el menu **********/
$("#menu-toggle").click(function(e){
    e.preventDefault();
    $("#wrapper").toggleClass("toggled");
});
/*******************************************************/

/********** toggled al cambiar de tamaño la pantalla **********/
function myFunction(x){
    
    if (x.matches) { // If media query matches
//        $("#wrapper").toggleClass("toggled");
        $('.nav3').addClass('menu-fixed2');
        $('.lista1').hide();
    } else {
//        $("#wrapper").toggleClass("toggled");
        $('.sidenav').sidenav();
        $('.nav3').removeClass('menu-fixed2');
        $('.lista1').show();
    }
}

var x = window.matchMedia("(max-width: 992px)")
myFunction(x) // Call listener function at run time
x.addListener(myFunction) // Attach listener function on state changes
/**************************************************************/

/********** menu acordeon **********/
$(document).ready(function(){
	$('.menu li:has(ul)').click(function(e){
		e.preventDefault();

		if ($(this).hasClass('activado')){
			$(this).removeClass('activado');
			$(this).children('ul').slideUp();
		} else {
			$('.menu li ul').slideUp();
			$('.menu li').removeClass('activado');
			$(this).addClass('activado');
			$(this).children('ul').slideDown();
		}
	});
        
	$(window).resize(function(){
		if ($(document).width() > 450){
			$('.contenedor-menu .menu').css({'display' : 'block'});
		}

		if ($(document).width() < 450){
			$('.contenedor-menu .menu').css({'display' : 'none'});
			$('.menu li ul').slideUp();
			$('.menu li').removeClass('activado');
		}
	});

	$('.menu li ul li a').click(function(){
		window.location.href = $(this).attr("href");
	});
});
/**********************************************/

/********** menu acordeon movil **********/
$(document).ready(function(){
	$('.menu2 li:has(ul)').click(function(e){
		e.preventDefault();

		if ($(this).hasClass('activado')){
			$(this).removeClass('activado');
			$(this).children('ul').slideUp();
		} else {
			$('.menu2 li ul').slideUp();
			$('.menu2 li').removeClass('activado');
			$(this).addClass('activado');
			$(this).children('ul').slideDown();
		}
	});
        
	$(window).resize(function(){
		if ($(document).width() > 450){
			$('.contenedor-menu2 .menu2').css({'display' : 'block'});
		}

		if ($(document).width() < 450){
			$('.contenedor-menu2 .menu2').css({'display' : 'none'});
			$('.menu2 li ul').slideUp();
			$('.menu2 li').removeClass('activado');
		}
	});

	$('.menu li ul li a').click(function(){
		window.location.href = $(this).attr("href");
	});
});
/**********************************************/

/********** sticky navbar projects*********/
$(document).ready(function () {
//    var altura = $('.nav3').offset().top;

    $(window).on('scroll', function () {
        if ($(window).scrollTop() > 300) {
            $('.nav3').addClass('menu-fixed');
            $('#contenido').addClass('anti-salto');
        } else {
            $('.nav3').removeClass('menu-fixed');
            $('#contenido').removeClass('anti-salto');
        }
    });
});
/*********************************/

/********** boton up **********/
$(document).ready(function(){
    $('.up').hide();
    
    $(window).on('scroll', function () {
        if ($(this).scrollTop() > 100) {
            $('.up').fadeIn('1000');
        } else {
            $('.up').fadeOut('1000');
        }
    });
    
    $('.up').click(function(){
       $('body, html').animate({
           scrollTop: 0
       },400); 
    });
});
/******************************/

/********** datatable *********/
$(document).ready( function () {
    $('.AllDataTables').DataTable( {
        /*"lengthMenu": [[5, 25, 50, -1], [5, 25, 50, 100]],*/
        searching: true,
        lengthChange: false,                     
        pageLength: 10,
        language: {
            "sProcessing":     "Procesando...",
            "sLengthMenu":     "Mostrar _MENU_ registros",
            "sZeroRecords":    "No se encontraron resultados",
            "sEmptyTable":     "Ningún dato disponible en esta tabla",
            //"sInfo":           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "sInfo":           "_TOTAL_ registros",
            //"sInfoEmpty":      "Mostrando registros del 0 al 0 de un total de 0 registros",
            "sInfoEmpty":      "0 registros",
            //"sInfoFiltered":   "(filtrado de un total de _MAX_ registros)",
            "sInfoFiltered":   "encontrados",
            "sInfoPostFix":    "",
            "sSearch":         "Buscar:",
            "sUrl":            "",
            "sInfoThousands":  ",",
            "sLoadingRecords": "Cargando...",
            "oPaginate": {
                "sFirst":    "Primero",
                "sLast":     "Último",
                "sNext":     "Siguiente",
                "sPrevious": "Anterior"
            },
            "oAria": {
                "sSortAscending":  ": Activar para ordenar la columna de manera ascendente",
                "sSortDescending": ": Activar para ordenar la columna de manera descendente"
            }
        }
    } );
    $("select").val('10');
    /*$('select').addClass("browser-default");*/
    /*$('select').material_select();*/
} );
/********************************/
