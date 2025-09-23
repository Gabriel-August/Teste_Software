const { somar, subtrair, multiplicar, dividir, potencia, raizQuadrada, } = require("../calculadora");

describe("Testes da Calculadora", () => {

    test("soma dois números", () => {
        expect(somar(5, 3)).toBe(8);
    });

    test("subtração resultando em negativo", () => {
        expect(subtrair(3, 5)).toBe(-2);
    });

    test("multiplicação por zero", () => {
        expect(multiplicar(7, 0)).toBe(0);
    });

    test("divisão com decimal", () => {
        expect(dividir(7, 2)).toBeCloseTo(3.5);
    });

    // Teste de erro corrigido (apenas um 'test' com a lógica correta)
    test("lança erro ao dividir por zero", () => {
        expect(() => dividir(10, 0)).toThrow("Divisão por zero não permitida!");
    });

    test("soma por zero", () => {
        expect(somar(10, 0)).toBe(10);
    });
    test("subtração com numeros iguais", () => { //
        expect(subtrair(10, 10)). toBe(0);
    });

    test("divisão por um", () => {
        expect(dividir(10, 1)). toBe(10);
    })

    test("Multiplicação com números negativos", () => {
        expect(multiplicar(-3, -5)).toBe(15);
    });

    test("combinações de positivos e negativos", () => {
        expect(multiplicar(-2, -3)). toBe(6); //negativos
    });

    test("combinações de positivos e negativos", () => {
            expect(multiplicar(2, -3)). toBe(-6);//positivos
    });

    test("deve elevar um número a uma potência positiva", () => {
        // 2^3 = 8
        expect(potencia(2, 3)).toBe(8);
      });

      test("deve calcular a raiz quadrada de um quadrado perfeito", () => {
          // Raiz de 25 é 5
          expect(raizQuadrada(25)).toBe(5);
        });



});

