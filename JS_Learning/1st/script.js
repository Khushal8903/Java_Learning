function show() {
  let heading =document.getElementById("h");

 if(heading.innerHTML === "Good Morning"){
    heading.innerHTML = "Good Afternoon";
 }else if(heading.innerHTML === "Good Afternoon"){
    heading.innerHTML = "Good Evening";
 }else{
    heading.innerHTML = "Good Morning";
 }
}