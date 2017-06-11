package hw;

public class Student {
	private String name, id;
	private int score;
	public Student(){};
	public Student(String name1, String id1, int score1){
		name = name1;
		id = id1;
		score = score1;
	}
	public void setName(String name1){name = name1;}
    public  void setId(String id1){id = id1;}
    public void setScore(int score1){score = score1;}
	public String getName(){return name;}
    public String getId(){return id;}
    public int getScore(){return score;}
	public String showAll(){
		return this.getName() +" "+ this.getId() +" "+ this.getScore();
	}
}
