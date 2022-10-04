class Main {
  public static void main(String[] args) {
    int number1,number2;
    number1=1;
    while(number1<=12){
      number2=1;
      while(number2<=12){
        
        System.out.println(number1+" x "+number2+" = "+number1*number2);
        number2++;
      }
      number1++;
    }
  }
}
