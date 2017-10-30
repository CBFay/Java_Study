/*
	-	From pg. 149 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Uses length member to copy an array
	-	Created 09.21.2017 by CB Fay
*/

class ACopy {
  public static void main(String[] args) {

    // declare new variable of type int called "i"
    int i;

    // declare two arrays of element type int and allocate them ten ints of memory
    int[] nums1 = new int[10];
    int[] nums2 = new int[10];

    // populate nums1 with ints, ascending in value with each element
    for(i=0; i<nums1.length; i++)
      nums1[i] = i;

    //copy nums1 to nums 2
    // check to make sure that the size of the source is not bigger than the size of the destination
    if(nums2.length >= nums1.length)
      //copy values from nums1 to nums2
      for(i=0; i<nums1.length; i++)
        nums2[i] = nums1[i];
    for(i=0; i<nums2.length; i++)
      System.out.print(nums2[i] + " ");
  }
}
