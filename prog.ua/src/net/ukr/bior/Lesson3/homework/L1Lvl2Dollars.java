package net.ukr.bior.Lesson3.homework;

import java.util.Scanner;

public class L1Lvl2Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollars;
        while (true) {
            System.out.println("Сколько у вас долларов?");
            dollars = sc.nextDouble();
            if (dollars < 1000000000) {
                break;
            }
        }
        String[] hundreds = new String[]{"сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] ten = new String[]{"двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] units = new String[]{"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] Tempunits = new String[]{"одина", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] unitsTen = new String[]{"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семьнадцать", "восемьнадцать", "девятнадцать"};

        System.out.print("У вас: ");
        if (dollars / 1000000 > 1) {
            if (dollars / 100000000 > 1) {
                System.out.print(dollars / 100000000 < 0 ? " " : hundreds[(int) dollars / 100000000 - 1]);
            }
            if ((dollars % 100000000) / 10000000 >= 1.0 && (dollars % 100000000) / 10000000 < 2) {
                System.out.print(" " + unitsTen[((int) (dollars % 100000000) / 1000000) - 10]);
            } else {
                System.out.print((int) (dollars % 100000000 / 10000000) - 1 <= 0 ? "" : " " + ten[(int) (dollars % 100000000 / 10000000) - 2]);
                System.out.print((int) (dollars % 10000000 / 1000000) - 1 < 0 ? "" : " " + units[(int) (dollars % 10000000 / 1000000) - 1]);
            }
            String text;
            if ((dollars % 100000000) / 10000000 >= 1.0 && (dollars % 100000000) / 10000000 < 2) {
                text = " миллионов ";
            } else {
                switch ((int) dollars % 10000000 / 1000000) {
                    case 0:
                        text = " миллионов ";
                        break;
                    case 1:
                        text = " миллион ";
                        break;
                    case 5:
                        text = " миллионов ";
                        break;
                    case 6:
                        text = " миллионов ";
                        break;
                    case 7:
                        text = " миллионов ";
                        break;
                    case 8:
                        text = " миллионов ";
                        break;
                    case 9:
                        text = " миллионов ";
                        break;
                    default:
                        text = " миллиона ";
                }
            }
            System.out.print(text);
        }


        double temp1Dollars = dollars % 1000000;
        if (temp1Dollars / 1000 > 1) {
            if (temp1Dollars / 100000 > 1) {
                System.out.print(temp1Dollars / 100000 < 0 ? " " : hundreds[(int) temp1Dollars / 100000 - 1]);
            }
            if ((temp1Dollars % 100000) / 10000 >= 1.0 && (temp1Dollars % 100000) / 10000 < 2) {
                System.out.print(" " + unitsTen[((int) (temp1Dollars % 100000) / 1000) - 10]);
            } else {
                System.out.print((int) (temp1Dollars % 100000 / 10000) - 1 <= 0 ? "" : " " + ten[(int) (temp1Dollars % 100000 / 10000) - 2]);
                System.out.print((int) (temp1Dollars % 10000 / 1000) - 1 < 0 ? "" : " " + Tempunits[(int) (temp1Dollars % 10000 / 1000) - 1]);
            }
            String text;
            if ((temp1Dollars % 100000) / 10000 >= 1.0 && (temp1Dollars % 100000) / 10000 < 2) {
                text = " тысяч ";
            } else {
                switch ((int) temp1Dollars % 10000 / 1000) {
                    case 1:
                        text = " тысяча ";
                        break;
                    case 2:
                        text = " тысячи ";
                        break;
                    case 3:
                        text = " тысячи ";
                        break;
                    case 4:
                        text = " тысячи ";
                        break;
                    default:
                        text = " тысяч ";
                }
            }
            System.out.print(text);
        }


        double temp2Dollars = dollars % 1000;
        if (temp2Dollars > 1) {

            if (temp2Dollars / 100 > 1) {
                System.out.print(temp2Dollars / 100 < 0 ? " " : hundreds[(int) temp2Dollars / 100 - 1]);
            }
            if ((temp2Dollars % 100) / 10 >= 1.0 && (temp2Dollars % 100) / 10 < 2) {
                System.out.print(" " + unitsTen[((int) ((temp2Dollars % 100) - 10))]);
            } else {
                System.out.print((int) (temp2Dollars % 100 / 10) - 1 <= 0 ? "" : " " + ten[(int) (temp2Dollars % 100 / 10) - 2]);
                System.out.print((int) (temp2Dollars % 10) - 1 < 0 ? "" : " " + units[(int) (temp2Dollars % 10) - 1]);
            }
            String text;
            if ((int) dollars == 0) {
                System.out.print("0");
            }


            if ((temp1Dollars % 100) / 10 >= 1.0 && (temp1Dollars % 100) / 10 < 2) {
                text = " долларов ";
            } else {
                switch ((int) temp1Dollars % 10) {
                    case 1:
                        text = " доллар ";
                        break;
                    case 2:
                        text = " доллара ";
                        break;
                    case 3:
                        text = " доллара ";
                        break;
                    case 4:
                        text = " доллара ";
                        break;
                    default:
                        text = " долларов ";
                }
            }
            System.out.print(text);
        } else {
            System.out.print(" долларов");
        }


        double cents = Math.round((dollars % 1) * 100);
        if (cents < 100 && cents > 0) {
            if (cents / 10 >= 1 && cents / 10 < 2) {
                System.out.print(" " + unitsTen[(int) (cents - 10)]);
            } else {
                System.out.print((int) (cents / 10) - 1 <= 0 ? "" : " " + ten[(int) (cents / 10) - 2]);
                System.out.print((int) (cents % 10) - 1 < 0 ? "" : " " + units[(int) (cents % 10) - 1]);
            }
            String countCents;
            if ((cents % 100) / 10 >= 1.0 && (cents % 100) / 10 < 2) {
                countCents = " центов";
            } else {
                switch ((int) cents % 10) {
                    case 1:
                        countCents = " цент";
                        break;
                    case 2:
                        countCents = " цента";
                        break;
                    case 3:
                        countCents = " цента";
                        break;
                    case 4:
                        countCents = " цента";
                        break;
                    default:
                        countCents = " центов";
                }
            }
            System.out.print(countCents);
        }


    }
}
