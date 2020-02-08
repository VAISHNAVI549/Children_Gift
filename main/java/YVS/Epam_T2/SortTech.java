package YVS.Epam_T2;
import java.util.Comparator;
class SweetCost implements Comparator<SortTech>{
	public int compare (SortTech s1, SortTech s2) {
		return s1.cost-s2.cost;
	}
}
class SweetQuant implements Comparator<SortTech>{
	public int compare(SortTech s1, SortTech s2) {
		return Float.compare(s1.weight,s2.weight);
	}
}
class SweetCont implements Comparator<SortTech>{
	public int compare(SortTech s1, SortTech s2) {
		return s1.sweetContent-s2.sweetContent;
	}
}
class SortTech{
    String name;
    int cost;
    float weight;
    int sweetContent;
    SortTech(String name,int cost,float weight,int sweetContent){
        this.name = name;
        this.cost =  cost;
        this.weight = weight;
        this.sweetContent = sweetContent;
    }
}