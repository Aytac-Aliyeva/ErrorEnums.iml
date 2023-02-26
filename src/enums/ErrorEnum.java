package enums;

import java.util.Objects;

public enum ErrorEnum {
    LOGİN_ERROR(102, "Sessiyanizin vaxti bitmishdir"),

    USER_REGISTRATION_ERROR(205, "This user alredy exists");


    private Integer errorCode;

    private String errorMessage;

    public static String getValue(ErrorEnum myErrorEnum) {
        ErrorEnum[] values = ErrorEnum.values();
        for (ErrorEnum errorEnum : values) {
            if (errorEnum == myErrorEnum) {
                return errorEnum.errorMessage;

            }
        }
        return null;
    }

    public static Integer getCode(ErrorEnum myErrorEnum) {
        ErrorEnum[] values = ErrorEnum.values();
        for (ErrorEnum errorEnum : values) {
            if (errorEnum == myErrorEnum) {
                return errorEnum.errorCode;

            }
        }
        return null;
    }


    public static String getMessageByErrorCode(Integer errorCode) {
        ErrorEnum[] values = ErrorEnum.values();
        for (ErrorEnum errorEnum : values) {
            if (Objects.equals(errorEnum.errorCode, errorCode)) {
                return errorEnum.errorMessage;
            }
        }
        return null;
    }


    public static ErrorEnum getMessageByEnum(Integer errorCode) {
        ErrorEnum[] values = ErrorEnum.values();
        for (ErrorEnum errorEnum : values) {
            if (Objects.equals(errorEnum.errorCode, errorCode)) {
                return errorEnum;
            }
        }
        return null;
    }




    ErrorEnum(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public ErrorEnum setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorEnum setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
