package lesson10.order;

import lesson10.Constants;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OrderFile {
    private final File fileOrder = Path.of("src", "lesson10", "order", "orderFile.txt").toFile();
    private final OrderWorker orderWorker = new OrderWorker();

    public void writeOrderToFile(){
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileOrder, true);
            fileOutputStream.write(orderWorker.addOrder());
            fileOutputStream.write(System.lineSeparator().getBytes());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void readOrdersFromFile(){
        try (var fileInputStream = new FileInputStream(fileOrder)){
            byte[] bytes = fileInputStream.readAllBytes();
            String allProducts = new String(bytes);
            System.out.println(allProducts);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deleteOrderFromFile(){
        List<String> lines = new ArrayList<>();

        try (var br = new BufferedReader(new FileReader(fileOrder)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Constants.DELETE_ORDER_ID);
        Scanner scanner = new Scanner(System.in);
        String buffId = scanner.next();

        Iterator<String> iterator = lines.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains(buffId)){
                iterator.remove();
            }
        }
        try (var fileOutputStream = new FileOutputStream(fileOrder)){ //перезаписываем файл
            for (String item: lines){
                fileOutputStream.write(item.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.write(System.lineSeparator().getBytes());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
