        $().ready(function () {
			$("#myForm").validate({ rules: {
               password: { 
                 required: true,
                    minlength: 6,
                    maxlength: 10,
               } , 
                   cfmPassword: { 
                    equalTo: "#password",
                     minlength: 6,
                     maxlength: 10
               }
           },
     messages:{
         password: { 
                 required:"Se requiere una contraseña"
               }
     }
			 });
        });
