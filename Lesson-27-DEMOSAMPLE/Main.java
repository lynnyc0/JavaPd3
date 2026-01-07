class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}


    String scramble(String str) {
      String bld = "";
      for (int i = 0; i < str.length() - str.length()%4; i += 4) {
        bld += str.charAt(i+2);
        bld += str.charAt(i+3);
        bld += str.charAt(i);
        bld += str.charAt(i+1);
      };
      
      int quotient = str.length()/4;

      bld += str.substring((quotient*4), str.length());
      return bld;
    };

    


    String encode(String txt) {
      String bld="";
      char ch;
      int ascii = 0;
      for(int x = 0; x < txt.length(); x++){
        ch = txt.charAt(x);
        ascii = (int)ch;
        ascii += 3;
        ch = (char)ascii;
        bld += ch;
      }
      return bld;
    };

     String unencode(String txt) {
      String bld="";
      char ch;
      int ascii = 0;
      for(int x = 0; x < txt.length(); x++){
        ch = txt.charAt(x);
        ascii = (int)ch;
        ascii -= 3;
        ch = (char)ascii;
        bld += ch;
      }
      return bld;
    };

    String subEncryption(String txt, char[] sub, char[] sub2){
      String bld = "";
      char ch;
      
      for(int i = 0; i < txt.length(); i++){
        ch = txt.charAt(i);


        for (int j = 0; j < sub.length; j++){
          if (ch == sub[j]){
        
            ch = sub2[j];
            break;
          }
        }
        bld += ch;
      }
      return bld;
    }

    String unsubEncryption(String txt, char[] unsub, char[] unsub2){
      String bld = "";
      char ch;
      
      for(int i = 0; i < txt.length(); i++){
        ch = txt.charAt(i);


        for (int j = 0; j < unsub.length; j++){
          if (ch == unsub[j]){
        
            ch = unsub2[j];
            break;
          }
        }
        bld += ch;
      }
      return bld;
    }
  
    
  

  void init() {

    String msg = "abcdefghijklmnopqrstuvwxyz!";

    char[] sub = {'b', 'f', 'j', 'p', 'v', 'a','g','h','i','q', 'k', 't' };
  

    char[] sub2 = {'\u0498', '\u0583', '\u0586', '\u05E9', '\u062C','\u0497','\u064A','\u06DD', '\u06E9', '\u0700', '\u0728','\u0919'};

    String msg2 = "abcdefghijklmnopqrstuvwxyz!";

    char[] unsub2 = {'b', 'f', 'j', 'p', 'v', 'a','g','h','i','q', 'k', 't' };
  

    char[] unsub = {'\u0498', '\u0583', '\u0586', '\u05E9', '\u062C','\u0497','\u064A','\u06DD', '\u06E9', '\u0700', '\u0728','\u0919'};

    

    print("original:" + msg);
    print("encoded: " + encode(msg));
    print("encoded and scrambled: " + scramble(encode(subEncryption(msg))));

    String finalMsg = subEncryption(scramble(encode(subEncryption(msg)), sub, sub2, unsub, unsub2));
    print("final: " + finalMsg);
    print("Scramble:" + scramble("abcdefghijklmnopqrstuvwxyz"));
    print("unscramble:" + scramble("cdabghefklijopmnstqrwxuvwxyz"));
    print("encode:" + encode("abcdefghijklmnopqrstuvwxyz"));
    print("unencode:" + unencode(encode("abcdefghijklmnopqrstuvwxyz")));
       c                                                                                                                                                                                                                              ccxprint("subEncryption:" + subEncryption("փيdeֆܨ۝۩nolmrsש܀جwङuz{xy|}$"));
  }

}


/*
    // This example we are substituting all lower case 
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u2663';  // Club
    sub2[1] = '\u2660';  // Spade
    sub2[2] = '\u2665';  // Heart
    sub2[3] = '\u2666';  // Diamond
    sub2[4] = '\u2836';  // Bralle symbol

    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = subEncryption(file,sub,sub2);
    //Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    //Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    String file2 = Input.readFile("Encode1.txt");
    
    String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }
  // Level 1 reverse string
  String reverse(String txt){
    String bld ="";
    
    return bld;
  }
  
  
  //Level 2 Cipher encoding with no wrapping
  String encode(String txt){
    String bld="";
    
     
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
*/