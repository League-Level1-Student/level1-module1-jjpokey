
public class Duck {
int numberOfFriends;
String favoriteFood;
Duck d = new Duck("Jerry",  20);
Duck(String favoriteFood, int numberOfFriends) {
  	this.favoriteFood = favoriteFood;
  	this.numberOfFriends = numberOfFriends;
}
void quack() {
	System.out.println("Quack!");
}
void waddle() {
	System.out.println("Waddle waddle...");
}
}

