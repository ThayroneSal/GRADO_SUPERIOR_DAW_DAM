document.getElementById("sumarBtn").addEventListener("click", function() {


let num1 =parseInt(document.getElementById("num1").value);
let num2 =parseInt(document.getElementById("num2").value);

let suma = num1 + num2;
document.getElementById("resultado").textContent = suma;

});