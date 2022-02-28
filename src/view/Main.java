package view;

import controller.ManagerMaterials;
import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Material> materials = new ArrayList<>();
        Material botMy = new CrispyFlour("bot01", "botMy", LocalDate.of(2021, 2, 25), 20000, 100);
        Material botChienXu = new CrispyFlour("bot02", "botChienXu", LocalDate.of(2021, 9, 29), 30000, 150);
        Material botChienGion = new CrispyFlour("bot03", "botChienXuGion", LocalDate.of(2021, 2, 12), 10000, 140);
        Material botNang = new CrispyFlour("bot04", "botNang", LocalDate.of(2020, 11, 1), 60000, 80);
        Material botGao = new CrispyFlour("bot05", "botGao", LocalDate.of(2021, 4, 3), 40000, 70);

        Material thitBo = new Meat("meat01", "thitBo", LocalDate.of(2021, 12, 21), 25000, 20);
        Material thitLon = new Meat("meat02", "thitLon", LocalDate.of(2022, 2, 23), 15000, 100);
        Material thitBoWagyu = new Meat("meat03", "thitBoWagyu", LocalDate.of(2021, 9, 1), 155000, 90);
        Material thitBoA5 = new Meat("meat04", "thitBoA5", LocalDate.of(2022, 10, 19), 205000, 50);
        Material thitChim = new Meat("meat05", "thitChim", LocalDate.of(2021, 12, 21), 35000, 200);

        materials.add(botMy);
        materials.add(botChienXu);
        materials.add(botChienGion);
        materials.add(botNang);
        materials.add(botGao);
        materials.add(thitBo);
        materials.add(thitLon);
        materials.add(thitBoWagyu);
        materials.add(thitBoA5);
        materials.add(thitChim);

        System.out.println(((CrispyFlour) botMy).getRealMoney());

        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Thêm mới sản phẩm Cripsy Flour");
            System.out.println("3. Thêm mới sản phẩm Meat");
            System.out.println("4. Xóa sản phẩm theo tên");
            System.out.println("5. Sửa sản phẩm Meat");
            System.out.println("6. Sửa sản phẩm Cripsy Flour");
            System.out.println("7. Tính tiền theo tên sản phẩm nhập vào: ");
            System.out.println("8. Chênh lệch chiết khấu theo sản phẩm: ");
            System.out.println("9. Sắp xếp sản phẩm theo giá: ");
            System.out.println("0. Exit");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    ManagerMaterials.displayMaterials(materials);
                    break;
                case 2:
                    ManagerMaterials.addProduct(materials, ManagerMaterials.createNewCrispyFlour());
                    break;
                case 3:
                    ManagerMaterials.addProduct(materials, ManagerMaterials.createNewMeat());
                    break;
                case 4:
                    ManagerMaterials.deleteProduct(materials);
                    break;
                case 5:
                    ManagerMaterials.editMeat(materials);
                    break;
                case 6:
                    ManagerMaterials.editCrispyFlour(materials);
                    break;
                case 7:
                    ManagerMaterials.payProduct(materials);
                    break;
                case 8 :
                    ManagerMaterials.differenceDiscount(materials);
                    break;
                case 9:
                    Collections.sort(materials);
                    ManagerMaterials.sortCostMaterials(materials);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn chưa nhập lựa chọn!");
            }
        }
    }
}
