package bai1.ra.bussiness.bussinessIMP;

import bai1.ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private int priority;
    private String catalogName;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {

    }

    public Catalog(int catalogId, int priority, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.priority = priority;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    @Override
    public void inputData(Scanner scanner, List<Catalog> catalogs) {
        System.out.println("Nhập tên danh mục");
        this.catalogName=scanner.nextLine();
        System.out.println("Nhập mô tả danh mục");
        this.descriptions=scanner.nextLine();
        System.out.println("Nhập độ ưu tiên");
        this.priority= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái danh mục");
        this.catalogStatus= Boolean.parseBoolean(scanner.nextLine());

    }



    @Override
    public void displayData() {
        System.out.println("----------------------------------");
        System.out.printf("Mã Danh muc : %d\n",this.catalogId);
        System.out.printf("Tên danh mục sản phẩm : %s\n",this.catalogName);
        System.out.printf("độ ưu tiên  : %d\n",this.priority);
        System.out.printf("Mô tả danh mục  : %s\n",this.descriptions);
        System.out.printf("Trạng thái danh mục  %s:\n",this.catalogStatus);
        System.out.println("----------------------------------");


    }
}
