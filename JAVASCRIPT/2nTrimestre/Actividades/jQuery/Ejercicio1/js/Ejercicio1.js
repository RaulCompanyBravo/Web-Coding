$(document).ready(function(){
    $('#dashboard').hover(
        function(){
            $(this).stop().animate
            $('#dashboard').animate({
                left: "0",
                backgroundColor: "red",
            },500,'easeOutBounce')
            
        },
        function(){
            $(this).stop().animate({
                left: "-100",
                backgroundColor: "blue",
            },500,'easeOutBounce')

    
        }
    );
});
