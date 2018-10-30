/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Rabbit
 *
 */
package pbo6.pkg10117910.latihan53.rabbit;

/**
 *
 * @author User
 */
public class PBO610117910Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit r = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+r.getName());
        System.out.println(r.getName()+" is Vegetarian? "+r.isVegetarian());
        System.out.println(r.getName()+" eats "+r.getEats());
        System.out.println(r.getName()+" has "+r.getNoOfLegs()+" legs.");
        System.out.println(r.getName()+" color is "+r.getColor());
    }
    
}
