import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        try {
            Days days= Days.valueOf(word.toUpperCase());
            switch (days) {
                case MONDAY, TUESDAY, WEDNESDAY, FRIDAY, SATURDAY:
                    System.out.println("Вы написали: "+days.getName()+"\n"+days.getNameOfPadezh()+" будет урок!");
                    System.out.println("\n");
                    System.out.println("(Перевод на киргизский:) Сиз жаздыныз: "+days.getNameOfKG()+"\n"+days.getNameOfKG()+" күнү сабак болот");
                    System.out.println("\n");
                    break;
                case THURSDAY:
                    System.out.println("Вы написали: "+days.getName()+"\n"+days.getNameOfPadezh()+" будет урок, а также будет урок Технического Английского!");
                    System.out.println("\n");
                    System.out.println("(Перевод на киргизский:) Сиз жаздыныз: "+days.getNameOfKG()+"\n"+days.getNameOfKG()+" күнү сабак болот жана англис тили сабагы");
                    break;
                case SUNDAY:
                    System.out.println("Вы написали: "+days.getName()+"\n"+days.getNameOfPadezh()+" будет выходной!");
                    System.out.println("(Перевод на киргизский:) Сиз жаздыныз: "+days.getNameOfKG()+"\n"+days.getNameOfKG()+" күнү выходной болот");
                default:
                    System.out.println("Я не уверен, что такой день недели существует.");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Такого дня недели не существует");
        }
    }
}