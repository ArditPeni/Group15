package IQ.VariousClasses;

public class RemoveDuplicates {
    /*
   Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
    */
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {
        String fixed = "";
        String duplicate = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }

            }
            duplicate = "" + s.charAt(i);
            if (count > 1 && !fixed.contains(duplicate)) {
                fixed += s.charAt(i);
            }
        }
        return fixed;
    }

    public static class question9_min_Value {
        public static void main(String[] args) {



        int array [] = new int[]{1,2,3,4,0};

                int min= getMinValue(array);

            System.out.println("min value is "+ min);

    }
    public static int getMinValue(int[] ints) {

        int minValue = ints[0];

        for (int i = 1; i < ints.length; i++) {

            if (ints[i] < minValue) {

             minValue= ints[i];
            }

            }
    return minValue;
        }




    }
}


