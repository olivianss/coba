package Praktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero hero1 = new Hero();
        System.out.println("PERMAINAN ADU HERO");
        System.out.print("Nama player 1 : ");
        String name1 = scanner.nextLine();
        hero1.setName(name1);
        System.out.println("Masukkan angka 0-500");
        System.out.println("=================================================");
        System.out.print("Health point : ");
        double hp1 = getValidInput(scanner, 0, 500);
        hero1.setHp(hp1);
        System.out.print("Attack point : ");
        double attack1 = getValidInput(scanner, 0, 500);
        hero1.setAttack(attack1);
        System.out.print("Defense point : ");
        double defense1 = getValidInput(scanner, 0, 500);
        hero1.setDefense(defense1);

        scanner.nextLine(); 
        System.out.println();
        System.out.println("PERMAINAN ADU HERO");
        System.out.print("Nama player 2 : ");
        String name2 = scanner.nextLine();
        System.out.println("Masukkan angka 0-500");
        System.out.println("=================================================");
        System.out.print("Health point : ");
        double hp2 = getValidInput(scanner, 0, 500);
        System.out.print("Attack point : ");
        double attack2 = getValidInput(scanner, 0, 500);
        System.out.print("Defense point: ");
        double defense2 = getValidInput(scanner, 0, 500);

        Hero hero2 = new Hero(name2, hp2, attack2, defense2);

        System.out.println("\nMemulai pertarungan!\n");

        int round = 1; 
        while (round <= 5 && hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("=========================================================");
            System.out.println("=========================================================");
            System.out.println("Ronde " + round + ":");
            hero1Attack(hero1, hero2); 
            if (hero2.getHp() > 0) { 
                hero2Attack(hero2, hero1); 
            }
            round++; 
            System.out.println(); 
        }

        System.out.println("Pertarungan selesai!\n");
        if (hero1.getHp() <= 0 && hero2.getHp() <= 0) {
            System.out.println("Pertarungan berakhir imbang!");
        } else if (hero1.getHp() <= 0) {
            System.out.println(hero2.getName() + " adalah pemenang dengan health " + hero2.getHp() + "!");
        } else {
            System.out.println(hero1.getName() + " adalah pemenang dengan health " + hero1.getHp() + "!");
        }

        scanner.close();
    }

    public static double getValidInput(Scanner scanner, double min, double max) {
        double input;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Input tidak valid! Masukkan nilai numerik.");
                scanner.next();
            }
            input = scanner.nextDouble();
            if (input < min || input > max) {
                System.out.println("Input di luar rentang valid! Masukkan nilai antara " + min + " hingga " + max + ".");
            }
        } while (input < min || input > max);
        return input;
    }

    public static void hero1Attack(Hero attacker, Hero defender) {
        double damage = attacker.getAttack() - defender.getDefense();
        if (damage > 0) {
            double newHp = defender.getHp() - damage;
            if (newHp < 0) newHp = 0;
            defender.setHp(newHp);
        }
        printAttack(attacker, defender, damage);
    }

    public static void hero2Attack(Hero attacker, Hero defender) {
        double damage = attacker.getAttack() - defender.getDefense();
        if (damage > 0) {
            double newHp = defender.getHp() - damage;
            if (newHp < 0) newHp = 0;
            defender.setHp(newHp);
        }
        printAttack(attacker, defender, damage);
    }

    public static void printAttack(Hero attacker, Hero defender, double damage) {
        System.out.println();
        System.out.println(attacker.getName() + " menyerang " + defender.getName() + "!");
        System.out.println();
        System.out.println(attacker.getName() + " menyerang dengan kekuatan " + attacker.getAttack() + "!");
        System.out.println(defender.getName() + " memiliki pertahanan sebesar " + defender.getDefense() + "!");
        if (damage > 0) {
            System.out.println(defender.getName() + " menerima " + damage + " kerusakan!");
            System.out.println("Health " + defender.getName() + " saat ini: " + defender.getHp());
        } else {
            System.out.println(defender.getName() + " tidak menerima kerusakan!");
            System.out.println("Health " + defender.getName() + " masih utuh: " + defender.getHp());
        }
    }
}

