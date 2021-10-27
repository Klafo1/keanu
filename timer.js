let timeElm = document.getElementById('timeElm');
let timer = function(x) {
 if(x === 0) {
    return;
 }

 timeElm.innerHTML = x;

 return setTimeout(() => {timer(--x)}, 1000)
}

timer(30);