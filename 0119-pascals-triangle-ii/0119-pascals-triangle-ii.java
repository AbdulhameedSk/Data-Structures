class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        long e = 1; // Use a long to avoid integer overflow

        for (int i = 0; i <= rowIndex; i++) { // Change the loop condition to <=
            result.add((int) e);
            e = e * (rowIndex - i) / (i + 1); // Fix the formula for next element
        }

        return result;
    }
}
