
import java.util.Scanner;

public class Test2
 {
 public static void main( String args[] )
{
 Employee employee[];
 Scanner input = new Scanner( System.in );

 for ( int i = 0; i < employee.length; i++ )
 {
 System.out.print( "Input first name: " );
 String firstName = input.nextLine();

 System.out.print( "Input last name: " );
 String lastName = input.nextLine();

 System.out.print( "Input hours worked: " );
 double hours = input.nextDouble();

 System.out.print( "Input tips earned: " );
 double tips = input.nextDouble();

 employee[ i ] = new Employee( firstName, lastName, 2.63, hours, tips );

 System.out.printf( "%s %s earned $%.2f\n", employee[ i ].getFirstName(),
 employee[ i ].getLastName(), employee[ i ].earnings() );

 input.nextLine();
 } 
 } 
 } 