class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
       Set<Integer> st = new TreeSet<>();

        // Put all elements of a[] in st
        for (int i = 0; i < a.length; i++)
            st.add(a[i]);

        // Put all elements of b[] in st
        for (int i = 0; i < b.length; i++)
            st.add(b[i]);

        ArrayList<Integer> res = new ArrayList<>(st);
        return res;
    }
}
