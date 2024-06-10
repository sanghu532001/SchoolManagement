<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
@import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@200;300;400;500;600;700&display=swap");

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Open Sans", sans-serif;
}

body {
  display: flex;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  width: 100%;
  padding: 0 10px;
}

body::before {
  content: "";
  position: absolute;
  width: 100%;
  height: 100%;
  background: url(https://img.freepik.com/free-vector/tropical-leaves-background-zoom_23-2148580778.jpg?size=626&ext=jpg&ga=GA1.1.1141335507.1717891200&semt=ais_user), #000;
  background-position: center;
  background-size: cover;
}

.wrapper {
  width: 400px;
  border-radius: 8px;
  padding: 30px;
  text-align: center;
  border: 1px solid rgba(255, 255, 255, 0.5);
  backdrop-filter: blur(8px);
  -webkit-backdrop-filter: blur(8px);
}

form {
  display: flex;
  flex-direction: column;
}

.input-field {
  position: relative;
  border-bottom: 2px solid #ccc;
  margin: 15px 0;
}

.input-field input {
  width: 100%;
  height: 40px;
  background: transparent;
  border: none;
  outline: none;
  font-size: 16px;
  color: #fff;
}

.input-field input:focus~label,
.input-field input:valid~label {
  font-size: 0.8rem;
  top: 10px;
  transform: translateY(-120%);
}

.wrapper a {
  color: #efefef;
  text-decoration: none;
}

.wrapper a:hover {
  text-decoration: underline;
}

button {
  background: #fff;
  color: #000;
  font-weight: 600;
  border: none;
  padding: 12px 20px;
  cursor: pointer;
  border-radius: 3px;
  font-size: 16px;
  border: 2px solid transparent;
  transition: 0.3s ease;
}

button:hover {
  color: #fff;
  border-color: #fff;
  background: rgba(255, 255, 255, 0.15);
}

h2{
color: #fff;
margin-bottom: 30px;
}

</style>
</head>
<body>
<!--  
<div class="container">
<form action="edit" method="post">
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Enter Id :</label>
  <input type="number" name="id" class="form-control" id="formGroupExampleInput" value="${student.id}">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Enter First Name :</label>
  <input type="text" name="first-name" class="form-control" id="formGroupExampleInput2" value="${student.firstName}">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Enter Last Name :</label>
  <input type="text" name="last-name" class="form-control" id="formGroupExampleInput" value="${student.lastName}">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Enter mother Name :</label>
  <input type="text" name="mother-name" class="form-control" id="formGroupExampleInput2" value="${student.motherName}">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Enter Father Name :</label>
  <input type="text" name="father-name" class="form-control" id="formGroupExampleInput2" value="${student.fatherName}">
</div>
<button type="submit" >Update</button>
-->

<!-- .......................................... -->

<div class="wrapper">
<h2>Update Details</h2>

<form action="edit" method="post">
      <div class="mb-3 input-field">
  <input type="number" name="id" class="form-control" id="formGroupExampleInput" value="${student.id}">
</div>
<div class="mb-3 input-field">
  <input type="text" name="first-name" class="form-control" id="formGroupExampleInput2" value="${student.firstName}">
</div>
<div class="mb-3 input-field">
  <input type="text" name="last-name" class="form-control" id="formGroupExampleInput" value="${student.lastName}">
</div>
<div class="mb-3 input-field">
  <input type="text" name="mother-name" class="form-control" id="formGroupExampleInput2" value="${student.motherName}">
</div>
<div class="mb-3 input-field">
  <input type="text" name="father-name" class="form-control" id="formGroupExampleInput2" value="${student.fatherName}">
</div>
<button type="submit">Update</button>
      
</form>
  </div>


<!-- .......................................... -->
</form>
</div>
</body>
</html>