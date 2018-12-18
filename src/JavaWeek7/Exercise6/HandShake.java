package JavaWeek7.Exercise6;

public abstract class HandShake {
    private String moveNumber;

    public HandShake(String moveNumber) {
        this.moveNumber = moveNumber;
    }

    public abstract String getName();
    Boolean isThere(String number){
        return moveNumber.contains(number);
    }

}
