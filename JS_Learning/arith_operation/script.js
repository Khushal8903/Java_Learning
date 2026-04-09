let first = document.getElementById("f");
let second = document.getElementById("s");
let result = document.getElementById("d");

let btn = document.querySelectorAll(".op");

btn.forEach(btn => {
  btn.addEventListener("click", function(){
    
let val = this.value;
let output;
let a= Number(first.value);
let b = Number(second.value);

switch(val){
  case '+' :
    output = a+b;
    break;
  case '-':
    output = a-b;
    break;
  case '*':
    output = a*b;
    break;
  case '/':
    b == 0 ? output = "Error: Division by zero" : output = a/b;
    break;
  case '!':
    first.value = "";
    second.value = "";
    output = "Cleared";
    break;
  default:
    output = "Invalid operator";
    break;
}
  let res = document.createElement("h1");
  res.innerHTML = "Result: " + output;
  result.appendChild(res);

});
});