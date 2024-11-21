/* Javascript objects are created using key value pairs
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue",
  fullName: function (){
    return this.firstName+" "+this.lastName;
  }
};

console.log(person.firstName+" is "+person["age"]+" years old");

const myArray = Object.values(person);
console.log(myArray);
delete person.age;
console.log(person);

//Creating objects: Literals:
const student = {
  firstName: "John",
  lastName: "Doe",
  age: 30,
  class: "Java developer"
};
student.score = "90%";

const empty = {} // An object with no properties.
const point = { x:0, y:0 }; // An object with two properties.
const point2 = { x: point.x, y: point.y + 1 }; // More complex values.
const book = {
  "main title": "JavaScript", // Property names can include spaces,
  "sub-title": "The Definitive Guide", // and hyphens; use string literals.
  "for": "all audiences", // for is a reserved word; quote it to use.
  author: { // The value of this property is itself an object.
    firstname: "David", // Note that these single-word
    surname: "Flanagan" // property names are unquoted.
  }
};

//Creating Objects: new keyword:
const x1 = new Object();    // A new Object object
const x2 = new String();    // A new String object
const x3 = new Number();    // A new Number object
const x4 = new Boolean();   // A new Boolean object
const x5 = new Array();     // A new Array object
const x6 = new RegExp();    // A new RegExp object
const x7 = new Function();  // A new Function object
const x8 = new Date();      // A new Date object

const o = new Object(); // Create an empty object: same as {}.
const a = new Array(); // Create an empty array: same as [].
const d = new Date(); // Create a Date object representing the current time.
const r = new RegExp("js"); // Create a RegExp object for pattern matching.


const person = new Object();
person.firstName = "John";
person.lastName = "Doe";
person.age = 50;
person.eyeColor = "blue";

*/
//Creating Objects: Object Constructors:
//Here is an example of using object constructors:
function Person(first, last, age, eye) {
  this.firstName = first;
  this.lastName = last;
  this.age = age;
  this.eyeColor = eye;
  this.introduce = function() {
    console.log(this.firstName + " " + this.lastName +
      " is " + this.age + " years old with " + this.eyeColor + " eyes.");
  };
}
//THe Prototype Property:
Person.prototype.species = "Human";

const myFather = new Person("John", "Doe", 50, "blue");
const myMother = new Person("Sally", "Rally", 48, "green");

myFather.birthday = "June 15th"; // Adding a property to an Object.

myFather.introduce(); // Calling an Object method.

console.log(myFather.species);

const myBrother = new Person("Jane", "Doe", 22, "blue");
myBrother.species = "Goblin";
Person.prototype.species = "Human";
console.log(myFather.species); // Human
console.log(myBrother.species); // Goblin
//console.log(myBrother.__proto__.species); // Human
console.log(Object.getPrototypeOf(myBrother).species); // Human
