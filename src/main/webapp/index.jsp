<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Page Redirection</title>
   </head>

   <body>
      <h2>Ovo je index page glumimo redirect iz interceptora i base controlera </h2>
      <p>Ovo ispod je ekvivalent enteru posle unosenja urla na adpru sledca strana glumi login controler sa adpra </p>
      
      <form:form method = "GET" action = "/springexample/page">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Redirect Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>