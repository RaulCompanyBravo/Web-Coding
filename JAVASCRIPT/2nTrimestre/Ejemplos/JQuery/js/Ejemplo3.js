$(document).ready(function(){
    var img1;
    $("#cosa").click(function(){
        img1=$(this).attr("src");
        console.log(img1)
        if(img1==img2){
            $(this).attr("src","http://opencode.us/wp-content/uploads/2013/10/css3_logo.png")
            var img2=$(this).attr("src");
        } else {
            $(this).attr("src","https://www.w3.org/html/logo/downloads/HTML5_Logo_512.png")
        }
        
        
    })
})