package Task3;

interface Sortable {
	public abstract int compare(Sortable b);

	public static void shell_sort(Sortable[] arr) {
		// Shell sort body
		int n = arr.length;
		  
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                Sortable temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].compare(temp) == 1; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
	}
}
