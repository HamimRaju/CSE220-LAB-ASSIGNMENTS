public static String checkSimilar( Node building1, Node building2 ){

        Node temp1 = building1;
        Node temp2 = building2;
        
        while (temp1!=null && temp2!=null) {
            if(temp1.elem != temp2.elem){
                return "Not Similar";
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1!=null){
            return "Not Similar";
        }
        if(temp2!=null){
            return "Not Similar";
        } 
        return "Similar";
}
