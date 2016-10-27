package encapsulation02_lib;

public class Proposal {
  private String name = "";
  public String getName() {
    return name;
  }

  public String setName(String newName){
    this.name = newName;
    return name;
  }
}
