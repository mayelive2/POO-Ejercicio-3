/*integrantres: 
  Mayeleen Rodriguez Gomez cod:2016114118
  Luis Hatum
*/

package perfectnumberlist;

import java.util.Scanner;
/**
 *
 * @author Maye
 */
public class PerfectNumberList {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
         PerfectNumberList aNumberTheoryUtil = new PerfectNumberList();
                
        System.out.print("Ingrese el límite superior (entero positivo): ");
        Scanner in = new Scanner(System.in);
        if ( ! in.hasNextInt()) {
            System.out.println("Limite Superior no Valido. Por favor intente ottra vez.");
            return;
        }
        int limiteSuperior = in.nextInt();
        
        if (limiteSuperior < 0) {
            System.out.println("Limite Supperior no es positivo. Por favor intente ottra vez.");
            return;
        }
        
        System.out.println("Estos Numeros son Perfectos:");
        int countPerfectNumbers   = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            if ( ! aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countPerfectNumbers++;
        }
        System.out.printf("\n[%1$d Numeros Perfectos Encontrados (%2$.2f%%)]\n",
                countPerfectNumbers, ((double)100 * countPerfectNumbers/limiteSuperior)
        );
        
        System.out.println();
        
        System.out.println("Estos números no son ni deficientes ni perfectos:");
        int countDeficientNumbers = 0;
        for (int i = 1; i <= limiteSuperior; i++) {
            if ( aNumberTheoryUtil.isDeficient(i) || aNumberTheoryUtil.isPerfect(i)) {
                continue;
            }
            System.out.printf("%d ", i);
            countDeficientNumbers++;
        }
        System.out.printf("\n[%1$d Numeros Encontrados (%2$.2f%%)]\n",
                countDeficientNumbers, ((double)100 * countDeficientNumbers/limiteSuperior)
        );     
    }
    
    
    private boolean isPerfect(int posInt){
        int sumDivisores = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisores += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisores == posInt);
    }
    
    
    private boolean isDeficient(int posInt){
        int sumDivisores = 0;
        for (int i = 1 ; i < posInt; i++) {
            sumDivisores += (posInt%i == 0) ? i : 0;
        }
        return (sumDivisores < posInt);
        
    }
    
}
