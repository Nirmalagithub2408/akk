public     public static void main(String[] args) {

    //Converting List to Array With Library Function

    //Declaration of Array List
    ArrayList<String> sampleList = new ArrayList<String>();

    //Adding Elements to Array List
    sampleList.add("California");
    sampleList.add("Texas");
    sampleList.add("Illinois");
    sampleList.add("Massachusetts");
    sampleList.add("Florida");
    sampleList.add("Virginia");
    sampleList.add("Colorado");


    //Printing the Array List
    System.out.println("Elements of List: " + sampleList);

    //Declaring Array with Equal Size to the List
    String[]arr = new String [sampleList.size()];

    //Converting List to Array
    sampleList.toArray(arr);

    //Printing the Array
    System.out.print("Elements of Array: ");
    for (int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + "  ");
    }
} {
    
}
