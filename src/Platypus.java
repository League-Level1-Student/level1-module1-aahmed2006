
public class Platypus {
    private String name;
    public Platypus(String name2) {
		// TODO Auto-generated constructor stub
	}
	void sayHi(){
		
        System.out.println("The platypus " + name + " is smarter than your average platypus.");
        new Platypus(name);
    }
}