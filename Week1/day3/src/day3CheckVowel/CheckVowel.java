package day3CheckVowel;

public class CheckVowel {
	char c;
	void vowel() {
		c='a';
	}
	void constant() {
		c='k';
	}
	void invalid() {
		c='5';
	}
    void check(char c){
    	if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){ 
    		System.out.println("Character is Vowel");
    	}else if(c>='a' && c<='z'||c>='A' && c<='Z'){
    		System.out.println("Character is Constant");
    	}else {
    		System.out.println("Invalid Character");
    	}
    }
	public static void main(String[] args) {
		CheckVowel obj=new CheckVowel();
	    obj.vowel();
		obj.check(obj.c);
		obj.constant();
		obj.check(obj.c);
		obj.invalid();
		obj.check(obj.c);
	}

}
