Given string as "JButton Button JMenu..." to stdin of your programm

* Add all elements from this string to `List<String>`
* Next, using Stream API remove all items not starting with J and items beginning with J replace with the same elements but without the J ,for example JFrame -> Frame
* next, print all the remaining elements in reverse order(using .println())
____________________________________
#### Sample Input:

ImageButton JTextField JTextArea CheckBox JMenu
_______________________________________
#### Sample Output:

Menu<br/>
TextArea<br/>
TextField