/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sistemas;

public class App {

    // Diseñe un algoritmo para saludar al usuario: Hola usuario. El nombre del
    // usuario es ingresado por teclado
    public static String saludarUsuario(String nombre) {
        try {
            return "Hola " + nombre;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    // Diseñe un algoritmo que lea por teclado una velocidad en Km/seg y la
    // convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public static String convertirVelocidad(double kmPorSeg) {
        try {
            // Convertir kilómetros por segundo a metros por segundo
            double metrosPorSeg = kmPorSeg * 1000;

            // Convertir kilómetros por segundo a metros por hora
            double metrosPorHora = kmPorSeg * 1000 * 3600;

            // Retornar el resultado en el formato solicitado
            return (int) metrosPorSeg + "|" + (int) metrosPorHora;
        } catch (Exception e) {
            return "0|0";
        }
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centímetros
    // cúbicos) y devolver su cantidad en litros
    public static int convertirCcALitros(double cc) {
        try {
            double litros = cc / 1000;
            return (int) litros;
        } catch (Exception e) {
            return -1;
        }

    }

    // Solicitar al usuario ingresar una cantidad en dólares y convertirla a pesos
    // según la TRM del día
    public static int convertirDolaresAPesos(double dolares, double trm) {
        try {
            double pesos = dolares * trm;
            return (int) pesos;
        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar la temperatura en grados centígrados y
    // convertirla en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5)
    public static int convertirCelsiusAFahrenheit(double celsius) {
        try {
            double Fahrenheit = 32 + (9 * celsius / 5);
            return (int) Fahrenheit;
        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar Nro de Días nro de horas nro de minutos y nro
    // segundos y convertir todo a segundos.
    public static int convertirATotalSegundos(int dias, int horas, int minutos, int segundos) {
        try {
            int segundosDias = dias * 24 * 3600;
            int segundosHoras = horas * 3600;
            int segundosMinutos = minutos * 60;

            int totalSegundos = segundosDias + segundosHoras + segundosMinutos + segundos;
            return totalSegundos;
        } catch (Exception e) {
            return -1;
        }
    }

    // Un usuario tiene un sistema de báscula para pesar camiones, dado el peso de
    // un camión debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public static String calcularPesoNeto(double peso) {
        try {
            double pesoCamionK = peso / 1000;
            double pesoCamionT = peso / 1000000;

            return (int) pesoCamionK + "|" + (int) pesoCamionT;

        } catch (Exception e) {
            return "0|0";
        }
    }

    // Diseñe un algoritmo que calcule el tiempo necesario para alcanzar un destino
    // dado por el usuario quien además ingresará la velocidad promedio en
    // kilómetros/hora y la distancia en kilómetros
    public static int calcularTiempoViaje(double distancia, double velocidadKilometros, double velocidadHora) {
        try {
            if (velocidadKilometros <= 0 || velocidadHora <= 0) {
                throw new IllegalArgumentException("La velocidad debe ser mayor que cero");
            }
            
            // Cálculo del tiempo en horas
            double tiempo = distancia * velocidadHora/velocidadKilometros;
            
            // Redondeo y conversión a entero
            return (int) Math.round(tiempo);
        } catch (Exception e) {
            return -1;
        } 
    }

    // Un avión necesita cargar combustible para cubrir sus rutas programadas en el
    // día. Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de
    // crucero. En el despegue el avión consume 1.2 toneladas de combustible y en el
    // aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando
    // 4 rutas y el kilometraje de cada ruta obtenga la cantidad de combustible que
    // debe tanquear en el avión.
    public static int calcularCombustible(double ruta1, double ruta2, double ruta3, double ruta4) {
        try {
            double distanciaTotal = ruta1 + ruta2 + ruta3 + ruta4;
            double combustibleVuelo = distanciaTotal / 60.8 * 0.2;
            double combustibleOperaciones = 4 * (1.2 + 0.4);
            double combustibleTotal = combustibleVuelo + combustibleOperaciones;
            return (int) (combustibleTotal);
        } catch (Exception e) {

            return -1;
        }
    }

    // Diseñar un algoritmo que calcule el peso neto en la luna de un peso terrestre
    // ingresado por teclado. La gravedad de la Luna es de alrededor del 17% más que
    // la de la tierra
    public static int calcularPesoLunar(double pesoTierra) {
        try {
            double pesoLuna = pesoTierra * 0.17;
            double pesoTotLunar = pesoTierra + pesoLuna;
            return (int) pesoTotLunar;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñar un algoritmo que calcule el saldo que debe haber en una taquilla de
    // un banco. El cajero deberá ingresar la base el total de recaudos y el total
    // de retiros
    public static int calcularSaldoTaquilla(double base, double ingresos, double retiros) {
        try {
            double saldoFinal = base + ingresos - retiros;
            
            if (saldoFinal < 0) {
                return -1;
            }
            
            return (int) saldoFinal;
        } catch (Exception e) {
            return -1;
        }
    }
    
    

    // Diseñe un algoritmo para calcular la propina en un restaurante(10%) el
    // impuesto al consumo (8%) y el valor final que deberá pagar ingresando el
    // valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante(double costoComida) {
        try {
            double propina = costoComida * 0.10;
            double impuesto = costoComida * 0.08;
            double total = costoComida + propina + impuesto;
            
            String propinaStr = String.valueOf((int) propina);
            String impuestoStr = String.valueOf((int) impuesto);
            String totalStr = String.valueOf((int) total);
            
            return propinaStr + "|" + impuestoStr + "|" + totalStr;
        } catch (Exception e) {
            return -1 + "|" + -1 + "|" + -1;
        }
    }

    // Diseñar un algoritmo que obtenga los puntos finales de un equipo de fútbol
    // (puntuación según lineamientos de Fifa) a partir de los datos ingresados por
    // teclado: Número de partidos ganados número de partidos perdidos número de
    // partidos empatados.
    public static int calcularPuntosFutbol(int ganados, int perdidos, int empatados) {
        try {
            int puntos = (3 * ganados) + (1 * empatados);
            return puntos;
        } catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para
    // una materia calcule la nota final.
    public static int calcularNotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5,
            double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5) {
        try {
            double notaFinal = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4
                    + nota5 * porcentaje5;

            if (porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5 == 0) {
                throw new Exception("La suma de los porcentajes debe ser mayor a cero");
            }

            return (int) Math.round(notaFinal);
        } catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4
    // primeras notas calcule cuánto tiene que sacar para ganar si el puntaje mínimo
    // es 3.
    public static int calcularNotaNecesaria(double porcentaje1, double porcentaje2, double porcentaje3,
            double porcentaje4, double porcentaje5, double nota1, double nota2, double nota3, double nota4) {
        try {

        double sumaPonderada = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4;
        if (porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5 == 0) {
            throw new Exception("La suma de los porcentajes debe ser mayor a cero");
        }
        double notaNecesaria = (3 - sumaPonderada) / porcentaje5;

        if (notaNecesaria < 0 || notaNecesaria > 10) {
            return -1; 
        }

        return (int) Math.round(notaNecesaria);
        } catch (Exception e) {
            return -1;
        }
    }

    // Se requiere un algoritmo para calcular el salario a pagar a un trabajador con
    // los siguientes datos ingresados por teclado: cantidad de horas normales
    // laboradas, cantidad de horas extras diurnas laboradas, cantidad de horas
    // extras
    // nocturnas laboradas valor de la hora normal. El valor de las horas extras
    // diurnas tienen un recargo adicional del 15% sobre la hora normal. El valor de
    // las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora
    // normal.
    public static int calcularSalario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas,
            double valorHoraNormal) {
        try {
            if (horasNormales < 0 || horasExtrasDiurnas < 0 || horasExtrasNocturnas < 0 || valorHoraNormal <= 0) {
                return -1;
            }

            double salarioHorasNormales = horasNormales * valorHoraNormal;
            double salarioHorasExtrasDiurnas = horasExtrasDiurnas * valorHoraNormal * 1.15;
            double salarioHorasExtrasNocturnas = horasExtrasNocturnas * valorHoraNormal * 1.35;
            double salarioTotal = salarioHorasNormales + salarioHorasExtrasDiurnas + salarioHorasExtrasNocturnas;

            return (int) salarioTotal;

        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área de un triángulo rectángulo.
    public static int calcularAreaTriangulo(double base, double altura) {
        try {
            double area = (base * altura) / 2;
            return (int) area;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el perímetro de un cuadrado.
    public static int calcularPerimetroCuadrado(double lado) {
        try {
            double perimetro = lado * 4;
            return (int) perimetro;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el volumen de un cilindro.
    public static int calcularVolumenCilindro(double radio, double altura) {
        try {
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
            return (int) volumen;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área del círculo. El radio se pide por
    // teclado.
    public static int calcularAreaCirculo(double radio) {
        try {
            double area = Math.PI * Math.pow(radio, 2);
            return (int) area;
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {

    }
}
