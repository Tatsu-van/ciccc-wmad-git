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

  }

  public static int convertToDigit(String[] bin){

  }

  public static String getPassword(String address, int key){

  }
}