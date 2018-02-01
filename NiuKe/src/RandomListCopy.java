public class RandomListCopy {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }else{
            RandomListNode head=new RandomListNode(pHead.label);
            head.next=pHead.next;
            head.random=pHead.random;
            RandomListNode p=head;
            while(pHead.next!=null){
                RandomListNode q=new RandomListNode(pHead.next.label);
                q.random=pHead.next.random;
                q.next=null;
                p.next=q;
                p=q;
                pHead=pHead.next;
            }
            return head;
        }

    }
}
