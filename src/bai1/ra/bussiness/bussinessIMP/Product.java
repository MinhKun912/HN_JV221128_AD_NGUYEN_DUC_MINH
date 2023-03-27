package bai1.ra.bussiness.bussinessIMP;

import bai1.ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop , Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String description;
    private Catalog catalog;
    private float exportPrice;
    private float importPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String description, Catalog catalog, float exportPrice, float importPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.exportPrice = exportPrice;
        this.importPrice = importPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> catalogs) {
        System.out.println("Nhập tên sản phẩm");
        this.productName=scanner.nextLine();
        System.out.println("Nhập tiêu đề");
        this.title=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        this.importPrice= Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm");
        this.description= scanner.nextLine();
        System.out.println("Nhập trạng sản phẩm");
        this.productStatus= Boolean.parseBoolean(scanner.nextLine());
        this.exportPrice=this.importPrice*RATE;
        System.out.println("Hãy chọn Danh mục cho sản phẩm");
        for (Catalog catalog: catalogs
             ) {
            catalog.displayData();
        }
        int catalogId= Integer.parseInt(scanner.nextLine());
        for (Catalog catalog: catalogs
        ) {
            if (catalog.getCatalogId()==catalogId){
                this.catalog=catalog;
                break;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("----------------MENU------------------");
        System.out.printf("Mã sản phẩm : %d\n",this.productId);
        System.out.printf("Tên danh mục sản phẩm : %s\n",this.productName);
        System.out.printf("Tiêu đề danh mục sản phẩm : %s\n",this.title);
        System.out.printf("danh mục  : %s\n",this.catalog);
        System.out.printf("Mô tả sản phẩm  : %s\n",this.description);
        System.out.printf("Trạng thái sản phẩm  %n:\n",(this.productStatus?"Còn":"Hết"));
        System.out.printf("Giá bán  %f:\n",this.exportPrice);
        System.out.println("----------------****------------------");
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.exportPrice-product.getExportPrice());
    }
}
