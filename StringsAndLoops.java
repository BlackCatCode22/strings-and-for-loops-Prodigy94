public class StringsAndLoops {
    public static void main(String[] args) {

        int myLoopControlVariable = 0;
        while(myLoopControlVariable <= 12) {
            System.out.println("My control variable is: " + myLoopControlVariable);
            myLoopControlVariable++;
        }

        String [] myStrArray = {"this", "that", "the other"};
        int[] myIntergerArray = {22, 33, 44, 55};

        for (int i = 0; i <= 2; i++){
            System.out.println("myIntergerArray[" + i + "] = " + myIntergerArray[i]);
        }
        }
    }
