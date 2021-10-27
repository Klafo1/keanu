Location
document.getElementById("dis").disabled = true;
var counter = 0;
var x = document.getElementById("myDIV");
var y = document.createElement("img");
var y1 = document.createElement("img");
var y2 = document.createElement("img");
var xy = document.createElement("img");

function myFunction() {
  document.getElementById("dis").disabled = false;
  counter++;
  if (counter % 2 == 0) {
    if (y && xy && x) {
      y.style.display = 'none';
      xy.style.display = 'inline';
      xy.setAttribute("src", "bricks.png");
      xy.setAttribute("width", "75");
      xy.setAttribute("height", "3");
      xy.setAttribute("style", "margin:a b c d");
      document.body.appendChild(xy);
    }
  } else {
    xy.style.display = 'none';
    y.setAttribute("src", "circle.png");
    y.setAttribute("width", "236");
    document.body.appendChild(y);
    y.style.display = 'inline';
  }
}
<button id="dis" onclick="myFunc()">Click me</button>
<img src="num1.png" style="position:absolute;top:80px;" onclick="myFunction()" />
<div id="myDIV">
</div>
<p id="demo"></p>