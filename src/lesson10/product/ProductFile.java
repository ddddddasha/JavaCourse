package lesson10.product;

import lesson10.Constants;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductFile {
    private final File fileProduct = Path.of("src", "lesson10", "product", "productFile.txt").toFile();
    private final ProductsWorker productsWorker = new ProductsWorker();
    public void writeProductToFile(){
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileProduct, true);
            fileOutputStream.write(productsWorker.addProduct());
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

    public void readProductFromFile(){
        try (var fileInputStream = new FileInputStream(fileProduct)){
            byte[] bytes = fileInputStream.readAllBytes();
            String allProducts = new String(bytes);
            System.out.println(allProducts);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deleteProductFromFile(){
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileProduct)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Constants.DELETE_PRODUCT_ID);
        Scanner scanner = new Scanner(System.in);
        String buffId = scanner.next();

        Iterator<String> iterator = lines.iterator();
        while(iterator.hasNext()){
            if(iterator.next().contains(buffId)){
                iterator.remove();
            }
        }

        try (var fileOutputStream = new FileOutputStream(fileProduct)){ //перезаписываем файл
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
