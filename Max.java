class Max{

public static string signup (String FirstName,String lastName,String gmailId,long PhoneNumber,String dob,String gender ){
String ref = null;
boolean userValidate= validateUserProfile(FirstName, lastName, gmailId, PhoneNumber, dob, gender);
if (uservalidate == true)
{
ref="user is valid";
}
else
{
ref = "user is invalid";

}
}
public static boolean validateUserProfile(String FirstName,String lastName,String gmailId,long PhoneNumber,String dob,String gender)
{
boollean userValid=false;
boolean isFirstNmae=fasle;
boolean isLastName=false;
boolean isgmailId=false;
boolean isPhoneNumber=false;
boolean isgender=false;

if(FirstName !=null &&FirstName.length()>=3){
boolean isFirstname=true;
}
else{
System.out.println("false");
}
if(LasttName !=null &&LaststName.length()>=3){
boolean isLasttname=true;
}
else{
System.out.println("false");
}
if(gmailId !=null){
Boolean isgmailId=true;
}
else{
System.out.println("false");
}
if(PhoneNumber!=null){
boolean isPhoneNumber=true;
}
else{
System.out.println("false");
}
if(gender !=null ){
boolean isgender=true;
}
else{
System.out.println("gender is invaild");
}

}
