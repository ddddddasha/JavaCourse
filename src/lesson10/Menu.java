package lesson10;

import lesson10.order.OrderFile;
import lesson10.product.ProductFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductFile productFile = new ProductFile();
    private final OrderFile orderFile = new OrderFile();

    public void mainMenu(){
       try {
           while (true){
               System.out.println(Constants.MAIN_MENU);
               int choice = scanner.nextInt();
               switch (choice){
                   case 1: secondMenu(); break;
                   case 2: thirdMenu(); break;
                   case 3: System.exit(0);
                   default:
                       System.out.println(Constants.ERROR_INPUT);
                       break;
               }
           }
       }
        catch (InputMismatchException e){
            System.out.println(Constants.ERROR_INPUT);
        }
    }

    public void secondMenu(){
        while (true){
            System.out.println(Constants.SECOND_MENU);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productFile.writeProductToFile();
                    break;
                case 2:
                    productFile.deleteProductFromFile();
                    break;
                case 3:
                    productFile.readProductFromFile();
                    break;
                case 4: mainMenu(); break;
                default:
                    System.out.println(Constants.ERROR_INPUT);
                    break;
            }
        }
    }

    public void thirdMenu(){
        while (true){
            System.out.println(Constants.THIRD_MENU);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productFile.readProductFromFile();
                    orderFile.writeOrderToFile();
                    break;
                case 2:
                    orderFile.deleteOrderFromFile();
                    break;
                case 3:
                    orderFile.readOrdersFromFile();
                    break;
                case 4: mainMenu(); break;
                default:
                    System.out.println(Constants.ERROR_INPUT);
                    break;
            }
        }
    }
}
