package pattern;

public class Diamond_Pattern {
    public static void main(String[] args) {
        int number = 4;
        for (int index = 1; index <= number; index++){
            for (int internalIndex = 1; internalIndex <= number - index; internalIndex++){
                System.out.print(" ");
            }
            for (int internalIndex = 1; internalIndex <= 2 * index -1 ; internalIndex++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int index = number; index >= 1 ; index--){
            for (int internalIndex = 1; internalIndex <= number - index ; internalIndex++){
                System.out.print(" ");
            }
            for (int internalIndex = 1; internalIndex <= 2 * index -1 ; internalIndex++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

//            *
//           ***
//          *****
//         *******
//         *******
//          *****
//           ***
//            *
