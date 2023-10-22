function confirmUpdate(name) {
  var confirmed = confirm('Are you sure you want to update details of ' + name + '');
  if (!confirmed) {
    return false;
  }
}


function confirmDelete() {
  var confirmed = confirm('Are you sure you want to delete this profile?');
  if (!confirmed) {
    return false;
  }
}

let password = document.getElementById("pwd");
let cpassword = document.getElementById("cpwd");
let errorMSG = document.getElementById("err");
let checkbox = document.getElementById("checkbox");

function passwordMatch() {
  if(password.value !== cpassword.value) {
    // console.log("Passwords do not match");
    errorMSG.style.display = "block";
  }else{
    // console.log("Passwords match");
    errorMSG.style.display = "none";
  }
    
}
cpassword.addEventListener("keyup", passwordMatch);


function showpwd(){
  
  if(checkbox.checked == true){
      password.type = "text";
      cpassword.type = "text";
  
  }else{
      password.type = "password";
      cpassword.type = "password";
  }
}

checkbox.addEventListener("click", showpwd);


