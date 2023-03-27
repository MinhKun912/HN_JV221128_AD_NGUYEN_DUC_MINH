package bai1.ra.run;

import bai1.ra.bussiness.bussinessIMP.Catalog;
import bai1.ra.bussiness.bussinessIMP.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog> catalog = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        while (true) {

            System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục \n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần  \n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "5. Thoát");


            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createCatalog(catalog, scanner);
                    break;
                case 2:
                    createproduct(products, scanner, catalog);
                    break;
                case 3:
                    sortByExportPriece(products);
                    break;
                case 4:
                    searchByCatalog(products, scanner);
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }


        }
    }

    private static void searchByCatalog(List<Product> products,Scanner scanner) {
        System.out.println("Nhập Catalog");
        String searchName=scanner.nextLine();
        List<Product> searches= new ArrayList<>();
        for (Product product:products
             ) {
            if (product.getCatalog().getCatalogName().contains(searchName)){
                searches.add(product);
            }
        }
        System.out.println("Danh sách tìm kiếm");
        display(searches);
    }

    private static void sortByExportPriece(List<Product> products) {
        Collections.sort(products);
        display(products);
    }

    public static void createCatalog(List<Catalog> catalogs, Scanner scanner) {
        System.out.printf("Nhập số Danh muc can thêm");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập Danh muc thứ " + (i + 1) + " :");
            Catalog catalog = new Catalog();
            catalog.inputData(scanner, catalogs);
            if (catalogs.size() == 0) {
                catalog.setCatalogId(1);
            }else {
                catalog.setCatalogId(catalogs.get(catalogs.size()-1).getCatalogId()+1);
            }
            catalogs.add(catalog);
        }
        System.out.println("thêm thành công");
        displayCatalog(catalogs);
    }

    public static void createproduct(List<Product> products, Scanner scanner, List<Catalog> catalogs) {
        System.out.printf("Nhập số lượng sản phẩm cần thêm");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập sản phẩm thứ " + (i + 1) + " :");
            Product product = new Product();
            product.inputData(scanner, catalogs);
            if (products.size() == 0) {
                product.setProductId(1);
            }else {
                product.setProductId(products.get(products.size()-1).getProductId()+1);
            }
            products.add(product);
        }
        display(products);
    }

    public static void display(List<Product> list) {
        for (Product product : list
        ) {
            product.displayData();
        }
    }

    public static void displayCatalog(List<Catalog> catalogs) {
        for (Catalog catalog : catalogs
        ) {
            catalog.displayData();
        }
    }

}




