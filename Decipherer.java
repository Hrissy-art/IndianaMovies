public class Decipherer {
    public static void main(String[] args) {

        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        System.out.println(decipher(message1));
        System.out.println(decipher(message2));
        System.out.println(decipher(message3));

    }
    public static String decipher(String message){
        int keyNumber = message.length() / 2;
        String subMessage = message.substring(5,5 + keyNumber);
String replaceMessage = subMessage.replaceAll("@#?", " ").replace("?", "");
String reversedMessage = new StringBuilder(replaceMessage).reverse().toString();
return reversedMessage;



    }

}