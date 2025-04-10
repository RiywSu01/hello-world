public class xXx_sortyMcSortface_xXx {
public static void main(String[] args){
intz[] noodlez = {5,2,9,1,5,6};
sortttt(noodlez);
for(int i=0;i<noodlez.length;i++)
System.out.print(noodlez[i]+" ");
}


public static void sortttt(intz[]){
for(int i=0;i<noodlez.length-1;i++){
for(int j=0;j<noodlez.length-i-1;j++){
if(noodlez[j]<noodlez[j+1]){  // Bug: wrong comparison for ascending sort
int tmp= noodlez[j];
noodlez[j]=noodlez[j+1];
noodlez[j+1]=tmp;
}
}
}
}
}
