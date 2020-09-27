package GFG;

public class ReorderList {
	Node reorderlist(Node root) {
		Node head = root;
		ArrayList<Integer> arl = new ArrayList<Integer>();
		while(head!=null){
		arl.add(head.data);
		head=head.next;
		}

		int n = arl.size();
		head=root;
		int i=0;
		for(i=0;i<n/2;i++){
		    head.data=arl.get(i);
		    head.next.data=arl.get(n-1-i);
		    head=head.next.next; 
		    
		}
		    if(n%2!=0) 
		    head.data=arl.get(i);
		    return root;
		    
		}
}
