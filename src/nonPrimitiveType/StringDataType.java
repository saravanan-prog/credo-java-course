package nonPrimitiveType;

public class StringDataType {
    public static void main(String[] args) {

        String firstPersonFirstName = "Saravanan";
        String firstPersonLastName = "Saravanan";

        String secondPersonFirstname = new String("vinoth");
        String secondPersonLastName = new String("vinoth");



        System.out.println(secondPersonFirstname == secondPersonLastName);

    }
}
