let f = document.getElementById("f");
let s= document.getElementById("s");
let output = document.getElementById("d");


// function result(){
//   let out =document.createElement("h1");
//   let res = Number(f.value) * Number(s.value);
//   out.innerHTML = res;
//   output.appendChild(out);
// }

// function result() {
//   if (f.value === "" || s.value === "") {
//     output.innerHTML = "Enter values";
//     return;
//   }

//   let res = Number(f.value) * Number(s.value);
//   output.innerHTML = res;
//}

function result() {
  let res = Number(f.value) * Number(s.value);
  output.innerHTML = "<b>" + res + "</b>";
}