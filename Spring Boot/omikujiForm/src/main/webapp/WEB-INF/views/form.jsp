<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Example</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
    <h1 class="text-center mt-3">Send an Omikuji!</h1>
	<div class="container text-center mt-5 border border-primary">
		<form action="/omikuji/show" method="post">
			<div>
				<label>Pick any number from 5 to 25 :</label>
				<input type="number" name="num" min=5 max=25 value=5 class="mt-3" />
			</div>
			
			<div>
				<label>Enter the name of any City :</label>
				<input type="text" name="city" class="mt-3" />
			</div>
			
			<div>
				<label>Enter the name of any real person :</label>
				<input type="text" name="person" class="mt-3"  />
			</div>
			
			<div>
				<label>Enter professional endeover or hoppy :</label>
				<input type="text" name="hoppy" class="mt-3"/>
			</div>
			
			<div>
				<label>Enter any type of living thing :</label>
				<input type="text" name="thing" class="mt-3" />
			</div>
			
			<div>
				<label>Say something nice to someone :</label>
				<textarea  name="comment" rows="4" cols="50" class="mt-3">
				</textarea>
			</div>
						
		        
		        <button type="submit" class="btn btn-primary mt-3 mb-3">Submit</button>
		    </form>
		
	</div>
    
</body>
</html>
