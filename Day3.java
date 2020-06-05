
class Element{
    int a;
    int b;
    Element(int a, int b){
        this.a = a;
        this.b = b;
    }    
}

class SortByFirstElem implements Comparator<Element>{
    public int compare(Element ob1, Element ob2){
        return (ob1.a - ob1.b) - (ob2.a - ob2.b);        
    }
}

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        ArrayList<Element> list = new ArrayList<>();
        for(int i=0; i<costs.length; i++){
            list.add(new Element(costs[i][0], costs[i][1]));
        }
        Collections.sort(list, new SortByFirstElem());
        int sum = 0; 
        int n = list.size();
        for(int i=0; i<n; i++){
            Element ob1 = list.get(i);
            if(i< n/2)
                sum += ob1.a;
            else
                sum += ob1.b;
        }
        return sum;
    }
}