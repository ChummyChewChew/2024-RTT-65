document.addEventListener("DOMContentLoaded", () => {//makes sure dom is loaded before it does anything
    // Initializing my variable
    //arrow operator can be used instead of function
    //argument variable does not exist in arrow functions
    //does not creat it's own this binding, can't be used as constructors, can't be declared, can't be accessed before initialization



    // Getting all my inputs from the DOM through ID
    let difficulty = document.getElementById("difficulty");
    let guessInput = document.getElementById("guess");
    let submitButton = document.getElementById("submitGuess");
    let result = document.getElementById("resultMessage");
    let victorySound = document.getElementById("VICTORY");
    let lossSound = document.getElementById("LOSS");
    let beep = document.getElementById("BEEP");
    let victoryImage = document.getElementById("victoryImage");
    let maxNumber;
    let answer;
    let guesses = 3;

    // Resetting game
    function reset() {
        // Clearing our contents and disabling inputs
        guessInput.value = "";
        result.textContent = "";
        guesses = 3;
        guessInput.disabled = true;
        submitButton.disabled = true;
        victoryImage.style.display = "none"; // Hide the victory image
    }

    function startGame() {
        reset();
        let selectedDifficulty = difficulty.value;
        if (selectedDifficulty === 'easy') {
            maxNumber = 5;
        } else if (selectedDifficulty === 'hard') {
            maxNumber = 10;
        }
        answer = Math.floor(Math.random() * maxNumber) + 1; // Getting a random number
        guessInput.disabled = false;
        submitButton.disabled = false;
    }

    // Function to handle guess submission
    function submitGuess() {
        let userGuess = parseInt(guessInput.value);


        if  (guesses > 0 && userGuess !== answer) {//Beep plays for guess
            beep.play();
        }

        if (isNaN(userGuess) || userGuess < 1 || userGuess > maxNumber) {//Checks if it's a number and within range
            result.textContent = "Please enter a valid guess";
            result.style.color = "red";
            return; // Stops the function if the input is invalid
        }

        guesses--;
        if (userGuess === answer) {
            result.textContent = "Congratulations! You guessed correctly";
            result.style.color = "green";
            victorySound.play();
            victoryImage.style.display = "block"; // Show the victory image
            guessInput.disabled = true;
            submitButton.disabled = true;
        } else if (guesses > 0) {
            result.textContent = "Sorry! You guessed incorrectly";
            result.style.color = "red";
            if (userGuess > answer) {
                result.textContent += " Try a lower number.";
            } else {
                result.textContent += " Try a higher number.";
            }
        } else {
            result.textContent = "Sorry! You are out of guesses!";
            result.style.color = "red";
            lossSound.play();
            guessInput.disabled = true;
            submitButton.disabled = true;
        }
    }


    submitButton.addEventListener("click", submitGuess);//Calling method on listener action


    guessInput.addEventListener("keydown", function(event) {
        if (event.key === "Enter") {
            submitGuess();
        }
    });

    difficulty.addEventListener("change", startGame);
});
