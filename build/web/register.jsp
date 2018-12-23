<%-- 
    Document   : register
    Created on : 21 Sep, 2018, 8:45:05 PM
    Author     : rajee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER NOW</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
      
    </head>
    <body >
        <nav class="navbar navbar-default navbar-fixed-top">
            
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <img class="navbar-brand" src="img/logo.png">
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-center">
                        <li ><a href="index.html">Home</a></li>
                        <li><a href="#">about</a></li>
                        <li class="active"><a href="register.jsp">register</a></li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown">clubs<span class="caret"></span></a>
                            <ul class="dropdown-menu ">
                                <li class="dropdown-item"><a href="#">MUSIC</a></li>
                                <li class="dropdown-item"><a href="#">ART</a></li>
                                <li class="dropdown-item"><a href="#">LITERATURE</a></li>
                                <li class="dropdown-item"><a href="#">DANCE</a></li>
                                <li class="dropdown-item"><a href="#">PHOTOGRAPHY</a></li>
                            </ul>
                        </li>
                        <li><a href="#">gallery</a></li>
                    </ul>
                </div>
            </div>
        </nav> 
        
        <p class="container text-center" style="padding-top:100px;">this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.
            this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.this is a sample text.</p>
        <br>
        <div class="container container-fluid">

            <div class='container'>
                <h2 style='text-align:center'> Registeration </h2>
                <form>


                    <div class="form-group">

                        <label for="inputName">Name</label>

                        <input type="text" class="form-control" id="inputName" name="inputName" placeholder="Your name..">

                    </div>

                    <div class="form-group">
                        <label for="selectbranch">Branch</label>
                        <select class="form-control" type="text" id="selectbranch" name="selectbranch">
                            <option>computer science and engineering</option>
                            <option>information technology</option>
                            <option>electronics and communication</option>
                            <option>civil engineering</option>
                            <option>mechanical engineering</option>
                            <option>electrical engineering</option>
                            <option>industrial production and engineering</option>
                        </select>

                    </div>

                    <div class="form-group">
                        <label for="selectsem">Semester</label>
                        <select class="form-control" type="text" id="selectsem" placeholder="Select Semester" name="selectsem">
                            <option>Select Semester</option>
                            <option>I</option>
                            <option>II </option>
                            <option>III</option>
                            <option>IV</option>
                            <option>V</option>
                            <option>VI</option>

                        </select>

                    </div> 

                    <div class="form-group">
                        <label>email <span class="glyphicon glyphicon-envelope"></span></label>
                        <input id="email" type="text" class="form-control" name="email" placeholder="Email">
                    </div>

                    <button type="submit" class="btn btn-primary">Register</button>

                </form>
            </div>
        </div>

        <%
          try{
               String name= request.getParameter("inputName");
               String branch= request.getParameter("selectbranch");
               String sem= request.getParameter("selectsem");
               String email= request.getParameter("email");
                String connectionURL = "jdbc:mysql://localhost:3306/registration";
                

        // declare a connection by using Connection interface 
                Connection connection = null;

        
               Class.forName("com.mysql.jdbc.Driver");

                /* Create a connection by using getConnection() method that takes parameters of 
        string type connection url, user name and password to connect to database. */
                connection = DriverManager.getConnection(connectionURL, "root", "");
                Statement st= connection.createStatement();
        // check weather connection is established or not by isClosed() method 
                if (!connection.isClosed())
       {
           int i= st.executeUpdate("insert into registration(name,branch,semester,email)values('"+name+"','"+branch+"','"+sem+"','"+email+"')");
          
                out.println("updated successfully");
            connection.close();
        }}
                catch(Exception ex)
                {
                    out.println(ex);
                }
        %>
  

</body>
</html>
