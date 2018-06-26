<%-- 
    Document   : index
    Created on : Jun 22, 2018, 10:18:15 AM
    Author     : Grace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transport Department</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <div class="sidenav">
            <a href="#">HOME</a>
            <a href="#">PROFILE</a>
            <a href="#">SETTINGS</a>
            <a href="#">LOG OUT </a>
        </div>

	<div class="main">
	<div class="tabbed">
		<!-- first panel-->
	<input name="tabbed" id="tabbed1" type="radio" checked>
            <section>
		<h1>
                    <label for="tabbed1">Register Vehicle</label>
		</h1>
                <div class="forms" id="carreg">
                    <form>
                        
                        
                        
                    </form>
                </div>
            </section>
		<!--second panel-->
        <input name="tabbed" id="tabbed2" type="radio" >
            <section>
		<h1>
                    <label for="tabbed2">Register Driver</label>
		</h1>
                <div>
                    <p>form ya driver</p>
		</div>
            </section>
        <!--third panel-->
        <input name="tabbed" id="tabbed3" type="radio" checked>
            <section>
		<h1>
                    <label for="tabbed3">Register Mechanic</label>
		</h1>
		<div>
                    <p>form ya mechanic</p>
		</div>
            </section>
	<input name="tabbed" id="tabbed4" type="radio" checked>
            <section>
                <h1>
                    <label for="tabbed4">Approve/Cancel Trip</label>
		</h1>
		<div>
                    <p>form ya trips</p>
		</div>
            </section>
	<input name="tabbed" id="tabbed5" type="radio" checked>
            <section>
		<h1>
                    <label for="tabbed5">Assign Mechanic</label>
		</h1>
                <div>
                    <p>form5 </p>
		</div>

            </section>
        <input name="tabbed" id="tabbed6" type="radio" checked>
	    <section>
		<h1>
                    <label for="tabbed6">Assign Driver</label>
		</h1>
		<div>
                    <p>form6</p>
		</div>
            </section>
	</div>
        </div>   
    </body>
</html>
