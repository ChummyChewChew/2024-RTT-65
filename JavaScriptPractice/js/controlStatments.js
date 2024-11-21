let number = 5;
if (number > 5) {
  console.log(number + " is greater than 5");
} else if (number < 5) {
  console.log(number + " is less than 5");
} else if (number == 5) {
  console.log(number + " is equal to 5");
} else {
  console.log(number + " is not a number");
}

switch (number){
  case 0:
    console.log("The number is zero");
    break;
  case 5:
    console.log("the number is 5");
    break;
  default:
    console.log("not valid");
    break;
}

let x = 5;
let y = 4;
let operand = "*";
switch (operand) {
  case "+":
    console.log(x + y);
    break;
  case "-":
    console.log(x - y);
    break;
  case "*":
    console.log(x * y);
    break
  case "/":
    console.log(x / y);
    break;
  default:
    console.log("Invalid Operand")
    break;
}
