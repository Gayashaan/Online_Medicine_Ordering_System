<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>

    <!-- insert g-icons -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <!-- insert css -->
    <link rel="stylesheet" href="./Admin_Thilina/css/style.css">


</head>


<body>
    <!---------------------------------------- SIDEBAR BEGINING ------------------------------------------>
    <%@ include file="Sidebar.jsp" %>
<!------------------------------------------- SIDEBAR END ------------------------------------------>

 <!--------------------------- main contian beginning ------------------------->

 <div class="main-content">

    <!-------------------------- CONTAINER-LEFT ------------------------------>

    <div class="container-left">

        <!-- greetings -->
        <div class="greetings">
            <h1 id="massage">good morning</h1>
        </div>
        <!-- greetings end -->


        <!-- Card begins -->
        <div class="main-card">

            <div class="card">
                <div class="insights">
                    <span class="material-symbols-rounded">insights</span>
                </div>
                    <div class="card-inner">
                        <p class="card-top">Lifetime Orders</p>
                        <p class="card-Qnt">01 Orders</p> <!--How many Sales-->
                    </div>
                    <!-- <div class="progress">
                        <p class="card-Qnt">figur</p> 
                    </div> -->
                
            </div>
            <div class="card">
                <div class="monitoring">
                    <span class="material-symbols-rounded">monitoring</span>
                </div>
                    <div class="card-inner">
                        <p class="card-top">Employees</p>
                        <p class="card-Qnt">02 Employees</p> <!--How many Sales-->
                    </div>
                    <!-- <div class="progress">
                        <p class="card-Qnt">figur</p> 
                    </div> -->
                
            </div>
            <div class="card">
                <div class="grouped_bar_chart">
                    <span class="material-symbols-rounded">grouped_bar_chart</span>
                </div>
                    <div class="card-inner">
                        <p class="card-top">Insights</p>
                        <p class="card-Qnt">03 Sales Completed</p> <!--How many Sales-->
                    </div>
                    <!-- <div class="progress">
                        <p class="card-Qnt">figur</p> 
                    </div> -->
                
            </div>
            
        </div>

        <div class="charts">

            <div class="chart-card"></div>

            <div class="chart-card">
                
                
            </div>

            

        </div>

    </div>



    <!-------------------------------- CONTAINER-RIGHT ------------------------------------>

    <div class="container-right">


            <div class="main-card-r">


                <div class="card-r">
                        <div class="calendar_month">
                            <span class="material-symbols-rounded">mail</span>
                        </div>
                        <div class="card-inner">
                            <p class="card-Qnt">Messages</p>
                            <br>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Laboriosam repudiandae dolores officia earum doloribus nobis sint quas distinctio veniam rem cumque, iste placeat architecto doloremque quae, quis eaque. Perspiciatis, corrupti!</p>
                        </div>
                        
                </div>

            </div>


    </div>


    
</div> <!--main content close tag-->

    <!---------------------- insert Javscript here ----------------------->
    <script src="./Admin_Thilina/js/index.js"></script>

</body>
</html>