public class Main{
  public static void main(String[] args){
    String myMailAddress = "tatsumasato@ciccc.tech";
    String[] myBin = convertToBin(myMailAddress);
    int passWord = convertToDigit(myBin);
    System.out.println(passWord);
    String cipherText = getPassword(myMailAddress, passWord);
    System.out.println("Your password is " + passWord);

    System.out.println(cipherText);
  }

  public static String[] convetToBin(String mail){
    int n = mail.length();
        char[] charArray = new char[n];
        int[] arrayOfNum = new int[n];
        int currentNum;
        char c;
        String  c1;
        int newC;
        String[] binArray = new String[n];

        for (int i = 0; i < n; i++){
            charArray[i] = mail.charAt(i);
//            System.out.println(charArray[i]);

        }

        for (int j = 0; j < n; j++){
            c = charArray[j];
            System.out.println(c);
//            System.out.println((int)c);
            newC =  c;
            arrayOfNum[j] =  newC;
//            System.out.println("a" + arrayOfNum);
        }

        for (int k = 0; k < n; k++){
            c1 = String.valueOf(arrayOfNum[k]);
//            System.out.println("c1 " + c1);
            currentNum = Integer.parseInt(c1);
            binArray[k] = Integer.toBinaryString(currentNum);
        }


        return binArray;
  }

  public static int convertToDigit(String[] bin){

  }

  public static String getPassword(String address, int key){

  }
}