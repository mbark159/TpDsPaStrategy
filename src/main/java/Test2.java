import context.Context;
import strategy.Strategy;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        int i=0;
        do {
            System.out.println("Quelle Strategy?");
            String strategyClassName = scanner.nextLine();
            try {
                i=Integer.parseInt(strategyClassName);
                System.out.println(i);
                if (i==1)  break;
            }catch (NumberFormatException e){
            Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();}
        }while ( i == 0);

    }
}