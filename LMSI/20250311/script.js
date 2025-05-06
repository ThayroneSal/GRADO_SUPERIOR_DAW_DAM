let contador = 0;
const contadorElement = documento.getElementById('contador');
const aumentar = documento.getElementById('aumentar');
const disminuir = documento.getElementById('disminuir');
const resetear = documento.getElementById('resetear');

// Evento de aumentar
aumentar.addEventListener('click', function() {
  contador++;
  actualizarContador();
});

// click, mousemove, keydown, input, change, submit, etc.

disminuir.addEventListener('click', function() {
  contador--;
    actualizarContador();
});

resetear.addEventListener('click', function() {
  contador = 0;
    actualizarContador();
});

function actualizarContador() {
  contadorElement.textContent = contador;
}
