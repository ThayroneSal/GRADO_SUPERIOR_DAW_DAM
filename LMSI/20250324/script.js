
//FUNCION DE CALCULAR CON CONSOLE.LOG

function calcularPorcentaje(){
    const numero = parseFloat(document.getElementById("numero").value);
    const porcentaje = parseFloat(document.getElementById("porcentaje").value);

    console.log("Número ingresado:", numero);
    console.log("Porcentaje ingresado:", porcentaje);

    const resultado = (numero * porcentaje) / 100;
    console.log(`Resultado del cálculo: (${numero} * ${porcentaje}) / 100 = ${resultado}`);
    document.getElementById("resultado").textContent = resultado;
}

//FUNCION DE LIMPIAR CAMPOS CON CONSOLE.LOG
function limpiarCampos() {
    document.getElementById("numero").value = "";
    document.getElementById("porcentaje").value = "";
    document.getElementById("resultado").textContent = 0;

    console.log("Campos reseteados")
}

//FUNCION DE CALCULAR SEGUNDO GRADO CON CONSOLE.LOG
function calcularSegundoGrado(){
    const a = parseFloat(document.getElementById("a").value);
    const b = parseFloat(document.getElementById("b").value);
    const c = parseFloat(document.getElementById("c").value);
    // console.log("a ingresado:", a);
    // console.log("b ingresado:", b);
    // console.log("c ingresado:", c);

    // console.log(`Valores ingresados: a = ${a}, b = ${b}, c = ${c}`);


    const x1 = (-b + Math.sqrt(b ** 2 - 4* a* c)) / (2 * a);
    const x2 = (-b - Math.sqrt(b ** 2 - 4* a* c)) / (2 * a);

    // console.log(`Resultado de la ecuacion: x1 = ${x1}, x2 = ${x2}`);

    // console.log(`x1: (-${b} + √(${b}^2 - 4*${a}*${c})) / 2*${a} = ${x1}`);

    // console.log(`x2: (-${b} - √(${b}^2 - 4*${a}*${c})) / 2*${a} = ${x2}`);

    document.getElementById("resultadoEq").textContent = `x1 = ${x1.toFixed(2)}, x2 = ${x2.toFixed(2)}`;

}

//FUNCION DE LIMPIAR CAMPOS CON CONSOLE.LOG

function limpiarSegundoGrado() {
    document.getElementById("a").value = "";
    document.getElementById("b").value = "";
    document.getElementById("c").value = "";
    document.getElementById("resultadoEq").textContent = 0;

    console.log("Campos reseteados")
}



document.getElementById("calcularBtn").addEventListener("click", calcularPorcentaje);
document.getElementById("limpiarBtn").addEventListener("click", limpiarCampos);
document.getElementById("calcularEqBtn").addEventListener("click", calcularSegundoGrado);
document.getElementById("limpiarEqBtn").addEventListener("click", limpiarSegundoGrado);

//a, b, c
// resultado1 = [-b + raiz( b^2-4*a*c)]/2*a
// resultado2 = [-b - raiz( b^2-4*a*c)]/2*a
//  // Math.sqrt()



    
