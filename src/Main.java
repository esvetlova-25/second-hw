public class Main {
public static void main(String [] args) {
        int amount=20_000; //стоимость билета

                int miles;
                if(amount>20){
                    miles = amount/20;
                } else {
                    miles = 0;
                }
System.out.println("Итоговая сумма начисленныйх мили " + miles);
    }
}