<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>OMOS</title>

    <!-- To add CSS file -->
    <link rel="stylesheet" type="text/css" href="LoginRegistration/css/loginPage.css">

    <!-- To add Icons -->
    <script src="https://kit.fontawesome.com/8d1ac6ad03.js" crossorigin="anonymous"></script>
</head>
<body>

    <!-- Header section -->
    <table width="100%">
        <tr>
            <td width="20%">
                <img src="Images/logo.png" alt="logo" width="60%" height="60%" id="logo">
            </td>

            <td width="50%">
                <div class="headTopic">
                    <h1 id="mainHeading">OMOS</h1>
                    <h3 id="slogan">&nbsp;&nbsp;Your Health, Our Priority, One Click Away.</h3>
                </div>
            </td>

            <td width="20%">
                <div class="AlreadyAcc">
                    <a href="RegistrationForm.html">Does not have an account?</a>
                    <a href="RegistrationForm.html"><button class="RRB">Register</button></a>
                </div>
            </td>
        </tr>
    </table>

    <div class="Line">
        <!-- Just to Take An empty NavBar -->
    </div>

    <br>

    <h1>Login</h1>
    
    <!-- Login form -->
    <div id="LForm">
        <fieldset>
            <form method="POST" action=" ">
                
                <label for="orderList"><b>Order List</b></label><br>
    			<textarea placeholder="Enter Order List with correct quantities" name="orderList" id="orderList" rows="4" cols="150"></textarea>

                <br><br>

                <label for="deadline"><b>Deadline</b></label>
    			<input type="date" name="deadline" id="deadline">

                <div class="FormButtons">
                    <input type="submit" name="login" value="Login" id="login">

                    <a href="HomePage1.html"><input type="button" value="Cancel" id="cancel"></a>
                </div>
            </form>
        </fieldset>
    </div>
    
    <br><br>
   
    <!-- Footer Begins -->
    <footer>
        <table width="100%">
            <tr class="footTable">
                <th width="20%">ishibishi</th>
                <th width="20%">gayashan</th>
                <th width="20%">dinuvi</th>
                <th width="20%">thilina</th>
                <th width="20%">Follow Us On</th>
            </tr>

            <tr class="footTable">
                <td>
                    <ul>
                        <li><a href="PPhomePage.php">ishibishi</a></li>
                        <li><a href="enter login details.php">gayashan</a></li>
                        <li><a href="makeClaim.php">dinuvi</a></li>
                        <li><a href="renewpolicy.php">thilina</a></li>
                    </ul>
                </td>

                <td>
                    <a href="AboutUs.html">About Us</a>
                </td>
                <td>
                    <i class="fa-solid fa-phone"></i> +94704484574<br><br>
                    <i class="fa-solid fa-envelope"></i> omos@info.lk <br><br>
                    <i class="fa-solid fa-fax"></i> +94112123123 <br><br>
                </td>
                <td>
                    <i class="fa-solid fa-location-dot"></i> New,<br>SLIIT,<br>Malabe,<br>Sri Lanka
                </td>
                <td>
                    <a href="#"><i class="fa-brands fa-square-facebook" style="font-size:30px;"></i></a>
                    <a href="#"><i class="fa-brands fa-square-twitter" style="font-size:30px;"></i></a>
                    <a href="#"><i class="fa-brands fa-square-instagram" style="font-size:30px;"></i></a>
                    <a href="#"><i class="fa-brands fa-linkedin" style="font-size:30px;"></i></a> 
                    <br><br><br><br>
                    <div id="Cpyright"><i class="fa-regular fa-copyright"></i>2023 All Rights Reserved</div>
                </td>
            </tr>
        </table>
    </footer>
    <!-- Footer Ends -->

    <!-- The JavaScript File of the Page -->
    <script src="./LoginRegistration/js/login.js"></script>

</body>
</html>
