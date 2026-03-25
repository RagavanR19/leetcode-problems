class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        t.add(1);
        l.add(t);
        if(numRows == 1){
            return l;
        }

        else{
            for(int i=1;i<numRows;i++){
                t = new ArrayList<>();
                t.add(1);
                for(int j=1;j<l.get(l.size()-1).size();j++){
                        t.add(l.get(l.size()-1).get(j-1)+l.get(l.size()-1).get(j));
                    }
                    t.add(1);
                    l.add(t);
                }
            }
            return l;
    }
}