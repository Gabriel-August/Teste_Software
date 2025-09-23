function
somar(a, b) { return a + b; } function
subtrair(a, b) { return a - b; } function
multiplicar(a, b) { return a * b; }

function dividir(a, b) {

if (b === 0) throw new Error("Divisão por zero não permitida!");
return a / b;
}
module.exports = { somar, subtrair, multiplicar, dividir, potencia, raizQuadrada };


// Novas funções
function potencia(base, expoente) {
  if (expoente < 0) {
    throw new Error("Expoente negativo não permitido.");
  }
  return Math.pow(base, expoente);
}

function raizQuadrada(numero) {
  if (numero < 0) {
    throw new Error("Não é possível calcular a raiz quadrada de um número negativo.");
  }
  return Math.sqrt(numero);
}

module.exports = {
  somar,
  subtrair,
  multiplicar,
  dividir,
  potencia,
  raizQuadrada,
 };