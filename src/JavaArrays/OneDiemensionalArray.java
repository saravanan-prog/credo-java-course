package JavaArrays;

public class OneDiemensionalArray {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "kala";
        names[1] = "mala";
        names[2] = "vimala";
        names[3] = "rajesh";
        names[4] = "uma";

        for(String item : names) {
            System.out.println("item====>" + item);
        }

    }
}
