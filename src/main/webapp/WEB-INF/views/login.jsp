<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Page Redirection</title>
   </head>

   <body>
      <h2>Ovo je sad Login strana  </h2>
      <p>Ispod se submituje forma sa post i zove se service iz login contr sa autowire </p>
      
     <!-- START OF REGISTER FORM --->
					<div class="registerForm">
						<form:form modelAttribute="form" action="/springexample/register" method="post">
							  Username:<br>
							  <input type="text" name="username">
							  <br>
							  Password:<br>
							  <input type="text" name="password">
							  <br><br>
							  <input type="submit" value="Submit">
						</form:form>
					</div>
   </body>
   
</html>