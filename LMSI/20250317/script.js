document.getElementById("calcularBtn").addEventListener("click",function(){

    let numero = parseFloat(document.getElementById("numero").value);
    let porcentaje = parseFloat(document.getElementById("porcentaje").value);

    let resultado = (numero * porcentaje) / 100;
    document.getElementById("resultado").textContent = resultado;
})

document.getElementById("limpiarBtn").addEventListener("click", function(){
    document.getElementById("numero").value = "";
    document.getElementById("porcentaje").value = "";
    document.getElementById("resultado").textContent = 0;

})