public class Main {
    public static void main(String[] args) {
        String[] lowercase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] upercase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] special = {"!", "?", "\"", "§", "$", "%", "&", "/", "(", ")", "=", "\\", "´", "`", "+", "*", "~", "@", "€", "µ", "'", "#"};
        int passlength = 12; //Standart ist 12, soll aber später von einem Schieberegler bestimmt werden
        String password = "";
        for (int i = 0; i < passlength; i++) {
            int what = (int) (Math.random() * 4);
            switch (what) {
                case 0:
                    password = password + lowercase[(int) (Math.random() * lowercase.length)];
                    break;
                case 1:
                    password = password + upercase[(int) (Math.random() * upercase.length)];
                    break;
                case 2:
                    password = password + special[(int) (Math.random() * special.length)];
                    break;
                case 3:
                    password = password + numbers[(int) (Math.random() * numbers.length)];
            }
        }
        System.out.println(password);
    }
}