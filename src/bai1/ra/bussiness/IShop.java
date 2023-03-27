package bai1.ra.bussiness;

import bai1.ra.bussiness.bussinessIMP.Catalog;

import java.util.List;
import java.util.Scanner;

public interface IShop {
     float RATE=1.3f;

    void inputData(Scanner scanner, List<Catalog> catalogs);


    void displayData();

}
