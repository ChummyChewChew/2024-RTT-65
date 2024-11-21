"use strict";
function defaultMessage(){
  console.log("Default message");
}
/*
//Call the function:
defaultMessage();

function customMessage(custom, times) {
  for (let i = 0; i < times; i++) {
    console.log(i, custom) ;
  }
}

customMessage("Hello!",3);

//Return something:
function add(a, b) {
  let c = a + b;
  return c;
}
let result = add(3, 5);
console.log(result);

//Variable Scope in JavaScript:
const scope = "global"; // Declare scope global
function checkscope() {
  let scope = "local"; // Declare scope local
  return scope; // Return local value
}
const result = checkscope();
console.log(result); // Will print “local”

const scope = "global scope"; // A global variable
function checkscope() {
  let scope = "local scope"; // A local variable
  function nested() {
    let scope = "nested scope"; // A nested local variable
    return scope; // Return the value in this scope
  }
  return nested();
}
const result = checkscope();
console.log(result); // Will print “nested scope”*/

//Hoisting:
const x = 1;
hoist();/*we call the function before declaring the function
so, the declaration is hoisted*/
function hoist() {
  console.log(x);
  // ReferenceError
  //const x = 2;
}
