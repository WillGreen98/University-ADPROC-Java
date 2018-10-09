package helloWorldApp;

public class LibClass {
    public static String acrosticBack(String[] args) {
        StringBuffer b = new StringBuffer();

        int k = args.length;
        int count=1;
        System.out.println("\n k= " + k +"\n");
        for(int i = k-1; (i>=0); i--) {  	 // a loop to scan all elements of the array args[ ]
            int n=args[i].length();		// length of the current element of the array
            System.out.println("n= " + n);

            if(n-count > 0) {                    // if the length of the �i�th element is greater than �i� �
                b.append(args[i].charAt(n - count));    // append() is a method from StringBuffer class
            } else {
                b.append('-');            // if not long enough, append '-'

                count++;
            }
        }
        return b.toString();
    }
}
