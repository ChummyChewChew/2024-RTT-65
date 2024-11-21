/*
Like java, this is a multi line comment
To declare variables
var
char
const
 */
//This is a single line comment
//Be careful with unassigned variables to avoid temporal dead zone, meaning it's trying to reach
//a unassigned variable
//Var can lead to TDZ so try to stick with let and const
var myVariables= "Some value";
let mySecond = true;
const PI = 3.14;
let my_Variable =1.5;

let x =10;
//here it is 10
{
  let x =2;
  //Inside this block, it is 2
  console.log(x)
}
//Outside the block, x is 10
console.log(x)
var counter = 1;
// Do something with this counter.

// Then, some many lines later...
if (true) {
  var counter = 2;
  // Do something with this other counter.

  console.log("Inside " + counter);
}

// Which counter are we referencing here?
console.log("Outside " + counter);


