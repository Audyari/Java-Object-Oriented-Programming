package Enum;



public enum Level {

    USER("USER 1"),
    ADMIN("USER 2"),
    SUPERADMIN("USER 3");

    String description;

    Level(String description){
        this.description = description;

    }

    String getDescription(){
        return description;
    }



}
