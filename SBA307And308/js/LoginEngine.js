document.getElementById("loginForm").addEventListener("submit", function (event) {
    //Getting all my inputs
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    const passwordRegex = /^\d+$/;
    let invalidInput = document.getElementById("errorMessage");
    let validInput = document.getElementById("successMessage");//Empty divs useful for changing dom
    invalidInput.textContent = "";
    validInput.textContent = "";

    if(!emailRegex.test(email)){
        event.preventDefault();
        invalidInput.textContent = "This is not a valid email";
        validInput.textContent =""//We need to clear this so make sure the user doesn't get confused
    }
    else if(!passwordRegex.test(password)){
        event.preventDefault();
        invalidInput.textContent = "This is not a valid  password";
        validInput.textContent = "";
    }
    else {
        event.preventDefault()
        invalidInput.textContent = "";
        validInput.textContent = "You have successfully logged in";
    }
})