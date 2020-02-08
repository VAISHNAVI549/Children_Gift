package YVS.Epam_T2;
import java.util.ArrayList;
import java.util.*;
public class Children_Gift{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<SortTech> ls = new ArrayList();
        ls.add(new Choclates_Details(" Ferero Roacher ",100,40.5f,60));
		ls.add(new Choclates_Details("DairyMilk",20,10.2f,50));
		ls.add(new Choclates_Details("FiveStar",10,11.5f,65));
		ls.add(new Choclates_Details("Munch",30,20.2f,25));
		 List<SortTech> ss = new ArrayList();
		ss.add(new Sweets("Mothichoor",50,10.8f,75));
		ss.add(new Sweets("Kalakand",50,15.8f,70));
		ss.add(new Sweets("MysoorePalk",40,19.8f,50));
		ss.add(new Sweets("GulabJamoon",45,12f,80));
		List<SortTech> choco = new ArrayList();
        float totalWeightcho = 0;
        float totalWeightsts = 0;
        float totalWeight = 0;
        for(SortTech s: ls)
            totalWeightcho+=s.weight;
        System.out.println("\nTotal Weight of the Choclates is : "+totalWeightcho);
        for(SortTech s: ls){
            if(s instanceof Choclates_Details)
                choco.add(s);
        }
        for(SortTech s: ss)
            totalWeightsts+=s.weight;
        System.out.println("\nTotal Weight of the Sweets is : "+totalWeightsts);
        for(SortTech s: ss){
            if(s instanceof Sweets)
                choco.add(s);
        }
        totalWeight= totalWeightsts+totalWeightcho;
        System.out.println("\nTotal Weight of the Gift is : "+totalWeight);
        System.out.println("\n_________ SORTING_________\n");
        System.out.println("Enter your choice to sort based on :\n");
        System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.SweetContent\n");
        int op = sc.nextInt();
        if(op == 1)Collections.sort(choco,new SweetCost());
        else if(op == 2)Collections.sort(choco,new SweetQuant());
        else Collections.sort(choco,new SweetCont());
        System.out.println("Items (Sweets & Cholates) Present in the Gift are:");
		for(SortTech s:choco){
			System.out.println("Name:"+s.name+" "+"Cost:"+s.cost+" "+"Weight:"+s.weight+" "+"Sweets_%"+s.sweetContent);
		}
		System.out.println("Do you Want List of Candies(y/n)");
		char c=sc.next().charAt(0);
		if(c=='y'){
			System.out.print("Enter the Option :\n1.Cost\n2.Weight\n3.SweetContent\n");
			op=sc.nextInt();
			System.out.println("Enter the Range");
			int min=sc.nextInt();
			int max=sc.nextInt();
			if(op==1) {
				for(SortTech cur:ls) {
					if(cur instanceof Candy && cur.cost>=min && cur.cost<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else if(op==2) {
				for(SortTech cur:ls) {
					
					if(cur instanceof Candy && cur.weight>=min && cur.weight<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
			else {
				for(SortTech cur:ls) {
					
					if(cur instanceof Candy && cur.sweetContent>=min && cur.sweetContent<=max){
						System.out.println(cur.name+" "+cur.cost+" "+cur.weight+" "+cur.sweetContent);
					}
				}
			}
		}
		sc.close();
	}
}
