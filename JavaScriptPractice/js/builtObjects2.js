//Arrays-
const a = [];
a[0] =3;
console.log(a[0]);
a[1] =a[0] -3;
console.log(a[a[1]]);
console.log(a[10])
console.log(a)
const objArray = [{ key1: "value1" }, { key2: "value2" }];
// ArrayName[array_index][object_key]
console.log(objArray[0]["key1"]);	// value1
const multiArray = [
  [{ key1: "value1", key2: "value2" },
    { key1: "value3", key2: "value4" }],
  [{ key1: "value5", key2: "value6" },
    { key1: "value7", key2: "value8" }]
];
// ArrayName[array_index][internal_array_index][object_key]
console.log(multiArray[1][0]["key2"]);	// value6

const b =[2, 3, 5, 7, 11]
b.length =2;
console.log(b);
b.length =5;
console.log(b)

const c = [];
//c[0] =3;
c.push(3);
c.push(4, 5, 6);
console.log(c);

const d = [4, 5, 6];
const e = d.pop();
console.log(e);
console.log(d);

const f = d.shift();
console.log(f)
console.log(d)

const g = [1, 2, 3];
const x = g.join();
console.log(x);
const y = g.join(" ");
console.log(y);
const z = g.join("");
console.log(z);
const h =  new Array(10);
const k = h.join("-");
console.log(h);

const l = [1, 2, 3];
let m = l.reverse().join();
console.log(l);
console.log(m);

let n = ["banana", "cherry", "apple"];
n.sort();
const s = n.join(" is good, ")
console.log(s);
let fruits = ["banana", "orange", "apple", "manga"];
fruits.sort();
console.log(fruits);
const a1 = [1, 2, 3, 4, 5];
const w1 = a.slice(0, 3);	// w = [1, 2, 3]
const x1 = a.slice(3);		// x = [4, 5]
const y1 = a.slice(1, -1);	// y = [2, 3, 4]
const z1 = a.slice(-3, -2);	// z = [3]
console.log(a);			// [1, 2, 3, 4, 5]
const languages = ["JavaScript", "Python", "C", "C++", "Java"];
// slicing the array from start to second-to-last element
let new_arr = languages.slice(0, -1);
console.log(new_arr); // ['JavaScript', 'Python', 'C', 'C++']
// slicing the array from third-to-last to last element
let new_arr1 = languages.slice(-3);
console.log(new_arr1); // ['C', 'C++', 'Java']
let fruits1 = ["banana", "orange", "apple", "mango"];
fruits.splice(2, 0, "lemon", "kiwi");
console.log(fruits);
// [“banana”, “orange”, “lemon”, “kiwi”, “apple”, “mango”]
let fruits3 = ["banana", "orange", "apple", "mango"];
fruits.splice(2, 2, "lemon", "kiwi");	// removes 2 elements
console.log(fruits);				// [“banana”, “orange”, “lemon”, “kiwi”]
const a2 = [1, 2, 3, 4, 5, 6, 7, 8];
const x2 = a.splice(4);				// x = [5, 6, 7, 8]; a = [1, 2, 3, 4]
const y2 = a.splice(1, 2);			// y = [2, 3]; a = [1, 4]
const z2 = a.splice(1, 1);			// z = [4]; a = [1]
const b2 = [1, 2, 3, 4, 5];
const m2 = b.splice(2, 0, "a", "b");	// m = []; b = [1, 2, “a”, “b”, 3, 4, 5]
const n2 = b.splice(2, 2, [1, 2], 3);	// n = [“a”, “b”];
// b = [1, 2, [1, 2], 3, 3, 4, 5]
let a4 = [23, 32, 45, 67, 77, 67, 98, 12];
for (let i = 0; i < a.length; i++) {
  console.log(a[i]);	// will output each element of the array
}
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
for (const personKey in person) {
  console.log(personKey + ": " + person[personKey]);
} 	// will output each key: value pair in the object
