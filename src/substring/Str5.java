package substring;
class Str5{
public static void main(String[] args){
String s="c    h   e t     a    n";
//remove all spaces from string
s=s.replaceAll(" ","");
System.out.println(s);
String s1="happy 80 indpendence day";
// remove all the digits
System.out.println(s1);
System.out.println(s1.replaceAll("[0-9]",""));
String s2="Chetan patgar @#1207%$";
//extract only digits from a string
System.out.println(s2);
System.out.println(s2.replaceAll("[^0-9]",""));
//extract only alphabet from alphabets from string
System.out.println(s2);
System.out.println(s2.replaceAll("[^A-Z,a-z]",""));
//remove special charecters
System.out.println(s2);
System.out.println(s2.replaceAll("[^A-Z,a-z,0-9]",""));
//remove alphabets from string
System.out.println(s2);
System.out.println(s2.replaceAll("[A-z,a-z]",""));
//replace all vowels with *
System.out.println(s2);
System.out.println(s2.replaceAll("[aeiou]","*"));
//replace digits with #
System.out.println(s2);
System.out.println(s2.replaceAll("[0-9]","#"));
String s3="hi hello     how    are   you";
//remove multiple spaces
System.out.println(s3);
System.out.println(s3.replaceAll(" +"," "));
//remove duplicate spaces
System.out.println(s3);
System.out.println(s3.replaceAll(" +"," "));
String s4="HhiI HhEeLLllOo HhOoWw AaRrEe YyOoUu";
//remove all uppercase letter
System.out.println(s4);
System.out.println(s4.replaceAll("[A-Z]",""));
//remove all lowercase letter
System.out.println(s4);
System.out.println(s4.replaceAll("[a-z]",""));
System.out.println(s2);
//only special charecter
System.out.println(s2.replaceAll("[a-z,A-Z,0-9]",""));
//replace all non alpahbetic charecter with space
String s5="hello1234 @sdjdj34";
System.out.println(s5);
System.out.println(s5.replaceAll("[^a-z,A-Z]"," "));
//count the no of digits using replaceAll
System.out.println(s5);
System.out.println(s5.replaceAll("[^0-9]","").length());
}
} 
