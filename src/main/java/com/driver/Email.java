package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        if(password.equals(oldPassword)){
           boolean size=false;
           boolean upper=false;
           boolean lower=false;
           boolean digit=false;
           boolean special=false;
           for(int i=0;i<newPassword.length();i++){
               char c=newPassword.charAt(i);
               if(newPassword.length()>=8)
                   size=true;
               if(Character.isUpperCase(c))
                   upper=true;
               if(Character.isLowerCase(c))
                   lower=true;
                if(Character.isDigit(c))
                   digit=true;
                if(Character.isSpaceChar(c))
                    special=true;
           }
           if(size && upper && lower && digit && special){
               password=newPassword;
           }
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
