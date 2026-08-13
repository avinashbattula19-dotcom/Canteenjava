import java.util.Scanner;

class student {
    int menu(String item, int Quantity) {
        int price = 0;
        // ===============================================================lunch==================================================================================================================
        if (item.equalsIgnoreCase("Biryani")) {
            price = 150;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("chickenfriedrice")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("chickenmanchurian")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("chickennoodles")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("fullmeals")) {
            price = 100;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("eggfriedrice")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("vegmanchurian")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("eggnoodles")) {
            price = 90;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("vegfriedrice")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("vegnoodles")) {
            price = 70;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("vegfriedrice")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("")) {
            price = 70;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("vegmeals")) {
            price = 80;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("plainrice")) {
            price = 30;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("pappu")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("sambar")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("curd")) {
            price = 25;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("chicken curry")) {
            price = 50;
        }
        // ==============================break
        // fast=========================================================================
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("bonda")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("dosa")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("puri")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("vada")) {
            price = 40;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("idli")) {
            price = 35;
        }
        // ==============================================snacks=================================================================
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("allu samosa")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("kachori")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("vegpuff")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("creambun")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("dilkush")) {
            price = 25;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("paneerroll")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("chickenroll")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("softicecream")) {
            price = 80;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("caramelpopcorn")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("samosachaat")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("papadchaat")) {
            price = 50;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("eggpuff")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("paneerpuff")) {
            price = 30;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("chickenpuff")) {
            price = 35;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("sandwich")) {
            price = 70;
        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("fries")) {
            price = 60;
        }
        // =================================================tea====================================================================
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("lemontea")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("badam milk")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("coffee")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("boosttea")) {
            price =20;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("tea")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("horlicksmilk")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("boostmilk")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("bournvitamilk")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("specialtea")) {
            price = 15;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("blacktea")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("greentea")) {
            price = 25;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("milk")) {
            price = 10;

        } else if (item.replaceAll("\\s+", "").equalsIgnoreCase("osmaniabiscuit")) {
            price = 3;

        }
        //===========================================juices====================================================================
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("bananamilkshake")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("dragonmilkshake")) {
            price = 60;

        } 
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("oreomilkshake")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("chocolatemilkshake")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("fruitsalad")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("strawberrymilkshake")) {
            price = 50;

        } 
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("grape")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("mixed fruit")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("apple")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("mango")) {
            price = 40;

        } 
        else if (item.replaceAll("\\s+", "").equalsIgnoreCase("mosambi")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("pineapple")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("sapota")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("banana")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("kharbuja")
                || item.replaceAll("\\s+", "").equalsIgnoreCase("papaya")) {
            price = 30;

        }

        // ===============================return values
        // conditions=======================================================================================================================
        int total = price * Quantity;
        return total;
    }

}

public class canteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name:");
        String Name = s.nextLine();
        System.out.print("Enter Branch :");
        String Branch = s.nextLine();
        System.out.print("Enter Rollno:");
        String Rollno = s.nextLine();
        System.out.println("                    ===========================================");
        System.out.println("                              Enter item names as per menu..");
        System.out.println("                    ===========================================");
        System.out.print("Enter Item:");
        String item = s.nextLine();
        System.out.print("Enter Quantity: ");
        int Quantity = s.nextInt();
        s.nextLine();
        System.out.print("Enter Item:");
        String item1 = s.nextLine();
        System.out.print("Enter Quantity: ");
        int Quantity1 = s.nextInt();
        s.nextLine();
        System.out.print("Enter Item:");
        String item2 = s.nextLine();
        System.out.print("Enter Quantity: ");
        int Quantity2 = s.nextInt();
        s.nextLine();
        System.out.print("Enter Item:");
        String item3 = s.nextLine();
        System.out.print("Enter Quantity: ");
        int Quantity3 = s.nextInt();
        s.nextLine();
        System.out.print("Enter Item:");
        String item4 = s.nextLine();
        System.out.print("Enter Quantity: ");
        int Quantity4 = s.nextInt();

        student s1 = new student();
        int total = s1.menu(item, Quantity);
        int total1 = s1.menu(item1, Quantity1);
        int total2 = s1.menu(item2, Quantity2);
        int total3 = s1.menu(item3, Quantity3);
        int total4 = s1.menu(item4, Quantity4);

        int grandtotal = total + total1 + total2 + total3 + total4;

        // ==============================================output====================================================================================================================================================================
        System.out.println("                    ===========================================");
        System.out.println("                                     Food-x CANTEEN             ");
        System.out.println("                    ===========================================");
        System.out.println("                    Name:" + Name);
        System.out.println("                    Branch" + Branch);
        System.out.println("                    Rollno:" + Rollno);

        System.out.println("                    ===========================================");
        System.out.println("                                                item:" + item);
        System.out.println("                                                Quantity:" + Quantity);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + total);
        System.out.println("                    ===========================================");
        System.out.println("                                                item:" + item1);
        System.out.println("                                                Quantity:" + Quantity1);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + total1);
        System.out.println("                    ===========================================");
        System.out.println("                                                item:" + item2);
        System.out.println("                                                Quantity:" + Quantity2);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + total2);
        System.out.println("                    ===========================================");
        System.out.println("                                                    item:" + item3);
        System.out.println("                                                Quantity:" + Quantity3);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + total3);
        System.out.println("                    ===========================================");
        System.out.println("                                                item:" + item4);
        System.out.println("                                                Quantity:" + Quantity4);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + total4);
        System.out.println("                    ============================================");
        System.out.println("                                                    total:" + grandtotal);
         System.out.println("                    ============================================");
          System.out.println("                    ============================================");

    }

}
