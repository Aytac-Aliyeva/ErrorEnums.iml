//import enums.ErrorEnums;
//import enums.Weekdays;

import enums.*;

import static enums.ErrorEnum.LOGİN_ERROR;
import static enums.Weekdays.SUNDAY;

public class Main {
    public static void main(String[] args) {
        System.out.println(SUNDAY);
        System.out.println(SUNDAY.getClass());


        if ("SUNDAY".equals(SUNDAY)) {
            System.out.println("true");
        } else System.out.println("false");


        Weekdays[] values = Weekdays.values();
        for (Weekdays enums : values) {
            System.out.println(enums);

        }


        System.out.println(LOGİN_ERROR.getErrorMessage());


//        ErrorEnum[] errorEnums = ErrorEnum.values();
//        for (ErrorEnum errorEnum : errorEnums) {
//            System.out.println(errorEnum.getErrorMessage());
//            System.out.println(errorEnum.getErrorCode());


        String value = ErrorEnum.getValue(LOGİN_ERROR);
        System.out.println(value);
        Integer code = ErrorEnum.getCode(LOGİN_ERROR);
        System.out.println(code);


        String messageByErrorCode = ErrorEnum.getMessageByErrorCode(205);
        System.out.println(messageByErrorCode);
        System.out.println("================================================");

        ErrorEnum messageByEnum = ErrorEnum.getMessageByEnum(205);
        System.out.println(messageByEnum.getErrorMessage());

    }
}

