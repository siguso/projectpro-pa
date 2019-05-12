$(document).ready(function(){
    $('.sidenav').sidenav();

    $('.slider').slider({
        height: 300,
        indicators: false
    });
    
//    $("#wrapper").toggleClass("toggled");
    
    $('.tooltipped').tooltip();
    
    $('.collapsible').collapsible();
    
    $(".dropdown-trigger").dropdown({
        coverTrigger: false,
        constrainWidth: true
    });
    
    $('input#input_text, textarea#textarea').characterCounter();
    
    $('select').formSelect();
    
    $('#login').webuiPopover({
        url:'#login-form'
    });
    
    $('.materialboxed').materialbox();
    
    $('.modal').modal();
});

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
/********** datepicker fecha **********/
//$(document).ready(function(){
//    $('.datepicker').datepicker({
//        format: 'dd/mm/yyyy',
//        showClearBtn: true,
//        i18n: {
//            clear: 'limpiar',
//            cancel: 'cancelar',
//            
//            months: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto',
//                'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
//                  
//            monthsShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dec'],
//                  
//            weekdays: ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado' ],
//      
//            weekdaysShort: ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'],
//        
//            weekdaysAbbrev: ['D', 'L', 'M', 'M', 'J', 'V', 'S']
//        }
//    });
//});
/************************************/

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
