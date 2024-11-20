const input = prompt("Enter a range of two numbers, separated by a space (e.g. 23 34): ");
const [min, max] = input.split(" ");
const guess = Math.floor(Math.random() * (Number(max) - Number(min) + 1) + Number(min));

let limiter = 0;
let userGuess;

while (limiter <= 10) {
  userGuess = prompt(`Guess a number between ${min} and ${max}: `);


  if (userGuess === guess) {
    alert("You got it: " + userGuess);
    break;
  }


  limiter++;
}

if (guess !== userGuess){
  alert("Sorry, the answer was: " + guess);
}
