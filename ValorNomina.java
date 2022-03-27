/*
1.	Hacer un algoritmo que lea N registros
(Nombre, salario básico y estrato del empleado)
y luego calcule el valor de la nómina si a cada
uno se le deduce el 8% del salario básico mensual
por prestaciones mensuales, se les da un auxilio
de transporte de 106000 y una bonificación dependiendo
del estrato así: si es tres o menos la bonificación es
del 5% sobre el salario básico, si es cuatro o cinco
la bonificación es del 3% sobre el salario básico y si
es estrato seis no se le da bonificación.
*/

import java.util.Scanner;

public class ValorNomina {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double salarioBasico = 0;
        int estratoEmpleado = 0;
        int numEmp = 0; //Numero Empleados >> Inicializada
        int i = 0;
        int auxTrans = 106000;

        //Captura numero de empleados
        System.out.println("Digite el numero de empleados: ");
        numEmp = leer.nextInt();

        double boni = 0;
        String nomEmpleado;
        for (i = 0 ; i <= numEmp ;i++) {

            System.out.println("Digite el NOMBRE del empleado: \n");
            nomEmpleado = leer.nextLine();
            System.out.println("Digite el SALARIO basico del empleado: \n");
            salarioBasico = leer.nextInt();
            System.out.println("Digite el ESTRATO del empleado: \n");
            estratoEmpleado = leer.nextInt();
            int estrato = 0;
            if (estrato <=3)
                boni += salarioBasico * 0.05;
            else if (estrato ==4 || estrato ==5)
                boni += salarioBasico * 0.03;
            else if (estrato == 6)
                boni += 0;
            /*
            switch (estrato) {
                case 3:
                    boni += salarioBasico * 0.05;
                    break;

                case 4:

                case 5:
                    boni += salarioBasico * 0.03;
                    break;

                case 6:
                    boni += 0;
                    break;
            }*/
        }
        int nomina;
        nomina = (int) (salarioBasico - (salarioBasico * 0.08) + (auxTrans * numEmp) + boni);
    }

}
