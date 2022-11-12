package model.enums;

public enum CinemaType {
    //can just change the name of cinema classes/experiences
    Platinum("Platinum"),
    IMAX("IMAX"),
    Economy("Economy");

    private String type;
    CinemaType(String type) { this.type = type;}

    public static CinemaType getType(String choice) {
        if(choice.equals("Platinum")){
            return Platinum;
        }
        else if(choice.equals("Economy")){
            return Economy;
        }
        else if (choice.equals("IMAX")){
            return IMAX;
        }
        else return null;
    }
}
