package org.example;

//лаба 1 - ввод/вывод в консоль

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

    int egg_kol2 = 5;
    int salt = 1;

    Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество порций: ");
        int pieces = sc.nextInt();
        System.out.print("Введите количество яблок: ");
        int apples = sc.nextInt();
        System.out.print("Введите количество яиц: ");
        int egg_kol1 = sc.nextInt();
        System.out.print("Введите граммовку муки и сахара (одно число в граммах): ");
        int muka_sugar_kol = sc.nextInt();
        System.out.print("Введите ёмкость стакана: ");
        int stakan_emkost = sc.nextInt();
        System.out.println("Хотите ввести заметку к рецепту? (1 - да/ 0 - нет) ");
        int choice = sc.nextInt();
        String zametka = "";


        if (choice == 1) {
            System.out.print("Введите заметку к рецепту: ");
            zametka = sc.nextLine();
            zametka = sc.nextLine();
        }
        else {
            System.out.println();
        }

        PrintWriter pw = new PrintWriter("rezceptik.txt");

        pw.println("                 >>> РЕЦЕПТ 'Шарлотки' <<< ");
        pw.println("--------------------------------------------------------------");
        pw.println("-- Ингредиенты (на " + pieces + " порций): ");
        pw.println("1. Яблоки (желательно кислые) - " + apples);
        pw.println("2. Яйца - " + egg_kol1 + " больших или " + egg_kol2 + " маленьких");
        pw.println("3. Сахар - " + muka_sugar_kol + " г (примерно 3/4 стакана ёмкостью " + stakan_emkost + " г" + ")");
        pw.println("4. Мука пшеничная - " + muka_sugar_kol + " г (1 стакан ёмкостью " + stakan_emkost + " г" + ")");
        pw.println("5. Соль - " + salt + " щепотка");
        pw.println("6. Масло сливочное/тёртое печенье (для формы)");
        pw.println("--------------------------------------------------------------");
        pw.println();
        pw.println("-- Способ приготовления: ");
        pw.println("--------------------------------------------------------------");
        pw.println();
        pw.println("Шаг 1. Подготовить продукты. Так как сахара мы берем достаточно много, и тесто получится сладким, \nяблоки лучше брать кислых сортов.");
        pw.println("Шаг 2. Взбить яйца с сахаром и щепоткой соли в светлую густую массу.\n" +
                "Чтобы убедиться, что масса уже хорошо взбилась, проведите линию венчиком. \n" +
                "Если она остаётся видимой в течение 1-2 секунд, а потом растекается, это значит, что яйца с сахаром хорошо взбиты. \nЕсли же она сразу растекается, нужно взбивать еще.");
        pw.println("Шаг 3. Подготовить яблоки, вырезать из них середину, нарезать ломтиками (или кубиками).");
        pw.println("Шаг 4. Муку частями просеивать в яично-сахарную смесь и аккуратно перемешивать лопаткой движениями снизу вверх.\n" +
                "С бисквитным тестом нужно работать осторожно, чтобы сохранить по максимуму его воздушность.\n" +
                "(На этом этапе можно добавить в тесто 1 ст. ложку жирной сметаны или 1 ст. ложку растопленного сливочного масла.");
        pw.println("Шаг 5. Форму выстелить пергаментом или смазать сливочным маслом (посыпать печеньем) и припылить мукой.\n Вылить 1/2 часть теста, разровнять.");
        pw.println("Шаг 6. Половину яблок, нарезанных дольками, выложить на тесто. \n Начинаем выкладывать дольки от бортиков и двигаемся по спирали к середине.");
        pw.println("Шаг 7. Сверху залить оставшимся тестом и таким же образом выложить оставшиеся яблоки.");
        pw.println("Шаг 8. Выпекать яблочную шарлотку в разогретой духовке в течение 25-30 минут при температуре 180 градусов. \nГотовность бисквитного пирога можно проверить деревянной шпажкой.");
        pw.println(zametka);
        pw.println("---------------------------------------------------------------");
        pw.println("Шарлотка готова, приятного аппетита!!!");
        pw.close();


        File file = new File("rezceptik.txt");

        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            System.out.println(data);
        }
        scan.close();
    }
}