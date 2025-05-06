// IMC=peso/altura^2 formula IMD

// Evento al hacer clic en "calcular"

document.getElementById("calcularBtn").addEventListener("click", function(){

    let altura = parseFloat(document.getElementById ("altura").value);
    let peso = parseFloat(document.getElementById("peso").value);

    // Calcular el IMC
    let imc = peso / (altura * altura);

    // Mostrar el resultado
    document.getElementById("resultado").textContent = imc.toFixed(2);


});

