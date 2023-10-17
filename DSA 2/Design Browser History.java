import java.util.*;

//https://course.acciojob.com/idle?question=4f43830c-35af-43cd-b296-1cbee30f44ea

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String homepage = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BrowserHistory browserHistory = new BrowserHistory(homepage);
        for(int i = 0; i < n; i++) {
            String q = sc.nextLine();
            String[] query = q.split("\\s+");
			
            if(query[0].equals("visit")){
                browserHistory.visit(query[1]);
            } else if(query[0].equals("back")){
                browserHistory.back(Integer.parseInt(query[1]));
            } else if(query[0].equals("forward")){
                browserHistory.forward(Integer.parseInt(query[1]));
            }
        }
    }
}
class BrowserHistory {
	//create array of string to store the url string
	String[]url;
	int index = -1; //current index
	int max = -1; //maximum index with history
	
	//constructor
    public BrowserHistory(String homepage) {
        url = new String[5000]; //as given in constraints
		url[++index] = homepage;
		max++;
    }

	//visit a new website
    public void visit(String urls) {
        url[++index] = urls;
		max = index;
    }
	//visit previously visited url
    public void back(int steps) {
        if((index - steps) <= 0){
			index=0; //reached Homepage
			System.out.println(url[0]); //print homePage
			return;
		}
		index-=steps;
		System.out.println(url[index]); //print homePage
    }
	//go to next url
    public void forward(int steps) {
        if(index+steps < max){
			index+=steps;
			System.out.println(url[index]);
			return;
		}
		index = max; //index reached the max
		System.out.println(url[max]);
    }
}
