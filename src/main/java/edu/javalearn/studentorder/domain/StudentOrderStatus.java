package edu.javalearn.studentorder.domain;

public enum StudentOrderStatus {
    START, CHECKED;
    public static StudentOrderStatus fromValue(int value){
        for(StudentOrderStatus sos : StudentOrderStatus.values()){
            if(sos.ordinal() == value){
                return sos;
            }
        }
        throw new RuntimeException("Unkown value: " + value);

    }
}
