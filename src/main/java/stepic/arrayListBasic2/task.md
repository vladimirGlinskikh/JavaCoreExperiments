##### On static List<String> changeList(List<String> list) method you must do:

1. find the longest string in list
   -if you use method max of class Collections : don't forget to implement a comparator for this method
   Collections.max(list, (s1,s2)->{...})
   by default, this method compares strings alphabetically!
   -of course you can use other approaches(for example comparison in a for-loop)

**Sample Input:**<br/>
hi hello goodmorning ass

**Sample Output**<br/>
goodmorning<br/>
goodmorning<br/>
goodmorning<br/>
goodmorning
