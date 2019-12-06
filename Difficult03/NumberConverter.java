
import java.util.Scanner;


public class NumberConverter {

	private String binaryString;
	private Scanner kbd;
public NumberConverter() {
	kbd = new Scanner(System.in);

//obtain binary string
System.out.println("Enter a binary number (only 1's and 0's)");
binaryString = kbd.next().trim();
boolean booleanIsValid = booleanValidate(binaryString);

if(booleanIsValid) {
//if the number input is a valid boolean stream, get decimal and hexadecimal correspondents and display
System.out.println(String.format("Decimal Value: %d", convertToDecimal(binaryString)));
System.out.println(String.format("Hexadecimal Value: %s", convertToHex(binaryString)));
}
else {
System.out.println("You input an invalid binary stream.\n(binary numbers do not contain digits greater than 1\nand contain no minus signs or other mathematical symbols");
}

}

private boolean booleanValidate(String binaryString) {
for(int i= binaryString.length(); i>0; i--) {

	String character = binaryString.substring(i-1, i);
	if(!character.matches("\\d")) {
		return false;
	}
	if(Integer.parseInt(character) > 1 ) {
		return false;
	}
}
return true;
}

private int convertToDecimal(String binary) {
int tmpvalue;
int result =0;
int numberOfDigits = binary.length();
for(int i= numberOfDigits; i>0; i--) {
tmpvalue = Integer.parseInt(binary.substring(i-1,i));
result += tmpvalue*(int)Math.pow(2, numberOfDigits-i);
}
return result;
}

private String convertToHex(String binary) {
String result ="";
String tmpvalue="";
int tempCount=0;
int tempresult;

int numberOfDigits = binary.length();
for(int i= numberOfDigits; i>0; i--) {
tmpvalue = binary.substring(i-1, i).concat(tmpvalue);
tempCount++;
if (tempCount == 4 || i==1 ) {
tempresult = convertToDecimal(tmpvalue);
switch(tempresult) {
case 10:
result = "A".concat(result);
break;
case 11:
result = "B".concat(result);
break;
case 12:
result = "C".concat(result);
break;
case 13:
result = "D".concat(result);
break;
case 14:
result = "E".concat(result);
break;
case 15:
result = "F".concat(result);
break;
default:
result = Integer.toString(tempresult).concat(result);
}
tmpvalue = "";
tempCount = 0;
}
}
return result;
}


public static void main(String[] args) {

	NumberConverter nc = new NumberConverter();
	
}
}
