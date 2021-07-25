package StringPract;

public class removeCharFromOtherChar {
    public static void main(String[] args) {
        String s1="india is great";
        String s2="in";

        int ip_ind=0;
        int res_ind=0;

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        int count[]=new int[256];
        for(int i=0; i<s2.length() ; i++){
             count[s2.charAt(i)]++;
        }

        while(ip_ind!=c1.length){
            char temp=c1[ip_ind];
            if(count[temp]==0){
                c1[res_ind]=c1[ip_ind];
                res_ind++;

            }
            ip_ind++;
        }
       String st=new String(c1);
        System.out.println(st.substring(0,res_ind));

    }
}
