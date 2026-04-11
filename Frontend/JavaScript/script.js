// console.log(window);

// console.log(global);



// var a;
// a = 10;
// var a = 10;
// var a;
// var a = 0;

// console.log(a);


// let a;
// a = 10;
// let a = 10;
// let a;
// let a = 0;

// console.log(a);



// const a;
// a = 10;
// const a = 10;
// const a;
// const a = 0;

// console.log(a);




// let $user_name = 10;
// console.log($user_name);



// Data Types
































var str = "Hello";

// console.log(str.toLowerCase());
// console.log(str.at(0));
// console.log(str.trimStart());
// console.log(str.trimEnd());
// console.log(str.trim());
// console.log(str.slice(-4, -1));
// console.log(str.replace("ll", "lo"));
// console.log(str.replaceAll('l', 'o'));
// console.log(str.concat(", how are you?"));
// console.log(str.substring(2, 4));         //doesn't work with negative index like slice
// console.log(str.split("").join());




//!Arrays


// push() - adds element at the end of the array
// pop() - removes element from the end of the array
// unshift() - adds element at the beginning of the array
// shift() - removes element from the beginning of the array
// splice() - adds/removes elements from the array at a specific index
// concat() - merges two or more arrays and returns a new array
// join() - joins all elements of an array into a string
// indexOf() - returns the first index at which a given element can be found in the array, or -1 if it is not present
// lastIndexOf() - returns the last index at which a given element can be found in the array, or -1 if it is not present
// includes() - determines whether an array includes a certain value among its entries, returning true or false as appropriate


//CRUD Operations on arrays



// let arr1 = [1, 'A', true, "Soumya", 20n];
// let arr2 = [1, 2, 3, 4, 5];
// // console.log(arr1);
// // console.log(arr[4]);

// console.log(typeof(arr1));
// console.log(typeof(arr2));


// let arr3 = new Array(1, 'A', true, "Soumya", 20n);
// let arr4 = Array.of(19);

// arr3[0] = 10;
// console.log(arr3);
// // console.log(arr4);
// delete arr3[1];
// console.log(arr3);

// arr3.shift();          //removes first element
// console.log(arr3);

// arr3.slice(1, 3);        //removes elements from index 1 to 2 (3 is not included)
// console.log(arr3);

// arr3.splice(4, 1, "Elem1", "Elem2");     //removes 1 element at index 4 with "Elem1" and "Elem2" concatinated at last
// console.log(arr3);

// let merge = arr3.concat(arr4);
// console.log(merge);



// let result = arr3.join("-");
// console.log(result);


//Map Method

// let arr = [1, 2, 3, 4, 5];
// let result = arr.map(n=>n*2);

// console.log(result);





//Filter Method
// let arr = [121,224,316,114,512,676];
// let result = arr.filter(n=>n>300);
// console.log(result);



//Reduce Method

// let arr = [1, 2, 3, 4, 5];
// let result = arr.reduce((acc, n) => acc + n, 0);
// console.log(result);



//Object

// let person = {
//     name:"Soumyadeep",
//     age: 20,
//     city: "Kolkata",
//     hobbies: ["Coding", "Gaming", "Cooking"],
//     action: function() {
//         console.log("Deewana Kar Rha Hai Tera roop sunehra");
//     }
// }

// delete person.city;

// console.log(person);
// person.action();






// for of and for in loop

// let arr = [10, 20, 30, 40, 50, 60];

// for (let i in arr) {
//     console.log(i);          //prints index of the array
// }

// for (let i of arr) {
//     console.log(i);          //prints value of the array
// }

// console.log(arr);

// console.log(typeof(arr));






//Spread Operator

// let arr1 = [1, 2, 3];
// let arr2 = [4, 5, 6];
// let arr3 = [...arr1, ...arr2];

// console.log(arr3);


// Spread Operator in functions

// function sum(a, b, c) {
//     return a + b + c;
// }

// let arr = [1, 2, 3];

// console.log(sum(...arr));








//Rest Operator

// function demo(a, b, ...args) {
//     console.log(a,b,args);
// }

// demo(1, 2, 3, 4, 5, 6);








// Destructuring

// let [a, b, c] = [1, 2, 3, 4, 5, 6];
// console.log(a, b, c);


// let [x, y, z] = [["Hello", "World", "Soumya"], [1, 2, 3], [true, false]];
// console.log(x, y, z);


// let [arr1, arr2, ...rest] = [1, 2, 3, 4, 5, 6];
// console.log(arr1, arr2, rest);









//object Destructuring

// let obj = {
//     username: "Soumyadeep",
//     age: 20,
//     hobbies: ["Coding", "Gaming", "Cooking"],
//     address: {
//         street: "123 Main St",
//         city: "Kolkata",
//         zip: "700001"
//     }
// }

// let {username, age, hobbies, address} = obj;

// console.log(username, age, hobbies, address);











