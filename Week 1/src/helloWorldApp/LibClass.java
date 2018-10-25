package helloWorldApp;

class LibClass {
    static String acrosticBack(String[] args) {
        StringBuilder buffer = new StringBuilder();

        int k = args.length;
        int count = 1;
        System.out.println("\n k= " + k +"\n");
        for(int i = k - 1; (i >= 0); i--) {
            int n=args[i].length();
            System.out.println("n= " + n);

            if(n-count > 0) {
                buffer.append(args[i].charAt(n - count));
            } else {
                buffer.append('-');
                count++;
            }
        }
        return buffer.toString();
    }
}
