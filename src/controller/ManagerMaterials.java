package controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerMaterials {
    public static void displayMaterials(ArrayList<Material> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void addProduct(ArrayList<Material> arr, Material element) {
        arr.add(element);
    }

    public static CrispyFlour createNewCrispyFlour() {
        Scanner inputIDFlour = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm");
        String id = inputIDFlour.nextLine();

        Scanner inputNameFlour = new Scanner(System.in);
        System.out.println("Nhập tên của sản phẩm");
        String name = inputNameFlour.nextLine();

        Scanner inputDayFlour = new Scanner(System.in);
        System.out.println("Nhập ngày sản xuất: ");
        int day = inputDayFlour.nextInt();

        Scanner inputMonthFlour = new Scanner(System.in);
        System.out.println("Nhập tháng sản xuất: ");
        int month = inputMonthFlour.nextInt();

        Scanner inputYearFlour = new Scanner(System.in);
        System.out.println("Nhập năm sản xuất: ");
        int year = inputYearFlour.nextInt();

        Scanner inputCostFlour = new Scanner(System.in);
        System.out.println("Nhập đơn giá của sản phẩm: ");
        int cost = inputCostFlour.nextInt();

        Scanner inputQuantityFlour = new Scanner(System.in);
        System.out.println("Nhập số lượng của sản phẩm: ");
        int quantity = inputQuantityFlour.nextInt();

        CrispyFlour newProduct = new CrispyFlour(id, name, LocalDate.of(year, month, day), cost, quantity);
        return newProduct;
    }

    public static Meat createNewMeat() {
        Scanner inputIdMeat = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm: ");
        String id = inputIdMeat.nextLine();

        Scanner inputNameMeat = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String name = inputNameMeat.nextLine();

        Scanner inputDayMeat = new Scanner(System.in);
        System.out.println("Nhập ngày sản xuất: ");
        int day = inputDayMeat.nextInt();

        Scanner inputMonthMeat = new Scanner(System.in);
        System.out.println("Nhập tháng sản xuất: ");
        int month = inputMonthMeat.nextInt();

        Scanner inputYearMeat = new Scanner(System.in);
        System.out.println("Nhập năm sản xuất: ");
        int year = inputYearMeat.nextInt();

        Scanner inputCostMeat = new Scanner(System.in);
        System.out.println("Nhập giá của sản phẩm: ");
        int cost = inputCostMeat.nextInt();

        Scanner inputWeightMeat = new Scanner(System.in);
        System.out.println("Nhập khối lượng sản phẩm");
        double weight = inputWeightMeat.nextDouble();

        Meat newProduct = new Meat(id, name, LocalDate.of(year, month, day), cost, weight);
        return newProduct;
    }

    public static void deleteProductByName(ArrayList<Material> arr) {
        Scanner inputNameProcduct = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        String name = inputNameProcduct.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(name)) {
                arr.remove(i);
            }
        }
    }

    public static void editMeatByName(ArrayList<Material> arr) {
        Scanner inputNameMeatNeedEdit = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm Meat bạn muốn sửa: ");
        String inputNameMeat = inputNameMeatNeedEdit.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(inputNameMeat)) {
                System.out.println("Edit product: " + inputNameMeat);

                Scanner editNameMeat = new Scanner(System.in);
                System.out.println("Sửa tên sản phẩm: ");
                String name = editNameMeat.nextLine();

                Scanner editIDMeat = new Scanner(System.in);
                System.out.println("Sửa id sản phẩm: ");
                String id = editIDMeat.nextLine();

                Scanner editDayMeat = new Scanner(System.in);
                System.out.println("Sửa ngày sản xuất: ");
                int day = editDayMeat.nextInt();

                Scanner editMonthMeat = new Scanner(System.in);
                System.out.println("Sửa tháng sản xuất: ");
                int month = editMonthMeat.nextInt();

                Scanner editYearMeat = new Scanner(System.in);
                System.out.println("Sửa năm sản xuất: ");
                int year = editYearMeat.nextInt();

                Scanner editCostMeat = new Scanner(System.in);
                System.out.println("Sửa giá sản phẩm: ");
                int cost = editCostMeat.nextInt();

                Scanner editWeightMeat = new Scanner(System.in);
                System.out.println("Sửa khối lượng sản phẩm: ");
                double weight = editWeightMeat.nextDouble();

                arr.get(i).setName(name);
                arr.get(i).setId(id);
                arr.get(i).setManufaturingDate(LocalDate.of(year, month, day));
                arr.get(i).setCost(cost);
                ((Meat) arr.get(i)).setWeight(weight);
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public static void editCrispyFlourByName(ArrayList<Material> arr) {
        Scanner inputNameFlourNeedEdit = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm Flour bạn muốn sửa: ");
        String inputNameFlour = inputNameFlourNeedEdit.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(inputNameFlour)) {
                System.out.println("Edit product: " + inputNameFlour);

                Scanner editNameMeat = new Scanner(System.in);
                System.out.println("Sửa tên sản phẩm: ");
                String name = editNameMeat.nextLine();

                Scanner editIDFlour = new Scanner(System.in);
                System.out.println("Sửa id sản phẩm: ");
                String id = editIDFlour.nextLine();

                Scanner editDayFlour = new Scanner(System.in);
                System.out.println("Sửa ngày sản xuất: ");
                int day = editDayFlour.nextInt();

                Scanner editMonthFlour = new Scanner(System.in);
                System.out.println("Sửa tháng sản xuất: ");
                int month = editMonthFlour.nextInt();

                Scanner editYearFlour = new Scanner(System.in);
                System.out.println("Sửa năm sản xuất: ");
                int year = editYearFlour.nextInt();

                Scanner editCostMeat = new Scanner(System.in);
                System.out.println("Sửa giá sản phẩm: ");
                int cost = editCostMeat.nextInt();

                Scanner editQuantityFlour = new Scanner(System.in);
                System.out.println("Sửa Số lượng sản phẩm: ");
                int quantity = editQuantityFlour.nextInt();

                arr.get(i).setName(name);
                arr.get(i).setId(id);
                arr.get(i).setManufaturingDate(LocalDate.of(year, month, day));
                arr.get(i).setCost(cost);
                ((CrispyFlour) arr.get(i)).setQuantity(quantity);
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public static void payProduct(ArrayList<Material> arr) {
        Scanner inputNameProduct = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tính tiền: ");
        String product = inputNameProduct.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (product.equals(arr.get(i).getName())) {
                if (arr.get(i) instanceof CrispyFlour) {
                    double result = ((CrispyFlour) arr.get(i)).getRealMoney();
                    System.out.println("Giá của " + product + " là: " + result);
                }
                if (arr.get(i) instanceof Meat) {
                    double result = ((Meat) arr.get(i)).getRealMoney();
                    System.out.println("Giá của " + product + " là" + result);
                }
            }

        }
    }

    public static void differenceDiscount(ArrayList<Material> arr) {
        Scanner inputProductToViewDiscount = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn xem chênh lệch chiết khấu");
        String product = inputProductToViewDiscount.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (product.equals(arr.get(i).getName())) {
                if (arr.get(i) instanceof CrispyFlour) {
                    double result = arr.get(i).getAmount() - ((CrispyFlour) arr.get(i)).getRealMoney();
                    System.out.println("Chênh lệch chiết khấu trong ngày hôm nay là: " + result);
                }
                if (arr.get(i) instanceof Meat) {
                    double result = arr.get(i).getAmount() - ((Meat) arr.get(i)).getRealMoney();
                    System.out.println("Chênh lệch chiết kháu trong ngày hôm nay là: " + result);
                }
            }
        }
    }

    public static void sortCostMaterials (ArrayList<Material> arr) {
        for (Material e: arr
             ) {
            System.out.println(e);
        }
    }
}

