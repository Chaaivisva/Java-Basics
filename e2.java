public class e2 {
  public static void main(String args[]){
    try{
      String s = "sky!";
     
      checkvowels(s);
    }
    catch(NoVowelException e){
        System.out.println(e.toString());
    }
  }

static void checkvowels(String s) throws NoVowelException{
    boolean containsvowels = false;
    String vowels = "aeiouAEIOU";
    int n = s.length();
    for(int i=0; i<n;i++){
       char ch = s.charAt(i);
       if(vowels.contains(String.valueOf(ch))){
          containsvowels = true;
          break;
       }
      }
      if(!containsvowels){
        throw new NoVowelException("It does not consist of vowels");
      }
  }

}

class NoVowelException extends Exception{
  NoVowelException(String s){
    super(s);
  }
}

