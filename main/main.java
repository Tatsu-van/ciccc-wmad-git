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
    int sum = 0;
        String  currentNum;
        int newNum;
        for (int i = 0; i < bin.length; i++) {
            currentNum = bin[i];
//            System.out.println(currentNum);
            for(int j = 0; j < currentNum.length(); j++){
                newNum = Integer.parseInt(String.valueOf(currentNum.charAt(j)));
//                System.out.println("newNum" + newNum);
                sum = sum + newNum;
            }
        }

        return sum;
  }

  public static String getPassword(String address, int key){
    if(key > 26){
      key = key % 26;
  }
  String cipherText = "";
  int n = address.length();

  for(int i = 0; i < n; i++){
      char c = address.charAt(i);
      if(Character.isLetter((c))){
          if(Character.isLowerCase(c)){
              char cha = (char)(c + key);
              if(cha > 'z'){
                  cipherText += (char)(c - (26 - key));
              }
              else {
                  cipherText += cha;
              }
          }
          else if(Character.isUpperCase(c)){
              char cha = (char)(c + key);
              if(cha > 'Z'){
                  cipherText += (char)(c - (26 - key));
              }
              else {
                  cipherText += cha;
              }
          }
      }
      else {
          cipherText = cipherText + c;
      }
  }

  return cipherText;
  }
}