<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <style>
        /* Basic styling for modern look */
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background-color: #f4f4f9;
            margin: 0;
        }
        .container {
            max-width: 600px;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
            border-radius: 8px;
            text-align: center;
        }
        h1 {
            color: #333;
        }
        h3 {
            color: #555;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 15px;
            text-align: left;
            font-weight: bold;
        }
        input[type="text"], input[type="number"], input[type="submit"] {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            cursor: pointer;
            font-weight: bold;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        .error-message {
            color: red;
            font-size: 12px;
            margin-top: -5px;
            margin-bottom: 10px;
            text-align: left;
        }
        .displayUsers {
            margin-top: 30px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f8f9fa;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Creant Company</h1>

        <h3>User Register Here!</h3>
        <form action="create" method="POST">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required="required" oninput="validateName()" placeholder="Enter your name">
            <div id="error-name" class="error-message"></div>

            <label for="phone">Phone</label>
            <input type="number" id="phone" name="phone" required="required" oninput="validatePhone()" placeholder="Enter your phone number">
            <div id="error-phone" class="error-message"></div>

            <label for="email">Email</label>
            <input type="text" id="email" name="email" required="required" oninput="validateEmail()" placeholder="Enter your email">
            <div id="error-email" class="error-message"></div>

            <input type="submit" id="submitBtn" value="Submit" disabled>
        </form>

        <span>${message}</span>

        <div class="displayUsers">
            <a href="getAllUsers">View All Users</a>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Phone</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.phone}</td>
                            <td>${user.email}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script type="text/javascript">
        function validateName() {
            const name = document.getElementById('name').value;
            if (name.length < 3 || name.length > 10) {
                document.getElementById('error-name').innerHTML = 'Name must be between 3 and 10 characters.';
                document.getElementById('submitBtn').disabled = true;
            } else {
                document.getElementById('error-name').innerHTML = '';
                document.getElementById('submitBtn').disabled = false;
            }
        }

        function validatePhone() {
            const phone = document.getElementById('phone').value;
            const pattern = /^[6-9]\d{9}$/;
            if (!pattern.test(phone)) {
                document.getElementById('error-phone').innerHTML = 'Phone number must start with 6-9 and contain 10 digits.';
                document.getElementById('submitBtn').disabled = true;
            } else {
                document.getElementById('error-phone').innerHTML = '';
                document.getElementById('submitBtn').disabled = false;
            }
        }

        function validateEmail() {
            const email = document.getElementById('email').value;
            const pattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
            if (!pattern.test(email)) {
                document.getElementById('error-email').innerHTML = 'Email must end with @gmail.com';
                document.getElementById('submitBtn').disabled = true;
            } else {
                document.getElementById('error-email').innerHTML = '';
                document.getElementById('submitBtn').disabled = false;
            }
        }
    </script>
</body>
</html>
