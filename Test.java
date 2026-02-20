/* public class Test {

    public static void main(String[] args) {
        System.out.println("hello human");

    
    }
} */


/* public class Test {
    
public static boolean ArmStrongNumber(int number){
int sum = 0;
int originalNumber = number;
int length = String.valueOf(number).length();
while (number > 0) {

int lastdigit = number % 10;

int  pow  = (int) Math.pow(lastdigit , length);

sum = sum + pow;

number = number / 10;


}

if (originalNumber  == sum) {
    return true;
}

    return false;
}

        public static void main(String[] args) {
            
System.out.println(ArmStrongNumber(153));

        }
    } */


     /*    public class Test {
        
    public static void Divisors(int n){

for (int i = 1; i <= n; i++) {
    
if (n %  i == 0) {
    
    System.out.println(i);
}


}


    }
            public static void main(String[] args) {

                Divisors(40);



            }
        } */

       /*      public class Test {
            
public static void prime(int n){
int count = 0;

    for (int i = 1; i <= n; i++) {
        
if (n %  i == 0) {
    
    count ++;
}
    }

if (count == 2) {
    
    System.out.println("prime");
}
else{
    System.out.println("no prime");
}


    }


                public static void main(String[] args) {
                    

                    prime(8);

                }
            } */