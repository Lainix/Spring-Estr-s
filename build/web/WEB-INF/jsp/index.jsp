<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body style="background-color:pink;">

        
        <h1>Determina tu estrés</h1>
        
        <font size=4>Hola en esta pagina te ayudare a determinar tu extrés</font>
        
        <p face="Comic Sans MS,arial,verdana">Diagnóstico de los niveles de estrés</p>
        
         <form action="ver.htm" method="post">
            <p>Te sientes extresado?</p>
            <input type="radio" name="Option" value="1" checked>Si</input>
            <input type="radio" name="Option" value="0" checked>No</input>
            <p>Tienes dolor de cabeza? </p>
            <input type="radio" name="Option2" value="1" checked>Si</input>
            <input type="radio" name="Option2" value="0" checked>No</input>
            <p>Te sientes enojado? </p>
            <input type="radio" name="Option3" value="1" checked>Si</input>
            <input type="radio" name="Option3" value="0" checked>No</input>
            
            
            <input type="submit" value="Buscar..." />
        </form>
        
    </body>
</html>
