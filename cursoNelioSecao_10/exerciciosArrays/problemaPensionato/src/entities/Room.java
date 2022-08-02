package entities;

public class Room {
  private String ownerName;

  private String ownerEmail;

  private int number;

  public Room() {

  }

  public Room(String ownerName, String ownerEmail, int number) {
    this.ownerName = ownerName;
    this.ownerEmail = ownerEmail;
    this.number = number;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
