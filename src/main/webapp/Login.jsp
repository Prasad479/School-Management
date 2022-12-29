<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<! DOCTYPE html>  
<html lang="en" >  
<head>  
  <meta charset="UTF-8">  
  <title> Login  
</title>  
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">  
</head>  
<style>  
body {  
          background-repeat: no-repeat, repeat;  
          background-position: center;  
          background-size: cover;  
          padding-top: 50px;  
        }  
        .login-form {  
          background:#1a11117a;  
          margin-top: 40px;  
          margin-bottom: 100px;  
          padding: 100px;  
          border-radius: 50px;  
          color: white;  
          box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.75);  
        }  
        .login-heading {  
          text-align: center;  
          margin-top: 20px;  
        }  
        .btn-primary {  
          width: 100%;  
        }  
</style>  
<body>  
<h1 class="text-center">Principal Login </h1>  
    <div class="container">  
      <div class="row">  
        <div class="col-md-8 offset-md-2">  
          <div class="login-form">  
            <form action="Login" method="post">  
              <div class="form-group">  
                <label for="exampleInputEmail1">Enter Username </label>  
                <input type="text" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">  
                <small id="emailHelp" class="form-text text-muted"> We'll never share your username with anyone else. </small>  
              </div>  
              <div class="form-group">  
                <label for="exampleInputPassword1"> Enter Password </label>  
                <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">  
              </div>  
              <button type="submit" class="btn btn-primary"> Submit </button>  
            </form>  
          </div>  
        </div>  
      </div>  
    </div>  
    <script>  
    </script>  
  </body>  
</html>