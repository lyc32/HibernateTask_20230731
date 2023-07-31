package org.example;

import org.example.modle.Product;
import org.example.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("0.getALl, 1. get, 2. update, 3 add, 4 delete, 5 exit");
            int choose = scanner.nextInt();
            switch (choose)
            {
                case 0:
                {
                    List<Product> productList = ProductRepository.getAll();
                    for (Product p: productList)
                    {
                        System.out.println(p);
                    }
                    break;
                }
                case 1:
                {
                    System.out.println("input pid:");
                    int pid = scanner.nextInt();
                    Product product = ProductRepository.get(pid);
                    System.out.println(product);
                    break;
                }

                case 2:
                {
                    System.out.println("input pid:");
                    int pid = scanner.nextInt();
                    Product product = ProductRepository.get(pid);
                    System.out.println(product);
                    System.out.println("input pname:");
                    product.setProductname(scanner.next());
                    System.out.println("input price:");
                    product.setProductPrice(scanner.nextFloat());
                    System.out.println("input Qty:");
                    product.setQuantity(scanner.nextInt());
                    System.out.println("input tax:");
                    product.setProductTax(scanner.nextFloat());
                    System.out.println("input totalPrice:");
                    product.setTotalPrice(scanner.nextFloat());
                    ProductRepository.update(product);
                    break;
                }

                case 3:
                {
                    System.out.println("input pid:");
                    int pid = scanner.nextInt();
                    System.out.println("input pname:");
                    String pname = scanner.next();
                    System.out.println("input price:");
                    float price = scanner.nextFloat();
                    System.out.println("input Qty:");
                    int qty = scanner.nextInt();
                    System.out.println("input tax:");
                    float tax = scanner.nextFloat();
                    System.out.println("input totalPrice:");
                    float totalPrice = scanner.nextFloat();
                    Product product = new Product(pid,pname,price,qty,tax,totalPrice);
                    ProductRepository.add(product);
                    break;
                }

                case 4:
                {
                    System.out.println("input pid:");
                    int pid = scanner.nextInt();
                    Product product = ProductRepository.get(pid);
                    ProductRepository.delete(product);
                    break;
                }
                case 5:System.exit(0);
            }
        }


    }

}
