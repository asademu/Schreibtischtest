import java.util.Scanner;

public class schreibtischtest {
    public static int zahl;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = keyboard.next().charAt(0);

        testeZeichen(letter);
    }

    public static void testeZeichen(char zeichen){
        switch (zeichen){
            case 'a':
                zahl = 8;
                while (zahl < 53){
                    zahl += 4;
                }
                break;
            case 'b':
                zahl = -2;
                do {
                    zahl *= 3;
                }while (zahl > -55);
                break;
            case 'c':
                zahl = 4;
                for (int i = 0; i < 10; i++){
                    zahl -= 2;
                }
                break;
            default:
                zahl = 1;
                break;
        }
        if (zahl < 0){
            if (zahl < -40){
                testeZeichen('h');
                zahl -= 4;
            }
            else {
                zahl += 2;
                zahl %= 8;
                zahl *= 4;
            }
        }
        System.out.println(zahl);
    }
}
