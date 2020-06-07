class Element{
    int a;
    int b;
    Element(int a, int b){
        this.a = a;
        this.b = b;
    }
}
class SortByLogic implements Comparator<Element>{
    public int compare(Element ob1, Element ob2){
        int temp = ob1.a - ob2.a;
        if(temp == 0){
            return ob1.b - ob2.b;
        }else{
            return -temp;
        }
    }
}
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        ArrayList<Element> list =  new ArrayList<>();
        
        for(int i =0; i<people.length; i++)
            list.add(new Element(people[i][0], people[i][1]));
        
        Collections.sort(list, new SortByLogic());      // sort list based on height 
                                                        // in case height is same sort according to k value;
        ArrayList<Element> anslist = new ArrayList<>();
        for(Element ob : list)           
            anslist.add(ob.b, ob);      //insert based on position
        
        
        for(int i=0; i<anslist.size(); i++){
            Element ob = anslist.get(i);
            people[i][0] = ob.a;
            people[i][1] = ob.b;
        }
        return people;
    }
}