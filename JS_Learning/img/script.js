var zoom;

function ApplyCss(){
    zoom=true
}

function zoomin(){
  if(zoom){
  let zoomin = document.getElementById("img");
   zoomin.style.width="500px";
   zoomin.style.height="400px";
   
  }

}

function zoomout(){
  if(zoom){
  let zoomin = document.getElementById("img");
   zoomin.style.width="300px";
   zoomin.style.height="200px";
  
  }
}

